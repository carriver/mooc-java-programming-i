
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("File to read: ");
        String file = reader.nextLine();
        System.out.println("\n");

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            RecipeLibrary library = new RecipeLibrary(scanner);
            library.readFile();

            UserInterface ui = new UserInterface(reader, library);
            ui.start();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
