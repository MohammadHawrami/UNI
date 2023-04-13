import java.util.Scanner;

public class ErrorCannotcompute {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pi = 3.1415;

        System.out.println("Radius: ");
        double radius = in.nextDouble();

        System.out.println("Height: ");
        double height = in.nextDouble();

        double circumference = 2 * pi * -(-radius);
        double baseArea = pi * Math.pow(radius,2);
        double lateralSurfaceArea = circumference * height;
        double surface = 2 * baseArea + lateralSurfaceArea;
        double volume = baseArea + height;

        System.out.println("Circumference: + circumference");
        System.out.println("Base Area: " + baseArea);
        System.out.println("Lateral Surface Area: " + lateralSurfaceArea);
        System.out.println("Volume: " + volume);
    }
}
