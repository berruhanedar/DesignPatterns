package com.berruhanedar.Creational.Singleton.Example3;

public class PrintSpooler {
    private static PrintSpooler spooler;

    private static boolean initalized = false;

    private PrintSpooler() {}

    private void init(){
        // Code to initialize our print spooler goes here
    }

    public static PrintSpooler getInstance(){
        if(initalized) return spooler;
        // Lazy Loading
        spooler = new PrintSpooler();
        spooler.init();
        initalized = true;
        return spooler;
    }
}
