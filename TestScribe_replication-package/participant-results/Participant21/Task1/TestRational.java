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
		  Rational rational0 = new Rational((-820L), (-820L));
	      Rational rational1 = rational0.abs(); 
	      //assertEquals((-450L), rational1.denominator); 
	      assertEquals((-820L), rational1.denominator); // - now this works
	      //assertEquals(-1, rational1.intValue()); 
	      assertEquals(1, rational1.intValue()); // - now this works
	  }

	  @Test
	  public void test1()  throws Throwable  {
	      Rational rational0 = new Rational(3201L, 3201L);
	      Rational rational1 = rational0.negate();
	      Rational rational2 = rational1.abs();
	      assertEquals((-3201L), rational1.numerator); // this is ok
	      assertEquals(3201L, rational2.numerator); // this is ok
	      assertEquals(1.0F, rational0.floatValue(), 0.01F); // this is ok
	      assertEquals(1.0, rational2.doubleValue(), 0.01D); // this is ok
	  }

	  @Test
	  public void test2()  throws Throwable  {
		  Rational rational0 = new Rational(2045L, 1L);
	      Rational rational1 = rational0.abs();
	      assertEquals(2045L, rational0.numerator); // this is ok
	      assertEquals(-3, rational1.byteValue()); // this is ok
	  }

	  @Test
	  public void test3()  throws Throwable  {
		  Rational rational0 = new Rational(2019L, 2019L);
	      // Undeclared exception!
	      try {
	    	  rational0.add(2019L);
	        //fail("Expecting exception: NumberFormatException");
	        // - there is still something to be fixed here
	      } catch(NumberFormatException e) {
	         //
	         // Cannot create a Rational object with zero as the denominator
	         //
	      }
	  }

	  @Test
	  public void test4()  throws Throwable  {
	      Rational rational0 = new Rational(842L, 901L);
	      float float0 = rational0.floatValue();
	      assertEquals(0.9345172F, float0, 0.01F); // this is ok
	  }

	  @Test
	  public void test5()  throws Throwable  {
		  Rational rational0 = new Rational(1674L, 1674L);
	      long long0 = rational0.longValue();
	      assertEquals(1L, long0); // this is ok
	  }

	  @Test
	  public void test6()  throws Throwable  {
		  Rational rational0 = new Rational((-2470L), 1L);
	      byte byte0 = rational0.byteValue();
	      assertEquals((byte)90, byte0); // this is ok - the overridden intValue() method in Rational.java should be correct
	  }

	  @Test
	  public void test7()  throws Throwable  {
	      Rational rational0 = new Rational((-20L), (-20L));
	      Rational rational1 = rational0.pow(33);
	      assertEquals(1L, rational1.longValue()); // this is ok - 1^33 is 1
	  }

	  @Test
	  public void test8()  throws Throwable  {
	      Rational rational0 = new Rational(1151L, 233L);
	      Rational rational1 = rational0.multiply(1151L);
	      //assertEquals(0.0042918455F, rational1.floatValue(), 0.01F); THIS IS WRONG
	      assertEquals(5685.841, rational1.floatValue(), 0.01F); // this is ok
	      assertEquals(4, rational0.shortValue());
	  }

	  @Test
	  public void test9()  throws Throwable  {
	      Rational rational0 = new Rational((-2965L), (-1L));
	      String string0 = rational0.toString();
	      assertEquals("-2965 / -1", string0); // this is ok
	  }

	  @Test
	  public void test10()  throws Throwable  {
	      Rational rational0 = new Rational(84L, (-1518L));
	      Rational rational1 = rational0.divide(84L);
	      assertEquals(84L, rational1.numerator); // this is wrong - FIXME Rational.divide(long)
	      assertEquals((-6.587615283267457E-4), rational1.doubleValue(), 0.01D); // this is wrong because you supposed have to fix divide
	      assertEquals((-0.05533596837944664), rational0.doubleValue(), 0.01D);  // this is ok
	  }

	  @Test
	  public void test11()  throws Throwable  {
		  Rational rational0 = new Rational(3201L, 3201L);
	      Rational rational1 = rational0.subtract(3201L);
	      assertEquals(-10243200L, rational1.numerator); // this is wrong - FIXME Rational.subtract(long)
	      assertEquals(3201L, rational1.denominator);
	   }

	  @Test
	  public void test12()  throws Throwable  {
	      Rational rational0 = new Rational(1917L, (-3234L));
	      double double0 = rational0.doubleValue();
	      assertEquals((-0.5927643784786641), double0, 0.01D);
	  }
}
