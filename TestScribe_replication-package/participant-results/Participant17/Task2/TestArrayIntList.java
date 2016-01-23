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

/**
 * CLASS UNDER TEST: 
 * The main class under test is ArrayIntList. It describes a single array integer list 
 * and maintains information regarding: 
 * - the data of the array integer list; 
 * - the size of the array integer list;
 * */

public class TestArrayIntList {
	
	@Test
	public void testAdd() {
		ArrayIntList list = new ArrayIntList();
		list.add(1);
	}
	
	@Test
	public void testCheckRange() {
		ArrayIntList list = new ArrayIntList();
		list.set(0, 1);
	}
	
	@Test
	public void testCheckRangeIncludingEndpoint() {
		ArrayIntList list = new ArrayIntList(1);
		list.add(1, 1);
	}

	/**
	 * OVERVIEW: The test case "test0" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test0() throws Throwable {
		// The test case instantiates an "ArrayIntList" with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		// The next method call ensures the capacity of arrayIntList0 with min 
		// capacity 3
		// The execution of this method call implicitly covers the following 1
		// conditions:
		// - the condition " min capacity greater than _data.length" is FALSE;
		arrayIntList0.ensureCapacity(3);
		// Then, it tests:
		// 1) whether the size of "arrayintlist0" is equal to 0;
		assertEquals(0, arrayIntList0.size());
	}

	/**
	 * OVERVIEW: The test case "test1" covers around 3.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test1() throws Throwable {
		// The test case instantiates an "ArrayIntList" with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			// The next method call add the element 5 to "arrayIntList0" at index 0
			arrayIntList0.add(0, 5);
			fail("Expecting exception: ArithmeticException");
		} catch (ArithmeticException e) {
			//
	        // / by zero
	        //
		}
	}

	/**
	 * OVERVIEW: The test case "test2" covers around 1.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test2() throws Throwable {
		// The test case instantiates an "ArrayUnsignedShortList" with the default
		// configuration (initial capacity is 8)
		ArrayUnsignedShortList arrayUnsignedShortList0 = new ArrayUnsignedShortList();
		ArrayIntList arrayIntList0 = null;
		try {
			//Then, the test case assigns to "arrayIntList0arrayIntList0" an object
			// obtained by casting "arrayUnsignedShortList0" as a collection of integers
			arrayIntList0 = new ArrayIntList((IntCollection) arrayUnsignedShortList0);
			fail("Expecting exception: IllegalArgumentException");
		} catch (IllegalArgumentException e) {
	         //
	         // capacity 0
	         //
		}
	}

	/**
	 * OVERVIEW: The test case "test3" covers around 1.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test3() throws Throwable {
		// The test case instantiates an "ArrayIntList" with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		// The test case declares an integer whose value is equal to the size of
		// "arrayintlist0"
		int int0 = arrayIntList0.size();
		// Then, it tests:
		// 1) whether "int0" is equal to 0;
		assertEquals(0, int0);
	}

	/**
	 * OVERVIEW: The test case "test4" covers around 5.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test4() throws Throwable {
		// The test case instantiates an "ArrayIntList" with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		// The next method call trim to size of "arrayIntList0"
		arrayIntList0.trimToSize();
		try {
			// the method add 651 to the object "arrayIntList0"
			arrayIntList0.add(651);
			fail("Expecting exception: ArithmeticException");
		} catch (ArithmeticException e) {
	         //
	         // / by zero
	         //
		}
	}

	/**
	 * OVERVIEW: The test case "test5" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test5() throws Throwable {
		// The test case instantiates a "ArrayIntList" with initial capacity 
		// equal to 18
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " initial capacity less than 1" is FALSE;
		ArrayIntList arrayIntList0 = new ArrayIntList(18);
		try {
			// It sets the element -11 at index -85 in arrayIntList0
			arrayIntList0.set((-85), (-11));
			fail("Expecting exception: IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
	         //
	         // Should be at least 0 and less than 0, found -85
	         //
		}
	}

	/**
	 * OVERVIEW: The test case "test6" covers around 0.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test6() throws Throwable {
		ArrayIntList arrayIntList0 = null;
		try {
			//Then, the test case assigns to "arrayIntList0arrayIntList0" an object
			// obtained by casting a null as a collection of integers
			arrayIntList0 = new ArrayIntList((IntCollection) null);
			fail("Expecting exception: NullPointerException");
		} catch (NullPointerException e) {
			//
	         // no message in exception (getMessage() returned null)
	         //
		}
	}

	/**
	 * OVERVIEW: The test case "test7" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test7() throws Throwable {
		// The test case instantiates a "ArrayIntList"  with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			// The next method call add the element to -654 "arrayIntList0" at 
			// index -654
			arrayIntList0.add((-654), (-654));
			fail("Expecting exception: IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
			//
	        // Should be at least 0 and at most 0, found -654
	        //
		}
	}

	/**
	 * OVERVIEW: The test case "test8" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test8() throws Throwable {
		// The test case instantiates a "ArrayIntList"  with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			// It sets the element 573 at index 1 in arrayIntList0
			arrayIntList0.set(1, 573);
			fail("Expecting exception: IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
			 //
	         // Should be at least 0 and less than 0, found 1
	         //
		}
	}

	/**
	 * OVERVIEW: The test case "test9" covers around 3.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test9() throws Throwable {
		// The test case instantiates a "ArrayIntList" with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		// The next method call the ensures the capacity of arrayIntList0 with min 
		// capacity 6562
		// The execution of this method call implicitly covers the following 1
		// conditions:
		// - the condition " min capacity greater than _data.length" is TRUE;
		arrayIntList0.ensureCapacity(6562);
		// Then, it tests:
		// 1) whether the size of "arrayintlist0" is equal to 0;
		assertEquals(0, arrayIntList0.size());
	}

	/**
	 * OVERVIEW: The test case "test10" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test10() throws Throwable {
		// The test case instantiates a "ArrayIntList" with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		// The next method call trim to size of "arrayIntList0"
		// The execution of this method call implicitly covers the following 1
		// conditions:
		// - the condition "the size is less than data.length" is TRUE;
		arrayIntList0.trimToSize();
		// The next method call trim to size of "arrayIntList0"
		// The execution of this method call implicitly covers the following 1
		// conditions:
		// - the condition "the size is less than data.length" is TRUE;
		arrayIntList0.trimToSize();
		// Then, it tests:
		// 1) whether the size of "arrayintlist0" is equal to 0;
		assertEquals(0, arrayIntList0.size());
	}

	/**
	 * OVERVIEW: The test case "test11" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test11() throws Throwable {
		// The test case instantiates a "ArrayIntList"  with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			// The next method call removes the element at index -51 of
			// "arrayIntList0"
			arrayIntList0.removeElementAt((-51));
			fail("Expecting exception: IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
	         //
	         // Should be at least 0 and less than 0, found -51
	         //
		}
	}

	/**
	 * OVERVIEW: The test case "test12" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test12() throws Throwable {
		// The test case instantiates a "ArrayIntList"  with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			// It retrieves the element at index 0 of arrayIntList0
			arrayIntList0.get(0);
			fail("Expecting exception: IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
	         //
	         // Should be at least 0 and less than 0, found 0
	         //
		}
	}

	/**
	 * OVERVIEW: The test case "test13" covers around 3.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test13() throws Throwable {
		// The test case instantiates a "ArrayIntList"  with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		// The next method call the ensure capacity in min cap 9 to
		// arrayIntList0
		// The execution of this method call implicitly covers the following 1
		// conditions:
		// - the condition " min capacity greater than _data.length" is TRUE;
		arrayIntList0.ensureCapacity(9);
		// Then, it tests:
		// 1) whether the size of "arrayintlist0" is equal to 0;
		assertEquals(0, arrayIntList0.size());
	}

	/**
	 * OVERVIEW: The test case "test14" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test14() throws Throwable {
		// The test case instantiates a "ArrayIntList" with the default
		// configuration.
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			// The next method call add the element 1651 to "arrayIntList0" at 
			// index 1651
			arrayIntList0.add(1651, 1651);
			fail("Expecting exception: IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
	         //
	         // Should be at least 0 and at most 0, found 1651
	         //
		}
	}

	/**
	 * OVERVIEW: The test case "test15" covers around 3.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test15() throws Throwable {
		// The test case instantiates an "ArrayUnsignedShortList" with the default
		// configuration (initial capacity is 8)
		ArrayUnsignedShortList arrayUnsignedShortList0 = new ArrayUnsignedShortList();
		// the method add the element 823 to the object "arrayUnsignedShortList0"
		arrayUnsignedShortList0.add(823);
		ArrayIntList arrayIntList0 = null;
		try {
			//Then, the test case assigns to "arrayIntList0arrayIntList0" an object
			// obtained by casting "arrayUnsignedShortList0" as a collection of integers
			arrayIntList0 = new ArrayIntList((IntCollection) arrayUnsignedShortList0);
			fail("Expecting exception: ArithmeticException");
		} catch (ArithmeticException e) {
	         //
	         // / by zero
	         //
		}
	}

}
