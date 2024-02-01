import java.sql.SQLOutput;
import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the score in the format Home: Visitor | HomeScore:VisitorScore ");
        String input = userInput.nextLine();

        String[] parts = input.split("\\|")[0].split(":");
        int homeScore = Integer.parseInt(parts[1]);
        int visitorScore = Integer.parseInt(parts[2]);
        
        if (homeScore > visitorScore){
            System.out.println("Home team has the higher score!");
        } else if (homeScore < visitorScore) {
            System.out.println("Visitor team has the higher score!");
        } else {
            System.out.println("the scores are tied!");
        }
    }
}
