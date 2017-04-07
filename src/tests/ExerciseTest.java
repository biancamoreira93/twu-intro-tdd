package tests;

import intro.Exercise;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bmoreira on 4/7/17.
 */
public class ExerciseTest {

    @Test
    public void shouldPrintExerciseOne(){
        Exercise exerciseOne = new Exercise();
        assertEquals(true, exerciseOne.exerciseOnePrint());
    }
}