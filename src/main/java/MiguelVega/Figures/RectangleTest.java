package main.java.MiguelVega.Figures;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.LizzyMendivil.unitTests.tdd.Calculator;

class RectangleTest {

	@Test
	public void class_declaradedasNull_resultnoNull() {
		 Figure actual = null;
		 Figure expected = Rectangle.fillRectangle();
		 assertEquals(expected, actual,"The objects are not equals");	 
		 
	}
		
	}


