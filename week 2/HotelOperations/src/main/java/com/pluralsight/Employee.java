package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0.0; // By default, employee has not worked any hours
    }

    // Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Derived getters
    public double getTotalPay() {
        // Calculate total pay based on hours worked and pay rate
        double totalPay;
        if (hoursWorked <= 40.0) {
            totalPay = hoursWorked * payRate;
        } else {
            totalPay = 40.0 * payRate + (hoursWorked - 40.0) * payRate * 1.5; // Overtime rate is 1.5 times the normal rate
        }
        return totalPay;
    }

    public double getRegularHours() {
        // Regular hours are hours worked up to 40 hours
        return Math.min(hoursWorked, 40.0);
    }

    public double getOvertimeHours() {
        // Overtime hours are hours worked beyond 40 hours
        return Math.max(hoursWorked - 40.0, 0.0);
    }
}

