package model;

public class Address {
    private String addressID;
    private String street;
    private Integer streetNumber;
    private String cityName;
    private Integer zip;

    public Address(String addressID, String street, Integer streetNumber, String cityName, Integer zip) {
        setAddressID(addressID);
        setStreet(street);
        setNumber(streetNumber);
        setCityName(cityName);
        setZip(zip);
    }

    public void setAddressID(String addressID) {
        this.addressID = addressID;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
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
