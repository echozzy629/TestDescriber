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
		// -450L, and denominator equal to -450L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-450L), (-450L));
		// The test case declares an object of the class "Rational" whose value
		// is equal to the absolute value of "rational0"
		
		// ADD
		assertEquals((-450L), rational0.denominator);
		
		// ADD
		assertEquals((-450L), rational0.numerator);
		
		Rational rational1 = rational0.abs();
		// Then, it tests:
		// 1) whether the integer value of "rational1" is equal to -1;
		
		assertEquals(1, rational1.intValue());

		
		//ADD
		assertEquals((1L), rational1.denominator);
		
		//ADD
		assertEquals((1L), rational1.numerator);
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
		assertEquals(0.3645743766122098, rational1.doubleValue(), 0.00000001D);
		// 2) whether the numerator of rational1 is equal to 848L;
		
	}

	/**
	 * OVERVIEW: The test case "test2" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test2() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 1L,
		// and denominator equal to 2338L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(1L, 2338L);
		// The test case declares an object of the class "Rational" whose value
		// is equal to the absolute value of "rational0"
		Rational rational1 = rational0.abs();
		// Then, it tests:
		// 1) whether the numerator of rational0 is equal to 1L;
		assertEquals(1L, rational0.numerator);
		// 2) whether the float value of "rational1" is equal to 4.27716E-4F
		// with delta equal to 0.01F;
		assertEquals(4.27716E-4F, rational1.floatValue(), 0.01F);
	}

	/**
	 * OVERVIEW: The test case "test3" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test3() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to -1L,
		// and denominator equal to 140L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		
		try {
			// ADD
			Rational rational0 = new Rational((-1L), 0L);
			fail("Expecting exception: NumberFormatException");
		} catch (NumberFormatException e) {
	        //
	        // Cannot create a Rational object with zero as the denominator
	        //
		}
		
		// ADD
		Rational rational1 = new Rational((-1L), 140L);
		Rational rational2 = rational1.add(1);
		assertEquals(139L, rational2.numerator);
		assertEquals(140L, rational2.denominator);
		
		
	}

	/**
	 * OVERVIEW: The test case "test4" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test4() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 1L,
		// and denominator equal to 1L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(1L, 1L);
		// The test case declares a float whose value is equal to the float
		// value of "rational0"
		float float0 = rational0.floatValue();
		// Then, it tests:
		// 1) whether "float0" is equal to 1.0F with delta equal to 0.01F;
		assertEquals(1.0F, float0, 0.01F);
	}

	/**
	 * OVERVIEW: The test case "test5" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test5() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 1L,
		// and denominator equal to 1L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(1L, 1L);
		// The test case declares a long whose value is equal to the long value
		// of "rational0"
		long long0 = rational0.longValue();
		// Then, it tests:
		// 1) whether "long0" is equal to 1L;
		assertEquals(1L, long0);
	}

	/**
	 * OVERVIEW: The test case "test6" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test6() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to
		// 2851L, and denominator equal to 2851L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(2851L, 2851L);
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
		// The test case instantiates a "Rational" with numerator equal to -20L,
		// and denominator equal to -20L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-20L), (-20L));
		// The test case declares an object of the class "Rational" whose value
		// is the power of "rational0"
		Rational rational1 = rational0.pow(3131);
		// Then, it tests:
		// 1) whether the long value of "rational1" is equal to 1L;
		assertEquals(1L, rational1.longValue());
		
		// ADD
		Rational rational2 = new Rational((32L), (64L));
		Rational rational3 = rational2.pow(2);
		assertEquals(0.25D, rational3.doubleValue(),0.1D);
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
		assertEquals(5685.8413F, rational1.floatValue(), 0.01F);
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
		// The test case instantiates a "Rational" with numerator equal to 348L,
		// and denominator equal to -177L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(348L, (-177L));
		// The test case declares an object of the class "String" the string
		// form of rational
		String string0 = rational0.toString();
		// Then, it tests:
		// 1) whether "string0" is equal to "348 / -177";
		assertEquals("348 / -177", string0);
	}

	/**
	 * OVERVIEW: The test case "test10" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test10() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to
		// 2851L, and denominator equal to 2851L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(2851L, 2851L);
		// The test case declares an object of the class "Rational" whose value
		// is the divide of "rational0"
		Rational rational1 = rational0.divide(2851L);
		// Then, it tests:
		// 1) whether the numerator of rational1 is equal to 2851L;
		assertEquals(1L, rational1.numerator);
		
		assertEquals(2851L, rational1.denominator);
		// 2) whether the double value of "rational0" is equal to 1.0 with delta
		// equal to 0.01D;
		assertEquals(1.0, rational0.doubleValue(), 0.01D);
		// 3) whether the double value of "rational1" is equal to
		// 3.5075412136092597E-4 with delta equal to 0.01D;
		assertEquals(3.5075412136092597E-4, rational1.doubleValue(), 0.01D);
	}

	/**
	 * OVERVIEW: The test case "test11" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test11() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 67L,
		// and denominator equal to 67L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(67L, 67L);
		// The test case declares an object of the class "Rational" whose value
		// is obtained by subtracting long integer to rational0
		Rational rational1 = rational0.subtract((-154L));
		// Then, it tests:
		// 1) whether the numerator of rational1 is equal to 10251L;
		assertEquals(155L, rational1.numerator);
		assertEquals(1L, rational1.denominator);
		// 2) whether the float value of "rational1" is equal to (-153.0F) with
		// delta equal to 0.01F;
		assertEquals((155.0F), rational1.floatValue(), 0.01F);
	}

	/**
	 * OVERVIEW: The test case "test12" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test12() throws Throwable {
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

}
