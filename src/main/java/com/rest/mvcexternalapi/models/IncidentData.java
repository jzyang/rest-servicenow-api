package com.rest.mvcexternalapi.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IncidentData {
//    @Id
//    @Column(name = "number", nullable = false, length = 10)
    private String number;
    private boolean active;
//    @ManyToOne
//    @JoinColumn(foreignKey = @ForeignKey(name = "fk_incident_user"))
    private UserData user;
    private int priority;
    private int urgency;
    private int severity;
//    @Column(name = "short_description")
    private String shortDescription;
//    @Column(length = 30)
    private String state;
//    @Column(length = 50)
    private String category;
//    @Column(name = "opened", nullable = false)
    private long openedTimestamp;
//    @Column(name = "updated")
    private long updatedTimestamp;
//    @Column(length = 100)
    private String assignmentGroup;
//    @Column(length = 50)
    private String assignedTo;
//    @Column(length = 50)
    private String closedBy;
//    @Column(length = 50)
    private String resolvedBy;
//    @Column(length = 100)
    private String company;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public UserData getUser() {
        return user;
    }

    public void setUser(UserData user) {
        this.user = user;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getUrgency() {
        return urgency;
    }

    public void setUrgency(int urgency) {
        this.urgency = urgency;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getOpenedTimestamp() {
        return openedTimestamp;
    }

    public void setOpenedTimestamp(long openedTimestamp) {
        this.openedTimestamp = openedTimestamp;
    }

    public long getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    public void setUpdatedTimestamp(long updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    public String getAssignmentGroup() {
        return assignmentGroup;
    }

    public void setAssignmentGroup(String assignmentGroup) {
        this.assignmentGroup = assignmentGroup;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getClosedBy() {
        return closedBy;
    }

    public void setClosedBy(String closedBy) {
        this.closedBy = closedBy;
    }

    public String getResolvedBy() {
        return resolvedBy;
    }

    public void setResolvedBy(String resolvedBy) {
        this.resolvedBy = resolvedBy;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
