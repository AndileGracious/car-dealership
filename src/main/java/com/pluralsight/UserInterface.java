package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {

    private Dealership dealership;

    public UserInterface(Dealership dealership) {
        this.dealership = dealership;
    }

    // display method
    // create arrayList to hold all vehicle objects
    // using for each loop to loop through all vehicles and display all of them until it reads null

    private void displayVehicles(ArrayList<Vehicle> vehicles) {

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVin() + "|" + vehicle.getYear() + "|" + vehicle.getMake() + "|" + vehicle.getModel() + "|" + vehicle.getVehicleType() + "|" + vehicle.getColor() + "|" + vehicle.getOdometer() + "|" + vehicle.getPrice());
        }

    }
    // Create scanner method to have the user select what they would like to do
    public void display(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hello, please select one of the following options: ");
        System.out.println(" 1. Lists All");
        System.out.println(" 0. Exit");
        int choice = myScanner.nextInt();

    }
}
