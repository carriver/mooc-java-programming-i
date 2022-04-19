
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void advance() {
        if (this.day < 30) {
            this.day++;
        } else if (this.month < 12) {
            this.day = 1;
            this.month++;
        } else {
            this.day = 1;
            this.month = 1;
            this.year++;
        }
    }

    public void advance(int howManyDays) {
        for (int i = 0; i < howManyDays; i++) {
            this.advance();
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate clone = this.clone();

        clone.advance(days);

        SimpleDate newDate = new SimpleDate(clone.day, clone.month, clone.year);

        return newDate;
    }

    @Override
    protected SimpleDate clone() {
        // create a new counter object that receives the value of the cloned counter as its initial value
        SimpleDate clone = new SimpleDate(this.day, this.month, this.year);

        // return the clone to the caller
        return clone;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

}
