
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            String pages = scanner.nextLine();

            System.out.print("Publication year: ");
            String publication = scanner.nextLine();

            books.add(new Book(title, pages, publication));
        }

        System.out.println();
        System.out.print("What information will be printed?");
        String filter = scanner.nextLine();

        for (Book book : books) {
            if (filter.equals("name")) {
                System.out.println(book.getTitle());
            } else {
                System.out.println(book);
            }
        }

    }
}
