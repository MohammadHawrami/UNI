import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double G;
        double H;

        Scanner in = new Scanner (System.in);

        System.out.println("Bitte geben sie ihre Körpergröße (m) an");
        H = in.nextDouble();

        System.out.println("Bitte geben sie ihr Körpergweicht (kg) an");
        G = in.nextDouble();

        double BMI = G / Math.pow(H,2);

        if (BMI < 20){
            System.out.println(BMI + "Sie sind leider Untergewichtig");
        }else if (20 <= BMI && BMI < 25){
            System.out.println(BMI + "Sie sind Normalgewichtig");
        }else if (25 <= BMI && BMI < 30){
            System.out.println(BMI + "Sie sind übergewichtig");
        }else if (30 <= BMI && BMI < 40){
            System.out.println(BMI + "Sie sind leider Stark übergewichtig");
        }else {
            System.out.println(BMI + "Sie sind leider Extrem übergewichtig");
        }
        System.out.println(BMI);
    }
}
