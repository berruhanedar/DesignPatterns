package com.berruhanedar.Creational.Singleton.resourcemanager;

public class ResourceManager {
    public static void main(String[] args) {
        // PrintSpooler spooler = new PrintSpooler();
        // It's not work because we apply singleton design and constructor is private
        PrintSpooler spooler = PrintSpooler.getInstance();
    }
}
