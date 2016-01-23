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
		// capacity 5
		// The execution of this method call implicitly covers the following 1
		// conditions:
		// - the condition " min capacity greater than _data.length" is FALSE;
		arrayIntList0.ensureCapacity(5);
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
		// Then, it retrieves the modification count for the object
		// "arrayIntList0"
		int modCount = arrayIntList0.getModCount();
		assertEquals(0,modCount); // ADDED
		//try {
			// The next method call add the element 7 to "arrayIntList0" at index 0
			arrayIntList0.add(0, 7);
			//fail("Expecting exception: ArithmeticException");
		//} catch (ArithmeticException e) {
			//
	        // / by zero
	        //
		//}
	}

	/**
	 * OVERVIEW: The test case "test2" covers around 5.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test2() throws Throwable {
		// The test case instantiates an "ArrayIntList" with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		// The next method call trim to size of "arrayIntList0"
		arrayIntList0.trimToSize(); //OK
		int newSize = arrayIntList0.size();
		assertEquals(0 , newSize);
		arrayIntList0.add(65);
		assertEquals(1 , arrayIntList0.size());
	}

	/**
	 * OVERVIEW: The test case "test3" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test3() throws Throwable {
		// The test case instantiates a "ArrayIntList" with the default
		// configuration (initial capacity is 8)
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " initial capacity less than 1" is FALSE;
		ArrayIntList arrayIntList0 = new ArrayIntList(8);
		try {
			// It sets the element 10 at index -855 in arrayIntList0
			arrayIntList0.set((-855), 10);
			fail("Expecting exception: IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
	         //
	         // Should be at least 0 and less than 0, found -855
	         //
		}
	}
	
	@Test
	public void testAdd() throws Throwable {
		// The test case instantiates a "ArrayIntList" with the default
		// configuration (initial capacity is 8)
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " initial capacity less than 1" is FALSE;
		ArrayIntList arrayIntList0 = new ArrayIntList(8);
		arrayIntList0.add(1);
		arrayIntList0.add(2);
		arrayIntList0.add(3);
		assertEquals(3,arrayIntList0.size());
		arrayIntList0.set(2, (-1));
	}

	/**
	 * OVERVIEW: The test case "test4" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test4() throws Throwable {
		// The test case instantiates a "ArrayIntList"  with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			// It sets the element 11 at index 4 in arrayIntList0
			arrayIntList0.set(4, 11);
			fail("Expecting exception: IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
			 //
	         // Should be at least 0 and less than 0, found 4
	         //
		}
	}

	/**
	 * OVERVIEW: The test case "test5" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test5() throws Throwable {
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
	 * OVERVIEW: The test case "test6" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test6() throws Throwable {
		// The test case instantiates a "ArrayIntList"  with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			// The next method call removes the element at index 39 of
			// "arrayIntList0"
			arrayIntList0.removeElementAt(39);
			fail("Expecting exception: IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
	         //
	         // Should be at least 0 and less than 0, found 39
	         //
		}
	}

	/**
	 * OVERVIEW: The test case "test7" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test7() throws Throwable {
		// The test case instantiates a "ArrayIntList" with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			// It retrieves the element at index 10 of arrayIntList0
			arrayIntList0.get(10);
			fail("Expecting exception: IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
	         //
	         // Should be at least 0 and less than 0, found 10
	         //
		}
	}

	/**
	 * OVERVIEW: The test case "test8" covers around 3.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test8() throws Throwable {
		// The test case instantiates a "ArrayIntList" with the default
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
	 * OVERVIEW: The test case "test9" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test9() throws Throwable {
		// The test case instantiates a "ArrayIntList" with the default
		// configuration.
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			// The next method call add the element 635 to "arrayIntList0" at
			// index 635
			arrayIntList0.add(635, 635);
			fail("Expecting exception: IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
	         //
	         // Should be at least 0 and at most 0, found 635
	         //
		}
	}

	/**
	 * OVERVIEW: The test case "test10" covers around 3.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test10() throws Throwable {
		// The test case instantiates an "ArrayUnsignedShortList" with the default
		// configuration (initial capacity is 8)
		ArrayUnsignedShortList arrayUnsignedShortList0 = new ArrayUnsignedShortList();
		// the method add the element 677 to the object "arrayUnsignedShortList0"
		arrayUnsignedShortList0.add(677);
		ArrayIntList arrayIntList0 = null;
		//try {
			//Then, the test case assigns to "arrayIntList0arrayIntList0" an object
			// obtained by casting "arrayUnsignedShortList0" as a collection of integers
			arrayIntList0 = new ArrayIntList((IntCollection) arrayUnsignedShortList0);
			//fail("Expecting exception: ArithmeticException");
		//} catch (ArithmeticException e) {
	         //
	         // / by zero
	         //
		//}
	}

	/**
	 * OVERVIEW: The test case "test11" covers around 1.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test11() throws Throwable {
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
	
	/**
	 * OVERVIEW: The test case "test12" covers around 1.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test12() throws Throwable {
		// The test case instantiates an "ArrayUnsignedShortList" with the default
		// configuration (initial capacity is 8)
		ArrayUnsignedShortList arrayUnsignedShortList0 = new ArrayUnsignedShortList();
		ArrayIntList arrayIntList0 = null;
		arrayIntList0 = new ArrayIntList((IntCollection) arrayUnsignedShortList0);
		assertEquals(0, arrayIntList0.size());
	}
	
	/**
	 * OVERVIEW: The test case "test13" covers around 0.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test13() throws Throwable {
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
	
	@Test
	public void testGet() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList(3);
		arrayIntList0.add(0,0);
		int value = arrayIntList0.get(0);
		assertEquals(0, value);
	}

	
	@Test
	public void testRemove1() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList(8);
		arrayIntList0.add(0,100);
		arrayIntList0.add(1,2);
		arrayIntList0.add(2,3);
		assertEquals(3, arrayIntList0.size());
		int element = arrayIntList0.removeElementAt(1);
		assertEquals(2, element);
		assertEquals(2, arrayIntList0.size());
		int element2 = arrayIntList0.removeElementAt(0);
		assertEquals(100, element2);
		assertEquals(1, arrayIntList0.size());
		int element3 = arrayIntList0.removeElementAt(0);
		assertEquals(3, element3);
		assertEquals(0, arrayIntList0.size());
	}
	
	@Test
	public void testTrimToSize() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList(2);
		arrayIntList0.add(0);
		arrayIntList0.add(1);
		arrayIntList0.add(2);
		arrayIntList0.add(2);
		// The next method call trim to size of "arrayIntList0"
		arrayIntList0.trimToSize(); //OK

	}
	
	@Test
	public void testCheckRange() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList(2);
		try {
			// It retrieves the element at index 0 of arrayIntList0
			arrayIntList0.get(-1);
			fail("Expecting exception: IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
	         //
	         // Should be at least 0 and less than 0, found 0
	         //
		}
	}
	
	@Test
	public void testCheckRange2() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList(2);
		try {
			// It retrieves the element at index 0 of arrayIntList0
			arrayIntList0.get(100000);
			fail("Expecting exception: IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
	         //
	         // Should be at least 0 and less than 0, found 0
	         //
		}
	}
	
	@Test
	public void testCheckRangeIncludingEndpoint1() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList(2);
		try {
			// It retrieves the element at index 0 of arrayIntList0
			arrayIntList0.add(1000, 1);
			fail("Expecting exception: IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
	         //
	         // Should be at least 0 and less than 0, found 0
	         //
		}
	}
	
	@Test
	public void testCheckRangeIncludingEndpoint2() throws Throwable {
		ArrayIntList arrayIntList0 = new ArrayIntList(2);
		try {
			// It retrieves the element at index 0 of arrayIntList0
			arrayIntList0.add(-1, 1);
			fail("Expecting exception: IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
	         //
	         // Should be at least 0 and less than 0, found 0
	         //
		}
	}
}

