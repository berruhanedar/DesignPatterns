package com.berruhanedar.Structural.Composite.realworldexample.badexample;

public class ExpensesClient {
    public static void main(String[] args) {
        Manager jane = new Manager("Jane");
        SalesPerson bob = new SalesPerson("Bob", jane);
        SalesPerson sue = new SalesPerson("Sue", jane);

        SalesTeam team = new SalesTeam();
        team.addManager(jane);
        team.addSalesPerson(bob);
        team.addSalesPerson(sue);

        payManager(jane, 100);
        paySalesPerson(bob, 300);
        payTeam(team, 200);
    }

    private static void payManager(Manager manager, int amount) {
        System.out.println("Expenses have been requested");
        manager.payExpenses(amount);
        System.out.println("Expenses have been paid\n");
    }

    private static void paySalesPerson(SalesPerson salesPerson, int amount) {
        System.out.println("Expenses have been requested");
        salesPerson.payExpenses(amount);
        System.out.println("Expenses have been paid\n");
    }

    private static void payTeam(SalesTeam salesTeam, int amount) {
        System.out.println("Expenses have been requested");
        salesTeam.payExpenses(amount);
        System.out.println("Expenses have been paid\n");
    }

}
