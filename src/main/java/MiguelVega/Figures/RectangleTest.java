package main.java.MiguelVega.Figures;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void class_declaradedasNull_resultnoNull() {
		Figure actual = null;
		Figure expected = Rectangle.fillRectangle();
		assertEquals(expected, actual);
	}
}
