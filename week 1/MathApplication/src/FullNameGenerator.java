import java.util.Scanner;

public class FullNameGenerator {
    public static void main(String [] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = userInput.nextLine();

        System.out.print("Enter you middle name (if you have one): ");
        String middleName = userInput.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = userInput.nextLine();

        System.out.print("Enter suffix (if you have one): ");
        String suffix = userInput.nextLine();

    }
}
