
import java.util.Scanner;

public class UserInterface {

    private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        readPoints();
        printGradeDistribution();
    }

    public void readPoints() {
        while (true) {
            Integer points = Integer.valueOf(scanner.nextLine());

            if (points.equals(-1)) {
                System.out.println("Point average (all): "
                        + this.register.averageOfPoints());

                System.out.println("Point average (passing): "
                        + this.register.averageOfPassingPoints());

                System.out.println("Pass percentage: "
                        + this.register.passPercentage());

                break;
            }

            if (!(points < 0 || points > 100)) {
                this.register.addGradeBasedOnPoints(points);
            }
        }
    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
