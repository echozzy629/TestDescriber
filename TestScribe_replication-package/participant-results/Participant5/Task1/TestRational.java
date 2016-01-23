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
	      Rational rational0 = new Rational(10L, 56L);
	      Rational rational1 = rational0.abs();
	      assertEquals(10L, rational0.numerator);
	      assertEquals(0.17857142857143, rational1.floatValue(), 0.01F);
	  }
	  
	  @Test
	  public void test1()  throws Throwable  {
	      Rational rational0 = new Rational((-64L), 1423L);
	      Rational rational1 = rational0.abs();
	      assertEquals(0.0449754040759, rational1.doubleValue(), 0.01D);
	      assertEquals(64L, rational1.numerator);
	      assertEquals(1423L, rational1.denominator);
	  }
	 
	  @Test
	  public void test2()  throws Throwable  {
	      Rational rational0 = new Rational((-64L), (-64L));
	      Rational rational1 = rational0.abs();
	      byte byte0 = rational0.byteValue();
	      assertEquals((byte)1, byte0);
	      assertEquals(1, rational1.intValue());
	      assertEquals(64L, rational1.numerator);
	  }

	  @Test
	  public void test3()  throws Throwable  {
	      Rational rational0 = new Rational((-1742L), (-874L));
	      String string0 = rational0.toString();
	      assertEquals("-1742 / -874", string0);
	      assertEquals((-1742L), rational0.numerator);
	  }

	  @Test
	  public void test4()  throws Throwable  {
	      Rational rational0 = new Rational((-64L), (-64L));
	      // Undeclared exception!
	      try {
	        rational0.add((72L));
	        fail("Expecting exception: NumberFormatException");
	      
	      } catch(NumberFormatException e) {
	         //
	         // Cannot create a Rational object with zero as the denominator
	         //
	      }
	  }

	  @Test
	  public void test5()  throws Throwable  {
	      Rational rational0 = new Rational(35L, 1644L);
	      Rational rational1 = rational0.multiply(35L);
	      assertEquals(6.08273E-4, rational1.doubleValue(), 0.01);
	      assertEquals(0, rational0.shortValue());
	  }

	  @Test
	  public void test6()  throws Throwable  {
	      Rational rational0 = new Rational(143L, 143L);
	      Rational rational1 = rational0.divide(50L);
	      assertEquals(7150L, rational1.denominator);
	      assertEquals(1.0, rational0.doubleValue(), 0.01D);
	      assertEquals(0.02, rational1.doubleValue(), 0.01D);
	  }
	  
	  @Test
	  public void test7()  throws Throwable  {
	      Rational rational0 = new Rational((-92L), (-92L));
	      Rational rational1 = rational0.pow(451);
	      assertEquals(1L, rational1.longValue());
	  }
	  
	  @Test
	  public void test8()  throws Throwable  {
	      Rational rational0 = new Rational(143L, 143L);
	      Rational rational1 = rational0.subtract(12L);
	      assertEquals(143L, rational1.denominator);
	      assertEquals(13.0F, rational1.floatValue(), 0.01F);
	  }
}
