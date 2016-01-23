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
		// -518L, and denominator equal to -518L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-518L), (-518L));
		// The test case declares an object of the class "Rational" whose value
		// is equal to the absolute value of "rational0"
		Rational rational1 = rational0.abs();
		// Then, it tests:
		// 1) whether the double value of "rational1" is equal to -1;
		assertEquals((-1.0), rational1.doubleValue(), 0.01D);
		// 2) whether the numerator of rational1 is equal to 518L;
		assertEquals(518L, rational1.numerator);
	}

	/**
	 * OVERVIEW: The test case "test1" covers around 7.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test1() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to
		// -848L, and denominator equal to 2326L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-848L), 2326L);
		// The test case declares an object of the class "Rational" whose value
		// is equal to the absolute value of "rational0"
		Rational rational1 = rational0.abs();
		// Then, it tests: 
		// 1) whether the double value of "rational1" is equal
		// to 0.3645743766122098 with delta equal to 0.01D;
		assertEquals(0.3645743766122098, rational1.doubleValue(), 0.01D);
		// 2) whether the numerator of rational1 is equal to 848L;
		assertEquals(848L, rational1.numerator);
	}

	/**
	 * OVERVIEW: The test case "test2" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test2() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 0L,
		// and denominator equal to 314L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(0L, 314L);
		// The test case declares an object of the class "Rational" whose value
		// is equal to the absolute value of "rational0"
		Rational rational1 = rational0.abs();
		// Then, it tests:
		// 1) whether the denominator of rational1 is equal to 314L;
	    assertEquals(314L, rational1.denominator);
		// 2) whether the float value of "rational0" is equal to 0.0F
		// with delta equal to 0.01F;
		assertEquals(0.0F, rational0.floatValue(), 0.01F);
		// 2) whether the float value of "rational1" is equal to 0.0F
		// with delta equal to 0.01F;
	    assertEquals(0.0F, rational1.floatValue(), 0.01F);
	}

	/**
	 * OVERVIEW: The test case "test3" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test3() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to -1267L,
		// and denominator equal to -1267L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-1267L), (-1267L));
		try {
			// The next method call the add long integer -626L to rational0
			rational0.add((-1267L));
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
		// The test case instantiates a "Rational" with numerator equal to 1927L,
		// and denominator equal to -611L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(1927L, (-611L));
		// The test case declares a float whose value is equal to the float
		// value of "rational0"
		float float0 = rational0.floatValue();
		// Then, it tests:
		// 1) whether "float0" is equal to -3.1538463F with delta equal to 0.01F;
		assertEquals((-3.1538463F), float0, 0.01F);
	}

	/**
	 * OVERVIEW: The test case "test5" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test5() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to -1L,
		// and denominator equal to 1L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-1L), 1L);
		// The test case declares a long whose value is equal to the long value
		// of "rational0"
		long long0 = rational0.longValue();
		// Then, it tests:
		// 1) whether "long0" is equal to -1L;
		assertEquals((-1L), long0);
	}

	/**
	 * OVERVIEW: The test case "test6" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test6() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to
		// 1L, and denominator equal to 1L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(1L, 1L);
		// The test case declares a byte equal to the byte value of "rational0"
		byte byte0 = rational0.byteValue();
		// Then, it tests:
		// 1) whether "byte0" is equal to (byte) 1;
		assertEquals((byte) 1, byte0);
	}

	/**
	 * OVERVIEW: The test case "test7" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test7() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 1L,
		// and denominator equal to 1L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(1L, 1L);
		// The test case declares an object of the class "Rational" whose value
		// is the power of "rational0"
		Rational rational1 = rational0.pow((int) (byte)1);
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
		// 1151L, and denominator equal to 233L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(1151L, 233L);
		// The test case declares an object of the class "Rational" whose value
		// is obtained by multiplying long scalar to rational0
		Rational rational1 = rational0.multiply(1151L);
		// Then, it tests: 
		//1) whether the float value of "rational1" is equal
		// to 0.0042918455F with delta equal to 0.01F;
		assertEquals(0.0042918455F, rational1.floatValue(), 0.01F);
		// 2) whether short value for the object "rational0" is equal to 4;
		// short value for the object "rational0"
		assertEquals(4, rational0.shortValue());
	}

	/**
	 * OVERVIEW: The test case "test9" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test9() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 1L,
		// and denominator equal to 1L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(1L, 1L);
		// The test case declares an object of the class "String" the string
		// form of rational
		String string0 = rational0.toString();
		// Then, it tests:
		// 1) whether "string0" is equal to "1 / 1";
		assertEquals("1 / 1", string0);
	}

	/**
	 * OVERVIEW: The test case "test10" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test10() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to
		// 1L, and denominator equal to 1L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(1L, 1L);
		// The test case declares an object of the class "Rational" whose value
		// is the divide of "rational0"
		Rational rational1 = rational0.divide(-1L);
		// Then, it tests:
		// 1) whether the numerator of rational1 is equal to 1L;
		assertEquals(1L, rational1.numerator);
		// 2) whether the integer value of "rational1" is equal to -1 with delta
		// equal to 0.01D;
		assertEquals(-1, rational1.intValue());
		// 3) whether the double value of "rational0" is equal to
		// 1.0 with delta equal to 0.01D;
		assertEquals(1.0, rational0.doubleValue(), 0.01D);
	}

	/**
	 * OVERVIEW: The test case "test11" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test11() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 0L,
		// and denominator equal to 314L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(0L, 314L);
		// The test case declares an object of the class "Rational" whose value
		// is obtained by subtracting long integer to rational0
		Rational rational1 = rational0.subtract(0L);
		// Then, it tests:
		// 1) whether the denominator of rational1 is equal to -314L;
		assertEquals((-314L), rational1.denominator);
		// 2) whether the float value of "rational1" is equal to -0.0 with
		// delta equal to 0.01F;
		assertEquals(-0.0, rational1.doubleValue(), 0.01D);
	}

	/**
	 * OVERVIEW: The test case "test12" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test12() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 2700L,
		// and denominator equal to 321L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(2700L, 321L);
		// The test case declares a double whose value is equal to the double
		// value of "rational0"
		double double0 = rational0.doubleValue();
		// Then, it tests:
		// 1) whether "double0" is equal to 8.411214953271028 with delta
		// equal to 0.01D;
		assertEquals(8.411214953271028, double0, 0.01D);
	}
	
	// TODO: test for overflow
	// TODO: test for divide by 0
	// TODO: test instantiation with integers, and whether the check for 0L still holds then.
	
	@Test
	public void testDouble() throws Throwable {
		Rational r = new Rational(10L, 3L);
		Double d = r.doubleValue();
		Double a = 10.0;
		Double b = 3.0;
		Double expected = a/b;
		
		System.out.println(d);
		assertEquals(expected, d);
	}
	
	@Test
	public void testFloat() throws Throwable {
		Rational r = new Rational(10L, 3L);
		Float d = r.floatValue();
		Float a = 10.0f;
		Float b = 3.0f;
		Float expected = a/b;
		assertEquals(expected, d);
	}
	
	@Test
	public void instantiateTest() throws Throwable{
		// should fail if correctly implemented.
		new Rational(1, 0);
	}

}
