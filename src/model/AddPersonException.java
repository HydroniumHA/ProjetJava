package model;

public class AddPersonException extends Exception {
    public AddPersonException() {
        super("We can't add this person.");
    }
}
