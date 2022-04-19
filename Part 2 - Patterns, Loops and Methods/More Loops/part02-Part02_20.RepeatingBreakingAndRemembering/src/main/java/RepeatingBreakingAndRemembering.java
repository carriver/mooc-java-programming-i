
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        int sum = 0;
        int numbers = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {

                System.out.println("Thx! Bye!");
                break;

            } else if (input != -1) {

                sum += input;
                numbers++;
                avg = (double)sum / numbers;

                if (input % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }

            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
