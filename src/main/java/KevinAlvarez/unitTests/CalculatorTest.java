package main.java.KevinAlvarez.unitTests;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void add_multipleNumbers_result6() {
		int actual = Calculator.add("1,2,3");
		int expected = 6;
		assertEquals(expected, actual);
	}
	
	@Test
	public void add_emptyString_result0() {
		int actual = Calculator.add("");
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void add_severalNumbers_result15() {
		int actual = Calculator.add("1,2,3,4,5");
		int expected = 15;
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void add_newLineSupport_result6() {
		int actual = Calculator.add("1\n2,3");
		int expected = 6;
		assertEquals(expected, actual);
	}

	@Test
	public void add_customDelimiter_result3() {
		int actual = Calculator.add("//;\n1;2");
		int expected = 3;
		assertEquals(expected, actual);
	}
	
	@Test(expected = RuntimeException.class)
	public void add_negativeNumbers_resultException() {
		int actual = Calculator.add("-1,2,-3,4,-5");
		int expected = 3;
		assertEquals(expected, actual);
	}
	
	@Test
	public void add_negativeNumbers_resultExceptionMessage() {
		try {			
			int actual = Calculator.add("-1,2,-3,4,-5");
		} catch (Exception error) {
			String message = "Negative Numbers: -1,-3,-5";
			assertEquals(error.getMessage(), message);
		}
	}
	
	@Test
	public void add_bigNumbers_result6() {
		int actual = Calculator.add("1,5000,2,2000,3");
		int expected = 6;
		assertEquals(expected, actual);
	}
	
	@Test
	public void add_customDelimiterOfAnyLength_result10() {
		int actual = Calculator.add("//[--]\n1--2--3--4");
		int expected = 10;
		assertEquals(expected, actual);
	}
	
	@Test
	public void add_multipleCustomDelimiters_result10() {
		int actual = Calculator.add("//[-][%]\n1-2%3-4");
		int expected = 10;
		assertEquals(expected, actual);
	}
}
