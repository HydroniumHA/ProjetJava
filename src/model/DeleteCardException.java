package model;

public class DeleteCardException extends Exception{
    public DeleteCardException() {
        super("We can't delete a card.");
    }
}
