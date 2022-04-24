
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> todo;

    public TodoList() {
        this.todo = new ArrayList<>();
    }

    public void add(String task) {
        this.todo.add(task);
    }

    public void print() {

        for (String task : this.todo) {
            System.out.println(this.todo.indexOf(task) + 1 + ": " + task);
        }
    }

    public void remove(int number) {
        this.todo.remove(number-1);
    }

}
