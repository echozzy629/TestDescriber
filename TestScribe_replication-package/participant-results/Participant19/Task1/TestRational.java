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
	public void test0() throws Throwable {
		Rational rational0 = new Rational((-302L), (-302L));
		Rational rational1 = rational0.abs();
		assertEquals((-302L), rational1.denominator);
		assertEquals(-1, rational1.shortValue());
	}

	@Test
	public void test1() throws Throwable {
		Rational rational0 = new Rational((-1249L), 1836L);
		Rational rational1 = rational0.abs();
		assertEquals(0.68028325F, rational1.floatValue(), 0.01F);
		assertEquals((-1249L), rational0.numerator);
	}

	@Test
	public void test2() throws Throwable {
		Rational rational0 = new Rational(1866L, 1L);
		Rational rational1 = rational0.abs();
		assertEquals(1866L, rational0.numerator);
		assertEquals(1866, rational1.shortValue());
	}

	@Test
	public void test3() throws Throwable {
		Rational rational0 = new Rational((-1104L), (-1104L));
		try {
			rational0.add((-1104L));
			fail("Expecting exception: NumberFormatException");

		} catch (NumberFormatException e) {
			//
			// Cannot create a Rational object with zero as the denominator
			//
		}
	}

	@Test
	public void test4() throws Throwable {
		Rational rational0 = new Rational(1L, 1L);
		float float0 = rational0.floatValue();
		assertEquals(1.0F, float0, 0.01F);
	}

	@Test
	public void test5() throws Throwable {
		Rational rational0 = new Rational(1199L, 663L);
		long long0 = rational0.longValue();
		assertEquals(1L, long0);
	}

	@Test
	public void test6() throws Throwable {
		Rational rational0 = new Rational((-4L), 1L);
		short short0 = rational0.shortValue();
		assertEquals((short) (-4), short0);
	}

	@Test
	public void test7() throws Throwable {
		Rational rational0 = new Rational(0L, (-1214L));
		Rational rational1 = rational0.pow(1);
		assertEquals((-1214L), rational1.denominator);
		assertEquals((-1214L), rational0.denominator);
		assertEquals(-0.0F, rational1.floatValue(), 0.01F);
	}

	@Test
	public void test8() throws Throwable {
		Rational rational0 = new Rational(1L, 1L);
		Rational rational1 = rational0.multiply((-3468L));
		assertEquals(1L, rational1.denominator);
		assertEquals(1, rational0.intValue());
		assertEquals(0.0F, rational1.floatValue(), 0.01F);
	}

	@Test
	public void test9() throws Throwable {
		Rational rational0 = new Rational((-1058L), (-1058L));
		String string0 = rational0.toString();
		assertEquals("-1058 / -1058", string0);
	}

	@Test
	public void test10() throws Throwable {
		Rational rational0 = new Rational((-1104L), (-1104L));
		Rational rational1 = rational0.divide((-1104L));
		assertEquals((-1104L), rational1.numerator);
		assertEquals(1218816L, rational1.denominator);
		assertEquals((-1104L), rational0.numerator);
	}

	@Test
	public void test11() throws Throwable {
		Rational rational0 = new Rational((-1249L), 1836L);
		Rational rational1 = rational0.subtract(1836L);
		assertEquals(1836L, rational0.denominator);
		assertEquals(1836L, rational1.denominator);
		assertEquals(43, rational1.byteValue());
	}

	@Test
	public void test12() throws Throwable {
		Rational rational0 = new Rational((-1104L), (-1104L));
		double double0 = rational0.doubleValue();
		assertEquals(1.0, double0, 0.01D);
	}

}
