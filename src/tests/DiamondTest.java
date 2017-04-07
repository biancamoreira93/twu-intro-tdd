package tests;

import intro.Diamond;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bmoreira on 4/7/17.
 */
public class DiamondTest {

    //Refactored to remove Duplicates
//    @Test
//    public void shouldPrintADiamond() throws Exception{
//        Diamond diamond = new Diamond();
//
//        String diamondString = "  *  \n" + " *** \n" + "*****\n" + " ***\n" + "  * \n";
//        int givenNumber = 3;
//
//        assertEquals(diamondString, diamond.shouldPrintADiamond(givenNumber));
//    }

    @Test
    public void shouldPrintADiamond() throws Exception{
        Diamond diamond = new Diamond();

        String diamondString = "  *  \n" + " *** \n" + "*****\n"
                + "Bianca\n"
                + "*****\n" + " *** \n" + "  *  \n";

        int givenNumber = 3;
        String givenName = "Bianca";

        assertEquals(diamondString, diamond.shouldPrintADiamond(givenNumber, givenName));
    }
}