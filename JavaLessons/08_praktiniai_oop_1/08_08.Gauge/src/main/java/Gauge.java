public class Gauge {
    private int value;

    public Gauge() {

    }

    public void increase() {
        value++;
    }

    public void decrease() {
        value--;
    }

    public int value() {
        return value;
    }

    public boolean full() {
        if (value == 5) {
            return true;
        }
        return false;
    }


}
