package model;

import java.time.LocalDate;

public class Subscription {
    private String subscriptionID;
    private LocalDate startDate;
    private Integer expectedDuration;
    private LocalDate endDate;
    private String personID;

    public Subscription(String subscriptionID, LocalDate startDate, Integer expectedDuration, LocalDate endDate, String personID) throws SettorException {
        setSubscriptionID(subscriptionID);
        setStartDate(startDate);
        setExpectedDuration(expectedDuration);
        setEndDate(endDate);
        setPersonID(personID);
    }

    public void setSubscriptionID(String subscriptionID) throws SettorException {
        if (subscriptionID != null) {
            this.subscriptionID = subscriptionID;
        } else {
            throw new SettorException();
        }
    }

    public void setStartDate(LocalDate startDate) throws SettorException {
        if (startDate != null) {
            this.startDate = startDate;
        } else {
            throw new SettorException();
        }
    }

    public void setExpectedDuration(Integer expectedDuration) throws SettorException {
        if (expectedDuration != null && expectedDuration > 0) {
            this.expectedDuration = expectedDuration;
        } else {
            throw new SettorException();
        }
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setPersonID(String personID) throws SettorException {
        if (personID != null) {
            this.personID = personID;
        } else {
            throw new SettorException();
        }
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
