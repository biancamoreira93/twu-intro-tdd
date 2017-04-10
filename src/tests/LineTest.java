package tests;

import intro.Line;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bmoreira on 4/7/17.
 */
public class LineTest {

    //This test was deleted because there's another test doing the same thing in a easy way
//    @Test
//    public void printAsterisk() throws Exception{
//        Line line = new Line();
//        assertEquals("*", line.printAsterisk());
//    }


    @Test
    public void printSpace() throws Exception{
        Line line = new Line();
        assertEquals(" ", line.printSpace());
    }

    @Test
    public void goToNewLine() throws Exception{
        Line line = new Line();
        assertEquals("\n", line.goToNewLine());
    }

    @Test
    public void shouldPrintAGivenNumberOfAsterisks() throws Exception{
        Line line = new Line();
        int givenNumber = 3;
        assertEquals("***", line.printAGivenNumberOfAsterisks(givenNumber));
    }

}