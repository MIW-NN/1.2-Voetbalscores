package voetbalScore.project.model;

public class Contest {
    private static final int DEFAULT_GOALS_CONCEDED_VALUE = 0;
    private static final int DEFAULT_GOALS_VALUE = 0;
    private static final String DEFAULT_OPPONENT_NAME_VALUE = "onbekend";

    public int goalsConceded;
    public int goals;
    public String opponentName;

    public Contest(String opponentName, int goals, int goalsConceded) {
        this.opponentName = opponentName;
        this.goals = goals;
        this.goalsConceded = goalsConceded;
    }

    public Contest(String opponentName) {
        this.opponentName = opponentName;
        this.goals = DEFAULT_GOALS_VALUE;
        this.goalsConceded = DEFAULT_GOALS_CONCEDED_VALUE;
    }

    public Contest() {
        this.opponentName = DEFAULT_OPPONENT_NAME_VALUE;
        this.goals = DEFAULT_GOALS_VALUE;
        this.goalsConceded = DEFAULT_GOALS_CONCEDED_VALUE;
    }

    public int determineContestPoints() {
        if (goals > goalsConceded) {
            return 3;
        } else if (goals == goalsConceded) {
            return 1;
        } else {
            return 0;
        }
    }

    public void printResult() {
        System.out.println("Uitslag van de wedstrijd tegen " + opponentName + ": " + goals + "-" + goalsConceded);
    }

    public void printContestPoints() {
        int contestPoints = determineContestPoints();

        if (contestPoints == 1) {
            System.out.println("Dit levert 1 wedstrijdpunt op");
        } else {
            System.out.printf("Dit levert %d wedstrijdpunten op\n", contestPoints);
        }
    }
}
