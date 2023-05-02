package model;

import java.time.LocalDate;

public class Card {
    private String cardID;
    private LocalDate creationDate;
    private String subscriptionID;

    public Card(String cardID, LocalDate creationDate, String subscriptionID) {
        setCardID(cardID);
        setCreationDate(creationDate);
        setSubscriptionID(subscriptionID);
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void setSubscriptionID(String subscriptionID) {
        this.subscriptionID = subscriptionID;
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
