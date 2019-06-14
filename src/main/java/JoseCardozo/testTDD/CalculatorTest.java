package main.java.JoseCardozo.testTDD;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add_emptyString_result0() throws Exception {
        int actual = Calculator.add("");
        int expected = 0;

        assertEquals(expected,actual);
    }

    @Test
    public void add_oneValue_result10() throws Exception {
        int actual = Calculator.add("5,5");
        int expected = 10;

        assertEquals(expected,actual);
    }

    @Test
    public void add_oneValue_result5() throws Exception {
        int actual = Calculator.add("5");
        int expected = 5;

        assertEquals(expected,actual);
    }

    @Test
    public void add_oneNullValue_result0() throws Exception {
        int actual = Calculator.add(null);
        int expected = 0;

        assertEquals(expected,actual);
    }

    @Test
    public void add_valueWithDifferentSeparetor_result6() throws Exception {
        int actual = Calculator.add("1\n2,3");
        int expected = 6;

        assertEquals(expected,actual);
    }

    @Test (expected = Exception.class)
    public void add_negativeNumbers_resultThrowException() throws Exception {
        Calculator.add("1,-2,3");
    }

    @Test
    public void add_twoNegativeNumbers_resultErrorMessage() throws Exception {
        String actual = "";
        String expected = "Negative numbers are: -2,-3";
        try {
            Calculator.add("1,-2,-3");
        }
        catch (Exception e){
           actual = e.getMessage();
        }
        assertEquals(expected,actual);
    }
}