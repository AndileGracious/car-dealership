package com.pluralsight;

import java.util.ArrayList;

public class Dealership {

      private  String name;
      private  String address;
      private  String phone;
      private ArrayList<Vehicle>inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle){
        inventory.remove(vehicle);
    }
    public ArrayList<Vehicle>getAllVehicles(){
        return inventory;
    }
    public ArrayList<Vehicle>getVehicleByMakeModel(String make, String model){
        ArrayList<Vehicle>result = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)){
                result.add(vehicle);
            }

        }
        return result;
    }
    public ArrayList<Vehicle>getVehicleByColor(String color) {
        ArrayList<Vehicle>result = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getColor().equalsIgnoreCase(color)) {
                result.add(vehicle);
            }
        }
        return result;
    }


    public ArrayList<Vehicle>getVehicleByVehicleType(String vehicleType) {
        ArrayList<com.pluralsight.Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getVehicleType().equalsIgnoreCase(vehicleType)) {
                result.add(vehicle);
            }
        }
        return result;

    }
}