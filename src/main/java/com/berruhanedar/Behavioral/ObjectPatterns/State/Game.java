package com.berruhanedar.Behavioral.ObjectPatterns.State;

public class Game {
    private ConsoleState consoleState;

    public Game() {
        System.out.println("Game started");
        consoleState = new AttackingState();
    }

    public void triangle() {
        consoleState.pressTriangle();
    }

    public void square() {
        consoleState.pressSquare();
    }

    public void circle() {
        consoleState.pressCircle();
    }

    public void x() {
        consoleState.pressX();
    }

    public void takeBall() {
        System.out.println("Ball won! Switching to attack.");
        consoleState = new AttackingState();
    }

    public void loseBall() {
        System.out.println("Ball lost! Switching to defence.");
        consoleState = new DefensiveState();
    }
}
