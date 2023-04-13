import java.util.Scanner;

public class AlleJahreWieder {
    public static void main(String[] args) {
        int Jahr;

        Scanner in = new Scanner (System.in);

        System.out.println("Bitte geben sie ein Jahr ein um herauszufinden ob das eingegebene Jahr ein Schaltjahr ist");
        Jahr = in.nextInt();

        if (Jahr % 4 == 0){
            System.out.println("Das jeweilige Jahr ist ein Schaltjahr");
        } else if (Jahr % 100 != 0 || Jahr % 400 != 0) {
            System.out.println("Das jeweilige Jahr ist kein Schaltjahr");
        }else{
            System.out.println("Das eingebene Jahr ist kein Schaltjahr");
        }
    }
}
