package tests;

import intro.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bmoreira on 4/10/17.
 */
public class FizzBuzzTest {


    @Test
    public void shouldPrintFizzWhenInputIsThree(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int givenNumber = 3;
        String expectedReturn = "1\n2\nFizz\n";

        assertEquals(expectedReturn, fizzBuzz.printFizzBuzz(givenNumber));
    }

    @Test
    public void shouldPrintBuzzWhenInputIsFive(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int givenNumber = 5;
        String expectedReturn = "1\n2\nFizz\n4\nBuzz\n";

        assertEquals(expectedReturn, fizzBuzz.printFizzBuzz(givenNumber));
    }

    @Test
    public void shouldPrintBuzzWhenInputIsFifteen(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int givenNumber = 15;
        String expectedReturn = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n";

        assertEquals(expectedReturn, fizzBuzz.printFizzBuzz(givenNumber));
    }
}