import java.util.Objects;
import java.util.Scanner;

public class Würfelspiel {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        String abfrage;

        do {
            System.out.println("Anzahl Würfel eingeben:");
            int anzahl = eingabe.nextInt();

            int summenwürfel = 0;
            for (int i = 1; i <= anzahl; i++) {
                int würfel = (int) (Math.random() * 6) + 1;
                System.out.println("Würfel " + i + ": " + würfel);
                summenwürfel = summenwürfel + würfel;
            }
            System.out.println("Gesamtaugenzahl: " + summenwürfel);
            System.out.println("--------------");

            System.out.println("Nochmal würfeln (ja/nein)?");
            abfrage = eingabe.next();
        } while ( abfrage.equalsIgnoreCase("ja") || abfrage.equalsIgnoreCase("j") );
    }
}
