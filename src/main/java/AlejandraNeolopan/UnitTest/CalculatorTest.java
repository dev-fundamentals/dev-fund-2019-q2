package main.java.AlejandraNeolopan.UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
Calculator calc=new Calculator();
	@Test
	public void add_emptyString_result9() {
		int actual = calc.add("\\,1\n2,3");
		int expected = 6;
		
		assertEquals(expected, actual);	
	}


}
