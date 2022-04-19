
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        double affMeal = 2.50;

        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment == affMeal) {
            this.money += affMeal;
            this.affordableMeals++;
            return 0.0;
        } else if (payment > affMeal) {
            this.money += affMeal;
            this.affordableMeals++;
            return payment - affMeal;
        } else {
            return payment;
        }

    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        double heartMeal = 4.30;

        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment == heartMeal) {
            this.money += heartMeal;
            this.heartyMeals++;
            return 0.0;
        } else if (payment > heartMeal) {
            this.money += heartMeal;
            this.heartyMeals++;
            return payment - heartMeal;
        } else {
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        double affMeal = 2.50;

        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if (card.balance() >= affMeal) {
            card.takeMoney(affMeal);
            this.affordableMeals++;
            return true;
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        double heartMeal = 4.30;

        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if (card.balance() >= heartMeal) {
            card.takeMoney(heartMeal);
            this.heartyMeals++;
            return true;
        } else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
        card.addMoney(sum);
        this.money += sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
