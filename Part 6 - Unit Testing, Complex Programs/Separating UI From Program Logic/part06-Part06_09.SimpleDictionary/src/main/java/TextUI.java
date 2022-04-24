
import java.util.Scanner;

public class TextUI {

    private SimpleDictionary simpleDictionary;
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.simpleDictionary = simpleDictionary;
        this.scanner = scanner;
    }

    public void start() {
        System.out.print("Command: ");
        String command = this.scanner.nextLine();

        while (!(command.equals("end"))) {

            if (command.equals("add")) {
                System.out.print("Word: ");
                String word = this.scanner.nextLine();

                System.out.print("Translation: ");
                String translation = this.scanner.nextLine();

                this.simpleDictionary.add(word, translation);

            }

            if (command.equals("search")) {
                System.out.print("To be translated: ");
                String word = this.scanner.nextLine();
                String translated = this.simpleDictionary.translate(word);
                if (translated == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                    System.out.println(translated);
                }
            }

            System.out.println("Unknown command");
            System.out.print("Command: ");
            command = this.scanner.nextLine();
        }

        System.out.println("Bye bye!");

    }

}
