
import java.util.Scanner;

public class NumberUno {
    public static int sum(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = sum (4,3,6,1);
        System.out.println("Sum:" + answer);

    }


}
