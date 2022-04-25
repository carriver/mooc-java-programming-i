
import java.util.ArrayList;
import java.util.Scanner;

public class Database {

    private ArrayList<Bird> database;

    public Database() {
        this.database = new ArrayList<>();
    }

    public void printAll() {
        if (this.database.isEmpty()) {
            System.out.println("No birds");

        } else {
            for (Bird bird : this.database) {
                System.out.println(bird);
            }
        }
    }

    public void printOne(String name) {
        if (this.database.isEmpty()) {
            System.out.println("No birds");

        } else {
            for (Bird bird : this.database) {

                if (bird.getName().equals(name)) {
                    System.out.println(bird);
                }
            }
        }
    }

    public void add(Bird bird) {
        this.database.add(bird);
    }

    public void addObservation(String name) {
        for (Bird bird : this.database) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
            }
        }
    }

    public ArrayList<Bird> getDatabase() {
        return database;
    }

}
