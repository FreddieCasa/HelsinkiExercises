
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will tell you a story, but I need some information first.\n" +
                "What is the main character called?");
        String a = scanner.nextLine();
//        System.out.println("Hi " + a);
        System.out.println("What is their job?");
        String b = scanner.nextLine();
        System.out.println("Here is the story:" + "\n" + "Once upon a time there was Bob, who was a builder."  + "\n" + "On the way to work, Bob reflected on life." + "\n" +"Perhaps Bob will not be a builder forever.");
        // Write your program here


    }
}
