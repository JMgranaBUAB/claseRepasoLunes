package org.example;

import org.example.transportJM.Bus;
import org.example.transportJM.Car;
import org.example.transportJM.Truck;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Truck truck1 = new Truck("R21", "amarillo", 250, "2541AAA", 16, true, 25);
        Truck truck2 = new Truck("T254", "blanco", 90, "25698BBB", 6, false, 5);

        truck1.printVehicle();
        truck2.printVehicle();

        Bus bus1 = new Bus("S55", "blanco", 6, "6989CCC", 150, 60, 1, 2);
        Bus bus2 = new Bus("S785", "verde", 4, "4589DDD", 100, 20, 1, 0);

        bus1.printVehicle();
        bus2.printVehicle();

        Car car1 = new Car("Ford escort", "rojo", 4, "4875FFF", 50, "Diesel");

        car1.printVehicle();
    }
}
