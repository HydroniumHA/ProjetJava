package model;

public class DeleteSubscriptionException extends Exception {
    public DeleteSubscriptionException() {
        super("We can't delete a subscription.");
    }
}
