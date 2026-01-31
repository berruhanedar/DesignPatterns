package com.berruhanedar.Creational.Singleton.Example1;

public class Singleton {

    private static Singleton singleton = new Singleton(); // Static methodda kullanılacak static olmalı

    private static int number = 0;

    private Singleton(){
        System.out.println("Singleton Constructor");
    }

    public static Singleton getInstance(){ // Static olmalı !!!!
        number++;
        System.out.println(number);
        return singleton;
    }
}
