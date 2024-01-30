import java.util.Scanner;

public class BasicCalculator {

    public static void main(String [] args){
        Scanner userInput = new Scanner(System.in);

        // Declare variables
        double num1,num2,results;
        char option;

        //input
        System.out.print("Enter the first number: ");
        num1 = userInput.nextDouble();

        System.out.print("Enter the second Number: ");
        num2 = userInput.nextDouble();

        // Display
        System.out.println("Possible calculations: ");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.print("Please select an option: ");
        char option = Scanner.next().charAt(0);

        // Output
        switch (Character.toUpperCase(option)) {
            case 'A':
                System.out.println("Result: " + (num1 + num2));
                break;
            case 'S':
                System.out.println("Result: " + (num1 - num2));
                break;
            case 'M':
                System.out.println("Result: " + (num1 * num2));
                break;
            case 'D':
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid option. Please select A, S, M, or D.");
        }
    }
System.out.println("Result: " + results);

    // Close the scanner
        scanner.close();
}

