import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to BTU Chat Bot. \nHow Can I Help You?");
        while (true) {
            Scanner input = new Scanner(System.in);
            String question = input.nextLine();

            if (question.toString().contains("faculties")) {
                System.out.println("We have total of 3 faculties: Business Administration, IT, Marketing;");
            } else if (question.toString().contains("pay")) {
                System.out.println("Each Faculty Pay is 2250GEL.");
            } else if (question.toString().contains("time")) {
                System.out.println("Each Faculty Duration is 4 Years.");
            } else if (question.toString().contains("students")) {
                System.out.println("We Have More Than 2500 Students.");
            } else {
                System.out.println("For Additional Questions You Will Have to Wait Until We are Online! We Will Be Back Soon.");
                System.exit(0);
            }
        }
    }
}