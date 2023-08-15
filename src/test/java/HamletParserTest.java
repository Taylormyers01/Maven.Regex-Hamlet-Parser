import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        HamletParser hp = new HamletParser();
        String input = "Hamlet was Ham of Letting with Hamlet as humlets Hams";
        String expected = "Leon was Ham of Letting with Leon as humlets Hams";

        String actual = hp.changeHamletToLeon(input);

        assertEquals(expected, actual);

    }

    @Test
    public void testChangeHoratioToTariq() {
        HamletParser hp = new HamletParser();
        String input = "Horatio is the best at gettinghoratio Ratiod with Horatio himself Harotio ";
        String expected = "Tariq is the best at gettingTariq Ratiod with Tariq himself Harotio ";
        String actual = hp.changeHoratioToTariq(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testFindHoratio() {
        HamletParser hp = new HamletParser();
        String input = "Horatio is the best at gettinghoratio Ratiod with Horatio himself Harotio ";
        int expected = 3;
        int actual = hp.findHoratio(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testFindHamlet() {
        HamletParser hp = new HamletParser();
        String input = "Hamlet was Ham of Letting with Hamlet as humlets Hams";
        int expected = 2;
        int actual = hp.findHamlet(input);

        assertEquals(expected, actual);
    }
}