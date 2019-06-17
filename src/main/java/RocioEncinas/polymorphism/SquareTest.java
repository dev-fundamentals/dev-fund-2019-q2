package main.java.RocioEncinas.polymorphism;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.junit.Test;

public class SquareTest {
	@Test
	public void getType_type_Square_resultSquare() {
		Square square = new Square(3);
		String actual = square.getType();
		String expected = "Square";

		assertEquals(expected, actual);
	}
	
	@Test
	public void area_side3_result9() {
		Square square = new Square(3);
		double actual = square.area();  
		double expected = 9;
		// using assertTrue because asserEquals was deprecated for double
		// It's deprecated because of the double's precision problems
		assertTrue("Not equals", actual - expected == 0);
	}
	
	@Test
	public void drawTxt_square_side3_resultDrawASquareOfSide3() {
		Square square = new Square(3);
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        square.drawTxt();
        
        StringWriter expectedStringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(expectedStringWriter);

        printWriter.println("***");
        printWriter.println("***");
        printWriter.println("***");
        printWriter.close();

        String expected = expectedStringWriter.toString();
        assertEquals(expected, outContent.toString());
	}
}
