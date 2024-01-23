package voetbalScore.project.model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

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
        var wedstrijd = new Wedstrijd("fc tegenstander", 1,1);

        Assert.assertEquals(0, wedstrijd.bepaalWedstrijdpunten());
    }

    PrintStream StandardOut = System.out;
    ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeAll
    public void setUpOutputStream(){
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void givenAWedstrijd_ShouldPrintResults(){

        var tegenstander = "fc tegenstander";
        var wedstrijd = new Wedstrijd(tegenstander, 10,90);

        wedstrijd.printUitslag();

        Assert.assertTrue(outputStreamCaptor.toString().contains(tegenstander));
        Assert.assertTrue(outputStreamCaptor.toString().contains("10"));
        Assert.assertTrue(outputStreamCaptor.toString().contains("90"));
    }

    @Test
    public void givenAWedstrijd_ShouldPrintPoints(){
        var wedstrijd = new Wedstrijd("fc tegenstander", 10,90);

        wedstrijd.printWedstrijdPunten();

        Assert.assertTrue(outputStreamCaptor.toString().contains("3"));
    }

    @AfterAll
    public void resetSystemOut(){
        System.setOut(StandardOut);
    }
}