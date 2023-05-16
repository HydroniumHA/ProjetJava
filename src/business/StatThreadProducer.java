package business;

import model.*;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class StatThreadProducer extends Thread {
    private ArrayList<Building> buildings;
    private int month;
    private int year;
    private CommonZone commonZone;
    private RepairOrderManager manager;

    public StatThreadProducer(ArrayList<Building> buildings, int month, int year, CommonZone commonZone) {
        this.buildings = new ArrayList<>(buildings);
        this.month = month;
        this.year = year;
        this.commonZone = commonZone;
        this.manager = new RepairOrderManager();
    }

    public void run() {
        synchronized (commonZone) {
            try {
                int daysToRepair;
                int nbRepairOrders;
                ArrayList<RepairOrder> repairOrders;

                for (Building building : buildings) {
                    daysToRepair = 0;
                    nbRepairOrders = 0;
                    repairOrders = manager.getAllRepairOrders(building.getBuildingID());
                    for (RepairOrder repairOrder : repairOrders) {
                        if (repairOrder.getRepairDate() != null && repairOrder.getRepairDate().getMonthValue() == month && repairOrder.getRepairDate().getYear() == year) {
                            daysToRepair += ChronoUnit.DAYS.between(repairOrder.getIssueDate(), repairOrder.getRepairDate());
                            nbRepairOrders++;
                        }
                    }
                    if (nbRepairOrders != 0) {
                        commonZone.setBuildingID(building.getBuildingID());
                        commonZone.setAverageRepairDays((double)daysToRepair / nbRepairOrders);
                        commonZone.notify();
                        commonZone.wait();
                    }
                }
                commonZone.complete();
                commonZone.notify();
            } catch (AllRepairOrdersException | InterruptedException exception) { }
        }
    }
}
