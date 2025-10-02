package voetbalScore.project.controller;

import voetbalScore.project.model.Wedstrijd;

import java.util.Scanner;

public class VoetbalscoresLauncher {

    public static void main(String[] args) {
        Wedstrijd eersteWedstrijd = new Wedstrijd("PEC", 5, 0);
        eersteWedstrijd.printUitslag();
        eersteWedstrijd.printWedstrijdPunten();

        System.out.println();
        Scanner toetsenbord = new Scanner(System.in);

        System.out.print("Wat is de naam van de tegenstander? ");
        String tegenstander = toetsenbord.next();

        System.out.print("Doelpunten gescoord: ");
        int voorDoelpunten = toetsenbord.nextInt();

        System.out.print("Doelpunten tegenstander: ");
        int tegenDoelpunten = toetsenbord.nextInt();

        Wedstrijd tweedeWedstrijd = new Wedstrijd(tegenstander, voorDoelpunten, tegenDoelpunten);
        tweedeWedstrijd.printUitslag();
        tweedeWedstrijd.printWedstrijdPunten();
    }
}
