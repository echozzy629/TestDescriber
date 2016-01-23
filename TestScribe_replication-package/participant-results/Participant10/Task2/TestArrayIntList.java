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
	@Test// this test is stupid as it does not have any meaningful assertions
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
		// Then, it retrieves the modification count for the object
		// "arrayIntList0"
		arrayIntList0.getModCount();
		//try {
			// The next method call add the element 1 to "arrayIntList0" at index 0
			arrayIntList0.add(0, 1);
//			fail("Expecting exception: ArithmeticException");
//		} catch (ArithmeticException e) {
//			//
//	        // / by zero
//	        //
//		}
			
		assertEquals("Failed to add element to list", 1, arrayIntList0.size());
	}

	/**
	 * OVERVIEW: The test case "test2" covers around 1.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test2() throws Throwable {
		ArrayIntList arrayIntList0 = null;
		try {
			//Then, the test case assigns to "arrayIntList0arrayIntList0" an object
			// obtained by casting "null" as a collection of integers
			arrayIntList0 = new ArrayIntList((IntCollection) null);
			fail("Expecting exception: NullPointerException");
		      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	}

	/**
	 * OVERVIEW: The test case "test3" covers around 5.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test3() throws Throwable {
		// The test case instantiates an "ArrayIntList" with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		// The next method call trim to size of "arrayIntList0"
		arrayIntList0.trimToSize();
//		try {
			// the method add -1616 to the object "arrayIntList0"
			arrayIntList0.add((-1616));
//			fail("Expecting exception: ArithmeticException");
//		} catch (ArithmeticException e) {
//	         //
//	         // / by zero
//	         //
//		}
			assertEquals("Failed to add element", 1, arrayIntList0.size());
	}

	/**
	 * OVERVIEW: The test case "test4" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test4() throws Throwable {
		// The test case instantiates a "ArrayIntList" with the default
		// configuration (initial capacity is 8)
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " initial capacity less than 1" is FALSE;
		ArrayIntList arrayIntList0 = new ArrayIntList(8);
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
	 * OVERVIEW: The test case "test5" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test5() throws Throwable {
		// The test case instantiates a "ArrayIntList"  with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			// The next method call add the element 0 to "arrayIntList0" at 
			// index -390
			arrayIntList0.add((-390), 0);
			fail("Expecting exception: IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
			//
	        // Should be at least 0 and at most 0, found -390
	        //
		}
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
			// It sets the element 1 at index 1 in arrayIntList0
			arrayIntList0.set(1, 1);
			fail("Expecting exception: IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
			 //
	         // Should be at least 0 and less than 0, found 1
	         //
		}
	}

	/**
	 * OVERVIEW: The test case "test7" covers around 3.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test// this test is stupid and same as test0
	public void test7() throws Throwable {
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
		assertEquals(0, arrayIntList0.size());
	}

	/**
	 * OVERVIEW: The test case "test8" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test8() throws Throwable {
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
	 * OVERVIEW: The test case "test9" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test9() throws Throwable {
		// The test case instantiates a "ArrayIntList"  with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			// The next method call removes the element at index -2401 of
			// "arrayIntList0"
			arrayIntList0.removeElementAt((-2401));
			fail("Expecting exception: IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
	         //
	         // Should be at least 0 and less than 0, found -2401
	         //
		}
	}

	/**
	 * OVERVIEW: The test case "test10" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test10() throws Throwable {
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
	 * OVERVIEW: The test case "test11" covers around 3.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test// this test is the same as test0 and test9
	public void test11() throws Throwable {
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
	 * OVERVIEW: The test case "test12" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test12() throws Throwable {
		// The test case instantiates a "ArrayIntList" with the default
		// configuration.
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			// The next method call add the element 6052 to "arrayIntList0" at 
			// index 6052
			arrayIntList0.add(6052, 6052);
			fail("Expecting exception: IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
	         //
	         // Should be at least 0 and at most 0, found 6052
	         //
		}
	}

	/**
	 * OVERVIEW: The test case "test13" covers around 3.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test13() throws Throwable {
		// The test case instantiates an "ArrayUnsignedShortList" with the default
		// configuration (initial capacity is 8)
		ArrayUnsignedShortList arrayUnsignedShortList0 = new ArrayUnsignedShortList();
		// the method add the element 677 to the object "arrayUnsignedShortList0"
		arrayUnsignedShortList0.add(677);
		ArrayIntList arrayIntList0 = null;
//		try {
			//Then, the test case assigns to "arrayIntList0arrayIntList0" an object
			// obtained by casting "arrayUnsignedShortList0" as a collection of integers
			arrayIntList0 = new ArrayIntList((IntCollection) arrayUnsignedShortList0);
//			fail("Expecting exception: ArithmeticException");
//		} catch (ArithmeticException e) {
//	         //
//	         // / by zero
//	         //
//		}
			
			assertEquals("Failed to add ArrayUnsignedShortList, wrong size", 1, arrayIntList0.size());
			assertEquals("Failed to add ArrayUnsignedShortList, wrong element", 677, arrayIntList0.get(0));
	}

	@Test
	public void testRemoveElementAt()
	{
		ArrayIntList array = createArrayIntList(1,2,3,4,5,6,7);
		
		// checking beginning of the list
		int elem = array.removeElementAt(0);
		assertEquals(1, elem);
		assertEquals(6, array.size());

		// checking middle
		elem = array.removeElementAt(1);
		assertEquals(3, elem);
		assertEquals(5, array.size());

		// checking end
		elem = array.removeElementAt(array.size()-1);
		assertEquals(7, elem);
		assertEquals(4, array.size());
		
		// checking bounds below
		try{
			elem = array.removeElementAt(-1);
			fail("Requested removeElementAt(-1). Expected exception: IndexOutOfBoundsException");
		}
		catch(IndexOutOfBoundsException ex)
		{
			// index is below 0
		}
		
		// checking bounds above
		try{
			elem = array.removeElementAt(array.size());
			fail("Requested removeElementAt(array.size()). Expected exception: IndexOutOfBoundsException");
		}
		catch(IndexOutOfBoundsException ex)
		{
			// index is above size()
		}
	}
	
	@Test
	public void testSetEmptyArray()
	{
		ArrayIntList array = new ArrayIntList();

		for(int i : new int[]{0, -1, 1, 10, -10})
		{
			try{
				array.set(i, i);
				fail("Requested set("+i+","+i+") on empty array. Expected exception: IndexOutOfBoundsException");
			}
			catch(IndexOutOfBoundsException ex)
			{
				// index is incorrect as there's no elements in array.
			}
		}
	}
	
	@Test// testing set using size and get.
	public void testSet()
	{
		ArrayIntList array = createArrayIntList(1,2,3,4,5,6,7);

		
		// inserting at first element
		int elem = array.set(0, 100);
		assertEquals(1, elem);
		assertEquals(7, array.size());
		assertEquals(100, array.get(0));
		
		// inserting in the middle
		elem = array.set(1, 101);
		assertEquals(2, elem);
		assertEquals(7, array.size());
		assertEquals(100, array.get(0));
		
		elem = array.set(4, 102);
		assertEquals(5, elem);
		assertEquals(7, array.size());
		assertEquals(101, array.get(4));
		
		// inserting at the end
		elem = array.set(array.size()-1, 103);
		assertEquals(7, elem);
		assertEquals(7, array.size());
		assertEquals(102, array.get(array.size()-1));
		
		// inserting below
		try{
			array.set(-1, 104);
			fail("Requested set("+-1+","+104+") on array. Expected exception: IndexOutOfBoundsException");
		}
		catch(IndexOutOfBoundsException ex)
		{
			// index is below 0
		}
		
		// inserting above
		
		try{
			array.set(array.size(), 105);
			fail("Requested set("+array.size()+","+105+") on array. Expected exception: IndexOutOfBoundsException");
		}
		catch(IndexOutOfBoundsException ex)
		{
			// index is above last index
		}
	}
	
	private ArrayIntList createArrayIntList(int... elements) {
		ArrayIntList res = new ArrayIntList(elements.length);
		for(int i=0;i<elements.length;++i)
			res.add(elements[i]);
		
		return res;
	}

}
