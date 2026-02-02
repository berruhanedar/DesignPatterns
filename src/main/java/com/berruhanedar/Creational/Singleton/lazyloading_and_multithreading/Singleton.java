package com.berruhanedar.Creational.Singleton.lazyloading_and_multithreading;

public class Singleton {

    private static Singleton singleton;// Global Değişken

    private static int number = 0;

    private Singleton() {
        System.out.println("Singleton Constructor");
    }

    public static Singleton getInstance() { // Thread Sfe
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        number++;
        System.out.println(number);
        return singleton;
    }
}
