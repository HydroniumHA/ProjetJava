package model;

public class ConnectionException extends Exception {
    public ConnectionException() {
        super("We can't connect to the database.");
    }
}