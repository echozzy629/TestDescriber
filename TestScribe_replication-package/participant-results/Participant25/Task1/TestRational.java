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
	      Rational rational0 = new Rational((-3671L), (-3671L));
	      Rational rational1 = rational0.divide(rational0);
	      assertEquals(1L, rational1.numerator);
	      assertEquals(1L, rational1.floatValue(), 0.01F);
	  }

	  @Test
	  public void test1()  throws Throwable  {
	      Rational rational0 = new Rational((-1L), (-1L));
	      Rational rational1 = rational0.abs();
	      assertEquals((1L), rational0.numerator);
	      assertEquals(1, rational1.byteValue());
	  }

	  @Test
	  public void test2()  throws Throwable  {
	      Rational rational0 = new Rational(851L, 851L);
	      Rational rational1 = rational0.abs();
	      assertEquals(851L, rational0.numerator);
	      assertEquals(851L, rational1.denominator);
	      assertEquals(1, rational1.byteValue());
	  }

	  @Test
	  public void test3()  throws Throwable  {
	      Rational rational0 = new Rational((-1L), (-1L));
	      try {
	        rational0.add((-3224L));
	        fail("Expecting exception: NumberFormatException");
	      
	      } catch(NumberFormatException e) {
	         //
	         // Cannot create a Rational object with zero as the denominator
	         //
	      }
	  }

	  @Test
	  public void test4()  throws Throwable  {
	      Rational rational0 = new Rational(851L, 851L);
	      float float0 = rational0.floatValue();
	      assertEquals(1.0F, float0, 0.01F);
	  }

	  @Test
	  public void test5()  throws Throwable  {
	      Rational rational0 = new Rational(1L, 1L);
	      long long0 = rational0.longValue();
	      assertEquals(1L, long0);
	  }

	  @Test
	  public void test6()  throws Throwable  {
	      Rational rational0 = new Rational((-2878L), 3335L);
	      short short0 = rational0.shortValue();
	      assertEquals((short)0, short0);
	      assertEquals((-0.8629685F), rational0.floatValue(), 0.01F);
	  }

	  @Test
	  public void test7()  throws Throwable  {
	      Rational rational0 = new Rational((-1706L), 1409L);
	      try {
	        rational0.pow((-1));
	        fail("Expecting exception: NumberFormatException");
	      
	      } catch(NumberFormatException e) {
	         //
	         // Cannot create a Rational object with zero as the denominator
	         //
	      }
	  }

	  @Test
	  public void test8()  throws Throwable  {
		  Rational rational0 = new Rational(1151L, 233L);
	      Rational rational1 = rational0.multiply(1151L);
	      assertEquals(5685.8413, rational1.floatValue(), 0.01F);
	      assertEquals(4, rational0.shortValue());
	  }

	  @Test
	  public void test9()  throws Throwable  {
	      Rational rational0 = new Rational(851L, 851L);
	      String string0 = rational0.toString();
	      assertEquals("851 / 851", string0);
	  }

	  @Test
	  public void test10()  throws Throwable  {
	      Rational rational0 = new Rational(1L, 1L);
	      Rational rational1 = rational0.divide(1L);
	      assertEquals(1.0F, rational0.floatValue(), 0.01F);
	      assertEquals(1L, rational1.longValue());
	  }

	  @Test
	  public void test11()  throws Throwable  {
	      Rational rational0 = new Rational((-1784L), 669L);
	      Rational rational1 = rational0.subtract(1L);
	      assertEquals((-1.6666666F), rational1.floatValue(), 0.01F);
	  }

	  @Test
	  public void test12()  throws Throwable  {
	      Rational rational0 = new Rational((-1784L), 669L);
	      double double0 = rational0.doubleValue();
	      assertEquals((-2.6666666666666665), double0, 0.01D);
	  }
	  
}
