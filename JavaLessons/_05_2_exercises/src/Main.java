public class Main {
    public static void main(String[] args) {

        System.out.println();

    }


    //example1 Sum the digits in an integer
//    public static int sumDigits(long n) {
//
//        long number1 = ( n / 100);
//        long number2 = (n / 10) % 10;
//        long number3 = n % 10;
////        System.out.println(number1);
////        System.out.println(number2);
////        System.out.println(number3);
//
//        return (int)number1 + (int)number2 + (int)number3;
//    }
//}


    //example2 Sum the digits in an integer
//
//    public static int sumDigits(long n) {
//        int sum = 0;
//
//        // Iterate until all digits are extracted
//        while (n != 0) {
//            // Extract the last digit using modulo (%) and add it to the sum
//            sum += n % 10;
//
//            // Remove the extracted digit from the number
//            n = n / 10;
//        }
//
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        // Test program to prompt user for an integer and display the sum of its digits
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//
//        // Read the integer input from the user
//        long number = scanner.nextLong();
//
//        // Calculate and display the sum of its digits
//        int digitSum = sumDigits(number);
//        System.out.println("Sum of digits: " + digitSum);
//
//        scanner.close();
//    }

    // example Palindrome integer

//    public static int reverse(int number){
//
//        int reversed = 0;
//
//        // Reverse the number
//
//        while (number != 0) {
//            int digit = number % 10;
//            reversed = reversed * 10 + digit;
//            number /= 10;
//        }
//
//        return reversed;
//    }
//
//
//
//
//    public static boolean isPalindrome(int number){
//    return number == reverse(number);
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//
//        int inputNumber = scanner.nextInt();
//
//        if (isPalindrome(inputNumber)) {
//            System.out.println(inputNumber + " is a palindrome.");
//        } else {
//            System.out.println(inputNumber + " is not a palindrome.");
//        }
//
//        scanner.close();
//    }


} //end of Main class - don't delete