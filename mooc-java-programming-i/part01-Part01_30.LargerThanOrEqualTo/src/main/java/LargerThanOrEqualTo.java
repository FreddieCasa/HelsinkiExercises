
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstNumb = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int secondNumb = Integer.valueOf(scan.nextLine());

        if (firstNumb > secondNumb) {
            System.out.println("Greater number is: " + firstNumb);
        } else if (secondNumb > firstNumb) {
            System.out.println("Greater number is: " + secondNumb);
        }
        System.out.println("The numbers are equal");
    }
}
