package com.berruhanedar.Structural.Composite.realworldexample.goodexample;

public class ExpensesClient {
    public static void main(String[] args) {
        Manager jane = new Manager("Jane");
        Salesperson bob = new Salesperson("Bob", jane);
        Salesperson sue = new Salesperson("Sue", jane);

        SalesTeam team = new SalesTeam();
        team.addPayee(jane);
        team.addPayee(bob);
        team.addPayee(sue);

        payTeam(jane, 100);
        payTeam(bob, 300);
        payTeam(team, 200);
    }


    private static void payTeam(Payee payee, int amount) {
        System.out.println("Expenses have been requested");
        payee.payExpenses(amount);
        System.out.println("Expenses have been paid\n");
    }
}
