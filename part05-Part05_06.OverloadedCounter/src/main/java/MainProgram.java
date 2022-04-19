
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here

        Counter counter = new Counter(1);
        counter.increase(2);
        counter.increase();
        counter.decrease();
        counter.decrease(2);

        System.out.println(counter.value());
    }
}
