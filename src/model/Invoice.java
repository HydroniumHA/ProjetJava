package model;

import java.time.LocalDate;

public class Invoice {
    private String documentID;
    private LocalDate date;
    private Double totalPriceWithoutVAT;
    private Double totalPriceIncludingVAT;
    private Boolean isPaid;
    private String subscriptionID;

    public Invoice(String documentID, LocalDate date, Double totalPriceWithoutVAT, Double totalPriceIncludingVAT, Boolean isPaid, String subscriptionID) {
        setDocumentID(documentID);
        setDate(date);
        setTotalPriceWithoutVAT(totalPriceWithoutVAT);
        setTotalPriceIncludingVAT(totalPriceIncludingVAT);
        setPaid(isPaid);
        setSubscriptionID(subscriptionID);
    }

    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTotalPriceWithoutVAT(Double totalPriceWithoutVAT) {
        this.totalPriceWithoutVAT = totalPriceWithoutVAT;
    }

    public void setTotalPriceIncludingVAT(Double totalPriceIncludingVAT) {
        this.totalPriceIncludingVAT = totalPriceIncludingVAT;
    }

    public void setPaid(Boolean paid) {
        this.isPaid = paid;
    }
    private void setSubscriptionID(String subscriptionID) {
        this.subscriptionID = subscriptionID;
    }

    public String getDocumentID() {
        return documentID;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getTotalPriceIncludingVAT() {
        return totalPriceIncludingVAT;
    }

    public Boolean getPaid() {
        return isPaid;
    }

    public String getSubscriptionID() {
        return subscriptionID;
    }
}
