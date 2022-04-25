
import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private Database database;

    public UserInterface(Scanner scan, Database database) {
        this.scan = scan;
        this.database = database;
    }

    public void start() {
        while (true) {

            System.out.print("? ");
            String command = this.scan.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {

                System.out.print("Name: ");
                String name = this.scan.nextLine();

                System.out.print("Name in Latin: ");
                String latinName = this.scan.nextLine();

                this.database.add(new Bird(name, latinName));
            }
            
            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String name = this.scan.nextLine();
                
                this.database.addObservation(name);
            }
            
            if (command.equals("All")) {
                this.database.printAll();
            }
            
            if (command.equals("One")) {
                System.out.print("Bird? ");
                String name = this.scan.nextLine();
                this.database.printOne(name);
            }
        }

    }

}
