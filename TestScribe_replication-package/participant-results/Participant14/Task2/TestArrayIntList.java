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
		arrayIntList0.ensureCapacity(2);
		assertEquals(0, arrayIntList0.size());
	}
	
	@Test
	public void test0b() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList(3);
		arrayIntList0.ensureCapacity(2);
		arrayIntList0.add(1,1);
		assertEquals(1, arrayIntList0.size());
	}

	@Test
	public void test1() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		// Undeclared exception!
		try {
			arrayIntList0.removeElementAt((-2978));
			fail("Expecting exception: IndexOutOfBoundsException");

		} catch (IndexOutOfBoundsException e) {
			//
			// Should be at least 0 and less than 0, found -2978
			//
		}
	}

	@Test
	public void test2() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			arrayIntList0.add(1);
			assertEquals(1, arrayIntList0.get(0)); //Can't understand why expect an arithmetic exception...

		} catch (ArithmeticException e) {
			//
			// / by zero
			//
		}
	}

	@Test
	public void test3() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			arrayIntList0.add(0, 110);
			assertEquals(110, arrayIntList0.get(0)); //The check for arithmetic exception should be below
			
		} catch (ArithmeticException e) {
			//
			// / by zero
			//
		}
	}
	
	@Test
	public void test3b() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			arrayIntList0.add(0,0);
			arrayIntList0.add(0,2);
			assertEquals(2, arrayIntList0.size()); //The check for arithmetic exception should be below
			
		} catch (ArithmeticException e) {
			//
			// / by zero
			//
		}
	}

	@Test
	public void test4() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList(8);
		try {
			arrayIntList0.set((-14), (-12));
			fail("Expecting exception: IndexOutOfBoundsException");

		} catch (IndexOutOfBoundsException e) {
			//
			// Should be at least 0 and less than 0, found -14
			//
		}
	}

	@Test
	public void test5() throws Throwable {
		ArrayIntList arrayIntList0 = null;
		try {
			arrayIntList0 = new ArrayIntList((IntCollection) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test
	public void test6() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			arrayIntList0.add((-1), (-1));
			fail("Expecting exception: IndexOutOfBoundsException"); //never executed
		} catch (IndexOutOfBoundsException e) {
			assertNotEquals(null, e); //The check should be here
		}
	}

	@Test
	public void test7() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			arrayIntList0.set(183, 183);
			fail("Expecting exception: IndexOutOfBoundsException");

		} catch (IndexOutOfBoundsException e) {
			//
			// Should be at least 0 and less than 0, found 183
			//
		}
	}
	
	@Test
	public void test7b() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			arrayIntList0.add(1, 1);
			arrayIntList0.set(1, 2);
			assertEquals(2,arrayIntList0.get(1));

		} catch (IndexOutOfBoundsException e) {
			//
			// Should be at least 0 and less than 0, found 1
			//
		}
	}

	@Test
	public void test8() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList(3);
		arrayIntList0.ensureCapacity(2712);
		assertEquals(0, arrayIntList0.size());
	}

	@Test
	public void test9() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		arrayIntList0.trimToSize();
		arrayIntList0.trimToSize();
		assertEquals(0, arrayIntList0.size());
	}

	@Test
	public void test10() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			arrayIntList0.get(29);
			fail("Expecting exception: IndexOutOfBoundsException");

		} catch (IndexOutOfBoundsException e) {
			//
			// Should be at least 0 and less than 0, found 29
			//
		}
	}

	@Test
	public void test11() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		arrayIntList0.ensureCapacity(10);
		assertEquals(0, arrayIntList0.size());
	}

	@Test
	public void test12() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			arrayIntList0.add(631, (-1));
			fail("Expecting exception: IndexOutOfBoundsException"); //never executed
		} catch (IndexOutOfBoundsException e) {
			assertNotEquals(null, e); //The check should be here
		}
	}

	@Test
	public void test13() throws Throwable {
		ArrayUnsignedShortList arrayUnsignedShortList0 = new ArrayUnsignedShortList();
		ArrayIntList arrayIntList0 = null;
		try {
			arrayIntList0 = new ArrayIntList((IntCollection) arrayUnsignedShortList0);
			fail("Expecting exception: IllegalArgumentException");

		} catch (IllegalArgumentException e) {
			//
			// capacity 0
			//
		}
	}
}
