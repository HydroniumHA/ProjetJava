package model;

import java.time.LocalDate;

public class Card {
    private String cardID;
    private LocalDate creationDate;
    private String subscriptionID;

    public Card(String cardID, LocalDate creationDate, String subscriptionID) throws SettorException {
        setCardID(cardID);
        setCreationDate(creationDate);
        setSubscriptionID(subscriptionID);
    }

    public void setCardID(String cardID) throws SettorException {
        if (cardID != null) {
            this.cardID = cardID;
        } else {
            throw new SettorException();
        }
    }

    public void setCreationDate(LocalDate creationDate) throws SettorException {
        if (creationDate != null) {
            this.creationDate = creationDate;
        } else {
            throw new SettorException();
        }
    }

    public void setSubscriptionID(String subscriptionID) throws SettorException {
        if (subscriptionID != null) {
            this.subscriptionID = subscriptionID;
        } else {
            throw new SettorException();
        }
    }

    public String getCardID() {
        return cardID;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public String getSubscriptionID() {
        return subscriptionID;
    }
}
