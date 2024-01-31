package voetbalScore.project.model;

public class Contest {
    private static final int DEFAULT_GOALS_CONCEDED_VALUE = 0;
    private static final int DEFAULT_GOALS_VALUE = 0;
    private static final String DEFAULT_OPPONENT_NAME_VALUE = "onbekend";

    public int goalsConceded;
    public int goals;
    public String opponentName;

    public Contest(String opponentName, int goals, int goalsConceded) {
    }

    public Contest(String opponentName) {
    }

    public Contest() {
    }

    public int determineContestPoints() {
            return 0;
    }

    public void printResult() {
    }

    public void printContestPoints() {
    }
}
