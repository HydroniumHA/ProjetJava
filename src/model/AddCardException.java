package model;

public class AddCardException extends Exception {
    public AddCardException() {
        super("We can't add a card.");
    }
}
