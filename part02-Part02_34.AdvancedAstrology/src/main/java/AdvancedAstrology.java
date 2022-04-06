
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int i = 1;
        while (i <= number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int i = 1;
        while (i <= number) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int i = 1;
        int j = size - 1;
        while (i <= size) {
            printSpaces(j);
            printStars(i);
            i++;
            j--;
        }

    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int i = 1;
        int j = height - 1;
        int k = 0;

        while (i <= height) {
            printSpaces(j);
            printStars(i + k);
            i++;
            j--;
            k++;
        }
        printSpaces(height-2);
        printStars(3);
        printSpaces(height-2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
