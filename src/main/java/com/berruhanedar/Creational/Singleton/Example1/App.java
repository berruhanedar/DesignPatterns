package com.berruhanedar.Creational.Singleton.Example1;

public class App {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Singleton singleton = Singleton.getInstance();
        }
    }
}
