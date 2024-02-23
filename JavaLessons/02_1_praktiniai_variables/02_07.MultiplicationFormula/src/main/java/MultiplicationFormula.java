
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        Integer firstNumber= scanner.nextInt();
        System.out.println("Give the second number:");
        Integer secondNumber= scanner.nextInt();
        System.out.println(firstNumber + " * " + secondNumber + " = " + firstNumber * secondNumber);
    }
}
