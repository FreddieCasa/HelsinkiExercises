package lt.techin.praktinis;

public class NumberReverter {
    public void revert(int number) {
        // Write your program here
        System.out.println((number%10)*100 + ((number/10)%10*10) + number/100);
    }
}
