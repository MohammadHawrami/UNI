import java.util.Scanner;

public class Rabatt {
    public static void main(String[] args) {
        double kg;
        double PreisK;
        int Bestellungen;

        Scanner in = new Scanner(System.in);

        System.out.println("Bitte gebn sie an wie viel Kilogramm sie möchten");
        System.out.println("Wenn sie 10kg nehmen kriegen sie bis zu 10% Rabatt auf ihr Produkt");
        System.out.println("Wenn sie 50kg nehemen kreigen sie bis zu 20% Rabatt auf ihr Produkt");

        System.out.println("Bitte geben sie das Gewicht des Produktes (kg) an:  ");
        kg = in.nextDouble();

        System.out.println("Bitte geben sie den Preis pro Kilogramm an:  ");
        PreisK = in.nextDouble();

        System.out.println("Bitte geben sie die Bestellmenge an");
        Bestellungen = in.nextInt();

        if (kg > 10 && kg < 50){
            double Endpreis = 0.1 * PreisK;
            System.out.println();
            double differenz = PreisK - Endpreis;
            System.out.println("Die Differenz ihrer Bestellung beträgt" + differenz + "€");
        }else if (kg >= 50){
            double Endpreis = 0.2 * PreisK;
            System.out.println("Sie müssen" + Endpreis + "Bezahlen");
            double differenz = PreisK - Endpreis;
            System.out.println("Die Differenz ihres Betrages beträgt" + differenz + "€");
        }else {
            System.out.println("Sie müssen" + PreisK + "Bezahlen");
        }
    }
}
