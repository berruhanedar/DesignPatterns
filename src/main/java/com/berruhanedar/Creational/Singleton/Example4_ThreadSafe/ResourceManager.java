package com.berruhanedar.Creational.Singleton.Example4_ThreadSafe;

public class ResourceManager {
    public static void main(String[] args) {
        // Java supports concurrency
        PrintSpooler spooler = PrintSpooler.getInstance();

        // First Thread
        Thread threadOne = new Thread(()->{PrintSpooler s = PrintSpooler.getInstance();});

        // Second Thread
        Thread threadTwo = new Thread(()->{PrintSpooler s = PrintSpooler.getInstance();});

        // Danger: If Singleton is not thread-safe, multiple instances may be created.
        threadOne.start();
        threadTwo.start();




    }
}
