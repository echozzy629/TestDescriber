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
 * 
 */

/**
 * CLASS UNDER TEST: The main class under test is Rational. It describes a
 * single rational and maintains information regarding: - the numerator of the
 * rational; - the denominator of the rational;
 */

public class TestRational {
	
	/**
	 * OVERVIEW: The test case "test0" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test0() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 67L,
		// and denominator equal to 67L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(67L, 67L);
		// The test case declares a double whose value is equal to the double
		// value of "rational0"
		double double0 = rational0.doubleValue();
		// Then, it tests:
		// 1) whether "double0" is equal to 1.0 with delta
		// equal to 0.01D;
		assertEquals(1.0, double0, 0.01D);
	}

	/**
	 * OVERVIEW: The test case "test1" covers around 7.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test1() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to
		// -1L, and denominator equal to -1L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-1L), (-1L));
		// The test case declares an object of the class "Rational" whose value
		// is equal to the absolute value of "rational0"
		Rational rational1 = rational0.abs();
		// Then, it tests:
		// 1) whether the long value of "rational1" is equal to (-1L);
		assertEquals(1L, rational1.longValue());
		// 2) whether the numerator of rational1 is equal to 1L;
		assertEquals(1L, rational1.numerator);
	}

	/**
	 * OVERVIEW: The test case "test2" covers around 7.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test2() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to
		// -18L, and denominator equal to 671L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-18L), 671L);
		// The test case declares an object of the class "Rational" whose value
		// is equal to the absolute value of "rational0"
		Rational rational1 = rational0.abs();
		// Then, it tests: 
		// 1) whether the double value of "rational1" is equal
		// to 0.026825633338301 with delta equal to 0.01D;
		assertEquals(0.026825633338301, rational1.doubleValue(), 0.01D);
		// 2) whether the numerator of rational1 is equal to 18L;
		assertEquals(18L, rational1.numerator);
	}

	/**
	 * OVERVIEW: The test case "test3" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test3() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 1754L,
		// and denominator equal to 1754L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(1754L, 1754L);
		// The test case declares an object of the class "Rational" whose value
		// is equal to the absolute value of "rational0"
		Rational rational1 = rational0.abs();
		// Then, it tests:
		// 1) whether the numerator of rational0 is equal to 1L;
		assertEquals(1754L, rational0.numerator);
		// 2) whether the float value of "rational1" is equal to 4.27716E-4F
		// with delta equal to 0.01F;
		assertEquals(1, rational1.floatValue(), 0.01F);
	}

	/**
	 * OVERVIEW: The test case "test4" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test4() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 0L,
		// and denominator equal to -1L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(0L, (-1L));
		try {
			// The next method call the add long integer 0 to rational0
			rational0.add(0);
		} catch (NumberFormatException e) {
			//
			// Cannot create a Rational object with zero as the denominator
			//
			assertEquals(e, null);
		}
	}

	/**
	 * OVERVIEW: The test case "test5" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test5() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 1754L,
		// and denominator equal to 1754L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(1754L, 1754L);
		// The test case declares a float whose value is equal to the float
		// value of "rational0"
		float float0 = rational0.floatValue();
		// Then, it tests:
		// 1) whether "float0" is equal to 1.0F with delta equal to 0.01F;
		assertEquals(1.0F, float0, 0.01F);
	}

	/**
	 * OVERVIEW: The test case "test6" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test6() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 1387L,
		// and denominator equal to 2232L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(1387L, 2232L);
		// The test case declares a long whose value is equal to the long value
		// of "rational0"
		long long0 = rational0.longValue();
		// Then, it tests:
		// 1) whether "long0" is equal to 0L;
		assertEquals(0L, long0);
		// 2) whether the float value of "rational0" is equal to 0.6214158F with 
		// delta equal to 0.01F;
	    assertEquals(0.6214158F, rational0.floatValue(), 0.01F);
	}

	/**
	 * OVERVIEW: The test case "test7" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test7() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to
		// 281L, and denominator equal to 281L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(281L, 281L);
		// The test case declares a byte equal to the byte value of "rational0"
		byte byte0 = rational0.byteValue();
		// Then, it tests:
		// 1) whether "byte0" is equal to (byte) 1;
		assertEquals((byte) 1, byte0);
	}

	/**
	 * OVERVIEW: The test case "test8" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test8() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 2899L,
		// and denominator equal to 2899L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(2899L, 2899L);
		// The test case declares an object of the class "Rational" whose value
		// is the power of "rational0"
		Rational rational1 = rational0.pow(0);
		// Then, it tests:
		// 1) whether the numerator of rational1 is equal to 1L;
		assertEquals(1L, rational1.numerator);
		// 2) whether the short value of "rational0" is equal to 1;
	    assertEquals(1, rational0.shortValue());
	    // 3) whether the float value of "rational0" is equal to 1.0F;
	    assertEquals(1.0F, rational1.floatValue(), 0.01F);
	}

	/**
	 * OVERVIEW: The test case "test9" covers around 5.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test9() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to
		// 22L, and denominator equal to 143L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(22L, 143L);
		// The test case declares an object of the class "Rational" whose value
		// is obtained by multiplying long scalar to rational0
		Rational rational1 = rational0.multiply(12L);
		// Then, it tests: 
		//1) whether the float value of "rational1" is equal
		// to 0.006993007F with delta equal to 0.01F;
		assertEquals(1.8461539F, rational1.floatValue(), 0.01F);
		// 2) whether short value for the object "rational0" is equal to 0;
		// short value for the object "rational0"
		assertEquals(0, rational0.shortValue());
	}

	/**
	 * OVERVIEW: The test case "test10" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test10() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 3271L,
		// and denominator equal to -1L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(3271L, (-1L));
		// The test case declares an object of the class "String" the string
		// form of rational
		String string0 = rational0.toString();
		// Then, it tests:
		// 1) whether "string0" is equal to "3271 / -1";
		assertEquals("3271 / -1", string0);
	}

	/**
	 * OVERVIEW: The test case "test11" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test11() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to
		// -15L, and denominator equal to -15L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-15L), (-15L));
		// The test case declares an object of the class "Rational" whose value
		// is the divide of "rational0"
		Rational rational1 = rational0.divide((-481L));
		// Then, it tests:
		// 1) whether the float value of rational1 is equal to (-0.002079002F);
		assertEquals((-0.002079002F), rational1.floatValue(), 0.01F);
		// 2)  whether the numerator of rational1 is equal to (-15L);
		assertEquals((-15L), rational1.numerator);
		// 3) whether the numerator of rational0 is equal to (-15L);
		assertEquals((-15L), rational0.numerator);
	}

	/**
	 * OVERVIEW: The test case "test12" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test12() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 3271L,
		// and denominator equal to -1L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(3271L, (-1L));
		// The test case declares an object of the class "Rational" whose value
		// is obtained by subtracting long integer to rational0
		Rational rational1 = rational0.subtract(5089L);
		// Then, it tests:
		// 1) whether the denominator of rational1 is equal to 1L;
		assertEquals((1L), rational1.denominator);
		// 2) whether the byte value of "rational1" is equal to 26;
		assertEquals(26, rational1.byteValue());
	}

	/**
	 * OVERVIEW: The test case "test12" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test13() throws Throwable {
		Rational rational0 = new Rational(1, 7);
		Rational rational1 = new Rational(1, 2);
		Rational rational2 = rational0.add(rational1);
		assertEquals(rational2.numerator, 9);
		assertEquals(rational2.denominator, 14);
	}

	/**
	 * OVERVIEW: The test case "test12" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test14() throws Throwable {
		Rational rational0 = new Rational(1, 7);
		Rational rational1 = new Rational(1, 2);
		Rational rational2 = rational0.subtract(rational1);
		assertEquals(rational2.numerator, -5);
		assertEquals(rational2.denominator, 14);
	}

	/**
	 * OVERVIEW: The test case "test12" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test15() throws Throwable {
		Rational rational0 = new Rational(1, 7);
		Rational rational1 = rational0.subtract(2);
		assertEquals(rational1.numerator, -13);
		assertEquals(rational1.denominator, 7);
	}
	
	/**
	 * OVERVIEW: The test case "test12" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test16() throws Throwable {
		Rational rational0 = new Rational(1, 5);
		Rational rational1 = new Rational(2, 5);
		Rational rational2 = rational0.multiply(rational1);
		assertEquals(rational2.numerator, 2);
		assertEquals(rational2.denominator, 25);
	}
	
	/**
	 * OVERVIEW: The test case "test0" covers around 7.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test17() throws Throwable {
		Rational rational0 = new Rational((-450L), (-300L));
		assertEquals(1, rational0.intValue());
	}

}
