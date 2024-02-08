package com.pluralsight;

import java.util.Scanner;

public class PizzaApplication
{
    public void run()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Welcome to Pizzeria");
        System.out.println("-------------------");
        System.out.println();

        System.out.print("Please enter your name: ");
        System.out.println();

        System.out.println("Menu");
        System.out.println("--------------------");

        System.out.println("Pizza Sizes:");
        System.out.println(" (S)mall - $ 5.99 ");
        System.out.println(" (M)edium - $ 8.99");
        System.out.println(" (L)arge - $ 11.99");
        System.out.println("Select your pizza size: ");
        String size = scanner.nextLine().strip();
        System.out.println();

        System.out.println("Sauces:");
        System.out.println(" (T)omato");
        System.out.println(" (A)lfredo");
        System.out.println(" (B)BQ");
        System.out.println("Select your sauce: ");
        String sauce = scanner.nextLine().strip();
        System.out.println();

        System.out.println("Cheeses:");
        System.out.println(" (M)ozzerella");
        System.out.println(" (P)rovolone");
        System.out.println(" (A)merican");
        System.out.println(" (C)hedder");
        System.out.println("Select your cheese: ");
        String cheese = scanner.nextLine().strip();
        System.out.println();

        System.out.println("Toppings:");


        // display order
        System.out.println();
        System.out.println("Order Details: ");
        System.out.println("-".repeat(20));
        System.out.println("Name:    " + name);
        System.out.println("Price:    $ " + totalPrice);
        System.out.println();
    }
}
