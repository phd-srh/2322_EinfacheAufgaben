import java.util.Scanner;

public class Guthaben {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        double guthaben = 2000.00;
        double betrag;
        System.out.println("Ihr Guthaben beträgt " + guthaben + " EUR.");

        while (true) {
            System.out.println("Hauptmenu");
            System.out.println("---------");
            System.out.println("1 - Einzahlen");
            System.out.println("2 - Abheben");
            System.out.println("3 - Beenden");
            System.out.print("Ihre Auswahl: ");
            int auswahl = eingabe.nextInt();

            if (auswahl == 3) break;
            if (auswahl != 1 && auswahl != 2) continue;

            if (auswahl == 1) {
                System.out.println("Wieviel möchten Sie einzahlen?");
            }
            else {
                System.out.println("Wieviel möchten Sie abheben?");
            }
            betrag = eingabe.nextDouble();

            if (betrag < 0) {
                System.out.println("Negative Beträge sind nicht zulässig");
                continue;
            }

            if (auswahl == 2) {
                if (betrag <= guthaben) {
                    System.out.println("Der Betrag von " + betrag + " EUR kann ausgezahlt werden.");
                    // guthaben = guthaben - betrag;
                    guthaben -= betrag; // gleiche wie eine zeile darüber
                } else {
                    System.out.println("Zu wenig Guthaben vorhanden. Auszahlung nicht möglich!");
                }
            }
            else {
                guthaben = guthaben + betrag;
                System.out.println("Der Betrag von " + betrag + " EUR wurde eingezahlt.");
            }

            System.out.println("Ihr Guthaben beträgt " + guthaben + " EUR.");
        }
        System.out.println("Vielen Dank und Auf Wiedersehen!");
    }
}
