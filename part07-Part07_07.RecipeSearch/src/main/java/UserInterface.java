
import java.nio.file.Paths;
import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private RecipeLibrary library;

    public UserInterface(Scanner scanner, RecipeLibrary library) {
        this.scan = scanner;
        this.library = library;
    }

    public void start() {

        System.out.println("Commands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n");

        System.out.print("Enter command: ");
        String command = this.scan.nextLine();

        while (true) {
            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                System.out.println();

                this.library.print();
            }

            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String name = this.scan.nextLine();
                System.out.println();
                this.library.findName(name);
            }
            
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int time = Integer.valueOf(this.scan.nextLine());
                System.out.println();
                this.library.findTime(time);
            }
            
            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = this.scan.nextLine();
                System.out.println();
                this.library.findIngredient(ingredient);
            }

            System.out.println();
            System.out.print("Enter command: ");
            command = this.scan.nextLine();
        }

    }

}
