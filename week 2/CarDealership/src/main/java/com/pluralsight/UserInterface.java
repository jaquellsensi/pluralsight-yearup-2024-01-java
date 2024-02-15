package com.pluralsight;

import java.util.ArrayList;
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
            // Display the main menu options
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
                System.out.println(vehicle); // Assuming Vehicle class has overridden toString() method
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

    public void processGetByYearRequest() {
        // Process user request to get vehicles by year
        // Get input for min and max year
        // Call dealership method to get vehicles by year and display results
    }

    public void processGetByColorRequest() {
        // Process user request to get vehicles by color
        // Get input for color
        // Call dealership method to get vehicles by color and display results
    }

    public void processGetByMileageRequest() {
        // Process user request to get vehicles by mileage
        // Get input for min and max mileage
        // Call dealership method to get vehicles by mileage and display results
    }

    public void processGetByVehicleTypeRequest() {
        // Process user request to get vehicles by vehicle type
        // Get input for vehicle type
        // Call dealership method to get vehicles by vehicle type and display results
    }

    public void processGetAllVehiclesRequest() {
        // Process user request to get all vehicles
        // Call dealership method to get all vehicles and display results
    }

    public void processAddVehicleRequest() {
        // Process user request to add a vehicle
        // Get input for vehicle details
        // Call dealership method to add the vehicle
    }

    public void processRemoveVehicleRequest() {
        // Process user request to remove a vehicle
        // Get input for vehicle details or select from displayed vehicles
        // Call dealership method to remove the vehicle
    }


}


