package main.java.AlejandraNeolopan.practiceInheritancePolymorphism.Exercise2;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestRectangle {
	Rectangle rect = new Rectangle("C05"); 

	@Test
	public void areaRectangle_equals8() {
		rect.setBase(4);
		rect.setHeight(2);
		rect.drawTxt();
		
		int expected=8;
		assertEquals(expected, (int)rect.getArea());
	}
}
