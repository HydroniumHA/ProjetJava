package controller;

import business.*;
import model.*;

public class ApplicationController {
    private PersonManager personManager;
    private AddressManager addressManager;

    public ApplicationController() {
        this.personManager = new PersonManager();
        this.addressManager = new AddressManager();
    }

    public void addPerson(Person person) throws AddPersonException {
        personManager.addPerson(person);
    }

    public void addAddress(Address address) throws AddAddressException {
        addressManager.addAddress(address);
    }

    public void deletePerson(String nationalRegistrationNumber) throws DeletePersonException {
        personManager.deletePerson(nationalRegistrationNumber);
    }
}
