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
			arrayIntList0.add(2034, (-3842));
			fail("Expecting exception: IndexOutOfBoundsException");

		} catch (IndexOutOfBoundsException e) {
			//
			// Should be at least 0 and at most 0, found 2034
			//
		}
	}

	@Test
	public void test1() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			arrayIntList0.add((-3328), 1);
			fail("Expecting exception: IndexOutOfBoundsException");

		} catch (IndexOutOfBoundsException e) {
			//
			// Should be at least 0 and at most 0, found -3328
			//
		}
	}

	@Test
	public void test2() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		arrayIntList0.trimToSize();
		arrayIntList0.trimToSize();
		// again it is not checked whether the capacity is reduced...
		assertEquals(0, arrayIntList0.size());
	}

	@Test
	public void test3() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		arrayIntList0.ensureCapacity(666);
		
		//again the size property does not change, you have to check whether _data.length has changed, should be larger than before
	    //I don't know whether there is a way to retrieve the actual capacity  
		assertEquals(0, arrayIntList0.size());
	}

	@Test
	public void test4() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		arrayIntList0.trimToSize();
		//try {
		arrayIntList0.add(783);
		assertEquals(783,arrayIntList0.get(0));
		//	fail("Expecting exception: ArithmeticException");

		//} catch (ArithmeticException e) {
			//
			// / by zero
			//
		//}
		// another check is needed for checking if the size has been actually reduced
	    // there should be a method like getCapacity which returns _data.length
	    // then all of those trimToSize, ensureCapacity, and so on methods can be checked for correctness
	}

	@Test
	public void test5() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			arrayIntList0.set((-879), 2246);
			fail("Expecting exception: IndexOutOfBoundsException");

		} catch (IndexOutOfBoundsException e) {
			//
			// Should be at least 0 and less than 0, found -879
			//
		}
	}

	@Test
	public void test6() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			arrayIntList0.get(1314);
			fail("Expecting exception: IndexOutOfBoundsException");

		} catch (IndexOutOfBoundsException e) {
			//
			// Should be at least 0 and less than 0, found 1314
			//
		}
	}

	@Test
	public void test7() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList(833);
		// Undeclared exception!
		//try {
		arrayIntList0.add(833);
		assertEquals(833,arrayIntList0.get(0));
		//	fail("Expecting exception: ArithmeticException");

		//} catch (ArithmeticException e) {
			//
			// / by zero
			//
		//}
	}

	@Test
	public void test8() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
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
	public void test9() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		int int0 = arrayIntList0.size();
		assertEquals(0, int0);
	}
}
