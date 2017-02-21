package com.igordudek;

/**
 * Created by VADMIN on 2017-02-21.
 */
class Car {
    int doors;
    String carColor;
    String wheelsColor;
    String tiresColor;
    String brand;
    String model;

    //Konstruktor
    Car(String carBrand, String carModel, int doorsNumber, String color, String wheels, String tires) {

        brand = carBrand;
        model = carModel;
        doors = doorsNumber;
        carColor = color;
        wheelsColor = wheels;
        tiresColor = tires;
    }



    void printInfo() {
        String info = " ";
        info = info + brand + " ";
        info = info + model + ", ";
        info = info + "kolor: " + carColor + ", ";
        info = info + "drzwi: " + doors + ", ";
        info = info + "felgi: " + wheelsColor + ", ";
        info = info + "opony: " + tiresColor;

        System.out.println(info);
    }
}

