package model;

public class AddSubscriptionException extends Exception {
    public AddSubscriptionException() {
        super("We can't add a subscription.");
    }
}
