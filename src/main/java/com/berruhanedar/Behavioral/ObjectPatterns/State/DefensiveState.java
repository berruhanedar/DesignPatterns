package com.berruhanedar.Behavioral.ObjectPatterns.State;

public class DefensiveState implements ConsoleState {

    @Override
    public void pressSquare() {
        System.out.println("Player switches to defensive mode.");
    }

    @Override
    public void pressTriangle() {
        System.out.println("Goalkeeper comes forward to defend.");
    }

    @Override
    public void pressCircle() {
        System.out.println("Player performs a sliding tackle.");
    }

    @Override
    public void pressX() {
        System.out.println("Player applies close marking.");
    }
}
