package org.apache.commons.collections.primitives;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.collections.primitives.ArrayIntList;
import org.apache.commons.collections.primitives.ArrayUnsignedShortList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

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
		// OK
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
		// Then, it retrieves the modification count for the object
		// "arrayIntList0"
		// QUESTION: What is the purpose of this statement?
		arrayIntList0.getModCount();
		// WRONG: Assuming 0-based indices, adding the integer 0 should success
		arrayIntList0.add(0, 0);
		assertEquals(0, arrayIntList0.get(0));
		
//		try {
//			// The next method call add the element 0 to "arrayIntList0" at index 0
//			arrayIntList0.add(0, 0);
//			fail("Expecting exception: ArithmeticException");
//		} catch (ArithmeticException e) {
//			//
//	        // / by zero
//	        //
//		}
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
		// ArrayUnsignedShortList implements IntList which realizes the IntCollection interface
		// Therefore it should be possible to add all elements this way.
		// Misses the add method that is not implemented in the abstract class AbstractIntCollection
		ArrayIntList arrayIntList0 = new ArrayIntList(arrayUnsignedShortList0);
		assertEquals(0, arrayIntList0.size());
		
//		ArrayIntList arrayIntList0 = null;
//		try {
//			//Then, the test case assigns to "arrayIntList0arrayIntList0" an object
//			// obtained by casting "arrayUnsignedShortList0" as a collection of integers
//			arrayIntList0 = new ArrayIntList((IntCollection) arrayUnsignedShortList0);
//			fail("Expecting exception: IllegalArgumentException");
//		} catch (IllegalArgumentException e) {
//	         //
//	         // capacity 0
//	         //
//		}
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
		// OK
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
		// WRONG: The missing add method should (probably) automatically resize the data structure
		// instead of throwing an exception
		arrayIntList0.add(110);
		assertEquals(1, arrayIntList0.size());
		assertEquals(110, arrayIntList0.get(0));
		
//		try {
//			// the method add 110 to the object "arrayIntList0"
//			arrayIntList0.add(110);
//			fail("Expecting exception: ArithmeticException");
//		} catch (ArithmeticException e) {
//	         //
//	         // / by zero
//	         //
//		}
	}

	/**
	 * OVERVIEW: The test case "test5" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test(expected=IndexOutOfBoundsException.class)
	public void test5() throws Throwable {
		// The test case instantiates a "ArrayIntList" with the default
		// configuration (initial capacity is 8)
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " initial capacity less than 1" is FALSE;
		ArrayIntList arrayIntList0 = new ArrayIntList(8);
		// OK, but much more legible this way with JUnit 4 exception expectation style
		arrayIntList0.set((-855), (-1));
		
//		try {
//			// It sets the element -1 at index -855 in arrayIntList0
//			arrayIntList0.set((-855), (-1));
//			fail("Expecting exception: IndexOutOfBoundsException");
//		} catch (IndexOutOfBoundsException e) {
//	         //
//	         // Should be at least 0 and less than 0, found -855
//	         //
//		}
	}

	/**
	 * OVERVIEW: The test case "test6" covers around 0.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	// Not clear what's the purpose of this test. It's unclear whether it is the
	// responsibility of the caller or callee to ensure non-null values.
	@Test
	@Ignore
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
	// Isn't this pretty much the same as test5?
	// This test seems rather an attempt to test the default initial capacity.
	@Test
	@Ignore
	public void test7() throws Throwable {
		// The test case instantiates a "ArrayIntList"  with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			// The next method call add the element to -1921 "arrayIntList0" at 
			// index -1921
			arrayIntList0.add((-1921), (-1921));
			fail("Expecting exception: IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
			//
	        // Should be at least 0 and at most 0, found -1921
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
		arrayIntList0.set(1, 1);
		// WRONG: Because of the initial capacity being 8,
		// it should successfully add and retrieve an element.
		// Allowed indices are [0,7]
		assertEquals(1, arrayIntList0.get(1));
		
//		try {
//			// It sets the element 1 at index 1 in arrayIntList0
//			arrayIntList0.set(1, 1);
//			fail("Expecting exception: IndexOutOfBoundsException");
//		} catch (IndexOutOfBoundsException e) {
//			 //
//	         // Should be at least 0 and less than 0, found 1
//	         //
//		}
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
		// capacity 1789
		// The execution of this method call implicitly covers the following 1
		// conditions:
		// - the condition " min capacity greater than _data.length" is TRUE;
		arrayIntList0.ensureCapacity(1789);
		// Then, it tests:
		// 1) whether the size of "arrayintlist0" is equal to 0;
		// OK
		assertEquals(0, arrayIntList0.size());
		// Additional assertion(s) are required that actually test the underlying capacity in some way.
	}
	
	// TIME LIMIT REACHED HERE

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
			// The next method call removes the element at index -39 of
			// "arrayIntList0"
			arrayIntList0.removeElementAt((-39));
			fail("Expecting exception: IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
	         //
	         // Should be at least 0 and less than 0, found -39
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
			// The next method call add the element 65535 to "arrayIntList0" at 
			// index 65535
			arrayIntList0.add(65535, 65535);
			fail("Expecting exception: IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
	         //
	         // Should be at least 0 and at most 0, found 65535
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
		// the method add the element 677 to the object "arrayUnsignedShortList0"
		arrayUnsignedShortList0.add(677);
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

	/**
	 * OVERVIEW: The test case "test16" covers around 1.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test16() throws Throwable {
		ArrayIntList arrayIntList0 = null;
		try {
			// The test case instantiates a "ArrayIntList" with initial capacity
			// equal to -2033.
			arrayIntList0 = new ArrayIntList((-2033));
			fail("Expecting exception: IllegalArgumentException");
		} catch (IllegalArgumentException e) {
	         //
	         // capacity -2033
	         //
		}
	}

}
