package voetbalScore.project.model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class WedstrijdTest {

    @Test
    public void givenAWedstrijd_withWinningScore_expectThreePoints() {
        var wedstrijd = new Wedstrijd("fc tegenstander", 1,0);

        Assert.assertEquals(3, wedstrijd.bepaalWedstrijdpunten());
    }

    @Test
    public void givenAWedstrijd_withDrawnScore_expectOnePoints() {
        var wedstrijd = new Wedstrijd("fc tegenstander", 0,0);

        Assert.assertEquals(1, wedstrijd.bepaalWedstrijdpunten());
    }

    @Test
    public void givenAWedstrijd_withLosingScore_expectNoPoints() {
        var wedstrijd = new Wedstrijd("fc tegenstander", 0,1);

        Assert.assertEquals(0, wedstrijd.bepaalWedstrijdpunten());
    }
}