package com.pluralsight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    private Scanner scanner;

    public UserInterface(Dealership dealership) {
        this.dealership = dealership;
        this.scanner = new Scanner(System.in);
    }

    public void display() {
        int choice;
        do {
            // Display the main menu
            System.out.println("Car Dealership Management System");
            System.out.println("1. Get Vehicles by Price");
            System.out.println("2. Get Vehicles by Make and Model");
            System.out.println("3. Get Vehicles by Year");
            System.out.println("4. Get Vehicles by Color");
            System.out.println("5. Get Vehicles by Mileage");
            System.out.println("6. Get Vehicles by Vehicle Type");
            System.out.println("7. Get All Vehicles");
            System.out.println("8. Add Vehicle");
            System.out.println("9. Remove Vehicle");
            System.out.println("0. Exit");

            choice = getMenuChoice();
            switch (choice) {
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                    break;
                case 7:
                    processGetAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                case 0:
                    System.out.println("Exiting the program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
    }

    private int getMenuChoice(){
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    private void processGetByPriceRequest() {
        System.out.println("Enter the minimum price:");
        double minPrice = scanner.nextDouble();
        System.out.println("Enter the maximum price:");
        double maxPrice = scanner.nextDouble();

        // Call the dealership method to get vehicles by price
        List<Vehicle> vehiclesByPrice = dealership.getVehiclesByPrice(minPrice, maxPrice);

        // Display the results
        System.out.println("Vehicles within price range $" + minPrice + " - $" + maxPrice + ":");
        if (((List<?>) vehiclesByPrice).isEmpty()) {
            System.out.println("No vehicles found within the specified price range.");
        } else {
            for (Vehicle vehicle : vehiclesByPrice) {
                System.out.println(vehicle);
            }
        }
    }

    private void processGetByMakeModelRequest() {
        System.out.println("Enter the make: ");
        String make = scanner.next();
        System.out.println("Enter the model: ");
        String model = scanner.next();

        List<Vehicle> vehiclesByMakeModel = dealership.getVehiclesByMakeModel(make, model);

        System.out.println("Vehicles with make: " +  make + ", model: " + model + ":");
        if (vehiclesByMakeModel.isEmpty()) {
            System.out.println("No vehicles found matching the specified make and model.");
        } else {
            for (Vehicle vehicle : vehiclesByMakeModel) {
                System.out.println(vehicle);

            }
        }
    }

    private void processGetByYearRequest() {
        System.out.println("Enter the minimum year: ");
        int minYear = scanner.nextInt();
        System.out.println("Enter the maximum year: ");
        int maxYear = scanner.nextInt();

        List<Vehicle> vehiclesByYear = dealership.getVehiclesByYear(minYear, maxYear);

        System.out.println("Vehicles within year range " + minYear + " - " + maxYear + ":");
        if (vehiclesByYear.isEmpty()) {
            System.out.println("No vehicles found within the specified year range.");
        } else {
            for (Vehicle vehicle : vehiclesByYear) {
                System.out.println(vehicle);
            }
        }
    }

    public void processGetByColorRequest() {
        System.out.println("Enter the color: ");
        String color = scanner.next();

        List<Vehicle> vehiclesByColor = dealership.getVehiclesByColor(color);

        System.out.println("Vehicles with color " + color + ":");
        if (vehiclesByColor.isEmpty()) {
            System.out.println("No vehicles found with the specified year color.");
        } else {
            for (Vehicle vehicle : vehiclesByColor) {
                System.out.println(vehicle);
            }
        }
    }

    private void processGetByMileageRequest() {
        System.out.println("Enter the minimum mileage: ");
        double minMileage = scanner.nextDouble();
        System.out.println("Enter the maximum mileage: ");
        double maxMileage = scanner.nextDouble();

        List<Vehicle> vehiclesByMileage = dealership.getVehiclesByMileage(minMileage, maxMileage);

        System.out.println("Vehicles within mileage range " + minMileage + " - " + maxMileage + ":");
        if (vehiclesByMileage.isEmpty()) {
            System.out.println("No vehicles found within the specified mile range.");
        } else {
            for (Vehicle vehicle : vehiclesByMileage) {
                System.out.println(vehicle);
            }
        }
    }

    private void processGetByVehicleTypeRequest() {
        System.out.println("Enter the vehicles type: ");
        String type = scanner.next().toLowerCase();

        List<Vehicle> validTypes = Arrays.asList(44901 | 2012 | Honda | Civic | SUV | Gray | 103221|6995.00);
        if (!validTypes.contains(type)) {
            System.out.println("Invalid vehicle type. Please enter a valid type.");
            return;
        }

        List<Vehicle> vehiclesByType = dealership.getVehiclesByType(type);

        System.out.println("Vehicles with type " + type + ":");
        if (vehiclesByType.isEmpty()) {
            System.out.println("No vehicles found with the specified type.");
        } else {
            for (Vehicle vehicle : vehiclesByType) {
                System.out.println(vehicle);
            }
        }
    }

    private void processGetAllVehiclesRequest() {
        List<Vehicle> allVehicles = dealership.getAllVehicles();

        System.out.println("All vehicles: ");
        if (allVehicles.isEmpty()) {
            System.out.println("No vehicles found.");
        } else {
            for (Vehicle vehicle : allVehicles) {
                System.out.println(vehicle);
            }
        }
    }

        private void processAddVehicleRequest() {
            System.out.println("Enter details of vehicles to add:");
            System.out.println("Make:");
            String make = scanner.next();
            System.out.println("Model:");
            String model = scanner.next();
            System.out.println("Year:");
            int year = scanner.nextInt();
            System.out.println("Color:");
            String color = scanner.next();
            System.out.println("Mileage:");
            double mileage = scanner.nextDouble();

            Vehicle vehicle = new Vehicle(make, model, year, color, mileage);

            dealership.addVehicle(newVehicle);

            System.out.println("Vehicle added successfully:");
            System.out.println(newVehicle);
    }

    public void processRemoveVehicleRequest() {
        // Process user request to remove a vehicle
        // Get input for vehicle details or select from displayed vehicles
        // Call dealership method to remove the vehicle
    }


}


