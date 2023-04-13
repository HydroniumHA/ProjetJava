package model;

public class AddAddressException extends Exception {
    public AddAddressException() {
        super("We can't add this address.");
    }
}
