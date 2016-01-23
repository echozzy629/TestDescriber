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
		// -82L, and denominator equal to -82L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-82L), (-82L));
		// The test case declares an object of the class "Rational" whose value
		// is equal to the absolute value of "rational0"
		Rational rational1 = rational0.abs();
		// Then, it tests:
		// 1) whether the integer value of "rational1" is equal to -1;
		
		// FIXME: This assertion should test if the absolute value is equal to 1 
		//        and not -1, because an absolute value is always positive
		// assertEquals(-1, rational1.intValue());
		assertEquals(1, rational1.intValue());
		
		
		
		// 2) whether the denominator of rational1 is equal to (-82L);
		// FIXME: This assertion should test if the absolute value of
		//        the denominator is 82L and not -82L 
		assertEquals((82L), rational1.denominator);
	}

	/**
	 * OVERVIEW: The test case "test1" covers around 7.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test1() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to
		// -85L, and denominator equal to 232L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-85L), 232L);
		// The test case declares an object of the class "Rational" whose value
		// is equal to the absolute value of "rational0"
		Rational rational1 = rational0.abs();
		// Then, it tests: 
		// 1) whether the double value of "rational1" is equal
		// to 0.36637931034483 with delta equal to 0.01D;
		assertEquals(0.36637931034483, rational1.doubleValue(), 0.01D);
		// 2) whether the numerator of rational1 is equal to 85L;
		assertEquals(85L, rational1.numerator);
		// 3) whether the denominator of rational1 is equal to 85L;
		assertEquals(232L, rational1.denominator);
	}

	/**
	 * OVERVIEW: The test case "test2" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test2() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 35L,
		// and denominator equal to 342L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(35L, 342L);
		// The test case declares an object of the class "Rational" whose value
		// is equal to the absolute value of "rational0"
		Rational rational1 = rational0.abs();
		// Then, it tests:
		// 1) whether the numerator of rational0 is equal to 35L;
		assertEquals(35L, rational0.numerator);
		// 1) whether the denominator of rational0 is equal to 342L;
		assertEquals(342L, rational0.denominator);
		// 2) whether the float value of "rational1" is equal to 0.10233918128655
		// with delta equal to 0.01F;
		assertEquals(0.10233918128655, rational1.floatValue(), 0.01F);
	}

	/**
	 * OVERVIEW: The test case "test3" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test3() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to -6L,
		// and denominator equal to 231L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-6L), 231L);
		try {
			// The next method call the add long integer -66L to rational0
			
			// FIXME: rational0 value was not updated 
			rational0 = rational0.add((-66L));
			// FIXME: this test says that we cannot add any number to a Rationale
			// fail("Expecting exception: NumberFormatException");
			
			assertEquals(-66.02597402597402, rational0.doubleValue(), 0.01D);
		
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
		// The test case instantiates a "Rational" with numerator equal to 1L,
		// and denominator equal to 2053L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(1L, 2053L);
		// The test case declares a float whose value is equal to the float
		// value of "rational0"
		float float0 = rational0.floatValue();
		// Then, it tests:
		// 1) whether "float0" is equal to 1.0F with delta equal to 4.8709207E-4F;
		assertEquals(4.8709207E-4F, float0, 0.01F);
	}

	/**
	 * OVERVIEW: The test case "test5" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test5() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 1L,
		// and denominator equal to -4269L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(1L, (-4269L));
		// The test case declares a long whose value is equal to the long value
		// of "rational0"
		long long0 = rational0.longValue();
		// Then, it tests:
		// 1) whether the double value of "rational0" is equal to (-2.3424689622862497E-4)
		// with delta equal to 0.01D;
		assertEquals((-2.3424689622862497E-4), rational0.doubleValue(), 0.01D);
		// 2) whether "long0" is equal to 0L;
		assertEquals(0L, long0);
	}

	/**
	 * OVERVIEW: The test case "test6" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test6() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to
		// 85L, and denominator equal to 85L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(85L, 85L);
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
		// The test case instantiates a "Rational" with numerator equal to -1L,
		// and denominator equal to -1L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-1L), (-1L));
		// The test case declares an object of the class "Rational" whose value
		// is the power of "rational0"
		Rational rational1 = rational0.pow(3404);
		// Then, it tests:
		// 1) whether the integer value of "rational1" is equal to 1;
		assertEquals(1, rational1.intValue());
		// 2) whether the short value of "rational1" is equal to 1;
		assertEquals(1, rational1.shortValue());
	}

	/**
	 * OVERVIEW: The test case "test8" covers around 5.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test8() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to
		// -1394L, and denominator equal to -1394L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-1394L),(-1394L));
		// The test case declares an object of the class "Rational" whose value
		// is obtained by multiplying long scalar to rational0
		Rational rational1 = rational0.multiply(2L);
		// Then, it tests: 
		//1) whether the float value of "rational1" is equal
		// to 0.0042918455F with delta equal to 0.01F;
		
		assertEquals(2.0F, rational1.floatValue(), 0.01F);
		// 2) whether short value for the object "rational0" is equal to 1;
		// short value for the object "rational0"
		assertEquals(1, rational0.shortValue());
	}

	/**
	 * OVERVIEW: The test case "test9" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test9() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 0L,
		// and denominator equal to -1887LL.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
	    Rational rational0 = new Rational(0L, (-1887L));
		// The test case declares an object of the class "String" the string
		// form of rational
		String string0 = rational0.toString();
		// Then, it tests:
		// 1) whether "string0" is equal to "0 / -1887";
		assertEquals("0 / -1887", string0);
	}

	/**
	 * OVERVIEW: The test case "test10" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test10() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to
		// -1L, and denominator equal to -1L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-1L), (-1L));
		// The test case declares an object of the class "Rational" whose value
		// is the divide of "rational0"
		Rational rational1 = rational0.divide((-1L));
		// Then, it tests:
		// 1) whether the numerator of rational1 is equal to (-1L);
		assertEquals((-1L), rational1.numerator);
		// 2) whether the denominator of rational1 is equal to 1L;
		assertEquals(1L, rational1.denominator);
		// 3) whether the float value of "rational0" is equal to 1.0F with delta
		// equal to 0.01D;
		assertEquals(1.0F, rational0.floatValue(), 0.01F);
	}

	/**
	 * OVERVIEW: The test case "test11" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test11() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 15L,
		// and denominator equal to 15L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(15L, 15L);
		// The test case declares an object of the class "Rational" whose value
		// is obtained by subtracting long integer to rational0
		Rational rational1 = rational0.subtract((-14L));
		// Then, it tests:
		// 1) whether the numerator of rational1 is equal to 10251L;
		// FIXME: the numerator in this case should be negative and not positive
		assertEquals(195L, rational1.numerator);
		// 2) whether the float value of "rational1" is equal to (-13.0F) with
		// delta equal to 0.01F;
		assertEquals((-13.0F), rational1.floatValue(), 0.01F);
	}

	/**
	 * OVERVIEW: The test case "test12" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test12() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 1L,
		// and denominator equal to -4269L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
	    Rational rational0 = new Rational(1L, (-4269L));
		// The test case declares a double whose value is equal to the double
		// value of "rational0"
		double double0 = rational0.doubleValue();
		// Then, it tests:
		// 1) whether "double0" is equal to (-2.3424689622862497E-4) with delta
		// equal to 0.01D;
		assertEquals((-2.3424689622862497E-4), double0, 0.01D);
	}
	

}
