package tests;

import intro.Triangle;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bmoreira on 4/7/17.
 */
public class TriangleTest {
    @Test
    public void shouldPrintRightTriangle() throws Exception{
        Triangle triangle = new Triangle();

        String triangleString = "*\n" + "**\n" + "***\n";

        assertEquals(triangleString, triangle.shouldPrintRightTriangle());
    }

    @Test
    public void shouldPrintACenteredTriangle() throws Exception{
        Triangle triangle = new Triangle();

        String triangleString = "  *  \n" + " *** \n" + "*****\n";
        int givenNumber = 3;

        assertEquals(triangleString, triangle.shouldPrintACenteredTriangle(givenNumber));
    }

    @Test
    public void shouldPrintACenteredTriangleInverse() throws Exception{
        Triangle triangle = new Triangle();

        String triangleInverseString = "*****\n" + " *** \n" + "  *  \n";
        int givenNumber = 3;
        boolean shouldPutSpaceBefore = false;

        assertEquals(triangleInverseString, triangle.shouldPrintACenteredTriangleInverse(givenNumber, shouldPutSpaceBefore));
    }
}