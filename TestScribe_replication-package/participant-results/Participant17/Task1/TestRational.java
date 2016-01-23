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
 */

public class TestRational {

	@Test
	public void testAdd() {
		Rational rational0 = new Rational(1, 4);
		Rational rational1 = new Rational(5, 4);
		assertEquals(rational1.numerator, rational0.add(1L).numerator);
		assertEquals(rational1.denominator, rational0.add(1L).denominator);
	}

	@Test
	public void testMultiply() {
		Rational rational0 = new Rational(1, 4);
		Rational rational1 = new Rational(3, 8);
		assertEquals(3, rational0.multiply(rational1).numerator);
		assertEquals(32, rational0.multiply(rational1).denominator);
	}

	@Test
	public void testAbs() {
		Rational rational0 = new Rational(1, 4);
		Rational rational1 = new Rational(-1, 4);
		assertEquals(1, rational0.abs().numerator);
		assertEquals(4, rational0.abs().denominator);
		assertEquals(1, rational1.abs().numerator);
		assertEquals(4, rational1.abs().denominator);
	}

	@Test
	public void testReduce() {
		Rational rational0 = new Rational(1, 4);
		Rational rational1 = new Rational(-2, 8);
		assertEquals(1, rational0.reduce().numerator);
		assertEquals(4, rational0.reduce().denominator);
		assertEquals(-1, rational1.reduce().numerator);
		assertEquals(4, rational1.reduce().denominator);
	}

	@Test
	public void test0() throws Throwable {
		Rational rational0 = new Rational((-741L), (-741L));
		Rational rational1 = rational0.abs();
		assertEquals((-741L), rational1.denominator);
		assertEquals(-1, rational1.intValue());
	}

	@Test
	public void test1() throws Throwable {
		Rational rational0 = new Rational((-1L), 1729L);
		Rational rational1 = rational0.abs();
		assertEquals((-1L), rational0.numerator);
		assertEquals(5.78368999421631E-4, rational1.doubleValue(), 0.01D);
	}

	@Test
	public void test2() throws Throwable {
		Rational rational0 = new Rational((-1L), (-1L));
		Rational rational1 = rational0.reduce();
		Rational rational2 = rational1.abs();
		assertEquals(1L, rational2.numerator);
		assertEquals(1L, rational1.numerator);
		assertEquals(1, rational1.shortValue());
	}

	@Test
	public void test3() throws Throwable {
		Rational rational0 = new Rational(0L, (-1L));
		try {
			rational0.add(0L);
			fail("Expecting exception: NumberFormatException");

		} catch (NumberFormatException e) {
			//
			// Cannot create a Rational object with zero as the denominator
			//
		}
	}

	@Test
	public void test4() throws Throwable {
		Rational rational0 = new Rational(1L, 2053L);
		float float0 = rational0.floatValue();
		assertEquals(4.8709207E-4F, float0, 0.01F);
	}

	@Test
	public void test5() throws Throwable {
		Rational rational0 = new Rational(1L, (-4269L));
		long long0 = rational0.longValue();
		assertEquals((-2.3424689622862497E-4), rational0.doubleValue(), 0.01D);
		assertEquals(0L, long0);
	}

	@Test
	public void test6() throws Throwable {
		Rational rational0 = new Rational((-1L), (-1L));
		short short0 = rational0.shortValue();
		assertEquals((short) 1, short0);
	}

	@Test
	public void test7() throws Throwable {
		Rational rational0 = new Rational((-1L), (-1L));
		Rational rational1 = rational0.pow(3404);
		assertEquals(1.0, rational1.doubleValue(), 0.01D);
		assertEquals(1, rational0.intValue());
	}

	@Test
	public void test8() throws Throwable {
		Rational rational0 = new Rational((-1394L), (-1394L));
		try {
			rational0.multiply(0L);
			fail("Expecting exception: ArithmeticException");

		} catch (ArithmeticException e) {
			//
			// / by zero
			//
		}
	}

	@Test
	public void test9() throws Throwable {
		Rational rational0 = new Rational(0L, (-1887L));
		String string0 = rational0.toString();
		assertEquals("0 / -1887", string0);
	}

	@Test
	public void test10() throws Throwable {
		Rational rational0 = new Rational((-1L), (-1L));
		Rational rational1 = rational0.divide((-1L));
		assertEquals((-1L), rational1.numerator);
		assertEquals(1L, rational1.denominator);
		assertEquals(1.0F, rational0.floatValue(), 0.01F);
	}

	@Test
	public void test11() throws Throwable {
		Rational rational0 = new Rational((-1394L), (-1394L));
		Rational rational1 = rational0.subtract((-1394L));
		assertEquals((-1941842L), rational1.numerator);
		assertEquals((-1393.0F), rational1.floatValue(), 0.01F);
	}

	@Test
	public void test12() throws Throwable {
		Rational rational0 = new Rational(1L, (-4269L));
		double double0 = rational0.doubleValue();
		assertEquals((-2.3424689622862497E-4), double0, 0.01D);
	}
}
