package model;

public class Building {
    private String buildingID;
    private Integer numberMaxPlaces;
    private Integer numberOccupiedPlaces;
    private String buildingType;
    private String address;

    public Building(String buildingID, int numberMaxPlaces, int numberOccupiedPlaces, String buildingType, String address) throws SettorException {
        setBuildingID(buildingID);
        setNumberMaxPlaces(numberMaxPlaces);
        setNumberOccupiedPlaces(numberOccupiedPlaces);
        setBuildingType(buildingType);
        setAddress(address);
    }

    public void setBuildingID(String buildingID) throws SettorException {
        if (buildingID != null) {
            this.buildingID = buildingID;
        } else {
            throw new SettorException();
        }
    }

    public void setNumberMaxPlaces(Integer numberMaxPlaces) throws SettorException {
        if (numberMaxPlaces!= null && numberMaxPlaces > 0) {
            this.numberMaxPlaces = numberMaxPlaces;
        } else {
            throw new SettorException();
        }
    }

    public void setNumberOccupiedPlaces(Integer numberOccupiedPlaces) throws SettorException {
        if (numberOccupiedPlaces != null && numberOccupiedPlaces >= 0) {
            this.numberOccupiedPlaces = numberOccupiedPlaces;
        } else {
            throw new SettorException();
        }
    }

    public void setBuildingType(String buildingType) throws SettorException {
        if (buildingType != null) {
            this.buildingType = buildingType;
        } else {
            throw new SettorException();
        }
    }

    public void setAddress(String address) throws SettorException {
        if (address != null) {
            this.address = address;
        } else {
            throw new SettorException();
        }
    }

    public String getBuildingID() {
        return buildingID;
    }
    public String getBuildingType() {
        return buildingType;
    }
}
