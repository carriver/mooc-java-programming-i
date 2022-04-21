
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeigth;

    public Suitcase(int maxWeigth) {
        this.items = new ArrayList<>();
        this.maxWeigth = maxWeigth;
    }

    public void addItem(Item item) {
        int weightSum = this.totalWeight() + item.getWeight();
        if (weightSum <= this.maxWeigth) {
            this.items.add(item);
        }
    }

    public int totalWeight() {

        int totalWeight = 0;

        for (Item item : items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    public void printItems() {

        if (!(this.items.isEmpty())) {

            for (Item i : this.items) {
                System.out.println(i.getName() + " ("
                        + i.getWeight() + " kg)");
            }
        }
    }

    @Override
    public String toString() {

        if (this.items.isEmpty()) {
            return "no items";
        } else if (this.items.size() == 1) {
            return this.items.size() + " item ("
                    + this.totalWeight() + " kg)";
        }

        return this.items.size() + " items ("
                + this.totalWeight() + " kg)";
    }
}
