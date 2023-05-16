package model;

import java.time.LocalDate;

public class Bike {
    private String bikeID;
    private String model;
    private String brand;
    private LocalDate purchaseDate;
    private Double value;
    private Boolean isDeclassified;

    public Bike(String bikeID, String model, String brand, LocalDate purchaseDate, Double value, Boolean isDeclassified) {
        setBikeID(bikeID);
        setModel(model);
        setBrand(brand);
        setPurchaseDate(purchaseDate);
        setValue(value);
        setDeclassified(isDeclassified);
    }

    public void setBikeID(String bikeID) {
        this.bikeID = bikeID;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public void setDeclassified(Boolean declassified) {
        isDeclassified = declassified;
    }
}
