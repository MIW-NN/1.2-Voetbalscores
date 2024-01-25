package voetbalScore.project.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

public class ContestTest {
    private static final String OPPONENT_NAME = "fc tegenstander";

    @Test
    public void givenACont_withAllParameters_expectValuesToBeSet(){
        var contest = new Contest(OPPONENT_NAME, 0,0);

        Assert.assertEquals(OPPONENT_NAME, contest.opponentName);
        Assert.assertEquals(0, contest.goals);
        Assert.assertEquals(0, contest.goalsConceded);
    }

    @Test
    public void givenACont_withOneParameters_expectValueToBeSet(){
        var contest = new Contest(OPPONENT_NAME);

        Assert.assertEquals(OPPONENT_NAME, contest.opponentName);
    }

    @Test
    public void givenACont_withNoParameters_expectValueNotToBeSet(){
        var contest = new Contest();

        Assert.assertNotEquals(OPPONENT_NAME, contest.opponentName);
    }

    @Test
    public void givenAContest_withWinningScore_expectThreePoints() {
        var contest = new Contest("fc tegenstander", 1,0);

        Assert.assertEquals(3, contest.determineContestPoints());
    }

    @Test
    public void givenAContest_withDrawnScore_expectOnePoints() {
        var contest = new Contest("fc tegenstander", 0,0);

        Assert.assertEquals(1, contest.determineContestPoints());
    }

    @Test
    public void givenAContest_withLosingScore_expectNoPoints() {
        var contest = new Contest("fc tegenstander", 0,1);

        Assert.assertEquals(0, contest.determineContestPoints());
    }
}