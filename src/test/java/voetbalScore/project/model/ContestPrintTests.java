package voetbalScore.project.model;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ContestPrintTests {

    PrintStream StandardOut = System.out;
    ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setUpOutputStream(){
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void givenAContest_ShouldPrintResults(){

        var tegenstander = "fc tegenstander";
        var wedstrijd = new Contest(tegenstander, 10,90);

        wedstrijd.printResult();

        var out = outputStreamCaptor.toString();

        Assert.assertTrue(out.contains(tegenstander));
        Assert.assertTrue(out.contains("10"));
        Assert.assertTrue(out.contains("90"));
    }

    @Test
    public void givenAContest_ShouldPrintPoints(){
        var wedstrijd = new Contest("fc tegenstander", 10,90);

        wedstrijd.printContestPoints();

        Assert.assertTrue(outputStreamCaptor.toString().contains("0"));
    }

    @After
    public void resetSystemOut(){
        System.setOut(StandardOut);
    }
}