package model;

public class UpdatePersonException extends Exception {
    public UpdatePersonException() {
        super("We can't update a person.");
    }
}
