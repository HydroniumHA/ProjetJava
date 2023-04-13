package model;

import java.util.UUID;

public class Address {
    private UUID addressID;
    private String street;
    private Integer number;
    private String cityName;
    private Integer postalCode;

    public Address(String street, Integer number, String cityName, Integer postalCode) {
        this.addressID = UUID.randomUUID();
        setStreet(street);
        setNumber(number);
        setCityName(cityName);
        setPostalCode(postalCode);
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public UUID getAddressID() {
        return addressID;
    }

    public String getStreet() {
        return street;
    }

    public Integer getNumber() {
        return number;
    }

    public String getCityName() {
        return cityName;
    }

    public Integer getPostalCode() {
        return postalCode;
    }
}
