package model;

public class JobTaskException extends Exception {
    public JobTaskException() {
        super("Problem with the JobTask, check if the fields are correct.");
    }
}
