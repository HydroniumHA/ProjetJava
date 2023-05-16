package business;

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

    public HashMap<String, Double> getJobTaskInfos(int month, int year) throws AllBuildingsException, AllRepairOrdersException, JobTaskException {
        if (String.valueOf(month).matches("^(0?[1-9]|1[0-2])$") && String.valueOf(year).matches("^\\d+$")) {
            ArrayList<Building> buildings = buildingManager.getAllBuildings();
            ArrayList<RepairOrder> repairOrders;

            for (Building building : buildings) {
                repairOrders = repairOrderManager.getAllRepairOrders(building.getBuildingID());
                StatThread statThread = new StatThread(building.getBuildingID(), month, year, repairOrders,this);
                statThread.start();
            }
            return averageBuildingRepairTime;
        }
        throw new JobTaskException();
    }

    public void setData(String buildingID, double averageRepairTime) {
        //TESTS A FAIRE !!!
        averageBuildingRepairTime.put(buildingID, averageRepairTime);
    }
}
