
public class Timer {

    private ClockHand seconds;
    private ClockHand seconds100;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.seconds100 = new ClockHand(100);
    }

    public void advance() {
        this.seconds100.advance();

        if (this.seconds100.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return seconds + ":" + seconds100;
    }
}
