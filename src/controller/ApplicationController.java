package controller;

import business.*;
import model.*;
import java.util.HashMap;

public class ApplicationController {
    private PersonManager personManager;
    private AddressManager addressManager;
    private InvoiceManager invoiceManager;
    private RepairOrderManager repairOrderManager;

    public ApplicationController() {
        this.personManager = new PersonManager();
        this.addressManager = new AddressManager();
        this.invoiceManager = new InvoiceManager();
        this.repairOrderManager = new RepairOrderManager();
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

    public HashMap<Bike, String> getAllRepairOrders(String buildingID) throws AllRepairOrdersException {
        return repairOrderManager.getAllRepairOrders(buildingID);
    }
}
