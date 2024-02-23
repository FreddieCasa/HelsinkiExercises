
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {

//        int[] array = {3, 1, 5, 99, 3, 12};
//        int[] array = {-1, 6, 9, 8, 12};
//        int[] numbers = {3, 2, 5, 4, 8};
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//
//        MainProgram.swap(numbers, 1, 0);
//        System.out.println(Arrays.toString(numbers));
//
//        MainProgram.swap(numbers, 0, 3);
//        System.out.println(Arrays.toString(numbers));
//        System.out.println("Smallest: " + MainProgram.smallest(array));
//
//        System.out.println("Index of the smallest: " + MainProgram.indexOfSmallest(array));

//        System.out.println("Index of the smallest from given index: " + MainProgram.indexOfSmallestFrom(array, 0));
//         System.out.println("Index of the smallest from given index: " + MainProgram.indexOfSmallestFrom(array, 1));
//          System.out.println("Index of the smallest from given index: " + MainProgram.indexOfSmallestFrom(array, 2));
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int number : array) {
            if (smallest > number) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = MainProgram.smallest(array);
        int count = 0;
        for (int number : array) {
            if (number == smallest) {
                return count;

            }
            count++;
        }

        return count;
    }

    public static int indexOfSmallestFrom(int[] array, int indexFrom) {
        int[] anotherArray = new int[array.length - indexFrom];
//        System.out.println("Given index to search from: " + indexFrom);
//        System.out.println("*another Array before changes:* " + Arrays.toString(anotherArray));
        int arrayIndex = 0;

        for (int element : array) {

            if (arrayIndex == indexFrom) {
//                System.out.println("*first forCicle - given Array index if matched indexFrom:* " + arrayIndex);
                for (int i = 0; i < anotherArray.length; i++) {

                    anotherArray[i] = array[arrayIndex];
//                     System.out.println("*another Array after second forCicle:* " + Arrays.toString(anotherArray));
                    arrayIndex++;

                }
                return MainProgram.indexOfSmallest(anotherArray) + indexFrom;

            }
            arrayIndex++;
//            System.out.println("*first forCicle - given Array index after if statement:* " + arrayIndex);
        }

        return MainProgram.indexOfSmallest(array);
    }

    public static void swap(int[] array, int index1, int index2) {

        int[] storingArray = new int[1];
        storingArray[0] = array[index1];
        array[index1] = array[index2];
        array[index2] = storingArray[0];

    }

    public static void sort(int[] array) {

        int count = 0;
        for (int element : array) {
            
            System.out.println(Arrays.toString(array));
            
            MainProgram.swap(array, count, MainProgram.indexOfSmallestFrom(array, count));
           
            
            count++;
        }

    }
}
