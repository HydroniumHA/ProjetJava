package model;

import java.time.LocalDate;

public class Subscription {
    private String subscriptionID;
    private LocalDate startDate;
    private int expectedDuration;
    private LocalDate endDate;
    private String personID;

    public Subscription(String subscriptionID, LocalDate startDate, int expectedDuration, LocalDate endDate, String personID) {
        setSubscriptionID(subscriptionID);
        setStartDate(startDate);
        setExpectedDuration(expectedDuration);
        setEndDate(endDate);
        setPersonID(personID);
    }

    public void setSubscriptionID(String subscriptionID) {
        this.subscriptionID = subscriptionID;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setExpectedDuration(int expectedDuration) {
        this.expectedDuration = expectedDuration;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getSubscriptionID() {
        return subscriptionID;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public int getExpectedDuration() {
        return expectedDuration;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getPersonID() {
        return personID;
    }
}
