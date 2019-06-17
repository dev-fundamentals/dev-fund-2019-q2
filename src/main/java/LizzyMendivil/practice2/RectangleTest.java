package main.java.LizzyMendivil.practice2;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.LizzyMendivil.unitTests.tdd.Calculator;

public class RectangleTest {
	
	@Test
	public void getFigureType_newRectangle_resultRectangle() {
		Rectangle r = new Rectangle(5, 2);
		String actual = r.getFigureType();
		String expected = "Rectangle";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getArea_base5_height2_result10() {
		Rectangle r = new Rectangle(5, 2);
		double actual = r.getArea();
		int expected = 10;
		
		assertEquals(expected, actual); // ?
	}

}
