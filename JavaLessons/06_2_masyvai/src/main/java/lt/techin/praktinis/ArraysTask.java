package lt.techin.praktinis;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.

        int[] arr = {5, 4, 5, 4, 9, 4, 5, 4};

        int minMark = getMin(arr);
        System.out.printf("Min mark: %d\n", minMark);
        System.out.println("First element: " + getFirstElement(arr));
        System.out.print("Min: ");
        System.out.println(getMin(arr));
        System.out.print("Max: ");
        System.out.println(getMax(arr));
        System.out.print("Sum: ");
        System.out.println(getSum(arr));
        System.out.print("Average: ");
        System.out.println(getAverage(arr));
        System.out.print("Elements counted: ");
        System.out.println(countElements(arr, 0));
        System.out.print("Contains n: ");
        System.out.println(contains(arr, 1));
        System.out.print("Last index: ");
        System.out.println(lastIndexOf(arr, 4));

        for (int v : arr
        ) {
            System.out.print(v + " ");

        }

    }

    //Metodas turi grąžinti pirmą masyvo elementą
    public static int getFirstElement(int[] arr) {
        //TODO
        return arr[0];
    }

    //Metodas turi grąžinti paskutinį masyvo elementą
    public static int getLastElement(int[] arr) {
        //TODO
        return arr[arr.length - 1];
    }

    //Raskite mažiausią masyvo elementą
    public static int getMin(int[] arr) {
        //TODO
        int minNumber = arr[0];
        for (int i = 0; i < arr[arr.length - 1]; i++) {
            if (arr[i] < minNumber) {
                minNumber = arr[i];
            }
        }
        return minNumber;
    }

    //Raskite didžiausią masyvo elementą
    public static int getMax(int[] arr) {
        //TODO
        int maxNumber = 0;
        for (int i = 0; i < arr[arr.length - 1]; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
        }
        return maxNumber;
    }

    //Suskaičiuokite masyvo elementų sumą
    public static int getSum(int[] arr) {
        //TODO
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    //Raskite masyvo elementų vidurkį
    public static double getAverage(int[] arr) {
        //TODO
        int count = 1;
        for (int i = 0; i < arr[arr.length - 1]; i++) {
            count++;
        }
        int sum = getSum(arr);
        double average = (double) sum / count;
        return average;
    }


    //Suskaičiuokite kiek masyve yra skaičių, didesnių nei duotas skaičius n
    public static int countElements(int[] arr, int n) {
        //TODO
        int count = 1;
        for (int i = 0; i < arr[arr.length - 1]; i++) {
            if (arr[i] > n) {
                count++;
            }
        }
        return count;
    }

    //Metodas turi grąžinti true, jei masyve yra elementas kurio reikšmė lygi n
    public static boolean contains(int[] arr, int n) {
        //TODO
        for (int i = 0; i < arr[arr.length - 1]; i++) {
            if (arr[i] == n) {
                return true;
            }

        }
        return false;
    }

    //Raskite elemento kurio reikšmė lygi n paskutinį indeksą
    public static int lastIndexOf(int[] arr, int n) {
        //TODO
        int lastIndex = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == n) {
                lastIndex = i;
                break;
            }


        }
        return lastIndex;
    }
}
