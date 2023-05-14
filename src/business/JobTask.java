package business;

import dataAccess.*;
import model.*;
import java.util.ArrayList;
import java.util.HashMap;

public class JobTask {
    private BuildingDataAccess dao;
    private RepairOrderManager manager;
    private HashMap<String, Double> averageBuildingRepairTime;

    public JobTask() {
        this.dao = new BuildingDBAccess();
        this.manager = new RepairOrderManager();
        averageBuildingRepairTime = new HashMap<>();
    }

    public HashMap<String, Double> getJobTaskInfos(int month, int year) throws AllBuildingsException, AllRepairOrdersException {
        // TESTS A FAIRE !!!
        ArrayList<Building> buildings = dao.getAllBuildings();
        ArrayList<RepairOrder> repairOrders;

        for (Building building : buildings) {
            repairOrders = manager.getAllRepairOrders(building.getBuildingID());
            StatThread statThread = new StatThread(building.getBuildingID(), month, year, repairOrders,this);
            statThread.start();
        }
        return averageBuildingRepairTime;
    }

    public void setData(String buildingID, double averageRepairTime) {
        averageBuildingRepairTime.put(buildingID, averageRepairTime);
    }
}
