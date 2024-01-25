package voetbalScore.project.controller;

import voetbalScore.project.model.Contest;

import java.util.Scanner;

public class SoccerScoreLauncher {

    public static void main(String[] args) {
        Contest firstcontest = new Contest("PEC", 5, 0);
        firstcontest.printResult();
        firstcontest.printContestPoints();
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Wat is de tegenstander? ");
        String naamTegenstander = input.next();
        Contest secondContest = new Contest(naamTegenstander);
        System.out.print("Doelpunten gescoord: ");
        secondContest.goals = input.nextInt();
        System.out.print("Doelpunten tegenstander: ");
        secondContest.goalsConceded = input.nextInt();
        secondContest.printResult();
        secondContest.printContestPoints();
    }
}
