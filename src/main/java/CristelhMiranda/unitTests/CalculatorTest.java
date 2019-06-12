package main.java.CristelhMiranda.unitTests;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void add_twoPositiveNumbers_result3() {
		int actual = Calculator.add(1, 2);
		int expected = 3;
		
		assertEquals(expected, actual);
	}

	@Test
	public void add_onePositiveOneNegatveNumbers_resultnegative11() {
		int actual = Calculator.add(1, -12);
		int expected = -11;
		
		assertEquals(expected, actual);
	}
}
