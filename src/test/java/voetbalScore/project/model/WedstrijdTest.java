package voetbalScore.project.model;

import org.junit.Assert;
import org.junit.Test;

class WedstrijdTest {

    @Test
    void givenAWedstrijd_withWinningScore_expectThreePoints() {
        var wedstrijd = new Wedstrijd("fc tegenstander", 1,0);

        Assert.assertEquals(3, wedstrijd.bepaalWedstrijdpunten());
    }

    @Test
    void givenAWedstrijd_withDrawnScore_expectOnePoints() {
        var wedstrijd = new Wedstrijd("fc tegenstander", 0,0);

        Assert.assertEquals(1, wedstrijd.bepaalWedstrijdpunten());
    }

    @Test
    void givenAWedstrijd_withLosingScore_expectNoPoints() {
        var wedstrijd = new Wedstrijd("fc tegenstander", 1,1);

        Assert.assertEquals(0, wedstrijd.bepaalWedstrijdpunten());
    }
}