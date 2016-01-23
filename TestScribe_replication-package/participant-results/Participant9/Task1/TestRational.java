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
	public void test0() throws Throwable {
		Rational rational0 = new Rational((-252L), (-252L));
		Rational rational1 = rational0.abs();
		assertEquals((-252L), rational0.numerator);
		assertEquals(-1, rational1.intValue());
	}

	@Test
	public void test1() throws Throwable {
		Rational rational0 = new Rational((-1L), 1L);
		Rational rational1 = rational0.abs();
		assertEquals(1, rational1.doubleValue(), 0.01D);
		assertEquals(1L, rational1.numerator);
	}

	@Test
	public void test2() throws Throwable {
		Rational rational0 = new Rational(703L, 703L);
		Rational rational1 = rational0.abs();
		assertEquals(703L, rational0.numerator);
		assertEquals(1, rational1.shortValue());
	}

	// FIXME test assertion is wrong due to bug in add()-method
	@Ignore
	@Test
	public void test3() throws Throwable {
		Rational rational0 = new Rational((-705L), (-705L));
		try {
			rational0.add((-705L));
			fail("Expecting exception: NumberFormatException");

		} catch (NumberFormatException e) {
			//
			// Cannot create a Rational object with zero as the denominator
			//
		}
	}

	@Test
	public void testAddRational() {
		Rational r1 = new Rational(2, 7);
		Rational r2 = new Rational(1, 7);
		assertEquals(new Rational(3, 7), r1.add(r2));
	}

	@Test
	public void testAddInteger() {
		Rational r1 = new Rational(2, 7);
		assertEquals(new Rational(17, 7), r1.add(2));
	}

	@Test
	public void test4() throws Throwable {
		Rational rational0 = new Rational(1L, (-2007L));
		float float0 = rational0.floatValue();
		assertEquals((-4.982561E-4F), float0, 0.01F);
	}

	@Test
	public void test5() throws Throwable {
		Rational rational0 = new Rational(1L, (-2007L));
		long long0 = rational0.longValue();
		assertEquals((-4.982561E-4F), rational0.floatValue(), 0.01F);
		assertEquals(0L, long0);
	}

	@Test
	public void test6() throws Throwable {
		Rational rational0 = new Rational(2851L, 2851L);
		byte byte0 = rational0.byteValue();
		assertEquals((byte) 1, byte0);
	}

	@Test
	public void test7() throws Throwable {
		Rational rational0 = new Rational((-5L), (-5L));
		Rational rational1 = rational0.pow(1653);
		assertEquals(1L, rational1.longValue());
	}

	@Test
	public void testPow() {
		checkPow(new Rational(3, 7), 2, new Rational(9, 49));
	}

	@Test
	public void testPowWithPowerOfOne() {
		checkPow(new Rational(3, 7), 0, new Rational(3, 7));
	}

	@Test
	public void testPowWithPowerOfZero() {
		checkPow(new Rational(3, 7), 0, new Rational(1, 1));
	}

	private void checkPow(Rational rational, int power, Rational expectedResult) {
		assertEquals(rational.pow(power), expectedResult);
	}

	@Test
	public void test8() throws Throwable {
		Rational rational0 = new Rational(0L, 1L);
		Rational rational1 = rational0.multiply((-3856L));
		assertEquals(1L, rational1.denominator);
		assertEquals(0.0, rational1.doubleValue(), 0.01D);
		assertEquals(1L, rational0.denominator);
	}

	@Test
	public void testMultiplyRational() {
		Rational r1 = new Rational(4, 7);
		Rational r2 = new Rational(2, 5);
		assertEquals(r1.multiply(r1.multiply(r2)), new Rational(8, 35));
	}

	@Test
	public void testMultiplyInteger() {
		Rational r1 = new Rational(4, 7);
		assertEquals(r1.multiply(r1.multiply(2)), new Rational(8, 7));
	}

	@Test
	public void test9() throws Throwable {
		Rational rational0 = new Rational(4727L, 4727L);
		String string0 = rational0.toString();
		assertEquals("4727 / 4727", string0);
	}

	@Test
	public void test10() throws Throwable {
		Rational rational0 = new Rational((-1L), (-1L));
		Rational rational1 = rational0.divide((-1L));
		assertEquals((-1L), rational1.numerator);
		assertEquals(1L, rational1.denominator);
		assertEquals(1, rational0.shortValue());
	}

	@Test
	public void testDivideByInteger() {
		Rational r1 = new Rational(4, 7);
		assertEquals(new Rational(2, 7), r1.divide(2));
	}

	@Test
	public void test11() throws Throwable {
		Rational rational0 = new Rational(703L, 703L);
		Rational rational1 = rational0.subtract(1L);
		assertEquals(2.0F, rational1.floatValue(), 0.01F);
		assertEquals(703L, rational1.denominator);
		assertEquals(1.0, rational0.doubleValue(), 0.01D);
	}

	@Test
	public void testSubtractRational() {
		Rational r1 = new Rational(4, 7);
		Rational r2 = new Rational(1, 7);
		assertEquals(new Rational(3, 7), r1.subtract(r2));
	}

	@Test
	public void testSubtractInteger() {
		Rational r1 = new Rational(20, 7);
		assertEquals(new Rational(6, 7), r1.subtract(2));
	}

	@Test
	public void test12() throws Throwable {
		Rational rational0 = new Rational(1L, 1L);
		double double0 = rational0.doubleValue();
		assertEquals(1.0, double0, 0.01D);
	}

	@Test
	public void testEqualsWithEqualRationals() {
		checkEquals(new Rational(4, 5), new Rational(4, 5), true);
	}

	@Test
	public void testEqualsWithDifferentRationals() {
		checkEquals(new Rational(4, 5), new Rational(8, 10), false);
		checkEquals(new Rational(1, 3), new Rational(1, 4), false);
		checkEquals(new Rational(7, 2), new Rational(4, 2), false);
	}

	private void checkEquals(Rational r1, Rational r2, boolean expectedResult) {
		assertEquals(r1.equals(r2), expectedResult);
	}

	@Test
	public void testHashCodeWithEqualRationals() {
		Rational r1 = new Rational(4, 5);
		Rational r2 = new Rational(4, 5);
		assertEquals(r1.hashCode(), r2.hashCode());
	}

	@Test
	public void testReduceOnReducableRational() {
		Rational originalRational = new Rational(2, 6);
		Rational reducedRational = originalRational.reduce();
		assertEquals(new Rational(1, 3), reducedRational);
	}

	@Test
	public void testReduceOnAlreadyReducedRational() {
		Rational originalRational = new Rational(1, 3);
		Rational reducedRational = originalRational.reduce();
		assertEquals(originalRational, reducedRational);
	}

	@Test
	public void testReduceOnNegativeValues() {
		Rational originalRational = new Rational(-1, -3);
		Rational reducedRational = originalRational.reduce();
		assertEquals(new Rational(1, 3), reducedRational);
	}

	@Test
	public void testInverse() {
		Rational r1 = new Rational(4, 7);
		assertEquals(new Rational(7, 4), r1.inverse());
	}

	@Test
	public void testNegate() {
		Rational r1 = new Rational(4, 7);
		assertEquals(new Rational(-4, 7), r1.negate());
	}

}
