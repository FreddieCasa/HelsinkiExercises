import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstN = Integer.parseInt(reader.nextLine());
        System.out.println("Enter second number:");
        int secondN = Integer.parseInt(reader.nextLine());
        System.out.println("Enter third number:");
        int thirdN = Integer.parseInt(reader.nextLine());

        if(firstN < secondN && firstN < thirdN) {
            if(secondN<thirdN){
                System.out.println(firstN + " " + secondN + " " + thirdN);
            } else{
                System.out.println(firstN + " " + thirdN + " " + secondN );
            }
        }

        else if  (secondN < firstN && secondN < thirdN) {
            if(firstN<thirdN){
            System.out.println(secondN + " " + firstN + " " + thirdN);
            }else {

                System.out.println(secondN + " " + thirdN + " " + firstN);
            }
        }

        else if  (thirdN < firstN && thirdN < secondN) {
            if (firstN<secondN){
                System.out.println(thirdN + " " + firstN + " " + secondN);
            }else{
                System.out.println(thirdN + " " + secondN + " " + firstN);
            }
        }
    }
}