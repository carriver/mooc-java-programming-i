
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int input1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Where from?");
        int input2 = Integer.valueOf(scanner.nextLine());

        for (int i = input2; i <= input1; i++) {
            System.out.println(i);
        }
    }
}
