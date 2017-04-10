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

        assertEquals(triangleString, triangle.printRightTriangle());
    }

    @Test
    public void shouldPrintACenteredTriangleWithValueOne() throws Exception{
        Triangle triangle = new Triangle();

        String triangleString = "  *  \n" + " *** \n" + "*****\n";
        int givenNumber = 1;

        assertEquals(triangleString, triangle.printACenteredTriangle(givenNumber));
    }

    @Test
    public void shouldPrintACenteredTriangleWithValueThree() throws Exception{
        Triangle triangle = new Triangle();

        String triangleString = "  *  \n" + " *** \n" + "*****\n";
        int givenNumber = 3;

        assertEquals(triangleString, triangle.printACenteredTriangle(givenNumber));
    }

    @Test
    public void shouldPrintACenteredTriangleWithValueFive() throws Exception{
        Triangle triangle = new Triangle();

        String triangleString = "  *  \n" + " *** \n" + "*****\n";
        int givenNumber = 5;

        assertEquals(triangleString, triangle.printACenteredTriangle(givenNumber));
    }

    @Test
    public void shouldPrintACenteredTriangleInverseWithValueOne() throws Exception{
        Triangle triangle = new Triangle();

        String triangleInverseString = "  *  \n";
        int givenNumber = 1;
        boolean shouldPutSpaceBefore = false;

        assertEquals(triangleInverseString, triangle.printACenteredTriangleInverse(givenNumber, shouldPutSpaceBefore));
    }

    @Test
    public void shouldPrintACenteredTriangleInverseWithValueThree() throws Exception{
        Triangle triangle = new Triangle();

        String triangleInverseString = "*****\n" + " *** \n" + "  *  \n";
        int givenNumber = 3;
        boolean shouldPutSpaceBefore = false;

        assertEquals(triangleInverseString, triangle.printACenteredTriangleInverse(givenNumber, shouldPutSpaceBefore));
    }

    @Test
    public void shouldPrintACenteredTriangleInverseWithValueFive() throws Exception{
        Triangle triangle = new Triangle();

        String triangleInverseString = "*******\n" + " ***** \n" + "  ***  \n" + "   *   \n";
        int givenNumber = 3;
        boolean shouldPutSpaceBefore = false;

        assertEquals(triangleInverseString, triangle.printACenteredTriangleInverse(givenNumber, shouldPutSpaceBefore));
    }
}