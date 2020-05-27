package com.example.demo.model;

public class User {
    private String username;
    private String password;
    private String personalData;

    public User() {
    }

    public User(String username, String password, String personalData) {
        this.username = username;
        this.password = password;
        this.personalData = personalData;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPersonalData() {
        return personalData;
    }

    public void setPersonalData(String personalData) {
        this.personalData = personalData;
    }
}
