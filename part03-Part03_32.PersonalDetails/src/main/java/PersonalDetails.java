
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = 0;
        int sum = 0;
        String name = "name";
        int count = 0;

        while (true) {
            String text = scanner.nextLine();

            if (text.equals("")) {
                break;
            }

            String[] pieces = text.split(",");

            sum += Integer.valueOf(pieces[1]);

            count += 1;
            
            if (length < pieces[0].length()) {
                length = pieces[0].length();
                name = pieces[0];
            }
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + 1.0 * sum/count);

    }
}
