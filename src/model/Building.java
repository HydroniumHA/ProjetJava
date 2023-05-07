package model;

public class Building {
    private String buildingID;
    private int numberMaxPlaces;
    private int numberOccupiedPlaces;
    private String buildingType;
    private String address;

    public Building(String buildingID, int numberMaxPlaces, int numberOccupiedPlaces, String buildingType, String address) {
        setBuildingID(buildingID);
        setNumberMaxPlaces(numberMaxPlaces);
        setNumberOccupiedPlaces(numberOccupiedPlaces);
        setBuildingType(buildingType);
        setAddress(address);
    }

    public void setBuildingID(String buildingID) {
        this.buildingID = buildingID;
    }

    public void setNumberMaxPlaces(int numberMaxPlaces) {
        this.numberMaxPlaces = numberMaxPlaces;
    }

    public void setNumberOccupiedPlaces(int numberOccupiedPlaces) {
        this.numberOccupiedPlaces = numberOccupiedPlaces;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBuildingID() {
        return buildingID;
    }
}
