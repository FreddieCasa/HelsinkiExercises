
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        JokeManager manager = new JokeManager();
        manager.addJoke("Just joking 1");
        manager.addJoke("Just joking 2");
        manager.addJoke("Just joking 3");
       
        System.out.println(manager.drawJoke());
        
        Scanner scanner = new Scanner(System.in);
        JokeManager jokeManager = new JokeManager();
        UserInterface ui = new UserInterface(manager, scanner);
        ui.start();
    }
}
