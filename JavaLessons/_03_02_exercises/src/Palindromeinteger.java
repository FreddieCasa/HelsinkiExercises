import java.util.Scanner;
public class Palindromeinteger {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a three-digit integer:");
        int palindrome = Integer.parseInt(reader.nextLine());
        int digit1 = palindrome % 10;
        int digit2 = palindrome / 10;
        int digit3 = palindrome / 100;

        if (digit1 == digit3){

            System.out.println(palindrome + " is palindrome");

        } else{

            System.out.println(palindrome + " is not palindrome");
        }


    }
}
