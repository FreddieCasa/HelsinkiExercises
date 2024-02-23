
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        System.out.println("Search for? ");
        String wordToSearchFor =  scanner.nextLine();
        for(String name:list){
            if (name.equals(wordToSearchFor) ){
                System.out.println(wordToSearchFor + " was found!");
                break;
            }
            System.out.println(wordToSearchFor + " was not found!");
            break;
        }
    }
}
