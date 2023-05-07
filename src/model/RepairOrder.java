package model;

import java.time.LocalDate;

public class RepairOrder {
    private String repairID;
    private LocalDate issueDate;
    private LocalDate repairDate;
    private String comments;
    private String bike;

    public RepairOrder(String repairID, LocalDate issueDate, LocalDate repairDate, String comments, String bike) {
        setRepairID(repairID);
        setIssueDate(issueDate);
        setRepairDate(repairDate);
        setComments(comments);
        setBike(bike);
    }

    public void setRepairID(String repairID) {
        this.repairID = repairID;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public void setRepairDate(LocalDate repairDate) {
        this.repairDate = repairDate;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setBike(String bike) {
        this.bike = bike;
    }

    public String getRepairID() {
        return repairID;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getRepairDate() {
        return repairDate;
    }

    public String getComments() {
        return comments;
    }

    public String getBike() {
        return bike;
    }
}
