package com.berruhanedar.Structural.Proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeUtil {

    public static List<Employee> getEmployees() {
        Employee berru = new Employee("Berru", "Berru123", true);
        Employee adam = new Employee("Adam", "Adam123", false);
        Employee john = new Employee("John", "John123", false);

        List<Employee> employees = new ArrayList<>();

        employees.add(berru);
        employees.add(adam);
        employees.add(john);

        return employees;
    }

    public static Map<String, Employee> getEmployeesWithUsernameMap() {
        List<Employee> employees = getEmployees();

        Map<String, Employee> employeesMap = new HashMap<>();

        for (Employee employee : employees) {
            employeesMap.put(employee.getUserName(), employee);
        }
        return employeesMap;
    }

    public static Employee getEmployeeByUsername(String userName) {
        Map<String, Employee> employeesMap = getEmployeesWithUsernameMap();
        Employee employee = employeesMap.get(userName);
        return employee;
    }

    public static boolean isUserValid(String userName, String password) {
        boolean isValid = false;
        Employee employee = getEmployeeByUsername(userName);
        if (employee != null) {
            isValid = employee.getPassword().equals(password);
        }
        return isValid;
    }
}
