package model;

public class DeleteAddressException extends Exception{
    public DeleteAddressException() {
        super("We can't delete an address.");
    }
}
