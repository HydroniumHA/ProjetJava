package model;

import java.time.LocalDate;

public class Invoice {
    private String documentID;
    private LocalDate date;
    private Double totalPriceWithoutVAT;
    private Double totalPriceIncludingVAT;
    private Boolean isPaid;

    public Invoice(String documentID, LocalDate date, Double totalPriceWithoutVAT, Double totalPriceIncludingVAT, Boolean isPaid) {
        setDocumentID(documentID);
        setDate(date);
        setTotalPriceWithoutVAT(totalPriceWithoutVAT);
        setTotalPriceIncludingVAT(totalPriceIncludingVAT);
        setPaid(isPaid);
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
        isPaid = paid;
    }

    public String getDocumentID() {
        return documentID;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getTotalPriceWithoutVAT() {
        return totalPriceWithoutVAT;
    }

    public Double getTotalPriceIncludingVAT() {
        return totalPriceIncludingVAT;
    }

    public Boolean getPaid() {
        return isPaid;
    }
}
