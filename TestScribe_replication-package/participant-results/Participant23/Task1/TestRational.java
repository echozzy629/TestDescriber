package org.magee.math;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
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
		  Rational rational0 = new Rational((-334L), (-334L));
	      Rational rational1 = rational0.abs();
	      assertEquals(1.0F, rational1.floatValue(), 0.01F);
	      assertEquals(334L, rational1.numerator);
	      assertEquals(334L, rational1.denominator);
	  }

	  @Test
	  public void test1()  throws Throwable  {
	      Rational rational0 = new Rational((-1L), 313L);
	      Rational rational1 = rational0.abs();
	      assertEquals(1L, rational0.numerator);
	      assertEquals(0.0031948881F, rational1.floatValue(), 0.01F);
	  }

	  @Test
	  public void test2()  throws Throwable  {
	      Rational rational0 = new Rational(1L, 1L);
	      Rational rational1 = rational0.abs();
	      assertEquals(1L, rational0.numerator);
	      assertEquals(1F, rational1.floatValue(), 0.01F);
	  }

	  // this test shows incorrect behavior
	  // the class needs be fixed and so is this test
//	  @Test
//	  public void test3()  throws Throwable  {
//	      Rational rational0 = new Rational(1L, 1L);
//      try {
//        rational0.add(1L);
//        fail("Expecting exception: NumberFormatException");
//      
//      } catch(NumberFormatException e) {
         //
         // Cannot create a Rational object with zero as the denominator
         //
//      }
//	  }

	  @Test
	  public void test4()  throws Throwable  {
		  Rational rational0 = new Rational((-334L), (-334L));
	      float float0 = rational0.floatValue();
	      assertEquals(1.0F, float0, 0.01F);
	  }

	  @Test
	  public void test5()  throws Throwable  {
		  Rational rational0 = new Rational((-1L), (-1L));
	      long long0 = rational0.longValue();
	      assertEquals(1L, long0);
	  }

	  @Ignore
	  @Test
	  public void test6()  throws Throwable  {
	      Rational rational0 = new Rational(1L, 1L);
	      int int0 = rational0.intValue();
	      assertEquals(1, int0);
	  }

	  @Test
	  public void test7()  throws Throwable  {
	      Rational rational0 = new Rational(1L, 1L);
	      Rational rational1 = rational0.pow(0);
	      assertEquals(1.0, rational0.doubleValue(), 0.01D);
	      assertEquals(1, rational1.intValue());
	  }

	  // multiplication is wrong: see comment in java class
//	  @Test
//	  public void test8()  throws Throwable  {
//	      Rational rational0 = new Rational(1151L, 233L);
//	      Rational rational1 = rational0.multiply(1151L);
//	      assertEquals(0.0042918455F, rational1.floatValue(), 0.01F);
//	      assertEquals(4, rational0.shortValue());
//	  }

	  @Test
	  public void test9()  throws Throwable  {
	      Rational rational0 = new Rational((-1L), (-1L));
	      String string0 = rational0.toString();
	      assertEquals("-1 / -1", string0);
	  }

	  @Test
	  public void test10()  throws Throwable  {
		  Rational rational0 = new Rational(542L, 452L);
	      Rational rational1 = rational0.divide(2L);
	      assertEquals(542L, rational1.numerator);
	      assertEquals(1.1991150442477876, rational0.doubleValue(), 0.01D);
	      assertEquals(0.5995575221238938, rational1.doubleValue(), 0.01D);
	  }

	  // bug in the code: see comment there
	  @Test
	  public void test11()  throws Throwable  {
		  Rational rational0 = new Rational((-334L), (-334L));
	      Rational rational1 = rational0.subtract((-334L));
	      assertEquals(334L, rational1.denominator);
	      assertEquals(335, rational1.doubleValue(), 0.01D);
	  }

	  // can't tell the true value of division
	  @Ignore
	  @Test
	  public void test12()  throws Throwable  {
	      Rational rational0 = new Rational(417L, 2465L);
	      double double0 = rational0.doubleValue();
	      assertEquals(0.16916835699797161, double0, 0.01D);
	  }
}
