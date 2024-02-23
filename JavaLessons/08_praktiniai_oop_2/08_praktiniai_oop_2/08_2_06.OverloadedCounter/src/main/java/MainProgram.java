
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counterWithStartValue = new Counter();
        Counter counter = new Counter();

        counterWithStartValue.increase();
        System.out.println(counterWithStartValue);
        counterWithStartValue.increase();
        System.out.println(counterWithStartValue);
        counterWithStartValue.increase(2);
        System.out.println(counterWithStartValue);
    }
}
