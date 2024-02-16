package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone, String s) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<Vehicle>();
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public List<Vehicle> getVehiclesByPrice(double minPrice, double maxPrice) {
        List<Vehicle> vehiclesWithinPriceRange = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            double price = vehicle.getPrice();
            if (price >= minPrice && price <= maxPrice)
                vehiclesWithinPriceRange.add(vehicle);
        }
        return vehiclesWithinPriceRange;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        List<Vehicle> vehiclesByMakeModel = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)) {
                vehiclesByMakeModel.add(vehicle);
            }
        }
        return vehiclesByMakeModel;
    }

    public List<Vehicle> getVehiclesByYear(int minYear, int maxYear) {
        List<Vehicle> vehiclesByYear = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            int year = vehicle.getYear();
            if (year >= minYear && year <= maxYear) {
                vehiclesByYear.add(vehicle);
            }
        }
        return vehiclesByYear;
    }

    public List<Vehicle> getVehiclesByColor(String color) {
        List<Vehicle> vehiclesByColor = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getColor().equalsIgnoreCase(color)) {
                vehiclesByColor.add(vehicle);
            }
        }
        return vehiclesByColor;
    }

    public List<Vehicle> getVehiclesByMileage(double minMileage, double maxMileage) {
        List<Vehicle> vehiclesByMileage = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            double mileage = vehicle.getMileage();
            if (mileage >= minMileage && mileage <= maxMileage) {
                vehiclesByMileage.add(vehicle);
            }
        }
        return vehiclesByMileage;
    }

    public List<Vehicle> getVehiclesByType(String type) {
        List<Vehicle> vehiclesByType = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getType().equalsIgnoreCase(type)) {
                vehiclesByType.add(vehicle);
            }
        }
        return vehiclesByType;
    }

    public List<Vehicle> getAllVehicles() {

        return new ArrayList<>(inventory);
    }

    public boolean addVehicle(Vehicle newVehicle) {

        return inventory.add(newVehicle);
    }

    public boolean removeVehicle(int vin) {

        for (Vehicle vehicle : inventory) {
            if (vehicle.getVin() == vin) {
            }
            return inventory.remove(vehicle);
        }
        return false;
    }

}