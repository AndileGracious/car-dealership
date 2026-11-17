package com.pluralsight;

import java.util.ArrayList;

public class UserInterface {
    // display method
    // create arrayList to hold all vehicle objects
    // using for each loop to loop through all vehicles and display all of them until it reads null

    private void displayVehicles(ArrayList<Vehicle> vehicles) {

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVin() + "|" + vehicle.getYear() + "|" + vehicle.getMake() + "|" + vehicle.getModel() + "|" + vehicle.getVehicleType() + "|" + vehicle.getColor() + "|" + vehicle.getOdometer() + "|" + vehicle.getPrice());
        }

    }
}
