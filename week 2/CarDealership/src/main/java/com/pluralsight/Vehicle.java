package com.pluralsight;

public class Vehicle
{
    private int vin;
    private int year;
    private String make;
    private String model;

    private String vehicleType;

    private String color;

    private int mileage;

    private double price;

    public Vehicle(int vin,int year, String make, String model,
                   String vehicleType, String color, double mileage, double price, String s) {
    }




    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double setPrice() {
        return 0;
    }
    public void getPrice(double price) {
        this.price = price;
    }

    public void newVehicle(int vin, int year, String make, String model,
                           String vehicleType, String color, double mileage, double price) {
    }
}
