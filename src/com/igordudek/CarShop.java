package com.igordudek;

public class CarShop {

    public static void main(String[] args) {

        Car audiA4 = new Car("Audi", "A4", 5, "Czarny", "Biale", "Czarne");
        Car vwPassat = new Car("Volkswagen", "Passat", 5, "niebieski", "Srebrne", "Czarne");

        audiA4.printInfo();
        vwPassat.printInfo();
    }
}
