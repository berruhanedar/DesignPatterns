package com.berruhanedar.Structural.Adapter;

public class App {
    public static void main(String[] args) {
        Socket socket =new Socket();
        Iron iron = new Iron();
        Fridge fridge = new Fridge();

        socket.powerOn(iron);
        socket.powerOn(fridge);

        IPhoneDevice iPhone = new IPhoneDevice();
        Adapter adapter = new Adapter(iPhone);
        socket.powerOn(adapter);
    }
}
