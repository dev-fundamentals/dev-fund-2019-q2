package main.java.NicolasRios.unitTests;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void add_emptyString_result0() {
		int actual = Calculator.add("");
		int expected = 0;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void add_oneValue_result10() {
		int actual = Calculator.add("10");
		int expected = 10;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void add_twoPositiveValues_result20() {
		int actual = Calculator.add("5,15");
		int expected = 20;
		
		assertEquals(expected, actual);
	
	}

	@Test
	public void add_nullValue_result0() {
		int actual = Calculator.add(null);
		int expected = 0;
		
		assertEquals(expected, actual);
	}

	@Test
	public void add_valueWithDiffSeparator_result6() {
		int actual = Calculator.add("1\n2,3");
		int expected = 0;
		
		assertEquals(expected, actual);
	}
	
	@Test (expected = Exception.class)
	public void add_negativeNumber_resultException() throws Exception {
		int actual = Calculator.add("-10");
	
	}
	
	@Test
	public void add_twoNegativeNumbers_resultErrorMessage() throws Exception {
		try {
			Calculator.add("-10, -20");
		} catch (Exception e) {
			
		}
		}
		
		int actual = Calculator.add("-10, -20");
		int expected = 0;


}
