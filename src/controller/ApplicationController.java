package controller;

import business.*;
import model.*;
import java.util.ArrayList;
import java.util.HashMap;

public class ApplicationController {
    private PersonManager personManager;
    private AddressManager addressManager;
    private InvoiceManager invoiceManager;
    private RepairOrderManager repairOrderManager;
    private SubscriptionManager subscriptionManager;
    private CardManager cardManager;
    private BuildingManager buildingManager;
    private JobTask jobTask;

    public ApplicationController() {
        this.personManager = new PersonManager();
        this.addressManager = new AddressManager();
        this.invoiceManager = new InvoiceManager();
        this.repairOrderManager = new RepairOrderManager();
        this.subscriptionManager = new SubscriptionManager();
        this.cardManager = new CardManager();
        this.buildingManager = new BuildingManager();
        this.jobTask = new JobTask();
    }

    public void addPerson(Person person) throws AddPersonException {
        personManager.addPerson(person);
    }

    public ArrayList<Person> getAllPersons() throws AllPersonsException {
        return personManager.getAllPersons();
    }

    public void updatePerson(Person person) throws UpdatePersonException {
        personManager.updatePerson(person);
    }

    public void deletePerson(String nationalRegistrationNumber) throws DeletePersonException {
        personManager.deletePerson(nationalRegistrationNumber);
    }

    public void addAddress(Address address) throws AddAddressException {
        addressManager.addAddress(address);
    }

    public HashMap<Address, String> getAddress(String cardID) throws AddressException {
        return addressManager.getAddress(cardID);
    }

    public ArrayList<Address> getPersonAddress(String nationalRegistrationNumber) throws AddressException {
        return addressManager.getPersonAddress(nationalRegistrationNumber);
    }

    public void updateAddress(Address address) throws UpdateAddressException {
        addressManager.updateAddress(address);
    }

    public void deleteAddress(String nationalRegistrationNumber) throws DeleteAddressException {
        addressManager.deleteAddress(nationalRegistrationNumber);
    }

    public HashMap<Invoice, String> getAllInvoices(String cityName, double minAmount) throws AllInvoicesException {
        return invoiceManager.getAllInvoices(cityName, minAmount);
    }

    public ArrayList<RepairOrder> getAllRepairOrders(String buildingID) throws AllRepairOrdersException {
        return repairOrderManager.getAllRepairOrders(buildingID);
    }

    public void addSubscription(Subscription subscription) throws AddSubscriptionException {
        subscriptionManager.addSubscription(subscription);
    }

    public void deleteSubscription(String nationalRegistrationNumber) throws DeleteSubscriptionException {
        subscriptionManager.deleteSubscription(nationalRegistrationNumber);
    }

    public void addCard(Card card) throws AddCardException {
        cardManager.addCard(card);
    }

    public ArrayList<Card> getAllCards() throws AllCardsException {
        return cardManager.getAllCards();
    }

    public void deleteCard(String nationalRegistrationNumber) throws DeleteCardException {
        cardManager.deleteCard(nationalRegistrationNumber);
    }

    public ArrayList<Building> getAllBuildings() throws AllBuildingsException {
        return buildingManager.getAllBuildings();
    }

    public HashMap<String, Double> getJobTaskInfos(int month, int year) throws AllBuildingsException, AllRepairOrdersException, JobTaskException {
        return jobTask.getJobTaskInfos(month, year);
    }
}
