
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lamba
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                simpleDictionary.add(word, translation);

            } else if (command.equals("search")) {
                System.out.println("To be translated: ");
                String toBeTranslated = scanner.nextLine();

                if (simpleDictionary.translate(toBeTranslated) == null) {
                    System.out.println("Word " + toBeTranslated + " was not found");
                }else{
                System.out.println("Word: " + simpleDictionary.translate(toBeTranslated));
                }
            } else {
                System.out.println("Unknown command");
            }

        }
    }

}
