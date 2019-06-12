package main.java.BenhaminHuanca.TDDPractice;

import org.junit.Test;

import static org.junit.Assert.*;


public class CalculatorTest {

    @Test
    public void add_emptyString_result0() throws Exception {
        int actual = Calculator.add("");
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void add_oneValue_result10() throws Exception {
        int actual = Calculator.add("1");
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void add_twoPositiveValues_result20() throws Exception {
        int actual = Calculator.add("2,3");
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void add_nullValue_result0() throws Exception {
        int actual = Calculator.add(null);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void add_valueWithDifferentSeparator_result6() throws Exception {
        int actual = Calculator.add("1\n2,3");
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test (expected = Exception.class)
    public void add_negativeNumber_resultException() throws Exception {
        Calculator.add("-10");

    }

	@Test
    public void add_valueBiggerThan1000_resultIgnored() throws Exception {
        int actual = Calculator.add("2,1001");
        int expected = 2;

        assertEquals(expected, actual);
    }
}