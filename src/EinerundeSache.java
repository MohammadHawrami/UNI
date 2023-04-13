import java.util.Scanner;

public class EinerundeSache {
    public static void main(String[] args) {
        double PI = 3.14159;
        double radius;
        Scanner in = new Scanner(System.in);

        System.out.println("Bitte geben sie den Radius des Kreises ein: ");
        radius = in.nextDouble();
        System.out.println("dein Kreisumfang lautet: ");
        System.out.println("U = " + 2 * PI * radius);

        System.out.println("deine Kreisfläche lautet: ");
        System.out.println("F = " + 2 * PI * Math.pow(radius,2));
    }
}
