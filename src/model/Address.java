package model;

public class Address {
    private String addressID;
    private String street;
    private Integer streetNumber;
    private String cityName;
    private Integer zip;

    public Address(String addressID, String street, Integer streetNumber, String cityName, Integer zip) throws SettorException {
        setAddressID(addressID);
        setStreet(street);
        setNumber(streetNumber);
        setCityName(cityName);
        setZip(zip);
    }

    public void setAddressID(String addressID) throws SettorException {
        if (addressID != null) {
            this.addressID = addressID;
        } else {
            throw new SettorException();
        }
    }

    public void setStreet(String street) throws SettorException {
        if (street != null) {
            this.street = street;
        } else {
            throw new SettorException();
        }
    }

    public void setNumber(Integer streetNumber) throws SettorException {
        if (streetNumber != null && streetNumber > 0) {
            this.streetNumber = streetNumber;
        } else {
            throw new SettorException();
        }
    }

    public void setCityName(String cityName) throws SettorException {
        if (cityName != null) {
            this.cityName = cityName;
        } else {
            throw new SettorException();
        }
    }

    public void setZip(Integer zip) throws SettorException {
        if (zip != null && zip > 0) {
            this.zip = zip;
        } else {
            throw new SettorException();
        }
    }

    public String getAddressID() {
        return addressID;
    }

    public String getStreet() {
        return street;
    }

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public Integer getZip() {
        return zip;
    }
}
