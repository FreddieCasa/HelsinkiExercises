
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        UserInterface ui = new UserInterface();

        while (true) {
            ui.printResult();

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if(amount < 0 ){
                continue;
            }

            if (command.equals("add")) {
                ui.add(amount);

            }

            if (command.equals("move")) {
                ui.move(amount);

            }
            if (command.equals("remove")) {
                ui.remove(amount);

            }

        }
    }

}
