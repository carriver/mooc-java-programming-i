
import java.util.Random;
import java.util.Scanner;

public class UserInterface {

    private JokeManager manager;
    private Scanner scanner;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list manager");
            System.out.println(" X - stop");

            String command = this.scanner.nextLine();

            if (command.equals("X") || command.equals("x")) {
                break;
            }

            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                this.manager.addJoke(joke);

            } else if (command.equals("2")) {
                System.out.println("Drawing a joke.");

                if (manager.getJokes().isEmpty()) {
                    System.out.println("Jokes are in short supply.");
                } else {
                    Random draw = new Random();
                    int index = draw.nextInt(manager.getJokes().size());
                    System.out.println(manager.getJokes().get(index));
                }

            } else if (command.equals("3")) {
                System.out.println("Printing the manager.");
                for (String joke : manager.getJokes()) {
                    System.out.println(joke);
                }
            }
        }
    }

}
