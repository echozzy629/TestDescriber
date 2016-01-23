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
	      Rational rational0 = new Rational((-911L), (-911L));
	      Rational rational1 = rational0.abs();
	      assertEquals(1, rational1.intValue()); //CHANGED
	      assertEquals(1, rational1.denominator);
	      assertEquals(1, rational1.numerator);
	  }

	  @Test
	  public void test1()  throws Throwable  {
	      Rational rational0 = new Rational(63L, 86L);
	      // Undeclared exception!
	     // try {
	      Rational rational1 =  rational0.add((-14L));
	       // fail("Expecting exception: NumberFormatException");
	      
	      //} catch(NumberFormatException e) {
	         //
	         // Cannot create a Rational object with zero as the denominator
	         //
	      //}
	      assertEquals(63L -86L*14L, rational1.numerator);
	      assertEquals(86L, rational1.denominator);
	      assertEquals(-13, rational1.intValue());
	  }

	  @Test
	  public void test2()  throws Throwable  {
	      Rational rational0 = new Rational(2613L, 472L);
	      byte byte0 = rational0.byteValue();
	      assertEquals((byte)5, byte0);
	  }

	  @Test
	  public void test3()  throws Throwable  {
	      Rational rational0 = new Rational(144L, 144L);
	      Rational rational1 = rational0.pow(452);
	      assertEquals(1L, rational1.longValue());
	  }

	  @Test
	  public void test4()  throws Throwable  {
		  Rational rational0 = new Rational((-131L), 163);
	      String string0 = rational0.toString();
	      assertEquals("-131 / 163", string0);
	      Rational rational1 = rational0.abs();
	      assertEquals("131 / 163", rational1.toString());
	  }

	  @Test
	  public void test5()  throws Throwable  {
		  Rational rational0 = new Rational(11L, 11L);
	      Rational rational1 = rational0.divide(11L);
	      assertEquals(11L, rational1.numerator);
	      assertEquals(11L * 11L, rational1.denominator); //added
	      assertEquals(1.0, rational0.doubleValue(), 0.01D);
	      assertEquals(0.090909090909090, rational1.doubleValue(), 0.01D);
	  }

	  @Test
	  public void test6()  throws Throwable  {
	      Rational rational0 = new Rational((-88L), 62L);
	      Rational rational1 = rational0.abs();
	      assertEquals(1.419354838708968, rational1.doubleValue(), 0.01D);
	      assertEquals(44L, rational1.numerator);
	  }

	  @Test
	  public void test7()  throws Throwable  {
	      Rational rational0 = new Rational(1L, 44L);
	      Rational rational1 = rational0.abs();
	      assertEquals(2.27272E-2F, rational1.floatValue(), 0.01F);
	  }
	  @Test
	  public void test8()  throws Throwable  {
	      Rational rational0 = new Rational(6L, 6L);
	      Rational rational1 = rational0.subtract((-15L));
	      assertEquals(84L, rational1.numerator);
	      assertEquals((-14.0), rational1.doubleValue(), 0.01);
	  }
	  
	  @Test
	  public void test9()  throws Throwable  {
		  Rational rational0 = new Rational(576L, 117L);
	      Rational rational1 = rational0.multiply(576L);
	      assertEquals(2835.6924F, rational1.floatValue(), 0.01F);
	      assertEquals(576L*576L,rational1.numerator);
	      assertEquals(117L,rational1.denominator);
	      assertEquals(4, rational0.shortValue());
	  }
	  
	  @Test
	  public void testZeroDenominator()  throws Throwable  {
	      try {
	    	  Rational rational0 = new Rational(1L, 0L);
	        fail("Expecting exception: NumberFormatException");
	      
	      } catch(NumberFormatException e) {
	         //
	         // Cannot create a Rational object with zero as the denominator
	         //
	      }
	  }
	  
	  @Test
	  public void testAbs()  throws Throwable  {
		  Rational rational0 = new Rational(-1L, -2L);
	      Rational rational1 = rational0.abs();
	      assertEquals("1 / 2", rational1.toString());
	  }
}
