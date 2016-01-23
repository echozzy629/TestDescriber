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
	      Rational rational0 = new Rational((-4L), (-5L));
	      Rational rational1 = rational0.abs();
	      assertEquals(0.8D, rational1.doubleValue(), 0.001D); //modified test, removed minus in front of 1, because abs function should return absolute value of a number. In this case it is 1 and integer value of that number should also be one. There is a bug in abs method in Rational.java
	      assertEquals(5L, rational1.denominator);
	      //added
	      assertEquals(4, rational1.numerator);
	  }

	  @Test
	  public void test1()  throws Throwable  {
	      Rational rational0 = new Rational((-351L), 1653L);
	      Rational rational1 = rational0.abs();
	      assertEquals(0.21234119782214, rational1.doubleValue(), 0.00000000000000001D); 
	      assertEquals(351L, rational1.numerator);
	  }

	  @Test
	  public void test2()  throws Throwable  {
	      Rational rational0 = new Rational(1L, 6552L);
	      Rational rational1 = rational0.abs();
	      assertEquals(1L, rational0.numerator);
	      assertEquals(1.52625E-4F, rational1.floatValue(), 0.00000000000000001F);
	  }

	  @Test
	  public void test3()  throws Throwable  {
	      Rational rational0 = new Rational((-1L), 140L);
	      // Undeclared exception!
	      try {
	        Rational newRational = rational0.add((-626L));
	        assertEquals(-87641L, newRational.numerator); //there is a bug in class Rationale in add method, it is fixed and test is modified
	        //fail("Expecting exception: NumberFormatException");
	      
	      } catch(NumberFormatException e) {
	         //
	         // Cannot create a Rational object with zero as the denominator
	         //
	      }
	     
	  }

	  @Test
	  public void test4()  throws Throwable  {
	      Rational rational0 = new Rational(1L, 17L); //modified test - dividing 1 with 1 does not make sence, test does not reveal any bugs.
	      float float0 = rational0.floatValue();
	      assertEquals(0.0588235294117647F, float0, 0.00000000000000001F);
	  }

	  @Test
	  public void test5()  throws Throwable  {
	      Rational rational0 = new Rational(31L, 8L); //modified test
	      long long0 = rational0.longValue();
	      assertEquals(3L, long0);
	  }

	  @Test
	  public void test6()  throws Throwable  {
	      Rational rational0 = new Rational(566L, 566L);
	      byte byte0 = rational0.byteValue();
	      assertEquals((byte)1, byte0);
	  }

	  @Test
	  public void test7()  throws Throwable  {
	      Rational rational0 = new Rational((-40L), (-40L));
	      Rational rational1 = rational0.pow(3131);
	      assertEquals(1L, rational1.longValue());
	  }

	  @Test
	  public void test8()  throws Throwable  {
	      Rational rational0 = new Rational(7L, -5L);
	      Rational rational1 = rational0.multiply(2L);
	      assertEquals(-2.8F, rational1.floatValue(), 0.01F);
	      assertEquals(-1, rational0.shortValue());
	  }

	  @Test
	  public void test9()  throws Throwable  {
	      Rational rational0 = new Rational(33L, (-125L));
	      String string0 = rational0.toString();
	      assertEquals("33 / -125", string0);
	  }

	  @Test
	  public void test10()  throws Throwable  { // Modified test
	      Rational rational0 = new Rational(2L, 5L);
	      Rational rational1 = rational0.divide(5L);
	      assertEquals(25L, rational1.denominator);
	      assertEquals(0.4D, rational0.doubleValue(), 0.01D);
	      assertEquals(0.08D, rational1.doubleValue(), 0.001D);
	  }

	  @Test
	  public void test11()  throws Throwable  {
	      Rational rational0 = new Rational(2L, 5L);
	      Rational rational1 = rational0.subtract((-3L));
	      assertEquals(17L, rational1.numerator);
	      assertEquals((3.4F), rational1.floatValue(), 0.01F);
	  }

	  @Test
	  public void test12()  throws Throwable  {
	      Rational rational0 = new Rational((-1L), 135L);
	      double double0 = rational0.doubleValue();
	      assertEquals((-0.007407407407407407), double0, 0.01D);
	  }
	  
	  //ADDED TEST
	  
	  @Test
	  public void test13() throws Throwable{
		  Rational rational0 = new Rational(26L,4L);
		  Rational reducedRational0 = rational0.reduce();
		  
	  }
}
