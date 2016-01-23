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
	public void testUnaryPlusOperator() {
		long l0 = -5L;
		long l1 = +l0;
		assertEquals(l0, l1);
	}
	
	  @Test
	  public void test0()  throws Throwable  {
	      Rational rational0 = new Rational((-40L), (-40L));
	      Rational rational1 = rational0.abs();
	      assertEquals(1, rational1.intValue());
	      assertEquals((-40L), rational1.denominator);
	  }

	  @Test
	  public void test1()  throws Throwable  {
	      Rational rational0 = new Rational((-88L), 26L);
	      Rational rational1 = rational0.abs();
	      assertEquals(3.38461538461538, rational1.doubleValue(), 0.01D);
	      assertEquals(88L, rational1.numerator);
	  }

	  @Test
	  public void test2()  throws Throwable  {
	      Rational rational0 = new Rational(1L, 1L);
	      Rational rational1 = rational0.abs();
	      assertEquals(1L, rational0.numerator);
	      assertEquals(1F, rational1.floatValue(), 0.01F);
	  }

	  @Test
	  public void test3()  throws Throwable  {
	      Rational rational0 = new Rational((-1L), 2L);
	      Rational rational1 = rational0.add((-1L));
	      assertEquals(rational1.numerator, -3L);
	      assertEquals(rational1.denominator, -2L);
	 }

	  @Test
	  public void test4()  throws Throwable  {
	      Rational rational0 = new Rational(1L, 1L);
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
	      Rational rational0 = new Rational(1L, 1L);
	      byte byte0 = rational0.byteValue();
	      assertEquals((byte)1, byte0);
	  }

	  @Test
	  public void test7()  throws Throwable  {
		  Rational rational0 = new Rational((-1069L), 1011L);
	      Rational rational1 = rational0.pow(0);
	      assertEquals(1.0F, rational1.floatValue(), 0.01F);
	      assertEquals((-1.057369F), rational0.floatValue(), 0.01F);
	  }

	  @Test
	  public void test8()  throws Throwable  {
	      Rational rational0 = new Rational(2L, 4L);
	      Rational rational1 = rational0.multiply(2L);
	      assertEquals(1F, rational1.floatValue(), 0.01F);
	      assertEquals(4, rational0.shortValue());
	  }

	  @Test
	  public void test9()  throws Throwable  {
		  Rational rational0 = new Rational(1L, 1L);
	      String string0 = rational0.toString();
	      assertEquals("1 / 1", string0);
	  }

	  @Test
	  public void test10()  throws Throwable  {
	      Rational rational0 = new Rational(1L, 2L);
	      Rational rational1 = rational0.divide(4);
	      assertEquals(1L, rational1.numerator);
	      assertEquals(8L, rational1.denominator);
	      assertEquals(0.5, rational0.doubleValue(), 0.01D);
	  }

	  @Test
	  public void test11()  throws Throwable  {
	      Rational rational0 = new Rational(1L, 2L);
	      Rational rational1 = rational0.subtract((-2L));
	      assertEquals(-3L, rational1.numerator);
	      assertEquals((-1.5F), rational1.floatValue(), 0.01F);
	  }

	  @Test
	  public void test12()  throws Throwable  {
	      Rational rational0 = new Rational((-1228L), (-1228L));
	      double double0 = rational0.doubleValue();
	      assertEquals(1.0, double0, 0.01D);
	  }
}
