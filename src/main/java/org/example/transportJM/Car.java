package org.example.transportJM;

import org.example.interfaces.PrintVehicle;
import org.example.interfaces.TruckClient;

public class Car extends Vehicle implements PrintVehicle, TruckClient {

    private String fuel;

    public Car(String model, String color, int numberWheels, String numberPlate, int power, String fuel) {
        super(model, color, numberWheels, numberPlate, power);
        this.fuel = fuel;
    }

    @Override
    public void printVehicle() {
        System.out.println("COCHE // modelo : " + getModel() + " | color : " + getColor() + " | Potencia : " + getPower() + "cv | Matricula : " + getNumberPlate() + " | Num Ruedas : " + getNumberWheels() + " | Tipo combustible : " + fuel );
    }

    @Override
    public void Client() {
        System.out.println("");

    }
}
