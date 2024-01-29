package com.pluralsight;
public class MathApp {
    public static void main(String[] args) {
        // Question 1:
        double BobSalary = 50000.0;
        double GarySalary = 60000.0;
        double HighestSalary = Math.max(BobSalary, GarySalary);
        System.out.println("1. The highest salary is: " + HighestSalary);

        // Question 2
        double carPrice = 25000.0;
        double truckPrice = 22000.0;
        double smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("2. The smallest price is: " + smallestPrice);

        // Question 3
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("3. The area of the circle is: " + area);

        // Question 4
        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("4. The square root of " + number + " is: " + squareRoot);

        // Question 5
        double x1 = 5.0;
        double y1 = 10.0;
        double x2 = 85.0;
        double y2 = 50.0;
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("5. The distance between the points is: " + distance);

        // Question 6
        double negativeValue = -3.8;
        double absoluteValue = Math.abs(negativeValue);
        System.out.println("6. The absolute value of " + negativeValue + " is: " + absoluteValue);

        // Question 7
        double randomValue = Math.random();
        System.out.println("7. A random number between 0 and 1 is: " + randomValue);
    }

}