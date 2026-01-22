package com.berruhanedar.Behavioral.ObjectPatterns.State;

public class App {
    public static void main(String[] args) {
        Game game = new Game();
        game.x();
        game.triangle();
        game.square();
        game.loseBall();

        game.x();
        game.square();
        game.takeBall();

    }
}
