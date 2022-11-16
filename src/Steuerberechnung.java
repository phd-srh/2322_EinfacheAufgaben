import java.util.Scanner;

public class Steuerberechnung {

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Bitte geben Sie Ihr Bruttogehalt ein: ");
        double bruttogehalt = eingabe.nextDouble();

        double abzüge = bruttogehalt * 20 / 100;
        double nettogehalt = bruttogehalt - abzüge;

        System.out.println("Bruttogehalt: " + bruttogehalt);
        System.out.println("Abzüge:       " + abzüge);
        System.out.println("Nettogehalt:  " + nettogehalt);
    }

}
