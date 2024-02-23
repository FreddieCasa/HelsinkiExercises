package lt.techin.praktinis;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        // Write your program here
        System.out.println(number/1000+((number/100)%10)+((number/10)%10)+(number%10));
    }
}
