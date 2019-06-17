package main.java.JoseCardozo.polymorphism2;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    Square square;
    @Test
    public void getArea_baseValue3_result9() {
        square =  new Square("Square",3);
        double actual = square.getArea();
        double expected = 9;

        assertEquals(expected,actual,0);
    }
}