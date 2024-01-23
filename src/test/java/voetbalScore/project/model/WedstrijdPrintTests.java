package voetbalScore.project.model;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class WedstrijdPrintTests {

    PrintStream StandardOut = System.out;
    ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setUpOutputStream(){
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void givenAWedstrijd_ShouldPrintResults(){

        var tegenstander = "fc tegenstander";
        var wedstrijd = new Wedstrijd(tegenstander, 10,90);

        wedstrijd.printUitslag();

        var out = outputStreamCaptor.toString();

        Assert.assertTrue(out.contains(tegenstander));
        Assert.assertTrue(out.contains("10"));
        Assert.assertTrue(out.contains("90"));
    }

    @Test
    public void givenAWedstrijd_ShouldPrintPoints(){
        var wedstrijd = new Wedstrijd("fc tegenstander", 10,90);

        wedstrijd.printWedstrijdPunten();

        Assert.assertTrue(outputStreamCaptor.toString().contains("0"));
    }

    @After
    public void resetSystemOut(){
        System.setOut(StandardOut);
    }
}