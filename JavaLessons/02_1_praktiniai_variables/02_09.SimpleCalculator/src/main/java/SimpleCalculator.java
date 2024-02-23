
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        int firstNumber= scanner.nextInt();
        System.out.println("Give the second number: ");
        int secondNumber= scanner.nextInt();
        int sum= firstNumber+secondNumber;
        int sub= firstNumber-secondNumber;
        int mult= firstNumber*secondNumber;
        double div= (double)firstNumber/secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + sub);
        System.out.println(firstNumber + " * " + secondNumber + " = " +  mult);
        System.out.println(firstNumber + " / " + secondNumber + " = " + div);

    }
}
