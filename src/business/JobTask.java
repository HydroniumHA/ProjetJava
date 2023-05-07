package business;

import dataAccess.*;
import model.*;
import java.time.LocalDateTime;
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
        ArrayList<Building> buildings = dao.getAllBuildings();
        ArrayList<RepairOrder> repairOrders;
        for (Building building : buildings) {
            repairOrders = manager.getAllRepairOrders(building.getBuildingID());
            //THREADS
        }
    }
}
