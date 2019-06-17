package main.java.RocioEncinas.polymorphism;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.junit.Test;

public class RectangleTest {
	
	@Test
	public void getType_type_Rectangle_resultRectangle() {
		Rectangle rectangle = new Rectangle(3, 6);
		String actual = rectangle.getType();
		String expected = "Rectangle";

		assertEquals(expected, actual);
	}
	
	@Test
	public void area_base6_height3_result18() {
		Rectangle rectangle = new Rectangle(6, 3);
		double actual = rectangle.area();  
		double expected = 18;
		// using assertTrue because asserEquals was deprecated for double
		// It's deprecated because of the double's precision problems
		assertTrue("Not equals", actual - expected == 0);
	}
	
	@Test
	public void drawTxt_rectangle_base6_height3_resultDrawRectangle_with_base6_height3() {
		Rectangle rectangle = new Rectangle(6, 3);
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        rectangle.drawTxt();
        
        StringWriter expectedStringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(expectedStringWriter);
        printWriter.println("******");
        printWriter.println("******");
        printWriter.println("******");
        printWriter.close();

        String expected = expectedStringWriter.toString();
        assertEquals(expected, outContent.toString());
	}
}
