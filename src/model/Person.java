package model;

import java.time.LocalDate;

public class Person {
    private String nationalRegistrationNumber;
    private String name;
    private String firstName;
    private Character gender;
    private LocalDate birthdate;
    private String email;
    private String phoneNumber;
    private Boolean wantsNewsLetter;
    private String addressID;

    public Person(String nationalRegistrationNumber, String name, String firstName, Character gender, LocalDate birthdate, String email, String phoneNumber, Boolean wantsNewsLetter, String addressID) {
        setNationalRegistrationNumber(nationalRegistrationNumber);
        setName(name);
        setFirstName(firstName);
        setGender(gender);
        setBirthdate(birthdate);
        setEmail(email);
        setPhoneNumber(phoneNumber);
        setWantsNewsLetter(wantsNewsLetter);
        setAddress(addressID);
    }

    public void setNationalRegistrationNumber(String nationalRegistrationNumber) {
        this.nationalRegistrationNumber = nationalRegistrationNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setWantsNewsLetter(Boolean wantsNewsLetter) {
        this.wantsNewsLetter = wantsNewsLetter;
    }

    public void setAddress(String addressID) {
        this.addressID = addressID;
    }

    public String getNationalRegistrationNumber() {
        return nationalRegistrationNumber;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public Character getGender() {
        return gender;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Boolean getWantsNewsLetter() {
        return wantsNewsLetter;
    }

    public String getAddressID() {
        return addressID;
    }
}
