
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        ArrayList<Integer> namesLength = new ArrayList();
        ArrayList<String> names = new ArrayList();

        while (true) {
            String details = scanner.nextLine();
            if (details.equals("")) {
                break;
            }
            String[] pieces = details.split(",");
            int nameLength = pieces[0].length();
            names.add(pieces[0]);
            namesLength.add(nameLength);
            sum = sum + Integer.valueOf(pieces[1]);
            count++;
        }

        int max = namesLength.get(0);

        for (int number : namesLength) {
            if (number > max) {
                max = number;
            }

        }
        int index = namesLength.indexOf(max);

      
       
        System.out.println("Longest name: " + names.get(index));
        System.out.println("Average of the birth years: " + 1.0 * sum / count);

    

    }

}
