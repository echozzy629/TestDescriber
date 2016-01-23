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
		// -62L, and denominator equal to -62L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-62L), (-62L));
		// The test case declares an object of the class "Rational" whose value
		// is equal to the absolute value of "rational0"
		Rational rational1 = rational0.abs();
		// Then, it tests:
		// 1) whether the integer value of "rational1" is equal to -1;
		assertEquals(-1, rational1.intValue());
		// 2) whether the denominator of rational1 is equal to (-62L);
		assertEquals((-62L), rational1.denominator);
	}

	/**
	 * OVERVIEW: The test case "test1" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test1() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to -1L,
		// and denominator equal to 222L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-1L), 222L);
		try {
			// The next method call the add long integer -222L to rational0
			rational0.add((-222L));
			fail("Expecting exception: NumberFormatException");
		} catch (NumberFormatException e) {
	        //
	        // Cannot create a Rational object with zero as the denominator
	        //
		}
	}
	
	/**
	 * OVERVIEW: The test case "test2" covers around 7.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test2() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to
		// -1L, and denominator equal to 222L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-1L), 222L);
		// The test case declares an object of the class "Rational" whose value
		// is equal to the absolute value of "rational0"
		Rational rational1 = rational0.abs();
		// Then, it tests: 
		// 1) whether the double value of "rational1" is equal
		// to 0.0045045045045 with delta equal to 0.01D;
		assertEquals(0.0045045045045, rational1.doubleValue(), 0.01D);
		// 2) whether the numerator of rational1 is equal to 1L;
		assertEquals(1L, rational1.numerator);
	}
	
	@Test
	public void test10() {
		Rational rational1 = new Rational(1, 2);
		Rational newRational = rational1.add(2);
		assertEquals(2.5, newRational.doubleValue(), 0.01D);
	}
	
	@Test
	public void test11() {
		Rational rational1 = new Rational(7, 2);
		Rational newRational = rational1.subtract(2);
		assertEquals(1.5, newRational.doubleValue(), 0.01D);
	}
	
	@Test
	public void test12() {
		Rational rationl1 = new Rational(3, 6);
		Rational newRational = rationl1.reduce();
		assertEquals(1, newRational.numerator);
		assertEquals(2, newRational.denominator);
	}
	
	@Test
	public void test13() {
		Rational rational1 = new Rational(26, 182);
		Rational newRational = rational1.reduce();
		assertEquals(1, newRational.numerator);
		assertEquals(7, newRational.denominator);
	}

	/**
	 * OVERVIEW: The test case "test3" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test3() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to
		// 51L, and denominator equal to 51L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(51L, 51L);
		// The test case declares a byte equal to the byte value of "rational0"
		byte byte0 = rational0.byteValue();
		// Then, it tests:
		// 1) whether "byte0" is equal to (byte) 1;
		assertEquals((byte) 1, byte0);
	}

	/**
	 * OVERVIEW: The test case "test4" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test4() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to -10L,
		// and denominator equal to -10L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-10L), (-10L));
		// The test case declares an object of the class "Rational" whose value
		// is the power of "rational0"
		Rational rational1 = rational0.pow(13);
		// Then, it tests:
		// 1) whether the long value of "rational1" is equal to 1L;
		assertEquals(1L, rational1.longValue());
	}
	
	@Test
	public void test14() {
		Rational rational = new Rational(2L, 3L);
		Rational newRational = rational.pow(3);
		assertEquals(new Rational(8, 27), newRational);
	}

	/**
	 * OVERVIEW: The test case "test5" covers around 5.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test5() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to
		// 2256L, and denominator equal to 144L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(2256L, 144L);
		// The test case declares an object of the class "Rational" whose value
		// is obtained by multiplying long scalar to rational0
		Rational rational1 = rational0.multiply(2256L);
		// Then, it tests: 
		//1) whether the float value of "rational1" is equal
		// to 0.00694444444444F with delta equal to 0.01F;
		assertEquals(0.00694444444444F, rational1.floatValue(), 0.01F);
		// 2) whether short value for the object "rational0" is equal to 15;
		// short value for the object "rational0"
		assertEquals(15, rational0.shortValue());
	}

	/**
	 * OVERVIEW: The test case "test6" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test6() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to -1L,
		// and denominator equal to 222L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational((-1L), 222);
		// The test case declares an object of the class "String" the string
		// form of rational
		String string0 = rational0.toString();
		// Then, it tests:
		// 1) whether "string0" is equal to "-1 / 222";
		assertEquals("-1 / 222", string0);
	}

	/**
	 * OVERVIEW: The test case "test7" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test7() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to
		// 85L, and denominator equal to 85L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(85L, 85L);
		// The test case declares an object of the class "Rational" whose value
		// is the divide of "rational0"
		Rational rational1 = rational0.divide(85L);
		// Then, it tests:
		// 1) whether the numerator of rational1 is equal to 85L;
		assertEquals(85L, rational1.numerator);
		// 2) whether the double value of "rational0" is equal to 1.0 with delta
		// equal to 0.01D;
		assertEquals(1.0, rational0.doubleValue(), 0.01D);
		// 3) whether the double value of "rational1" is equal to
		// 0.011764705882352941 with delta equal to 0.01D;
		assertEquals(0.011764705882352941, rational1.doubleValue(), 0.01D);
	}

	/**
	 * OVERVIEW: The test case "test8" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test8() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 62L,
		// and denominator equal to 62L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(62L, 62L);
		// The test case declares an object of the class "Rational" whose value
		// is obtained by subtracting long integer to rational0
		Rational rational1 = rational0.subtract((-147L));
		// Then, it tests:
		// 1) whether the numerator of rational1 is equal to 9052L;
		assertEquals(9052L, rational1.numerator);
		// 2) whether the denominator of rational1 is equal to -62L;
		assertEquals(-62L, rational1.denominator);
		// 3) whether the float value of "rational1" is equal to (-146.0F) with
		// delta equal to 0.01F;
		assertEquals((-146.0F), rational1.floatValue(), 0.01F);
	}
	
	@Test
	public void test15() {
		Rational rational1 = new Rational(3, 4);
		Rational rational2 = new Rational(5, 8);
		Rational newRational = rational1.add(rational2);
		assertEquals(1.375, newRational.doubleValue(), 0.01D);
	}
	
	@Test
	public void test16() {
		Rational rational1 = new Rational(3, 4);
		Rational rational2 = new Rational(1, 8);
		Rational newRational = rational1.subtract(rational2);
		assertEquals(0.5, newRational.doubleValue(), 0.01D);
	}
	
	@Test
	public void test17() {
		Rational rational1 = new Rational(3, 4);
		Rational rational2 = new Rational(2, 3);
		Rational rational3 = new Rational(1, 6);
		
		Rational newRational = (rational1.add(rational2)).subtract(rational3);
		assertEquals(1.25, newRational.longValue(), 0.01D);
	}
	
	/**
	 * OVERVIEW: The test case "test9" covers around 6.0% (low percentage) of
	 * statements in "Rational"
	 **/
	@Test
	public void test9() throws Throwable {
		// The test case instantiates a "Rational" with numerator equal to 1L,
		// and denominator equal to 28L.
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " denominator equals to 0L" is FALSE;
		Rational rational0 = new Rational(1L, 28L);
		// The test case declares an object of the class "Rational" whose value
		// is equal to the absolute value of "rational0"
		Rational rational1 = rational0.abs();
		// Then, it tests:
		// 1) whether the numerator of rational0 is equal to 1L;
		assertEquals(1L, rational0.numerator);
		// 2) whether the float value of "rational1" is equal to 3.57143E-2F
		// with delta equal to 0.01F;
		assertEquals(3.57143E-2F, rational1.floatValue(), 0.01F);
	}

}
