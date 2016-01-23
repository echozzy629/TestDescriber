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
		  Rational rational0 = new Rational((-1L), (-1L));
	      Rational rational1 = rational0.abs();
	      assertEquals(-1L, rational0.numerator);
	      assertEquals(1.0, rational1.doubleValue(), 0.01D);
	  }

	  @Test
	  public void test1()  throws Throwable  {
		  Rational rational0 = new Rational(517L, 517L);
	      Rational rational1 = rational0.abs();
	      assertEquals(517L, rational0.numerator);
	      assertEquals(1, rational1.shortValue());
	  }

	  @Test
	  public void test2()  throws Throwable  {
		  Rational rational0 = new Rational(2887L, 2887L);
	      // Undeclared exception!
	      try {
	        rational0.add(2887L);
	        fail("Expecting exception: NumberFormatException");
	      
	      } catch(NumberFormatException e) {
	         //
	         // Cannot create a Rational object with zero as the denominator
	         //
	      }
	  }

	  @Test
	  public void test3()  throws Throwable  {
		  Rational rational0 = new Rational((-301L), (-301L));
	      float float0 = rational0.floatValue();
	      assertEquals(1.0F, float0, 0.01F);
	  }

	  @Test
	  public void test4()  throws Throwable  {
		  Rational rational0 = new Rational((-1266L), (-1266L));
	      long long0 = rational0.longValue();
	      assertEquals(1L, long0);
	  }

	  @Test
	  public void test05()  throws Throwable  {
	      Rational rational0 = new Rational((-511L), (-511L));
	      byte byte0 = rational0.byteValue();
	      assertEquals(1, rational0.shortValue());
	      assertEquals((byte)1, byte0);
	  }

	  @Test
	  public void test6()  throws Throwable  {
		  Rational rational0 = new Rational(517L, 517L);
	      // Undeclared exception!
	      try {
	        rational0.pow((-2463));
	        fail("Expecting exception: NumberFormatException");
	      
	      } catch(NumberFormatException e) {
	         //
	         // Cannot create a Rational object with zero as the denominator
	         //
	      }
	  }

	  @Test
	  public void test7()  throws Throwable  {
		  Rational rational0 = new Rational((-301L), (-301L));
	      Rational rational1 = rational0.multiply((-301L));
	      assertEquals((-301.0F), rational1.floatValue(), 0.01F);
	      assertEquals(1, rational0.shortValue());
	  }

	  @Test
	  public void test8()  throws Throwable  {
		  Rational rational0 = new Rational(200L, 200L);
	      String string0 = rational0.toString();
	      assertEquals("200 / 200", string0);
	  }

	  @Test
	  public void test09()  throws Throwable  {
	      Rational rational0 = new Rational((-3075L), (-240L));
	      Rational rational1 = rational0.divide((-3075L));
	      assertEquals(738000L, rational1.denominator);
	      assertEquals((-0.004166666666666667), rational1.doubleValue(), 0.01D);
	      assertEquals(12.8125, rational0.doubleValue(), 0.01D);
	  }

	  @Test
	  public void test10()  throws Throwable  {
	      Rational rational0 = new Rational(77L, 77L);
	      Rational rational1 = rational0.subtract(77L);
	      assertEquals(6006L, rational1.numerator);
	      assertEquals(78.0F, rational1.floatValue(), 0.01F);
	  }

	  @Test
	  public void test11()  throws Throwable  {
	      Rational rational0 = new Rational((-2313L), (-2313L));
	      double double0 = rational0.doubleValue();
	      assertEquals(1.0, double0, 0.01D);
	  }
}
