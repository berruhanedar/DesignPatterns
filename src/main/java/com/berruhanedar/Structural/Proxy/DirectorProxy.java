package com.berruhanedar.Structural.Proxy;

import java.math.BigDecimal;

// It will act like real Director
public class DirectorProxy implements CompanyInformation {

    private Director director; // It needs real director instance

    // Authentication
    private String userName;
    private String password;

    public DirectorProxy(String userName, String password) {
        this.director = new Director(); // This is important
        this.userName = userName;
        this.password = password;
    }

    private boolean isUserDirector() {
        boolean isUserDirector = false;  //it is flag
        boolean isUserValid = EmployeeUtil.isUserValid(userName, password);
        if (isUserValid) {
            Employee employee = EmployeeUtil.getEmployeeByUsername(userName);
            isUserDirector = employee.isDirector();
        }
        return isUserDirector;
    }

    @Override
    public BigDecimal getTurnover() throws IllegalAccessException {
        if(isUserDirector()) {
            return director.getTurnover();
        } else {
            throw new IllegalAccessException();
        }
    }
}
