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
  public void test0()  throws Throwable  {
      ArrayIntList arrayIntList0 = new ArrayIntList();
      arrayIntList0.ensureCapacity(3);
      assertEquals(0, arrayIntList0.size());
  }

  @Test
  public void test1()  throws Throwable  {
      ArrayIntList arrayIntList0 = new ArrayIntList();
      arrayIntList0.getModCount();
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
  public void test2()  throws Throwable  {
      ArrayUnsignedShortList arrayUnsignedShortList0 = new ArrayUnsignedShortList();
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
  public void test3()  throws Throwable  {
      ArrayIntList arrayIntList0 = new ArrayIntList();
      int int0 = arrayIntList0.size();
      assertEquals(0, int0);
  }

  @Test
  public void test4()  throws Throwable  {
      ArrayIntList arrayIntList0 = new ArrayIntList();
      arrayIntList0.trimToSize();
      try {
        arrayIntList0.add(110);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      ArrayIntList arrayIntList0 = new ArrayIntList(8);
      try {
        arrayIntList0.set((-855), (-1));
        fail("Expecting exception: IndexOutOfBoundsException");
   
      } catch(IndexOutOfBoundsException e) {
         //
         // Should be at least 0 and less than 0, found -855
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      ArrayIntList arrayIntList0 = null;
      try {
        arrayIntList0 = new ArrayIntList((IntCollection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      ArrayIntList arrayIntList0 = new ArrayIntList();
      try {
        arrayIntList0.add((-1921), (-1921));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Should be at least 0 and at most 0, found -1921
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      ArrayIntList arrayIntList0 = new ArrayIntList();
      try {
        arrayIntList0.set(1, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Should be at least 0 and less than 0, found 1
         //
      }
  }

  @Test
  public void test9()  throws Throwable  {
      ArrayIntList arrayIntList0 = new ArrayIntList();
      arrayIntList0.ensureCapacity(1789);
      assertEquals(0, arrayIntList0.size());
  }

  @Test
  public void test10()  throws Throwable  {
      ArrayIntList arrayIntList0 = new ArrayIntList();
      arrayIntList0.trimToSize();
      arrayIntList0.trimToSize();
      assertEquals(0, arrayIntList0.size());
  }

  @Test
  public void test11()  throws Throwable  {
      ArrayIntList arrayIntList0 = new ArrayIntList();
      // Undeclared exception!
      try {
        arrayIntList0.removeElementAt((-39));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Should be at least 0 and less than 0, found -39
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      ArrayIntList arrayIntList0 = new ArrayIntList();
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
  public void test13()  throws Throwable  {
      ArrayIntList arrayIntList0 = new ArrayIntList();
      arrayIntList0.ensureCapacity(9);
      assertEquals(0, arrayIntList0.size());
  }

  @Test
  public void test14()  throws Throwable  {
      ArrayIntList arrayIntList0 = new ArrayIntList();
      try {
        arrayIntList0.add(65535, 65535);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Should be at least 0 and at most 0, found 65535
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      ArrayUnsignedShortList arrayUnsignedShortList0 = new ArrayUnsignedShortList();
      arrayUnsignedShortList0.add(677);
      ArrayIntList arrayIntList0 = null;
      try {
        arrayIntList0 = new ArrayIntList((IntCollection) arrayUnsignedShortList0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      ArrayIntList arrayIntList0 = null;
      try {
        arrayIntList0 = new ArrayIntList((-2033));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // capacity -2033
         //
      }
  }
}
