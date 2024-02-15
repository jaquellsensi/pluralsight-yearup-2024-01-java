package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        Dealership dealership = new Dealership("D & B Used Cars|111 Old Benbrook Rd|817-555-5555");
        UserInterface userInterface = new UserInterface(dealership);

        userInterface.display();


    }
}
