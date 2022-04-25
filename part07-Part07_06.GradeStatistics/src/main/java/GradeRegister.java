
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;
    private ArrayList<Integer> passingPoints;
    private int participants;
    private int passsingParticipants;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
        this.participants = 0;
        this.passsingParticipants = 0;
    }

    public double averageOfGrades() {
        if (this.grades.isEmpty()) {
            return -1;
        }

        int sum = 0;

        for (Integer grade : this.grades) {
            sum += grade;
        }

        return 1.0 * sum / this.grades.size();

    }

    public double averageOfPoints() {
        if (this.points.isEmpty()) {
            return -1;
        }

        int sum = 0;
        int count = 0;

        for (Integer i : this.points) {
            if (i > 0 && i <= 100) {
                sum += i;
                count += 1;
            }
        }

        return 1.0 * sum / count;
    }

    public String averageOfPassingPoints() {
        if (this.passingPoints.isEmpty()) {
            return "-";
        }

        int sum = 0;

        for (Integer i : this.passingPoints) {
            sum += i;
        }
        String avg = String.valueOf((1.0 * sum / this.passingPoints.size()));

        return avg;
    }

    public double passPercentage() {
        return 100.0 * this.passsingParticipants / this.participants;
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
        this.participants += 1;

        if (points > 49) {
            this.passingPoints.add(points);
            this.passsingParticipants += 1;
        }
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
