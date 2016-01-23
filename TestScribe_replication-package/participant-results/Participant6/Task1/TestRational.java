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
	 * OVERVIEW: The test case "test0" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test0() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to -1L,
		// and denominator equal to 245L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-1L), 245L);
		// The next method call the add long integer -142L to rational0
		rational0.add((-142L));
		assertEquals(-0.0040816325, rational0.floatValue(), 0.01F);
	}
	
	/**
	 * OVERVIEW: The test case "test1" covers around 7.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test1() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to
		// -1L, and denominator equal to 232L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-1L), 232L);
		// The test case declares an object of the class "Rational" whose value
		// is equal to the absolute value of "rational0"
		Rational rational1 = rational0.abs();
		// Then, it tests: 
		// 1) whether the double value of "rational1" is equal
		// to 0.00431034482759 with delta equal to 0.01D;
		assertEquals(0.00431034482759, rational1.doubleValue(), 0.01D);
		// 2) whether the numerator of rational1 is equal to 1L;
		assertEquals(1L, rational1.numerator);
		// 3) whether the denominator of rational1 is equal to 1L;
		assertEquals(232L, rational1.denominator);
	}

	/**
	 * OVERVIEW: The test case "test2" covers around 7.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test2() throws Throwable {
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
		// 1) whether the integer value of "rational1" is equal to -1;
		assertEquals(1, rational1.intValue());
		// 2) whether the denominator of rational1 is equal to (-1L);
		assertEquals(1L, rational1.denominator);
	}

	/**
	 * OVERVIEW: The test case "test3" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test3() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 1L,
		// and denominator equal to 3215L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(1L, 3215L);
		// The test case declares an object of the class "Rational" whose value
		// is equal to the absolute value of "rational0"
		Rational rational1 = rational0.abs();
		// Then, it tests:
		// 1) whether the numerator of rational0 is equal to 1L;
		assertEquals(1L, rational0.numerator);
		// 2) whether the denominator of rational0 is equal to 3215L;
		assertEquals(3215L, rational0.denominator);
		// 2) whether the float value of "rational1" is equal to 3.11041E-4F
		// with delta equal to 0.01F;
		assertEquals(3.11041E-4F, rational1.floatValue(), 0.01F);
	}

	/**
	 * OVERVIEW: The test case "test4" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test4() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to -22L,
		// and denominator equal to -22L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-22L), (-22L));
		// The test case declares an object of the class "Rational" whose value
		// is the power of "rational0"
		Rational rational1 = rational0.pow((int) 45);
		// Then, it tests:
		// 1) whether the long value of "rational1" is equal to 1L;
		assertEquals(1L, rational1.longValue());
	}
	
	/**
	 * OVERVIEW: The test case "test5" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test5() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to
		// -22L, and denominator equal to -22L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-22L), (-22L));
		// The test case declares a byte equal to the byte value of "rational0"
		byte byte0 = rational0.byteValue();
		// Then, it tests:
		// 1) whether "byte0" is equal to (byte) 1;
		assertEquals((byte) 1, byte0);
	}

	/**
	 * OVERVIEW: The test case "test6" covers around 5.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test6() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to
		// 1873L, and denominator equal to 3764L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(1873L, 3764L);
		// The test case declares an object of the class "Rational" whose value
		// is obtained by multiplying long scalar to rational0
		Rational rational1 = rational0.multiply(32L);
		// Then, it tests: 
		//1) whether the float value of "rational1" is equal
		// to 0.015409139F with delta equal to 0.01F;
		assertEquals(15.923486F, rational1.floatValue(), 0.01F);
		// 2) whether short value for the object "rational0" is equal to 0;
		// short value for the object "rational0"
		assertEquals(0, rational0.shortValue());
	}

	/**
	 * OVERVIEW: The test case "test7" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test7() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to
		// 2451L, and denominator equal to 2451L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(2451L, 2451L);
		// The test case declares an object of the class "Rational" whose value
		// is the divide of "rational0"
		Rational rational1 = rational0.divide(2451L);
		// Then, it tests:
		// 1) whether the numerator of rational1 is equal to 2451L;
		assertEquals(2451L, rational1.numerator);
		// 2) whether the double value of "rational1" is equal to
		// 4.079967360261118E-4 with delta equal to 0.01D;
		assertEquals(4.079967360261118E-4, rational1.doubleValue(), 0.01D);
	}

	/**
	 * OVERVIEW: The test case "test8" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test8() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 12L,
		// and denominator equal to 12L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(12L, 12L);
		// The test case declares an object of the class "Rational" whose value
		// is obtained by subtracting long integer to rational0
		Rational rational1 = rational0.subtract((-154L));
		// Then, it tests:
		// 1) whether the numerator of rational1 is equal to 1836L;
		assertEquals(1836L, rational1.numerator);
		// 2) whether the float value of "rational1" is equal to (-153.0F) with
		// delta equal to 0.01F;
		assertEquals((-153.0F), rational1.floatValue(), 0.01F);
	}

	/**
	 * OVERVIEW: The test case "test9" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test9() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to -1L,
		// and denominator equal to 140L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-1L), 140L);
		// The test case declares a double whose value is equal to the double
		// value of "rational0"
		double double0 = rational0.doubleValue();
		// Then, it tests:
		// 1) whether "double0" is equal to (-0.007142857142857143) with delta
		// equal to 0.01D;
		assertEquals((-0.007142857142857143), double0, 0.01D);
	}

	/**
	 * OVERVIEW: The test case "test10" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test10() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to -16L,
		// and denominator equal to 23L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-16L), 23L);
		// The test case declares an object of the class "String" the string
		// form of rational
		String string0 = rational0.toString();
		// Then, it tests:
		// 1) whether "string0" is equal to "-16 / 23";
		assertEquals("-16 / 23", string0);
	}
	
}
