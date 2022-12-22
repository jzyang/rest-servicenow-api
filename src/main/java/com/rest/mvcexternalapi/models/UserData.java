package com.rest.mvcexternalapi.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserData {
//    @Id
//    @Column(name = "uid", nullable = false, length = 50)
    private String uid;

    private boolean active;
//    @Column(name="firstname", length = 100)
    private String firstName;
//    @Column(name="lastname", length = 100)
    private String lastName;
//    @Column(nullable = false, length = 100)
    private String email;
//    @Column(length = 100)
    private String company;
//    @Column(length = 100)
    private String department;
    private String roles;
    private String title;
//    @Column(name = "created", nullable = false)
    private long createdTimestamp;
//    @Column(name = "last_login")
    private long lastLoginTimestamp;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(long createdDate) {
        this.createdTimestamp = createdDate;
    }

    public long getLastLoginTimestamp() {
        return lastLoginTimestamp;
    }

    public void setLastLoginTimestamp(long lastLoginDate) {
        this.lastLoginTimestamp = lastLoginDate;
    }
}
