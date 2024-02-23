
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        int count = 0;

        for (int j = 0; j < array.length; j++) {
            count++;
            System.out.println();
            for (int i = 0; i < array[count-1]; i++) {
                System.out.print("*");
            }
        }
    }

}
