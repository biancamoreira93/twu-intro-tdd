package tests;

import intro.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bmoreira on 4/10/17.
 */
public class FizzBuzzTest {

    @Test
    public void shouldReceiveThreeAndThenReturnTrue(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int givenNumber = 3;
        boolean expectedReturn = true;

        assertEquals(expectedReturn, fizzBuzz.isFizz(givenNumber));
    }

    @Test
    public void shouldReceiveSixAndThenReturnTrue(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int givenNumber = 6;
        boolean expectedReturn = true;

        assertEquals(expectedReturn, fizzBuzz.isFizz(givenNumber));
    }

    @Test
    public void shouldReceiveNineAndThenReturnTrue(){
        FizzBuzz fizz = new FizzBuzz();
        int givenNumber = 9;
        boolean expectedReturn = true;

        assertEquals(expectedReturn, fizz.isFizz(givenNumber));
    }

    @Test
    public void shouldReceiveTenAndThenReturnFalse(){
        FizzBuzz fizz = new FizzBuzz();
        int givenNumber = 10;
        boolean expectedReturn = false;

        assertEquals(expectedReturn, fizz.isFizz(givenNumber));
    }

    @Test
    public void shouldReceiveFiveAndThenReturnTrue(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int givenNumber = 5;
        boolean expectedReturn = true;

        assertEquals(expectedReturn, fizzBuzz.isBuzz(givenNumber));
    }

    @Test
    public void shouldReceiveTenAndThenReturnTrue(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int givenNumber = 10;
        boolean expectedReturn = true;

        assertEquals(expectedReturn, fizzBuzz.isBuzz(givenNumber));
    }

    @Test
    public void shouldReceiveFifteenAndThenReturnTrue(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int givenNumber = 15;
        boolean expectedReturn = true;

        assertEquals(expectedReturn, fizzBuzz.isBuzz(givenNumber));
    }

    @Test
    public void shouldFizzBuzzReceiveFifteenAndThenReturnTrue(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int givenNumber = 15;
        boolean expectedReturn = true;

        assertEquals(expectedReturn, fizzBuzz.isFizzBuzz(givenNumber));
    }
}