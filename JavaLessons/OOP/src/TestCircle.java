import java.io.PrintStream;

public class TestCircle {
    public TestCircle() {
    }

    public static void main(String[] args) {
        Circle c2 = new Circle(2.0);
        PrintStream var10000 = System.out;
        double var10001 = c2.getRadius();
        var10000.println("The Cricle has radius of " + var10001 + " and area of " + c2.getArea());
        Circle c3 = new Circle(3.0, "white");
        var10000 = System.out;
        var10001 = c3.getRadius();
        var10000.println("The Cricle has radius of " + var10001 + " and area of " + c3.getArea() + " and color " + c3.getColor());
        Circle c4 = new Circle();
        c4.setRadius(5.0);
        System.out.println("radius is: " + c4.getRadius());
        c4.setColor("blue");
        System.out.println("color is: " + c4.getColor());
        Circle c1 = new Circle(5.0);
        System.out.println(c1.toString());
    }
}
