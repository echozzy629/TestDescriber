package org.apache.commons.collections.primitives;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.Field;

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
  public void test0()  throws Throwable  {
      ArrayIntList arrayIntList0 = new ArrayIntList();
      try {
        arrayIntList0.add(0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
      }
  }
  
  @Test
  public void test1()  throws Throwable  {
      ArrayIntList arrayIntList0 = new ArrayIntList();
      arrayIntList0.trimToSize();
      try {
        arrayIntList0.add(122);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ArrayIntList arrayIntList0 = new ArrayIntList();
      arrayIntList0.ensureCapacity(3);
      assertEquals(0, arrayIntList0.size());
  }

  @Test
  public void test3()  throws Throwable  {
      ArrayUnsignedShortList arrayUnsignedShortList0 = new ArrayUnsignedShortList(15);
      ArrayIntList arrayIntList0 = null;
      try {
        arrayIntList0 = new ArrayIntList((IntCollection) arrayUnsignedShortList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // capacity 0
         //
      }
  }
  
  @Test
  public void test4()  throws Throwable  {
      ArrayIntList arrayIntList0 = null;
      try {
        arrayIntList0 = new ArrayIntList((IntCollection) arrayIntList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      ArrayIntList arrayIntList0 = new ArrayIntList(8);
      try {
        arrayIntList0.set((-11), (-2));
        fail("Expecting exception: IndexOutOfBoundsException");
   
      } catch(IndexOutOfBoundsException e) {
         //
         // Should be at least 0 and less than 0, found -11
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      ArrayIntList arrayIntList0 = new ArrayIntList();
      try {
        arrayIntList0.add((-191), (-191));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Should be at least 0 and at most 0, found -191
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      ArrayIntList arrayIntList0 = new ArrayIntList();
      try {
        arrayIntList0.set(45, 87);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Should be at least 0 and less than 0, found 45
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      ArrayIntList arrayIntList0 = new ArrayIntList();
      arrayIntList0.trimToSize();
      arrayIntList0.trimToSize();
      assertEquals(0, arrayIntList0.size());
  }
  
  @Test
  public void test9()  throws Throwable  {
      ArrayIntList arrayIntList0 = new ArrayIntList();
      arrayIntList0.ensureCapacity(7305);
      assertEquals(0, arrayIntList0.size());
  }

  @Test
  public void test10()  throws Throwable  {
      ArrayIntList arrayIntList0 = new ArrayIntList();
      // Undeclared exception!
      try {
        arrayIntList0.removeElementAt(37);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Should be at least 0 and less than 0, found 37
         //
      }
  }
  
  @Test
  public void test17() {
	  ArrayIntList oList = new ArrayIntList();
	  oList.add(1);
	  oList.add(2);
	  oList.add(3);
	  oList.removeElementAt(1);
	  assertEquals(2, oList.size());
	  assertEquals(1, oList.get(0));
	  assertEquals(3, oList.get(1));
	  oList.removeElementAt(0);
	  assertEquals(1, oList.size());
	  assertEquals(3, oList.get(0));
  }

  @Test
  public void test11()  throws Throwable  {
      ArrayIntList arrayIntList0 = new ArrayIntList(143);
      try {
        arrayIntList0.get(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Should be at least 0 and less than 0, found 0
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      ArrayIntList arrayIntList0 = new ArrayIntList();
      arrayIntList0.ensureCapacity(9);
      assertEquals(0, arrayIntList0.size());
  }

  @Test
  public void test13()  throws Throwable  {
      ArrayIntList arrayIntList0 = new ArrayIntList();
      try {
        arrayIntList0.add(764, 764);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Should be at least 0 and at most 0, found 764
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      ArrayIntList arrayIntList0 = null;
      try {
        arrayIntList0 = new ArrayIntList((-406));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // capacity -406
         //
      }
  }
  
  @Test
  public void test15() {
	  ArrayIntList oList = new ArrayIntList();
	  oList.add(1);
	  oList.add(2);
	  oList.add(3);
	  ArrayIntList list = new ArrayIntList(oList);
	  assertEquals(3, list.size());
  }
  
  @Test
  public void test16() {
	  ArrayIntList list = new ArrayIntList(3);
	  list.add(0, 1);
	  list.add(0, 2);
	  System.out.println(list);
  }
  
  @Test
  public void test18() throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
	  ArrayIntList oList = new ArrayIntList(1);
	  Field f = oList.getClass().getDeclaredField("_data");
	  f.setAccessible(true);
	  int[] data = (int[]) f.get(oList);
	 
	  assertEquals(1, data.length);
	  oList.add(1);
	  oList.add(2);
	  oList.add(3);
	  data = (int[]) f.get(oList);
	  
	  assertEquals(4, data.length);
	  oList.ensureCapacity(50);
	  
	  data = (int[]) f.get(oList);
	  assertEquals(50, data.length);
  }
}