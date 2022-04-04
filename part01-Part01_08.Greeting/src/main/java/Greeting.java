
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        System.out.println("What's your name?");
        String message = scanner.nextLine();

        // Print the message written by the user
        System.out.println("Hi " + message);

    }
}
