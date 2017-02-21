package com.igordudek;

/**
 * Created by VADMIN on 2017-02-21.
 */
class Car {

    //VARIABLES
    private int year;
    private String brand;
    private String model;
    private String color;

    //CONSTRUCTORS
    public Car(int year, String brand, String model, String color) {

        this.setYear(year);
        this.setBrand(brand);
        this.setModel(model);
        this.setColor(color);
    }



    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void printInfo() {
        String info = " ";
        info = info + brand + " ";
        info = info + model + ", ";
        info = info + "kolor: " + color + ", ";
        info = info + "rocznik: " + year + ", ";


        System.out.println(info);
    }
}

