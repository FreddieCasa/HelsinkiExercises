
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give number:");
        int number = Integer.parseInt(scan.nextLine());

        if(number>0){
            System.out.println("Give number:");
            System.out.println(number);
            System.out.println("Number is positive.");
        }
        else{
            System.out.println("Give number:");
            System.out.println(number);
            System.out.println("Number is not positive.");
        }
    }
}
