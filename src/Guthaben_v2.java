import javax.management.monitor.GaugeMonitor;
import java.util.Scanner;

public class Guthaben_v2 {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        double guthaben = 2000.00;
        double kreditlimit = 500.00;
        double überzugsgebühr = 0.10;
        double überzugszinsen = 12.0/100;
        double betrag;

        Hauptschleife:
        while (true) {
            System.out.println("Ihr Guthaben beträgt " + guthaben + " EUR.");
            System.out.println("Ihr Kreditlimit liegt bei " + kreditlimit + " EUR.");

            System.out.println("Hauptmenu");
            System.out.println("---------");
            System.out.println("1 - Einzahlen");
            System.out.println("2 - Abheben");
            System.out.println("3 - Kreditlimit erhöhen");
            System.out.println("4 - Überzugszinsen erheben");
            System.out.println("5 - Beenden");
            System.out.print("Ihre Auswahl: ");
            int auswahl = eingabe.nextInt();

            switch (auswahl) {
                case 1 :
                    System.out.println("Wieviel möchten Sie einzahlen?");
                    betrag = eingabe.nextDouble();
                    if (betrag < 0) {
                        System.out.println("Negative Beträge sind nicht zulässig");
                        continue;
                    }
                    guthaben = guthaben + betrag;
                    System.out.println("Der Betrag von " + betrag + " EUR wurde eingezahlt.");
                    break;
                case 2:
                    System.out.println("Wieviel möchten Sie abheben?");
                    betrag = eingabe.nextDouble();
                    if (betrag < 0) {
                        System.out.println("Negative Beträge sind nicht zulässig");
                        continue;
                    }
                    if (betrag <= guthaben) {
                        System.out.println("Der Betrag von " + betrag +
                                " EUR kann ausgezahlt werden.");
                        // guthaben = guthaben - betrag;
                        guthaben -= betrag; // gleiche wie eine zeile darüber
                    } else if (betrag <= guthaben + kreditlimit) {
                        System.out.println("Der Betrag von " + betrag +
                                " EUR kann mit Hilfe des Kreditlimits ausgezahlt werden");
                        guthaben = guthaben - betrag;
                        guthaben = guthaben - überzugsgebühr;
                    } else {
                        System.out.println("Zu wenig Guthaben und Kreditlimit vorhanden." +
                                " Auszahlung nicht möglich!");
                    }
                    break;
                case 3:
                case 4:
                    System.out.println("Diese Funktion ist noch nicht implementiert!");
                    break;
                case 5:
                    break Hauptschleife;
                default:
                    System.out.println("Ungültige Auswahl, bitte nochmal probieren.");
            }
            System.out.println();
        }
        System.out.println("Vielen Dank und Auf Wiedersehen!");
    }
}
