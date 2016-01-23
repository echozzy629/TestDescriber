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
 * CLASS UNDER TEST:
 * The main class under test is Rational. It describes a single rational and maintains 
 * information regarding: 
 * - the numerator of the rational; 
 * - the denominator of the rational;
 */

public class TestRational {

	/**
	 * OVERVIEW: The test case "test0" covers around 7.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test0() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to
		// -22L, and denominator equal to -22L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-22L), (-22L));
		// The test case declares an object of the class "Rational" whose value
		// is equal to the absolute value of "rational0"
		Rational rational1 = rational0.abs();
		// Then, it tests:
		// 1) whether the integer value of "rational1" is equal to -1;
		assertEquals(-1, rational1.intValue());
		// 2) whether the denominator of rational1 is equal to (-22L);
		assertEquals((-22L), rational1.denominator);
	}

	/**
	 * OVERVIEW: The test case "test1" covers around 7.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test1() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to
		// -1L, and denominator equal to 2L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-1L), 2L);
		// The test case declares an object of the class "Rational" whose value
		// is equal to the absolute value of "rational0"
		Rational rational1 = rational0.abs();
		// Then, it tests: 
		// 1) whether the double value of "rational1" is equal
		// to 0.5 with delta equal to 0.01D;
		assertEquals(0.5, rational1.doubleValue(), 0.01D);
		// 2) whether the numerator of rational1 is equal to 1L;
		assertEquals(1L, rational1.numerator);
	}

	/**
	 * OVERVIEW: The test case "test2" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test2() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 41L,
		// and denominator equal to 41L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(41L, 41L);
		// The test case declares an object of the class "Rational" whose value
		// is equal to the absolute value of "rational0"
		Rational rational1 = rational0.abs();
		// Then, it tests:
		// 1) whether the numerator of rational0 is equal to 41L;
		assertEquals(41L, rational0.numerator);
		// 2) whether the float value of "rational1" is equal to 1.0F
		// with delta equal to 0.01F;
		assertEquals(1.0F, rational1.floatValue(), 0.01F);
	}

	/**
	 * OVERVIEW: The test case "test3" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test3() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to -221L,
		// and denominator equal to -221L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-221L), (-221L));
		try {
			// The next method call the add long integer -221L to rational0
			rational0.add((-221L));
			fail("Expecting exception: NumberFormatException");
		} catch (NumberFormatException e) {
	        //
	        // Cannot create a Rational object with zero as the denominator
	        //
		}
	}

	/**
	 * OVERVIEW: The test case "test4" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test4() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 253L,
		// and denominator equal to 23L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(253L, 23L);
		// The test case declares a float whose value is equal to the float
		// value of "rational0"
		float float0 = rational0.floatValue();
		// Then, it tests:
		// 1) whether "float0" is equal to 11.0F with delta equal to 0.01F;
		assertEquals(11.0F, float0, 0.01F);
	}

	/**
	 * OVERVIEW: The test case "test5" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test5() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 4621L,
		// and denominator equal to 4621L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(4621L, 4621L);
		// The test case declares a double whose value is equal to the long value
		// of "rational0"
		double double0 = rational0.doubleValue();
		// Then, it tests:
		// 1) whether "double0" is equal to 1F with delta equal to 0.01F;
		assertEquals(1F, double0, 0.01F);
		// 2) whether the byte value of "double0" is equal to (byte) 1;
		assertEquals((byte) 1, rational0.byteValue());
	}

	/**
	 * OVERVIEW: The test case "test6" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test6() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to
		// 281L, and denominator equal to 281L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(281L, 281L);
		// The test case declares a short equal to the byte value of "rational0"
		short short0 = rational0.shortValue();
		// Then, it tests:
		// 1) whether "short0" is equal to 1;
		assertEquals(1, short0);
	}

	/**
	 * OVERVIEW: The test case "test7" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test7() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to -21L,
		// and denominator equal to -21L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-21L), (-21L));
		// The test case declares an object of the class "Rational" whose value
		// is the power of "rational0"
		Rational rational1 = rational0.pow(3);
		// Then, it tests:
		// 1) whether the long value of "rational1" is equal to 1L;
		assertEquals(1L, rational1.longValue());
	}

	/**
	 * OVERVIEW: The test case "test8" covers around 5.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test8() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to
		// 142L, and denominator equal to 432L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(142L, 432L);
		// The test case declares an object of the class "Rational" whose value
		// is obtained by multiplying long scalar to rational0
		Rational rational1 = rational0.multiply(63L);
		// Then, it tests: 
		//1) whether the float value of "rational1" is equal
		// to 20.708334F with delta equal to 0.01F;
		assertEquals(973.714285714, rational1.floatValue(), 0.01F);
		// 2) whether short value for the object "rational0" is equal to 0;
		// short value for the object "rational0"
		assertEquals(0, rational0.shortValue());
	}

	/**
	 * OVERVIEW: The test case "test9" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test9() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 1L,
		// and denominator equal to -1L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(1L, (-1L));
		// The test case declares an object of the class "String" the string
		// form of rational
		String string0 = rational0.toString();
		// Then, it tests:
		// 1) whether "string0" is equal to "1 / -1";
		assertEquals("1 / -1", string0);
	}

	/**
	 * OVERVIEW: The test case "test10" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test10() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to
		// 552L, and denominator equal to 552L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(552L, 552L);
		// The test case declares an object of the class "Rational" whose value
		// is the divide of "rational0"
		Rational rational1 = rational0.divide(552L);
		// Then, it tests:
		// 1) whether the numerator of rational1 is equal to 552L;
		assertEquals(552L, rational1.numerator);
		// 2) whether the double value of "rational0" is equal to 1.0 with delta
		// equal to 0.01D;
		assertEquals(1.0, rational0.doubleValue(), 0.01D);
		// 3) whether the double value of "rational1" is equal to
		// 0.0018115942028985507 with delta equal to 0.01D;
		assertEquals(0.0018115942028985507, rational1.doubleValue(), 0.01D);
	}

	/**
	 * OVERVIEW: The test case "test11" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test11() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 2L,
		// and denominator equal to 4L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(2L, 4L);
		// The test case declares an object of the class "Rational" whose value
		// is obtained by subtracting long integer to rational0
		Rational rational1 = rational0.subtract((-512L));
		// Then, it tests:
		// 1) whether the numerator of rational1 is equal to 2046L;
		assertEquals(2046L, rational1.numerator);
		// 2) whether the float value of "rational1" is equal to (-511.5F) with
		// delta equal to 0.01F;
		assertEquals((-511.5F), rational1.floatValue(), 0.01F);
	}

}
