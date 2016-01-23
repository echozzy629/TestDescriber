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
		Rational rational0 = new Rational((122L), (-122L));
		Rational rational1 = rational0.abs();
		assertEquals(1, rational1.intValue());
		assertEquals((122L), rational1.denominator);
	}

	@Test
	public void test1() throws Throwable {
		Rational rational0 = new Rational(1L, 1672L);
		Rational rational1 = rational0.abs();
		assertEquals(1L, rational0.numerator);
		assertEquals(5.98086E-4F, rational1.floatValue(), 0.01F);
	}

	@Test
	public void test2() throws Throwable {
		Rational rational0 = new Rational(17L, (-89L));
		String string0 = rational0.toString();
		assertEquals("17 / -89", string0);
	}

	@Test
	public void test3() throws Throwable {
		Rational rational0 = new Rational((-2L), 8L);
		// Undeclared exception!
		try {
			rational0.add((-151L));
			fail("Expecting exception: NumberFormatException");

		} catch (NumberFormatException e) {
			//
			// Cannot create a Rational object with zero as the denominator
			//
		}
	}

	@Test
	public void test4() throws Throwable {
		Rational rational0 = new Rational(5L, 5L);
		float float0 = rational0.floatValue();
		assertEquals(1.0F, float0, 0.01F);
	}

	@Test
	public void test5() throws Throwable {
		Rational rational0 = new Rational(-372L, -372L);
		byte byte0 = rational0.byteValue();
		assertEquals((byte) 1, byte0);
	}

	@Test
	public void test6() throws Throwable {
		Rational rational0 = new Rational((-14L), (-14L));
		Rational rational1 = rational0.pow(3451);
		assertEquals(1L, rational1.longValue());
		assertNotNull(rational1);
	}

	@Test
	public void test7() throws Throwable {
		Rational rational0 = new Rational(151L, 23L);
		Rational rational1 = rational0.multiply(151L);
		assertEquals(0.04347826086957F, rational1.floatValue(), 0.01F);
		assertEquals(6, rational0.shortValue());
	}

	@Test
	public void test8() throws Throwable {
		Rational rational0 = new Rational(281L, 281L);
		Rational rational1 = rational0.divide(281L);
		assertEquals(78961L, rational1.denominator);
		assertEquals(1L, rational0.doubleValue(), 0.01D);
		assertEquals(3.55871886121E-3, rational1.doubleValue(), 0.01D);
	}

	@Test
	public void test9() throws Throwable {
		Rational rational0 = new Rational(67L, 67L);
		Rational rational1 = rational0.subtract((-154L));
		assertEquals(10251L, rational1.numerator);
		assertEquals((-153.0F), rational1.floatValue(), 0.01F);
	}

	@Test
	public void test10() throws Throwable {
		Rational rational0 = new Rational((-18L), 251L);
		Rational rational1 = rational0.abs();
		assertEquals(0.07171314741036, rational1.doubleValue(), 0.01D);
		assertEquals(18L, rational1.numerator);
	}
}
