package tests;

import intro.Diamond;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bmoreira on 4/7/17.
 */
public class DiamondTest {

    @Test
    public void shouldPrintADiamondWithSizeOne() throws Exception{
        Diamond diamond = new Diamond();

        String diamondString = "*\n";
        int givenNumber = 1;

        assertEquals(diamondString, diamond.printADiamond(givenNumber, null));
    }

    @Test
    public void shouldPrintADiamondWithSizeThree() throws Exception{
        Diamond diamond = new Diamond();

        String diamondString = "  *  \n" + " *** \n" + "*****\n" + " ***\n" + "  * \n";
        int givenNumber = 3;

        assertEquals(diamondString, diamond.printADiamond(givenNumber, null));
    }

    @Test
    public void shouldPrintADiamondWithSizeFive() throws Exception{
        Diamond diamond = new Diamond();

        String diamondString = "    *    \n" + "   ***   \n" + "  *****  \n"
                + " ******* \n" + "*********\n" + " *******\n" + "  ***** \n"
                + "   ***  \n" + "    *   \n";

        int givenNumber = 5;

        assertEquals(diamondString, diamond.printADiamond(givenNumber, null));
    }

    @Test
    public void shouldPrintADiamondWithNameWithSizeOne() throws Exception{
        Diamond diamond = new Diamond();

        String diamondString = "*\n" + "Bianca\n" + "*\n";

        int givenNumber = 1;
        String givenName = "Bianca";

        assertEquals(diamondString, diamond.printADiamond(givenNumber, givenName));
    }

    @Test
    public void shouldPrintADiamondWithNameWithSizeThree() throws Exception{
        Diamond diamond = new Diamond();

        String diamondString = "  *  \n" + " *** \n" + "*****\n"
                + "Bianca\n"
                + "*****\n" + " *** \n" + "  *  \n";

        int givenNumber = 3;
        String givenName = "Bianca";

        assertEquals(diamondString, diamond.printADiamond(givenNumber, givenName));
    }

    @Test
    public void shouldPrintADiamondWithNameWithSizeFive() throws Exception{
        Diamond diamond = new Diamond();

        String diamondString = "    *    \n" + "   ***   \n" + "  *****  \n" + " ******* \n" + "*********\n"
                + "Bianca\n"
                + "*********\n" + " ******* \n" + "  *****  \n" + "   ***   \n" + "    *    \n";

        int givenNumber = 5;
        String givenName = "Bianca";

        assertEquals(diamondString, diamond.printADiamond(givenNumber, givenName));
    }
}