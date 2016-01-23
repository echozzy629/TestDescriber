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
	      Rational rational0 = new Rational((-1943L), (-1943L));
	      Rational rational1 = rational0.abs();
	      assertEquals(1, rational1.intValue()); // M.V: edited
	      assertEquals(1, rational1.denominator); // M.V: edited
	  }

	  @Test
	  public void test1()  throws Throwable  {
	      Rational rational0 = new Rational((-14L), 65L);
	      Rational rational1 = rational0.abs();
	      assertEquals(0.21538461538462, rational1.doubleValue(), 0.01D);
	      assertEquals(14L, rational1.numerator); // M.V: edited
	  }

	  @Test
	  public void test2()  throws Throwable  {
		  Rational rational0 = new Rational(165L, 232L);
	      Rational rational1 = rational0.abs();
	      assertEquals(165L, rational0.numerator);
	      assertEquals(0.71120689655172F, rational1.floatValue(), 0.01F);
	  }

	  /*@Test   MV: edited + e' un operazione chiusa sui razionali: e' sempre possibile
	  public void test3()  throws Throwable  {
	      Rational rational0 = new Rational((-1L), 140L);
	      // Undeclared exception!
	      try {
	        rational0.add((-73L));
	        fail("Expecting exception: NumberFormatException");
	      
	      } catch(NumberFormatException e) {
	         //
	         // Cannot create a Rational object with zero as the denominator
	         //
	      }
	  }*/ 

	  @Test
	  public void test4()  throws Throwable  {
		  Rational rational0 = new Rational((-1889L), 1L);
	      float float0 = rational0.floatValue();
	      assertEquals((-1889.0F), float0, 0.01F);
	  }

	  @Test
	  public void test5()  throws Throwable  {
		  Rational rational0 = new Rational((-944L), 2618L);
	      long long0 = rational0.longValue();
	      assertEquals((-0.3605806F), rational0.floatValue(), 0.01F);
	      assertEquals(0L, long0);
	  }

	  @Test
	  public void test6()  throws Throwable  {
		  Rational rational0 = new Rational((-1943L), (-1943L));
	      int int0 = rational0.intValue();
	      assertEquals(1, int0);
	  }

	  @Test
	  public void test7()  throws Throwable  {
		  Rational rational0 = new Rational(1L, 1794L);
	      Rational rational1 = rational0.pow(32);
	      assertEquals(-1, rational1.byteValue());
	      assertEquals(5.574136E-4F, rational0.floatValue(), 0.01F);
	  }

	  @Test
	  public void test8()  throws Throwable  {
		  Rational rational0 = new Rational((-6118L), (-6118L));
	      Rational rational1 = rational0.multiply((-977L));
	      assertEquals((-9.807126511932004E-4), rational1.doubleValue(), 0.01D);
	  }

	  @Test
	  public void test9()  throws Throwable  {
	      Rational rational0 = new Rational((-2271L), (-2271L));
	      String string0 = rational0.toString();
	      assertEquals("-2271 / -2271", string0);
	  }

	  @Test
	  public void test10()  throws Throwable  {
	      Rational rational0 = new Rational(67L, 67L);
	      Rational rational1 = rational0.subtract((-154L));
	      assertEquals(155L, rational1.numerator);   // M.V: edited
	      assertEquals((155.0F), rational1.floatValue(), 0.01F);   // M.V: edited
	  }
	  
	  @Test
	  public void test11()  throws Throwable  {
	      Rational rational0 = new Rational(2851L, 2851L);
	      Rational rational1 = rational0.divide(2851L);
	      assertEquals(1L, rational1.numerator);       // M.V: edited
	      assertEquals(2851L, rational1.denominator);    // M.V: edited
	      assertEquals(1.0, rational0.doubleValue(), 0.01D);   // M.V: edited
	      assertEquals(1L/2851L, rational1.doubleValue(), 0.01D);    // M.V: edited
	  }

	  @Test
	  public void test12()  throws Throwable  {
	      Rational rational0 = new Rational((-1014L), (-1014L));
	      double double0 = rational0.doubleValue();
	      assertEquals(1.0, double0, 0.01D);
	  }
}
