package com.berruhanedar.Creational.Factory.example2;

public class App {
    public static void main(String[] args) {
        PhoneFactory iPhone13 = new iPhone13Factory();
        iPhone13.createPhone();

        PhoneFactory iPhone17 = new iPhone17Factory();
        iPhone17.createPhone();

    }
}
