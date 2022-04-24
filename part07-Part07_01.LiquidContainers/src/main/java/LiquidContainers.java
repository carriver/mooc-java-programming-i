
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (amount < 0) {
                break;
            }

            if (command.equals("add")) {
                first += amount;

                if (first > 100) {
                    first = 100;
                }
            }

            if (command.equals("move")) {

                if (amount > first) {
                    amount = first;
                }

                second += amount;
                first -= amount;

                if (second > 100) {
                    second = 100;
                }
            }

            if (command.equals("remove")) {
                if (amount > second) {
                    amount = second;
                }

                second -= amount;
            }
            
            System.out.println();
        }
    }

}
