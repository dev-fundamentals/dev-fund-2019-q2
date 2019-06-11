package main.java.JhasmanyQuiroz.classes.class07UnitTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CalculatorTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void calculatorAddValues() throws Exception {
    int actual = Calculator.add("1,2");
    int expected = 3;

    assertEquals(expected, actual);
  }

  @Test(expected = Exception.class)
   public void add_negativeNumber_resultException() throws Exception {
     int actual = Calculator.addNumbers("-1,-5");
   }

   @Test(expected = Exception.class)
   public void add_addNegativeNumber_resultErrorMessage() throws Exception {
     try {
       Calculator.add("1");
     } catch(Exception e) {
       String actual = e.getMessage();
       assertEquals(actual, "Negative Numbers are: -1 and -5");
     }
   }

   @Test
    public void add_addNegativeNumber_resultErrorMessage1() {
       Calculator.addNumbers("-1,-5");
       thrown.expect(IllegalArgumentException.class);
       thrown.expectMessage("There are negative numbers: '-1,-5'");
   }
}