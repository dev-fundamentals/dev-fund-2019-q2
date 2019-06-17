package main.java.JoseCardozo.polymorphism2;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    Rectangle rectangle;
    @Test
    public void getArea_base4_height5_result20() {
        rectangle = new Rectangle("Rectangle",4,5);
        double actual = rectangle.getArea();
        double expected = 20;

        assertEquals(expected,actual,0);
    }
}