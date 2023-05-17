package business;

import model.JobTaskException;

public class StatThreadConsumer extends Thread {
    private CommonZone commonZone;
    private JobTask jobTask;

    public StatThreadConsumer(CommonZone commonZone, JobTask jobTask) {
        this.commonZone = commonZone;
        this.jobTask = jobTask;
    }

    public void run() {
        String buildingID;
        Double averageRepairDays;

        synchronized (commonZone) {
            while (!commonZone.isCompleted()) {
                try {
                    buildingID = commonZone.getBuildingID();
                    averageRepairDays = commonZone.getAverageRepairDays();
                    if (buildingID == null) {
                        commonZone.wait();
                    } else {
                        jobTask.setJobTaskInfos(buildingID, averageRepairDays);
                        commonZone.setBuildingID(null);
                        commonZone.setAverageRepairDays(null);
                        commonZone.notify();
                    }
                } catch (InterruptedException | JobTaskException exception) { }
            }
            jobTask.go();
        }
    }
}
