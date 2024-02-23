import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter integer:");
        int n = Integer.parseInt(reader.nextLine());

        if(n%4==0 && n%5==0){
            System.out.println("is " + n + " divisible by 4 and 5? true");
        } else{
            System.out.println("is " + n + " divisible by 4 and 5? false");
        }

        if(n%4==0 || n%5==0){
            System.out.println("is " + n + " divisible by 4 and 5? true");
        } else{
            System.out.println("is " + n + " divisible by 4 and 5? false");
        }

        if(n%4==0 ^ n%5==0){
            System.out.println("is " + n + " divisible by 4 and 5? true");
        } else{
            System.out.println("is " + n + " divisible by 4 and 5? false");
        }
    }
}
