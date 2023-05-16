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

    public void addAddress(Address address) throws AddAddressException {
        addressManager.addAddress(address);
    }

    public ArrayList<Person> getAllPersons() throws AllPersonsException {
        return personManager.getAllPersons();
    }

    public void deletePerson(String nationalRegistrationNumber) throws DeletePersonException {
        personManager.deletePerson(nationalRegistrationNumber);
    }

    public HashMap<Invoice, String> getAllInvoices(String cityName, double minAmount) throws AllInvoicesException {
        return invoiceManager.getAllInvoices(cityName, minAmount);
    }

    public ArrayList<RepairOrder> getAllRepairOrders(String buildingID) throws AllRepairOrdersException {
        return repairOrderManager.getAllRepairOrders(buildingID);
    }

    public HashMap<Address, String> getAddress(String cardID) throws AddressException {
        return addressManager.getAddress(cardID);
    }

    public void addSubscription(Subscription subscription) throws AddSubscriptionException {
        subscriptionManager.addSubscription(subscription);
    }

    public void addCard(Card card) throws AddCardException {
        cardManager.addCard(card);
    }

    public void updatePerson(Person person) throws UpdatePersonException {
        personManager.updatePerson(person);
    }

    public HashMap<String, Double> getJobTaskInfos(int month, int year) throws AllBuildingsException, AllRepairOrdersException {
        return jobTask.getJobTaskInfos(month, year);
    }

    public ArrayList<Building> getAllBuildings() throws AllBuildingsException {
        return buildingManager.getAllBuildings();
    }

    public ArrayList<Card> getAllCards() throws AllCardsException {
        return cardManager.getAllCards();
    }
}
