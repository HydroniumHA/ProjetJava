package business;

import dataAccess.*;
import model.*;
import java.util.ArrayList;
import java.util.HashMap;

public class JobTask {
    private RepairOrderManager repairOrderManager;
    private BuildingManager buildingManager;
    private HashMap<String, Double> averageBuildingRepairTime;

    public JobTask() {
        this.repairOrderManager = new RepairOrderManager();
        this.buildingManager = new BuildingManager();
        averageBuildingRepairTime = new HashMap<>();
    }

    public HashMap<String, Double> getJobTaskInfos(int month, int year) throws AllBuildingsException, AllRepairOrdersException {
        // TESTS A FAIRE !!!
        ArrayList<Building> buildings = buildingManager.getAllBuildings();
        ArrayList<RepairOrder> repairOrders;

        for (Building building : buildings) {
            repairOrders = repairOrderManager.getAllRepairOrders(building.getBuildingID());
            StatThread statThread = new StatThread(building.getBuildingID(), month, year, repairOrders,this);
            statThread.start();
        }
        return averageBuildingRepairTime;
    }

    public void setData(String buildingID, double averageRepairTime) {
        averageBuildingRepairTime.put(buildingID, averageRepairTime);
    }
}
