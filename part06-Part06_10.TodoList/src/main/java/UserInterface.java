
import java.util.Scanner;

public class UserInterface {

    private TodoList todo;
    private Scanner scanner;

    public UserInterface(TodoList todo, Scanner scanner) {
        this.todo = todo;
        this.scanner = scanner;
    }

    public void start() {
        System.out.print("Command: ");
        String command = this.scanner.nextLine();

        while (!(command.equals("stop"))) {

            if (command.equals("add")) {
                System.out.print("To add: ");
                String task = this.scanner.nextLine();

                this.todo.add(task);
            }

            if (command.equals("remove")) {
                System.out.print("Which one is removed?: ");
                int taskNumber = Integer.valueOf(this.scanner.nextLine());

                this.todo.remove(taskNumber);
            }
            
            if (command.equals("list")) {
                this.todo.print();
            }

            System.out.println("Unknown command");
            System.out.print("Command: ");
            command = this.scanner.nextLine();
        }

    }
}
