package com.pluralsight;

public class Reservation {
    private String roomType;
    private double pricePerNight;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;

        // Set initial price per night based on room type
        if ("king".equalsIgnoreCase(roomType)) {
            this.pricePerNight = 139.00;
        } else if ("double".equalsIgnoreCase(roomType)) {
            this.pricePerNight = 124.00;
        } else {

            this.pricePerNight = 0.0;
        }

        // Increase price per night by 10% for weekends
        if (isWeekend) {
            this.pricePerNight *= 1.10;
        }
    }

    // Getters and Setters
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    // Calculate reservation total
    public double getReservationTotal() {
        return pricePerNight * numberOfNights;
    }
}


