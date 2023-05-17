package model;

import java.time.LocalDate;

public class Person {
    private String nationalRegistrationNumber;
    private String lastName;
    private String firstName;
    private Character gender;
    private LocalDate birthdate;
    private String email;
    private String phoneNumber;
    private Boolean wantsNewsLetter;
    private String addressID;

    public Person(String nationalRegistrationNumber, String lastName, String firstName, Character gender, LocalDate birthdate, String email, String phoneNumber, Boolean wantsNewsLetter, String addressID) throws SettorException {
        setNationalRegistrationNumber(nationalRegistrationNumber);
        setName(lastName);
        setFirstName(firstName);
        setGender(gender);
        setBirthdate(birthdate);
        setEmail(email);
        setPhoneNumber(phoneNumber);
        setWantsNewsLetter(wantsNewsLetter);
        setAddress(addressID);
    }

    public void setNationalRegistrationNumber(String nationalRegistrationNumber) throws SettorException {
        if (nationalRegistrationNumber.matches("^\\d{2}\\.\\d{2}\\.\\d{2}-\\d{3}\\.\\d{2}$")) {
            this.nationalRegistrationNumber = nationalRegistrationNumber;
        } else {
            throw new SettorException();
        }
    }

    public void setName(String lastName) throws SettorException {
        if (lastName != null) {
            this.lastName = lastName;
        } else {
            throw new SettorException();
        }
    }

    public void setFirstName(String firstName) throws SettorException {
        if (firstName != null) {
            this.firstName = firstName;
        } else {
            throw new SettorException();
        }
    }

    public void setGender(Character gender) throws SettorException {
        if (gender != null) {
            this.gender = gender;
        } else {
            throw new SettorException();
        }
    }

    public void setBirthdate(LocalDate birthdate) throws SettorException {
        if (birthdate != null) {
            this.birthdate = birthdate;
        } else {
            throw new SettorException();
        }
    }

    public void setEmail(String email) throws SettorException {
        if (email == null || email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            this.email = email;
        } else {
            throw new SettorException();
        }
    }

    public void setPhoneNumber(String phoneNumber) throws SettorException {
        if (phoneNumber == null || phoneNumber.matches("^\\+\\d+$")) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new SettorException();
        }
    }

    public void setWantsNewsLetter(Boolean wantsNewsLetter) throws SettorException {
        if (wantsNewsLetter != null) {
            this.wantsNewsLetter = wantsNewsLetter;
        } else {
            throw new SettorException();
        }
    }

    public void setAddress(String addressID) throws SettorException {
        if (addressID != null) {
            this.addressID = addressID;
        } else {
            throw new SettorException();
        }
    }

    public String getNationalRegistrationNumber() {
        return nationalRegistrationNumber;
    }

    public String getLastName() {
        return lastName;
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
