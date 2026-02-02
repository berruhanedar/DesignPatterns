package com.berruhanedar.Creational.Singleton.threadsafe;

public class PrintSpooler {
    // Eager  Loading
    private static final PrintSpooler spooler = new  PrintSpooler();

    private static boolean initalized = false;

    private PrintSpooler() {}

    private void init(){
        // Code to initialize our print spooler goes here
    }

    public static synchronized PrintSpooler getInstance(){
        if(initalized) return spooler;
        spooler.init();
        initalized = true;
        return spooler;
    }
}
