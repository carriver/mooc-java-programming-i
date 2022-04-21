
import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> hold;
    private int maxWeigth;

    public Hold(int maxWeigth) {
        this.maxWeigth = maxWeigth;
        this.hold = new ArrayList<>();

    }

    public void addSuitcase(Suitcase suitcase) {
        int weightSum = this.totalWeight() + suitcase.totalWeight();
        if (weightSum <= this.maxWeigth) {
        this.hold.add(suitcase);
        }
    }
    
    public int totalWeight() {

        int totalWeight = 0;

        for (Suitcase s : hold) {
            totalWeight += s.totalWeight();
        }

        return totalWeight;
    }
    
    public void printItems() {
        
        if (!(this.hold.isEmpty())) {

            for (Suitcase s : this.hold) {
                s.printItems();
            }
        }
    }

    @Override
    public String toString() {
        if (this.hold.isEmpty()) {
            return "no suitcases";
        } else if (this.hold.size() == 1) {
            return this.hold.size() + " suitcase ("
                    + this.totalWeight() + " kg)";
        }

        return this.hold.size() + " suitcases ("
                + this.totalWeight() + " kg)"; 
    }

    
}
