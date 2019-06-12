package main.java.AlejandraNeolopan.UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	 
	public void add_emptyString_result0() throws Exception {
		int actual = Calculator.add("");
		int expected = 0;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void add_oneValue_result10() throws Exception {
		
		int actual = Calculator.add("10");
		
		int expected = 10;
		
		assertEquals(expected, actual);
	}

	@Test
	public void add_twoPositiveValues_result20() throws Exception {
		
		int actual = Calculator.add("5,15");
		int expected = 20;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void add_nullValue_result0() throws Exception {
		int actual = Calculator.add(null);
		int expected = 0;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void add_ValueWitDiferentSeparetor_result6() throws Exception {
		int actual = Calculator.add("1\n2,3");
		int expected = 6;
		
		assertEquals(expected, actual);
	}
	@Test (expected = Exception.class)
	public void add_negativeNumber_resultException() throws Exception {
		Calculator.add("-10");
		
	}
	
	@Test 
	public void add_twoNegativeNumber_resultErrorMessage() throws Exception {
		try {
			
			Calculator.add("-10,-20");
			
		} catch (Exception e) {
			String actual = e.getMessage();
			
			assertEquals(actual, "Negative numbers are: -10, -20");
		}
	}
	 
	 
	@Test
	public void add_supportDifferentSeparator_result3() throws Exception {
		
		int actual = Calculator.add("//;\n1;2");
		
		int expected = 3;
		
		assertEquals(expected, actual );
	}
	
	@Test
	public void add_biggerThan1000_result2() throws Exception {
		int actual = Calculator.add("//;\n1001;2");
		int expected = 2;
		
		assertEquals(expected, actual);
	}
	@Test
	public void add_delimitersanylenght_result6() throws Exception {
		
		int actual = Calculator.add("//[-]\n1-2-3");
		int expected = 6;
		
		assertEquals(expected, actual);
	}

	@Test
	public void add_delimiterMultiple_result6() throws Exception {
		
		int actual = Calculator.add("//[-][%]\n1-2%3");
		int expected = 6;
		
		assertEquals(expected, actual);
	}
	

}
