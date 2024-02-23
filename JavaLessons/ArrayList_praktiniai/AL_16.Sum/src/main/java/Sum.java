
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(-1);
        System.out.println(sum(list));

        list.add(5);
        list.add(1);
        System.out.println(sum(list));

    }


    public static int sum(ArrayList<Integer> numbers) {
        int returnSum = 0;
        for (int number : numbers) {
          returnSum += number;
        }
        return returnSum;
    }
}
