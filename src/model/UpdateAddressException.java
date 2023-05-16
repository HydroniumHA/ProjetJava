package model;

public class UpdateAddressException extends Exception {
    public UpdateAddressException() {
        super("We can't update an address");
    }
}
