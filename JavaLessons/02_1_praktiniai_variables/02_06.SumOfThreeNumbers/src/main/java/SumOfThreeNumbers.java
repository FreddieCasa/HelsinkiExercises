
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        Integer a = scanner.nextInt();
        System.out.println("Give the second number:");
        Integer b = scanner.nextInt();
        System.out.println("Give the third number:");
        Integer c = scanner.nextInt();
        System.out.println("The sum of the numbers is " + (a+b+c) );
    }
}
