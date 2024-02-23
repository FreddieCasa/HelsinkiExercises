
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        for (int value : array) {
            System.out.print(value);
            for (int i = 0; i < 1; i++) {
                if(value == 2){
                    break;
                }
                System.out.print(", ");
            }
        }
    }
}
