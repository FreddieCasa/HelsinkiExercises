import java.util.Scanner;

public class MilesToKilometers {

   public  static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter miles:");
        int miles= scanner.nextInt();
        double  mile=1.6;
        float conv= miles*(float)mile;
        System.out.println(miles + " miles is " + conv +  " kilometers");

    }


}
