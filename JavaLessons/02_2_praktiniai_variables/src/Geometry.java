import java.util.Scanner;


public class Geometry {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter x1:");
        double x1= Double.parseDouble(reader.nextLine());
        System.out.println("Enter y1:");
        double y1= Double.parseDouble(reader.nextLine());
        System.out.println("Enter x2:");
        int x2= Integer.parseInt(reader.nextLine());
        System.out.println("Enter y2:");
        int y2= Integer.parseInt(reader.nextLine());
        double x =(x2 - x1)*(x2 - x1);
        double y =(y2 - y1)*(y2 - y1);
        double calc = Math.sqrt(x+y);


        System.out.println("The distance between the two points is : " + calc);

    }
}
