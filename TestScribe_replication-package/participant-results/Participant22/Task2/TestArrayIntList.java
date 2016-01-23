package org.apache.commons.collections.primitives;

import org.junit.Test;

import static org.junit.Assert.*;

import org.apache.commons.collections.primitives.ArrayIntList;
import org.apache.commons.collections.primitives.ArrayUnsignedShortList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/*
 * The following test cases have been automatically generated using EvoSuite. 
 * These unit tests contain assertions that reflect the current behavior of the  
 * class under test (ArrayIntList.java). However, since the class under test is faulty 
 * (i.e., there are bugs), the generated assertions may wrongly reflect the 
 * incorrect behavior. Therefore, the assertions need to be analyzed and fixed. 
 * Feel free to remove assertions or to @Ignore tests you do not understand.
 *
 * Notes on Testing: There are bugs in ArrayIntList.java. A test revealing a bug should 
 * fail. Tests not revealing bugs should pass. To this aim you can add/remove and modify
 * test cases. You may fix obvious bugs, but do not waste time debugging.
 */

public class TestArrayIntList {

	@Test
	public void test0() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList(2000);
		try {
			arrayIntList0.add(2000, 1528);
			fail("Expecting exception: IndexOutOfBoundsException");

		} catch (IndexOutOfBoundsException e) {
			//
			// Should be at least 0 and at most 0, found 2000
			//
		}
	}

	@Test
	public void test1() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			arrayIntList0.add((-721), (-2153));
			fail("Expecting exception: IndexOutOfBoundsException");

		} catch (IndexOutOfBoundsException e) {
			//
			// Should be at least 0 and at most 0, found -721
			//
		}
	}

	@Test
	public void test2() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		arrayIntList0.trimToSize();
		arrayIntList0.trimToSize();
		assertEquals(0, arrayIntList0.size());
	}

	@Test
	public void test3() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList(2);
		arrayIntList0.ensureCapacity(505);
		assertEquals(0, arrayIntList0.size());
	}

	@Test
	public void test4() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		arrayIntList0.trimToSize();
		try {
			arrayIntList0.add(0, 0);
			fail("Expecting exception: ArithmeticException");

		} catch (ArithmeticException e) {
			//
			// / by zero
			//
		}
	}

	@Test
	public void test5() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			arrayIntList0.set(411, 0);
			fail("Expecting exception: IndexOutOfBoundsException");

		} catch (IndexOutOfBoundsException e) {
			//
			// Should be at least 0 and less than 0, found 411
			//
		}
	}

	@Test
	public void test6() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList(31);
		ArrayIntList arrayIntList1 = null;
		try {
			arrayIntList1 = new ArrayIntList((IntCollection) arrayIntList0);
			fail("Expecting exception: IllegalArgumentException");

		} catch (IllegalArgumentException e) {
			//
			// capacity 0
			//
		}
	}

	@Test
	public void test7() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList(2);
		try {
			arrayIntList0.add(2);
			fail("Expecting exception: ArithmeticException");

		} catch (ArithmeticException e) {
			//
			// / by zero
			//
		}
	}

	@Test
	public void test8() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			arrayIntList0.get((-1475));
			fail("Expecting exception: IndexOutOfBoundsException");

		} catch (IndexOutOfBoundsException e) {
			//
			// Should be at least 0 and less than 0, found -1475
			//
		}
	}
	
}
