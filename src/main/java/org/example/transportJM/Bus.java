package org.example.transportJM;

import org.example.interfaces.PrintVehicle;
import org.example.interfaces.Travel;

public class Bus extends Vehicle implements PrintVehicle, Travel {


    private int seat;
    private int flat;
    private int wc;

    public Bus(String model, String color, int numberWheels, String numberPlate, int power, int seat, int flat, int wc) {
        super(model, color, numberWheels, numberPlate, power);


        this.seat = seat;
        this.flat = flat;
        this.wc = wc;
    }

    @Override
    public void printVehicle(){
        System.out.println("BUS // modelo : " + getModel() + " | color : " + getColor() + " | Potencia : " + getPower() + "cv | Matricula : " + getNumberPlate() + " | Num Ruedas : " + getNumberWheels() + " | asientos : " + seat + " | pisos : " + flat  + " | baños : " + wc);
    }

    @Override
    public void Travelzone() {
        System.out.println("viaja Por Francia e Italia");
    }
}
