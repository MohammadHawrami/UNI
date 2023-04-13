import java.util.Scanner;

public class Großkleinergleich {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner in = new Scanner(System.in);

        System.out.println("Bitte geben sie die Zahl für A ein");
        a = in.nextInt();

        System.out.println("Bitte geben sie die Zahl für B ein");
        b = in.nextInt();

        if (a > b){
            System.out.println("Die größere Zahl lautet a: " + a);
        }else if (a < b){
            System.out.println("Die größere Zahl lautet b: " + b);
        }else {
            System.out.println("Beide Zahlen sind gleich groß: " + a +b);
        }
    }
}
