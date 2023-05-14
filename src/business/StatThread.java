package business;

import model.*;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class StatThread extends Thread {
    private String buildingID;
    private int month;
    private int year;
    ArrayList<RepairOrder> repairOrders;
    JobTask jobTask;

    public StatThread(String buildingID, int month, int year, ArrayList<RepairOrder> repairOrders, JobTask jobTask) {
        this.buildingID = buildingID;
        this.month = month;
        this.year = year;
        this.repairOrders = repairOrders;
        this.jobTask = jobTask;
    }

    public void run() {
        int daysToRepair = 0;
        int nbRepairOrders = 0;

        for (RepairOrder repairOrder : repairOrders) {
            if (repairOrder.getRepairDate() != null && repairOrder.getRepairDate().getMonthValue() == month && repairOrder.getRepairDate().getYear() == year) {
                daysToRepair += ChronoUnit.DAYS.between(repairOrder.getRepairDate(), repairOrder.getIssueDate());
                nbRepairOrders++;
            }
        }
        jobTask.setData(buildingID,(double)daysToRepair / nbRepairOrders);
    }
}
