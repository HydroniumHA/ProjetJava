package business;

import model.*;
import java.util.ArrayList;
import java.util.HashMap;

public class JobTask {
    private BuildingManager buildingManager;
    private HashMap<String, Double> averageBuildingRepairDays;
    private boolean complete;

    public JobTask() {
        this.buildingManager = new BuildingManager();
        this.averageBuildingRepairDays = new HashMap<>();
    }

    public void go() {
        complete = true;
    }

    public HashMap<String, Double> getJobTaskInfos(int month, int year) throws AllBuildingsException, JobTaskException {
        if (true) {
            ArrayList<Building> buildings = buildingManager.getAllBuildings();
            CommonZone commonZone = new CommonZone();
            StatThreadProducer statThreadProducer = new StatThreadProducer(buildings, month, year, commonZone);
            StatThreadConsumer statThreadConsumer = new StatThreadConsumer(commonZone, this);

            statThreadProducer.start();
            statThreadConsumer.start();

            while (!complete) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException exception) {
                    throw  new JobTaskException();
                }
            }
            return averageBuildingRepairDays;
        }
        throw new JobTaskException();
    }

    public void setJobTaskInfos(String buildingID, Double averageRepairDays) {
        averageBuildingRepairDays.put(buildingID, averageRepairDays);
    }
}
