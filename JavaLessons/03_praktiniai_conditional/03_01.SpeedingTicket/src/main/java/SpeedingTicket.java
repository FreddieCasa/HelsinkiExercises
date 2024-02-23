
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here.
        System.out.print("Give speed:");
        int speed= Integer.parseInt(scanner.nextLine());

        if (speed<=120) {
            System.out.print("Give speed: ");
            System.out.print("\n" + speed);
        } else {
            System.out.print("Give speed: ");
            System.out.print(speed);
            System.out.print("\n" + "Speeding ticket!");
        }
    }
}
