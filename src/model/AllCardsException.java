package model;

public class AllCardsException extends Exception {
    public AllCardsException() {
        super("We can't get all cards.");
    }
}
