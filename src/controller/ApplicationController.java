package controller;

import business.*;
import model.*;
import java.util.HashMap;

public class ApplicationController {
    private PersonManager personManager;
    private AddressManager addressManager;
    private InvoiceManager invoiceManager;

    public ApplicationController() {
        this.personManager = new PersonManager();
        this.addressManager = new AddressManager();
        this.invoiceManager = new InvoiceManager();
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

    public HashMap<Invoice, String> getAllInvoices(String cityName, double minAmount) throws AllInvoicesException {
        return invoiceManager.getAllInvoices(cityName, minAmount);
    }
}
