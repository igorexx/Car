package com.igordudek;

public class CarShop {

    public static void main(String[] args) {

        Car audiA4 = new Car(2008, "Audi", "A4", "czarny");
        Car vwPassat = new Car(2015, "Volkswagen", "Passat", "bialy");
        Car fiatBravo = new Car(2009, "Fiat", "Bravo", "srebrny");

        audiA4.printInfo();
        vwPassat.printInfo();
        fiatBravo.printInfo();


    }
}
