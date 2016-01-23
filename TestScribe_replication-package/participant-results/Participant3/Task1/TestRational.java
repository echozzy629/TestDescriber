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
	 * OVERVIEW: The test case "test0" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	@Ignore
	public void test0() throws Exception {
		// The test case instantiates a "Rational" with numerator equal to 636L,
		// and denominator equal to 636L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(636L, 636L);
		// The test case declares an object of the class "Rational" by subtracting
		// 636L to rational0
		Rational rational1 = rational0.subtract(636L);
		// Then, it tests:
		// 1) whether the numerator of "rational1" is equal to 405132L;
		assertEquals(405132L, rational1.numerator);
		// 2) whether "rational1" is not null;
		assertNotNull(rational1);
		// 3) whether the float value of "rational1" is equal to 637.0F with
		// delta equal to 0.01F;
		assertEquals(637.0F, rational1.floatValue(), 0.01F);
	}
	
	/**
	 * OVERVIEW: The test case "test0" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test0Customized() throws Exception {
		Rational rational0 = new Rational(636L, 636L);         // == 1/1
		Rational rational1 = rational0.subtract(636L);         // == -635/1
		assertEquals(-635.0, rational1.doubleValue(), 0.01);
		assertNotNull(rational1);
		assertEquals(-635.0F, rational1.floatValue(), 0.01F);
	}

	/**
	 * OVERVIEW: The test case "test1" covers around 7.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test1() throws Exception {
		// The test case instantiates a "Rational" with numerator equal to
		// -1610L, and denominator equal to -1610L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(-1610L, -1610L); // == 1/1
		// The test case declares an object of the class "Rational" by dividing 
		// -1610L to "rational0"
		Rational rational1 = rational0.divide(-1610L);     // == 1/-1610 == - 1/1610
		// Then, it tests:
		// 1) whether "rational1" is not null;
		assertNotNull(rational1);
		// The test case declares an object of the class "Rational" equals
		// to the absolute value of "rational1"
		Rational rational2 = rational1.abs();
		// 2) whether "rational2" is not null;
		assertNotNull(rational2);
		// 3) whether the float value of "rational0" is equal to 1.0F with delta
		// equal to 0.01F;
		assertEquals(1.0F, rational0.floatValue(), 0.01F);
		// 4) whether the double value of "rational2" is equal to
		// 6.211180124223603E-4 with delta equal to 0.01D; 
		assertEquals(6.211180124223603E-4, rational2.doubleValue(), 0.01D);
		// 5) whether the numerator of rational1 is equal to -1610L;
		assertEquals(-1610L, rational1.numerator);
	}

	/**
	 * OVERVIEW: The test case "test2" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test2() throws Exception {
		// The test case instantiates a "Rational" with numerator equal to
		// -1610L, and denominator equal to -1610L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(-1610L, -1610L);
		// The test case declares an object of the class "String" equals to
		// the string representing the whole "rational0"
		String string0 = rational0.toString();
		// Then, it tests:
		// 1) whether "string0" is not null;
		assertNotNull(string0);
		// 2) whether "string0" is equal to "-1610 / -1610";
		assertEquals("-1610 / -1610", string0);
	}

	/**
	 * OVERVIEW: The test case "test3" covers around 5.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test3() throws Exception {
		// The test case instantiates a "Rational" with numerator equal to
		// -291L, and denominator equal to -291L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(-291L, -291L);
		// The test case declares an object of the class "Rational" by multiplying
		// -291L to rational0
		Rational rational1 = rational0.multiply(-291L);
		// Then, it tests: 
		//1) whether the double value of "rational1" is equal
		// to -0.003436426116838488 with delta equal to 0.01D;
		assertEquals(-291, rational1.doubleValue(), 0.01D);
		// 2) whether "rational1" is not null;
		assertNotNull(rational1);
		// 3) whether the float value of "rational0" is equal to 1.0F with delta
		// equal to 0.01F;
		assertEquals(1.0F, rational0.floatValue(), 0.01F);
	}

	/**
	 * OVERVIEW: The test case "test4" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	@Ignore // This test is no good because .reduce doesn't actually work properly anyway.
	public void test4() throws Exception {
		// The test case instantiates a "Rational" with numerator equal to
		// -695L, and denominator equal to -695L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(-695L, -695L); // == 1/1
		// The test case declares an object of the class "Rational" whose value
		// is the power of "rational0"
		Rational rational1 = rational0.pow(562);
		// Then, it tests: 
		//1) whether the float value of "rational0" is equal
		// to 1.0F with delta equal to 0.01F;
		assertEquals(1.0F, rational0.floatValue(), 0.01F);
		// 2) whether "rational1" is not null;
		assertNotNull(rational1);
		// 3) whether the numerator of rational1 is equal to
		// 9223372036854775807L;
		assertEquals(9223372036854775807L, rational1.numerator);
		// 4) whether the double value of "rational1" is equal to 1.0 with delta
		// equal to 0.01D; double value for the object "rational1"
		assertEquals(1.0, rational1.doubleValue(), 0.01D);
	}
	
	@Test
	public void test4CustomizedForReduce() throws Exception {
		Rational rational0 = new Rational(-695L, -695L); // == 1/1
		Rational rational1 = rational0.pow(562);
		assertEquals(1L, rational1.numerator);  // this would pass with fixed .reduce
		assertEquals(1L, rational1.denominator);
		assertEquals(1.0, rational1.doubleValue(), 0.01D);
	}

	/**
	 * OVERVIEW: The test case "test5" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test5() throws Exception {
		// The test case instantiates a "Rational" with numerator equal to
		// -1610L, and denominator equal to -1610L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(-1610L, -1610L);
		// The test case declares a byte equal to the byte value of "rational0"
		// NOTE: This is not override from Number so I don't know why it works.
		byte byte0 = rational0.byteValue();
		// Then, it tests: 
		//1) whether the float value of "rational0" is equal
		// to 1.0F with delta equal to 0.01F;
		assertEquals(1.0F, rational0.floatValue(), 0.01F);
		// 2) whether "byte0" is equal to (byte) 1;
		assertEquals((byte) 1, byte0);
	}

	/**
	 * OVERVIEW: The test case "test6" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test6() throws Exception {
		// The test case instantiates a "Rational" with numerator equal to
		// -1610L, and denominator equal to -1610L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(-1610L, -1610L);
		// The test case declares a long equal to the long value of
		// "rational0"
		long long0 = rational0.longValue();
		// Then, it tests:
		// 1) whether the long value of "rational0" is equal to 1L;
		assertEquals(1L, rational0.longValue());
		// 2) whether "long0" is equal to 1L;
		assertEquals(1L, long0);
		// 3) whether the denominator of rational0 is equal to -1610L;
		assertEquals(-1610L, rational0.denominator);
	}

	/**
	 * OVERVIEW: The test case "test7" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test7() throws Exception {
		// The test case instantiates a "Rational" with numerator equal to 636L,
		// and denominator equal to 636L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(636L, 636L);
		// The test case declares a float equals to the float value of 
		// "rational0"
		float float0 = rational0.floatValue();
		// Then, it tests:
		// 1) whether "float0" is equal to 1.0F with delta equal to 0.01F;
		assertEquals(1.0F, float0, 0.01F);
		// 2) whether the float value of "rational0" is equal to 1.0F with delta
		// equal to 0.01F;
		assertEquals(1.0F, rational0.floatValue(), 0.01F);
	}

	/**
	 * OVERVIEW: The test case "test8" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	@Ignore // this test is misleading because of a bug in .add
	public void test8() throws Exception {
		// The test case instantiates a "Rational" with numerator equal to -15L,
		// and denominator equal to -15L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(-15L, -15L);
		// Then, it tests: 
		//1) whether the float value of "rational0" is equal
		// to 1.0F with delta equal to 0.01F;
		assertEquals(1.0F, rational0.floatValue(), 0.01F);
		try {
			// It add "rational0.denominator" to "rational0"
			rational0.add(rational0.denominator);
			fail("Expecting exception: NumberFormatException");
		} catch (NumberFormatException e) {
	        //
	        // Cannot create a Rational object with zero as the denominator
	        //
		}
	}
	
	/**
	 * OVERVIEW: The test case "test8" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test8Customized() throws Exception {
		// The test case instantiates a "Rational" with numerator equal to -15L,
		// and denominator equal to -15L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(-15L, -15L).reduce();
		// Then, it tests: 
		//1) whether the float value of "rational0" is equal
		// to 1.0F with delta equal to 0.01F;
		assertEquals(1.0F, rational0.floatValue(), 0.01F);
		assertEquals(1L, rational0.denominator, 1L);
		// this test would pass if reduce and add were working properly
		Rational rational1 = rational0.add(rational0.denominator);
		assertEquals(2.0F, rational1.floatValue(), 0.01F);
	}

	/**
	 * OVERVIEW: The test case "test9" covers around 7.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test9() throws Exception {
		// The test case instantiates a "Rational" with numerator equal to
		// -1610L, and denominator equal to -1610L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(-1610L, -1610L);
		// The test case declares an object of the class "Rational" by
		// negating "rational0"
		Rational rational1 = rational0.negate();
		// The test case declares an object of the class "Rational" equal to 
		// the absolute value of "rational1"
		Rational rational2 = rational1.abs();
		// Then, it tests: 
		//1) whether the float value of "rational2" is equal
		// to -1.0F with delta equal to 0.01F;
		assertEquals(-1.0F, rational2.floatValue(), 0.01F);
		// 2) whether the denominator of rational0 is equal to -1610L;
		assertEquals(-1610L, rational0.denominator);
		// 3) whether the integer value of "rational1" is equal to -1; 
		assertEquals(-1, rational1.intValue());
		// 4) whether "rational2" is not null;
		assertNotNull(rational2);
		// 5) whether the denominator of rational2 is equal to -1610L;
		assertEquals(-1610L, rational2.denominator);
	}

	/**
	 * OVERVIEW: The test case "test10" covers around 7.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test10() throws Exception {
		// The test case instantiates a "Rational" with numerator equal to
		// -291L, and denominator equal to -291L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(-291L, -291L);
		// The test case declares an object of the class "Rational" equal to 
		// the absolute value of "rational0"
		Rational rational1 = rational0.abs();
		// Then, it tests:
		// 1) whether the denominator of rational0 is equal to -291L;
		assertEquals(-291L, rational0.denominator);
		// 2) whether the float value of "rational1" is equal to -1.0F with
		// delta equal to 0.01F;
		assertEquals(-1.0F, rational1.floatValue(), 0.01F);
		// 3) whether "rational1" is not null;
		assertNotNull(rational1);
		// 4) whether the denominator of rational1 is equal to -291L;
		assertEquals(-291L, rational1.denominator);
	}

}
