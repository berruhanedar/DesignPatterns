package com.berruhanedar.Creational.Factory.example2;

public class iPhone13Factory extends PhoneFactory{

    @Override
    Phone createPhone() {
        return new iPhone13();
    }
}
