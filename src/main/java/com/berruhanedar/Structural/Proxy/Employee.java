package com.berruhanedar.Structural.Proxy;

public class Employee {
    private String userName;
    private String password;
    private boolean isDirector;

    public Employee(String userName, String password, boolean isDirector) {
        this.userName = userName;
        this.password = password;
        this.isDirector = isDirector;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isDirector() {
        return isDirector;
    }

    public void setDirector(boolean director) {
        isDirector = director;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
