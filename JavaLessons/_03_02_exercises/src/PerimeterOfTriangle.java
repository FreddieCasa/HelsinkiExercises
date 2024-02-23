import java.util.Scanner;
public class PerimeterOfTriangle {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the first edge of triangle:");
        int edge1 = Integer.parseInt(reader.nextLine());

        System.out.println("Enter the second edge of triangle:");
        int edge2 = Integer.parseInt(reader.nextLine());

        System.out.println("Enter the third edge of triangle:");
        int edge3 = Integer.parseInt(reader.nextLine());

        int perimeter = edge1 + edge2 + edge3;

        if ((edge1+edge2)>edge3 && (edge2+edge3)>edge1 && (edge3+edge1)>edge2) {
            System.out.println(perimeter);
        }
        else{
            System.out.println("Input invalid");
        }




    }
}