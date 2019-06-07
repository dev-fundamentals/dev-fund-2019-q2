package main.java.JhasmanyQuiroz.classes.class07UnitTest;

import static org.junit.Assert.*;

public class CalculatorTest {

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
       Calculator.add();
     } catch(Exception e) {
       String actual = e.getMessage();
       assertEquals(actual, "Negative Numbers are: -1 and -5");
     }
   }
}