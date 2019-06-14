package main.java.RolandoMamani.UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void add_emptyString_result9() {
		int actual = Calculator.add("1\n2,3");
		int expected = 6;
		
		assertEquals(expected, actual);	
	}

}
