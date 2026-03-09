package org.example.transportJM;

public abstract class Vehicle {

    private String model;
    private String color;
    private int numberWheels;
    private String numberPlate;
    private int power;

    public Vehicle(String model, String color, int numberWheels, String numberPlate, int power) {
        this.model = model;
        this.color = color;
        this.numberWheels = numberWheels;
        this.numberPlate = numberPlate;
        this.power = power;
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

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public abstract void printVehicle();
}
