package com.berruhanedar.Creational.Factory.example2;

public class iPhone17Factory extends PhoneFactory{

    @Override
    Phone createPhone() {
        return new iPhone17();
    }
}
