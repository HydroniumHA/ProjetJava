package model;

public class AllInvoicesException extends Exception {
    public AllInvoicesException() {
        super("We can't show all invoices.");
    }
}
