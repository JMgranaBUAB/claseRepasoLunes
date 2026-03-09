package org.example.transportJM;

import org.example.interfaces.PrintVehicle;
import org.example.interfaces.TruckClient;

public class Truck extends Vehicle implements PrintVehicle, TruckClient {


    private boolean trailer;
    private int payload;

    public Truck(String model, String color, int power, String numberPlate, int numberWheels, boolean trailer, int payload) {

        super(model, color, numberWheels, numberPlate, power);

        this.trailer = trailer;
        this.payload = payload;
    }

    @Override
    public void printVehicle(){
        System.out.println("CAMION // modelo : " + getModel() + " | color : " + getColor() + " | Potencia : " + getPower() + "cv | Matricula : " + getNumberPlate() + " | Num Ruedas : " + getNumberWheels() + " | remolque : " + trailer + " | tara : " + payload + "T");    }

    @Override
    public void Client() {
        System.out.println("Vinos de Jerez y Alfombras Madrileñas");
    }
}
