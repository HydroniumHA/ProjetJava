package model;

public class DeletePersonException extends Exception {
    public DeletePersonException() {
        super("We can't delete this person.");
    }
}
