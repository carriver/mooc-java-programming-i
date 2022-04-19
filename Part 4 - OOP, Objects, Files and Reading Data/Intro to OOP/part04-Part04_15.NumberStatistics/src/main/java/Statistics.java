
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        int count = 0;
        int sum = 0;

    }

    public void addNumber(int number) {
        // adds a new number to the statistics
        count += 1;
        sum += number;

    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        if (count != 0) {
        return 1.0 * sum/count;
        } else {
            return 0;
        }
    }
}
