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
	// Guys, test names or descriptions should define what is tested!
	// Also, it's nice if one test tests 1 functionality.

	@Test// this test tests abs() (and intValue()) functions.
	public void test0() throws Throwable {
		Rational rational0 = new Rational((-432L), (-432L));
		Rational rational1 = rational0.abs();
		assertEquals(/*-*/1, rational1.intValue());// FAIL
		assertEquals((/*-*/432L), rational1.denominator); // FAIL
	}

	@Test // this test tests abs() (and doubleValue()) functions.
	public void test1() throws Throwable {
		Rational rational0 = new Rational((-523L), 6453L);
		Rational rational1 = rational0.abs();
		// comparing to 0.08...., how do you want me to understand if there's an error in assertion, abs or doubleValue?
		// I would even define all constants at the beginning of the method.
		assertEquals(/*0.08104757477142*/(double)(523L)/6453L, rational1.doubleValue(), 0.01D);
		assertEquals(523L, rational1.numerator);
	}

	@Test// this test tests abs() (and floatValue()) functions.
	public void test2() throws Throwable {
		Rational rational0 = new Rational(15L, 17430L);
		Rational rational1 = rational0.abs();
		assertEquals(15L, rational0.numerator);
		// same as in previous test. I understand it's hard or even impossible to do during automated test generation, 
		// but otherwise it's hard to understand the test.
		assertEquals( (float)(15L)/(17430L)/*8.60585E-4F*/, rational1.floatValue(), 0.01F);
	}

	@Test// this test tests add(long) function
	public void test3() throws Throwable {
		Rational rational0 = new Rational((-1L), 140L);
		// Undeclared exception!
//		try {
			Rational rational1 = rational0.add((-626L));// FAIL
			assertEquals((-1L) + (-626L)*(140L), rational1.numerator);
			assertEquals(140L, rational1.denominator);
//			fail("Expecting exception: NumberFormatException");
//
//		} catch (NumberFormatException e) {
//			//
//			// Cannot create a Rational object with zero as the denominator
//			//
//		}
	}

	@Test// this test tests floatValue() function.
	public void test4() throws Throwable {
		Rational rational0 = new Rational(12L, 12L);
		float float0 = rational0.floatValue();
		assertEquals(1.0F, float0, 0.01F);
	}

	@Test// this test tests longValue() function.
	public void test5() throws Throwable {
		Rational rational0 = new Rational(164L, 164L);
		long long0 = rational0.longValue();
		assertEquals(1L, long0);
	}

	@Test// this test tests byteValue() function.
	public void test6() throws Throwable {
		Rational rational0 = new Rational(21L, 21L);
		byte byte0 = rational0.byteValue();
		assertEquals((byte) 1, byte0);
	}

	@Test// this test tests pow(int) (and longValue()) functions. 
	public void test7() throws Throwable {
	    Rational rational0 = new Rational((-2154L), (-2154L));
	    Rational rational1 = rational0.pow(11);
	    assertEquals(1L, rational1.longValue());
	}

	@Test// this test tests multiply(long) (and floatValue() and shortValue()) functions.
	public void test8() throws Throwable {
		Rational rational0 = new Rational(115L, 23L);
		Rational rational1 = rational0.multiply(115L);
		assertEquals(/*0.04347826086957*/ ((float)((115L)*(115L)))/(23L) , rational1.floatValue(), 0.01F);
		assertEquals((short)((115L)/(23L)), rational0.shortValue());
	}

	@Test// this test tests toString() function.
	public void test9() throws Throwable {
		Rational rational0 = new Rational(348L, (-177L));
		String string0 = rational0.toString();
		assertEquals("348 / -177", string0);
	}

	@Test// this test tests divide(long) (and doubleValue()) function.
	public void test10() throws Throwable {
		Rational rational0 = new Rational(2851L, 2851L);
		Rational rational1 = rational0.divide(1L);
		assertEquals(2851L, rational1.numerator);
		assertEquals(1.0, rational0.doubleValue(), 0.01D);
		assertEquals(/*1L*/ (double)2851L/(2851L*1L), rational1.doubleValue(), 0.01D);
	}

	@Test// this test tests substract(long) (and floatValue())
	public void test11() throws Throwable {
		Rational rational0 = new Rational((-1441L), (-1441L));
	    Rational rational1 = rational0.subtract(1L);
		assertEquals(/*2882L*/-1441L - ((-1441L) * 1L), rational1.numerator);
		assertEquals(/*2.0F*/ (float)(-1441L - ((-1441L) * 1L))/(1441L) , rational1.floatValue(), 0.01F);
	}
	
	@Test
	public void testReduce() throws Throwable {
		long[] nom	  = new long[]{1, 0,  0,100, 44, 31, 45,135, -1, 17, 3};
		long[] den 	  = new long[]{1, 1, 99,  2, 11, 31, 30, 15,-11,-12, 15};
		long[] nomRes = new long[]{1, 0,  0, 50,  4,  1,  3,  9,  1, 17,  1};
		long[] denRes = new long[]{1, 1, 99,  1,  1,  1,  2,  1, 11,-12,  5};
		
		for(int i=0;i<nom.length;++i)
		{
			Rational r = new Rational(nom[i], den[i]);
			
			Rational res = r.reduce();
			
			assertEquals(String.format("Rational(%s, %s).reduce(): Rational.numerator:",
							nom[i], den[i]),
						nomRes[i], res.numerator);
			
			assertEquals(String.format("Rational(%s, %s).reduce(): Rational.denominator",
					nom[i], den[i]),
				denRes[i], res.denominator);
		}
		
		
	}
}
