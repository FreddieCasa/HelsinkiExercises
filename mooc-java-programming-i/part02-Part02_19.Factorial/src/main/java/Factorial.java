
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = Integer.valueOf(scan.nextLine());
        int fac = 1;
        for (int i = 1; i <= a; i++) {
            fac = fac * i;
        }
        System.out.println(fac);

    }
}
