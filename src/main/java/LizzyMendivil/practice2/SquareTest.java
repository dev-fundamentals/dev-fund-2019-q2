package main.java.LizzyMendivil.practice2;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void getFigureType_newSquare_resultSquare() {
		Square s = new Square(5);
		String actual = s.getFigureType();
		String expected = "Square";
		
		assertEquals(expected, actual);
	}
	
	/*@Test
	public void getArea_side5_result25() {
		Square s = new Square(5);
		double actual = s.getArea();
		int expected = 25;
		
		assertEquals(expected, actual); // ?
	}*/

}
