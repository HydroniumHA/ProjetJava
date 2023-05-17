package model;

import java.time.LocalDate;

public class Invoice {
    private String documentID;
    private LocalDate invoiceDate;
    private Double totalPriceWithoutVAT;
    private Double totalPriceIncludingVAT;
    private Boolean isPaid;
    private String subscriptionID;

    public Invoice(String documentID, LocalDate invoiceDate, Double totalPriceWithoutVAT, Double totalPriceIncludingVAT, Boolean isPaid, String subscriptionID) throws SettorException {
        setDocumentID(documentID);
        setDate(invoiceDate);
        setTotalPriceWithoutVAT(totalPriceWithoutVAT);
        setTotalPriceIncludingVAT(totalPriceIncludingVAT);
        setPaid(isPaid);
        setSubscriptionID(subscriptionID);
    }

    public void setDocumentID(String documentID) throws SettorException {
        if (documentID != null) {
            this.documentID = documentID;
        } else {
            throw new SettorException();
        }
    }

    public void setDate(LocalDate invoiceDate) throws SettorException {
        if (invoiceDate != null) {
            this.invoiceDate = invoiceDate;
        } else {
            throw new SettorException();
        }
    }

    public void setTotalPriceWithoutVAT(Double totalPriceWithoutVAT) throws SettorException {
        if (totalPriceWithoutVAT != null && String.valueOf(totalPriceWithoutVAT).matches("^\\d+(\\.\\d+)?$")) {
            this.totalPriceWithoutVAT = totalPriceWithoutVAT;
        } else {
            throw new SettorException();
        }
    }

    public void setTotalPriceIncludingVAT(Double totalPriceIncludingVAT) throws SettorException {
        if (totalPriceIncludingVAT != null && String.valueOf(totalPriceIncludingVAT).matches("^\\d+(\\.\\d+)?$")) {
            this.totalPriceIncludingVAT = totalPriceIncludingVAT;
        } else {
            throw new SettorException();
        }
    }

    public void setPaid(Boolean paid) throws SettorException {
        if (paid != null) {
            this.isPaid = paid;
        } else {
            throw new SettorException();
        }
    }

    private void setSubscriptionID(String subscriptionID) throws SettorException {
        if (subscriptionID != null) {
            this.subscriptionID = subscriptionID;
        } else {
            throw new SettorException();
        }
    }

    public String getDocumentID() {
        return documentID;
    }

    public LocalDate getDate() {
        return invoiceDate;
    }

    public Double getTotalPriceIncludingVAT() {
        return totalPriceIncludingVAT;
    }

    public Boolean getPaid() {
        return isPaid;
    }
}
