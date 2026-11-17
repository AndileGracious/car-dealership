package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;


public class DealershipFileManager {
    public Dealership getDealership() {


        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("inventory.csv"));

            String firstLine = bufferedReader.readLine();
            String[] firstParts = firstLine.split("\\|");
            Dealership dealership = new Dealership (firstParts[0], firstParts[1], firstParts[2]);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split("\\|");
                int vin = Integer.parseInt(parts[0]);
                int year = Integer.parseInt(parts[1]);
                String make = parts[2];
                String model = parts[3];
                String vehicleType = parts[4];
                String color = parts[5];
                int odometer = Integer.parseInt(parts[6]);
                BigDecimal price = new BigDecimal(parts[7]);

                dealership.addVehicle(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));
            }
            bufferedReader.close();
            return dealership;

        } catch (Exception e) {
            System.out.println("An error has occured!");
            return null;
        }

    }
    public void saveDealership(Dealership dealership){

    }
}