package business;

public class CommonZone {
    private String buildingID;
    private Double averageRepairDays;
    private boolean completed;

    public String getBuildingID() {
        return buildingID;
    }

    public Double getAverageRepairDays() {
        return averageRepairDays;
    }

    public void setBuildingID(String buildingID) {
        this.buildingID = buildingID;
    }

    public void setAverageRepairDays(Double averageRepairDays) {
        this.averageRepairDays = averageRepairDays;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void complete() {
        this.completed = true;
    }
}
