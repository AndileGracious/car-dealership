package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {

    private Dealership dealership;

    // init method to load dealership from file so display can use it
    private void init() {
        DealershipFileManager manager = new DealershipFileManager();
        this.dealership = manager.getDealership();
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
    // Using switch case to display the Vehicles or exit depending on which choice they make

    public void display() {

        int choice = -1;
        while (choice != 0) {
            init();
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Hello, please select one of the following options: ");
            System.out.println(" 1. Lists All");
            System.out.println(" 0. Exit");
            choice = myScanner.nextInt();

            switch (choice) {
                case 1:
                    displayVehicles(dealership.getAllVehicles());
                    break;
                case 0:
                    System.out.println("You exited");
                    break;
            }
        }

    }
}