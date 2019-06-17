package main.java.JoseCardozo.unitTests;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    @Test
    public void add_twoPositiveNumbers_result3() {
        int actual = Calculator.add(1,2);
        int expected = 3;

        assertEquals(String.format("The expected value %d and actual value %d are not equals.",expected,actual),expected,actual);
    }

    @Test
    public void add_onePositiveOneNevativeNumbers_resultNevative11() {
        int actual = Calculator.add(1,-12);
        int expected = -11;

        assertEquals(String.format("The expected value %d and actual value %d are not equals.",expected,actual),expected,actual);
    }
}