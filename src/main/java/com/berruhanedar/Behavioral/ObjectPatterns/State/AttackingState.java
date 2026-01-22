package com.berruhanedar.Behavioral.ObjectPatterns.State;

public class AttackingState implements ConsoleState {

    @Override
    public void pressSquare() {
        System.out.println("Player takes a powerful shot on goal.");
    }

    @Override
    public void pressTriangle() {
        System.out.println("Player makes a through pass.");
    }

    @Override
    public void pressCircle() {
        System.out.println("Player crosses the ball into the box.");
    }

    @Override
    public void pressX() {
        System.out.println("Player makes a short pass.");
    }
}
