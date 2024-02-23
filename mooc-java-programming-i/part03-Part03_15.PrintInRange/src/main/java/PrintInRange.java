
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int i = lowerLimit; i <= upperLimit; i++){
            if (numbers.contains(Integer.valueOf(i))){
                System.out.println(i);
            }
        }
    }

}
