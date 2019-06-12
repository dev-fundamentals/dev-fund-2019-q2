package main.java.NicolasRios.UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculadoraTest {

	@Test
	public void add__twoPositiveNumbers_result3() {
		int actual = calculadora.add(1, 2);
		int expected = 3;
		
		assertEquals(expected, actual);
	}

	@Test
	public void add_onePositiveOneNegativeNumbers_resultneg11() {
		int actual = calculadora.add(1, -12);
		int expected = 3;
		
		assertEquals(expected, actual);
	
	}
}
