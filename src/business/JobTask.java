package business;

import dataAccess.*;
import model.*;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;

public class JobTask {
    private BuildingDataAccess dao;
    private RepairOrderManager manager;

    public JobTask() {
        this.dao = new BuildingDBAccess();
        this.manager = new RepairOrderManager();
    }

    public HashMap<String, Double> getJobTaskInfos(int month, int year) throws AllBuildingsException, AllRepairOrdersException {
        // TESTS A FAIRE !!!
        HashMap<String, Double> averageBuildingRepairTime = new HashMap<>();
        ArrayList<Building> buildings = dao.getAllBuildings();
        ArrayList<RepairOrder> repairOrders;

        for (Building building : buildings) {
            int daysToRepair = 0;
            int nbRepairOrders = 0;

            repairOrders = manager.getAllRepairOrders(building.getBuildingID());
            for (RepairOrder repairOrder : repairOrders) {
                if (repairOrder.getRepairDate() != null) {
                    daysToRepair += ChronoUnit.DAYS.between(repairOrder.getRepairDate(), repairOrder.getIssueDate());
                    nbRepairOrders++;
                }

            }
            averageBuildingRepairTime.put(building.getBuildingID(), (double)daysToRepair / nbRepairOrders);
        }
        return averageBuildingRepairTime;
        //FAIRE CECI AVEC THREAD !!!
    }
}
