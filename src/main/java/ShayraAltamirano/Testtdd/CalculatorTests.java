package main.java.ShayraAltamirano.Testtdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTests {

	@Test
	public void add_emptyString_result0() throws Exception {
		int actual =Calculator.add("");
		int expected =0;
		assertEquals(expected,actual);
	}
	@Test
	public void add_2NumbersString_result10() throws Exception {
		int actual =Calculator.add("3,7");
		int expected =10;
		assertEquals(expected,actual);
	}
	@Test
	public void add_3NumberString_result20() throws Exception {
		int actual =Calculator.add("10,6,4");
		int expected =20;
		assertEquals(expected,actual);
	}
	
	@Test
	public void add_nseparatorNumberString_result20() throws Exception {
		int actual =Calculator.add("10,5\n1,4");
		int expected =20;
		assertEquals(expected,actual);
	}
	
	@Test (expected=Exception.class)
	public void add_negativeNumberString_resultExeption() throws Exception {
		Calculator.add("-10");
	}
	
	@Test (expected=Exception.class)
	public void add_negativeNumberString_resultNegativeNumbers() throws Exception {
		try {
			Calculator.add("-10,-20");
		}catch(Exception e) {
			String actual=e.getMessage();
			assertEquals(actual,"Negative numbers are: -10,-20,");
		}
	}
	
	@Test 
	public void add_longNumberString_resultIgnoreLongNumber() throws Exception {
		int actual =Calculator.add("10,1001,4");
		int expected =14;
		assertEquals(expected,actual);
	}
	
	@Test
	public void add_severalseparatorNumberString_result10() throws Exception {
		int actual =Calculator.add("5%1//%\n4");
		int expected =10;
		assertEquals(expected,actual);
	}
}

