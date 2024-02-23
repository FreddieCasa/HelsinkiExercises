
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary simpleDictionary = new SimpleDictionary();

        TextUI ui = new TextUI(scanner, simpleDictionary);
        ui.start();
        System.out.println(simpleDictionary.translate("pike"));
    }
}
