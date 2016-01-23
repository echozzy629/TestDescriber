package org.magee.math;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.magee.math.Rational;

/*
 * The following test cases have been automatically generated using EvoSuite. 
 * These unit tests contain assertions that reflect the current behavior of the  
 * class under test (Rational.java). However, since the class under test is faulty 
 * (i.e., there are bugs), the generated assertions may wrongly reflect the 
 * incorrect behavior. Therefore, the assertions need to be analyzed and fixed. 
 * Feel free to remove assertions or to @Ignore tests you do not understand.
 *
 * Notes on Testing: There are bugs in Rational.java. A test revealing a bug should 
 * fail. Tests not revealing bugs should pass. To this aim you can add/remove and modify
 * test cases. You may fix obvious bugs, but do not waste time debugging.
 */

public class TestRational {
	
	  @Test
	  public void test0()  throws Throwable  {
	      Rational rational0 = new Rational((-450L), (-450L));
	      Rational rational1 = rational0.abs();
	      // WRONG: abs(-450/-450) == 1
	      assertEquals(1, rational1.intValue());
	      // WRONG: abs(-450/-450) == 450/450 => denominator == 450
	      assertEquals(450L, rational1.denominator);
	  }

	  @Test
	  public void test1()  throws Throwable  {
	      Rational rational0 = new Rational((-848L), 2326L);
	      Rational rational1 = rational0.abs();
	      // OK
	      assertEquals(0.3645743766122098, rational1.doubleValue(), 0.01D);
	      // OK
	      assertEquals(848L, rational1.numerator);
	  }

	  @Test
	  public void test2()  throws Throwable  {
	      Rational rational0 = new Rational(1L, 2338L);
	      Rational rational1 = rational0.abs();
	      // OK
	      assertEquals(1L, rational0.numerator);
	      // OK
	      assertEquals(4.27716E-4F, rational1.floatValue(), 0.01F);
	  }

	  @Test
	  public void test3()  throws Throwable  {
	      Rational rational0 = new Rational((-1L), 140L);
	      // WRONG: Adding a negative number shouldn't throw an exception,
	      // instead it should simply perform the addition
//	      // Undeclared exception!
//	      try {
//	        rational0.add((-626L));
//	        fail("Expecting exception: NumberFormatException");
//	      
//	      } catch(NumberFormatException e) {
//	         //
//	         // Cannot create a Rational object with zero as the denominator
//	         //
//	      }
	      Rational rational1 = rational0.add((-626L));
	      assertEquals(-626.0071428571428571F, rational1.floatValue(), 0.01F);
	  }

	  @Test
	  public void test4()  throws Throwable  {
	      Rational rational0 = new Rational(1L, 1L);
	      float float0 = rational0.floatValue();
	      // OK
	      assertEquals(1.0F, float0, 0.01F);
	  }

	  @Test
	  public void test5()  throws Throwable  {
	      Rational rational0 = new Rational(1L, 1L);
	      long long0 = rational0.longValue();
	      // OK
	      assertEquals(1L, long0);
	  }

	  @Test
	  public void test6()  throws Throwable  {
	      Rational rational0 = new Rational(2851L, 2851L);
	      byte byte0 = rational0.byteValue();
	      // OK
	      assertEquals((byte)1, byte0);
	  }

	  @Test
	  public void test7()  throws Throwable  {
	      Rational rational0 = new Rational((-20L), (-20L));
	      Rational rational1 = rational0.pow(3131);
	      // WRONG: -1^3131 == -1 (theoretically, practically => long overflow)
	      assertEquals(-1L, rational1.longValue());
	  }

	  @Test
	  public void test8()  throws Throwable  {
	      Rational rational0 = new Rational(1151L, 233L);
	      Rational rational1 = rational0.multiply(1151L);
	      // WRONG: 
	      assertEquals(5685.8412017167382488F, rational1.floatValue(), 0.01F);
	      // OK (assuming shortValue to capping instead of rounding)
	      assertEquals(4, rational0.shortValue());
	  }

	  @Test
	  public void test9()  throws Throwable  {
	      Rational rational0 = new Rational(348L, (-177L));
	      String string0 = rational0.toString();
	      // OK
	      assertEquals("348 / -177", string0);
	  }

	  @Test
	  public void test10()  throws Throwable  {
	      Rational rational0 = new Rational(2851L, 2851L);
	      Rational rational1 = rational0.divide(2851L);
	      // OK (iff the next assertion also holds (i.e., no reduction took place)
	      assertEquals(2851L, rational1.numerator);
	      assertEquals(8128201L, rational1.denominator);
	      // OK
	      assertEquals(1.0, rational0.doubleValue(), 0.01D);
	      // OK
	      assertEquals(3.5075412136092597E-4, rational1.doubleValue(), 0.01D);
	  }

	  @Test
	  public void test11()  throws Throwable  {
	      Rational rational0 = new Rational(67L, 67L);
	      Rational rational1 = rational0.subtract((-154L));
	      // WRONG: 67 - (-10318) == 10385
	      assertEquals(10385L, rational1.numerator);
	      // WRONG: 1 - (-154) == 155
	      assertEquals(155.0F, rational1.floatValue(), 0.01F);
	  }

	  @Test
	  public void test12()  throws Throwable  {
	      Rational rational0 = new Rational((-1L), 140L);
	      double double0 = rational0.doubleValue();
	      // OK
	      assertEquals((-0.007142857142857143), double0, 0.01D);
	  }
	  
	  // TODO: Write additional tests for:
	  // * reduce (complex method),
	  // * intValue + longValue (similar methods with different implementation)
	  // * inverse (not yet tested)
	  // * NumberFormatException (net yet tested)
	  // * boundaries (i.e., more tests that cover overflow situations alike test7)
}
