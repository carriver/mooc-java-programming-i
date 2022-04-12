
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        int games = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner reader = new Scanner(Paths.get(file))) {

            while (reader.hasNextLine()) {
                String line = reader.nextLine();

                String[] parts = line.split(",");
                String team1 = parts[0];
                String team2 = parts[1];
                int points1 = Integer.valueOf(parts[2]);
                int points2 = Integer.valueOf(parts[3]);

                if (team1.equals(team) || team2.equals(team)) {
                    games += 1;

                    if (team1.equals(team) && points1 > points2) {
                        wins += 1;
                    } else if (team1.equals(team) && points1 < points2) {
                        losses += 1;
                    }

                    if (team2.equals(team) && points1 > points2) {
                        losses += 1;
                    } else if (team2.equals(team) && points1 < points2) {
                        wins += 1;
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}
