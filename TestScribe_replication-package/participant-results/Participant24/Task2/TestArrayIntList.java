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
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			arrayIntList0.add(65535, 65535);
			fail("Expecting exception: IndexOutOfBoundsException");

		} catch (IndexOutOfBoundsException e) {
			//
			// Should be at least 0 and at most 0, found 65535
			//
		}
	}

	@Test
	public void test1() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			arrayIntList0.add((-3354), (-3354));
			fail("Expecting exception: IndexOutOfBoundsException");

		} catch (IndexOutOfBoundsException e) {
			//
			// Should be at least 0 and at most 0, found -3354
			//
		}
	}

	@Test
	public void test2() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			arrayIntList0.set(570, 570);
			fail("Expecting exception: IndexOutOfBoundsException");

		} catch (IndexOutOfBoundsException e) {
			//
			// Should be at least 0 and less than 0, found 570
			//
		}
	}

	@Test
	public void test3() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		arrayIntList0.trimToSize();
		arrayIntList0.trimToSize();
		assertEquals(8, arrayIntList0.size());
	}

	@Test
	public void test4() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		arrayIntList0.ensureCapacity(801);
		assertEquals(8, arrayIntList0.size());
	}

	@Test
	public void test5() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		arrayIntList0.trimToSize();
		try {
			arrayIntList0.add(1);

		} catch (ArithmeticException e) {
			fail("Expecting exception: ArithmeticException");
			//
			// / by zero
			//
		}
	}

	@Test
	public void test6() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			arrayIntList0.set(0, 0);

		} catch (IndexOutOfBoundsException e) {
			fail("Expecting exception: IndexOutOfBoundsException");
			//
			// Should be at least 0 and less than 0, found 0
			//
		}
	}

	public void test7() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			arrayIntList0.get(0);
			fail("Expecting exception: IndexOutOfBoundsException");

		} catch (IndexOutOfBoundsException e) {
			//
			// Should be at least 0 and less than 0, found 0
			//
		}
	}

	@Test
	public void test8() throws Throwable {
		ArrayUnsignedShortList arrayUnsignedShortList0 = new ArrayUnsignedShortList();
		ArrayIntList arrayIntList0 = null;
		try {
			arrayIntList0 = new ArrayIntList(
					(IntCollection) arrayUnsignedShortList0);
			fail("Expecting exception: IllegalArgumentException");

		} catch (IllegalArgumentException e) {
			//
			// capacity 0
			//
		}
	}

	@Test
	public void test9() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			arrayIntList0.add(1);
			fail("Expecting exception: ArithmeticException");

		} catch (ArithmeticException e) {
			//
			// / by zero
			//
		}
	}
	  
}
