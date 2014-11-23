import static org.junit.Assert.*;

import org.junit.Test;


public class DouLinkedListTest {
	DouLinkedList<Integer> test = new DouLinkedList<Integer>();
	
	@Test
	public void testInsert() {
		test.insert(0, 1); // test for insert into empty list, current status = 1
		assertEquals(test.get(0), (Integer)1);
		assertEquals(test.size(), 1);
		
		test.insert(1, 3); // test for insert into last position, current status = 1 3
		assertEquals(test.get(0), (Integer)1);
		assertEquals(test.get(1), (Integer)3);
		assertEquals(test.size(), 2);
		
		test.insert(0, 0); // test for insert into first position, current status = 0 1 3
		assertEquals(test.get(0), (Integer)0);
		assertEquals(test.get(1), (Integer)1);
		assertEquals(test.get(2), (Integer)3);
		assertEquals(test.size(), 3);
		
		test.insert(2, 2); // test for insert into center position, current status = 0 1 2 3
		assertEquals(test.get(0), (Integer)0);
		assertEquals(test.get(1), (Integer)1);
		assertEquals(test.get(2), (Integer)2);
		assertEquals(test.get(3), (Integer)3);
		assertEquals(test.size(), 4);
	}

	@Test
	public void testInsertFirst() {
		test.insertFirst(1); // test for insert into empty list, current status = 1
		assertEquals(test.get(0), (Integer)1);
		assertEquals(test.size(), 1);
		
		test.insertFirst(0); // test for insert into not empty list, current status = 0 1
		assertEquals(test.get(0), (Integer)0);
		assertEquals(test.get(1), (Integer)1);
		assertEquals(test.size(), 2);
	}

	@Test
	public void testInsertLast() {
		test.insertLast(0); // test for insert into empty list, current status = 0
		assertEquals(test.get(0), (Integer)0);
		assertEquals(test.size(), 1);
		
		
		test.insertLast(1); // test for insert into not empty list, current status = 0 1
		assertEquals(test.get(0), (Integer)0);
		assertEquals(test.get(1), (Integer)1);
		assertEquals(test.size(), 2);
	}

	@Test
	public void testRemove() {
		test.insertLast(0);
		test.insertLast(1);
		test.insertLast(2);
		test.insertLast(3);
		test.insertLast(4);
		test.insertLast(5); // current status = 0 1 2 3 4 5

		test.remove(0); // test for remove first node, current status = 1 2 3 4 5
		assertEquals(test.get(0), (Integer)1);
		assertEquals(test.get(1), (Integer)2);
		assertEquals(test.get(2), (Integer)3);
		assertEquals(test.get(3), (Integer)4);
		assertEquals(test.get(4), (Integer)5);
		assertEquals(test.size(), 5);
		
		test.remove(4); // test for remove last node, current status = 1 2 3 4
		assertEquals(test.get(0), (Integer)1);
    assertEquals(test.get(1), (Integer)2);
    assertEquals(test.get(2), (Integer)3);
    assertEquals(test.get(3), (Integer)4);
    assertEquals(test.size(), 4);
    
    test.remove(2); // test for remove middle node, current status = 1 2 4
    assertEquals(test.get(0), (Integer)1);
    assertEquals(test.get(1), (Integer)2);
    assertEquals(test.get(2), (Integer)4);
    assertEquals(test.size(), 3);
    
    test.insert(2, 3); // test for insert center position after remove action, current status = 1 2 3 4
    assertEquals(test.get(0), (Integer)1);
    assertEquals(test.get(1), (Integer)2);
    assertEquals(test.get(2), (Integer)3);
    assertEquals(test.get(3), (Integer)4);
    assertEquals(test.size(), 4);
    
    test.insert(0, 0); // test for insert first position after remove action, current status = 0 1 2 3 4
    assertEquals(test.get(0), (Integer)0);
    assertEquals(test.get(1), (Integer)1);
    assertEquals(test.get(2), (Integer)2);
    assertEquals(test.get(3), (Integer)3);
    assertEquals(test.get(4), (Integer)4);
    assertEquals(test.size(), 5);
    
    test.insert(5, 5); // test for insert last position after remove action, current status = 0 1 2 3 4 5
    assertEquals(test.get(0), (Integer)0);
    assertEquals(test.get(1), (Integer)1);
    assertEquals(test.get(2), (Integer)2);
    assertEquals(test.get(3), (Integer)3);
    assertEquals(test.get(4), (Integer)4);
    assertEquals(test.get(5), (Integer)5);
    assertEquals(test.size(), 6);
	}

	@Test
	public void testRemoveFirst() {
	  boolean result = false;
	  
	  try { // test for remove empty list
	    test.removeFirst();
	  } catch(NullPointerException ex) {
	    result = true;
	  }
	  assertTrue(result);
	  
	  test.insertLast(0);
	  test.insertLast(1); // current status 0 1
	  
	  test.removeFirst(); // current status 1
	  assertEquals(test.get(0), (Integer)1);
	  assertEquals(test.size(), 1);
	  
	  test.removeFirst(); // current status is null;
	  result = false;
	  try {
	    test.get(0);
	  } catch(NullPointerException ex) {
	    result = true;
	  }
	  assertTrue(result);
	  assertEquals(test.size(), 0);
	}

	@Test
	public void testRemoveLast() {
	  boolean result = false;
    
    try { // test for remove empty list
      test.removeLast();
    } catch(NullPointerException ex) {
      result = true;
    }
    assertTrue(result);
    
    test.insertLast(0);
    test.insertLast(1); // current status 0 1
    
    test.removeLast(); // current status 0
    assertEquals(test.get(0), (Integer)0);
    assertEquals(test.size(), 1);
    
    test.removeLast(); // current status is null;
    result = false;
    
    try {
      test.get(0);
    } catch(NullPointerException ex) {
      result = true;
    }
    
    assertTrue(result);
    assertEquals(test.size(), 0);
	}

	@Test
	public void testClear() {
	  boolean result = false;
	  
	  test.insertLast(0);
	  test.insertLast(1);
	  test.insertLast(2);
	  test.insertLast(3);
	  test.insertLast(4);
	  test.insertLast(5);
	  test.insertLast(6); 
	  
	  test.clear();
	  result = false;
	  
	  try {
	    test.get(0);
	  } catch(NullPointerException ex) {
	    result = true;
	  }
	  
	  assertTrue(result);
	  assertEquals(test.size(), 0);
	}

	@Test
	public void testGet() {
	  boolean result = false;
	  
	  try { // test for get action of empty list
      test.get(0);
    } catch(NullPointerException ex) {
      result = true;
    }
    
    assertTrue(result);
    
    test.insertLast(0);
    test.insertLast(1);
    test.insertLast(2);
    
    assertEquals(test.get(0), (Integer)0); // test for get first node
    assertEquals(test.get(1), (Integer)1); // test for get middle node
    assertEquals(test.get(2), (Integer)2); // test for get last node
    
    result = false;
    try { // test for out of position
      test.get(4);
    } catch(NullPointerException ex) {
      result = true;
    }
    
    assertTrue(result);
	}
	
	@Test
	public void testGetFirst() {
	  boolean result = false;
	    
	  try { // test for get action of empty list
	    test.getFirst();
	  } catch(NullPointerException ex) {
	    result = true;
	  }
	    
	  assertTrue(result);
	  
	  test.insertLast(0);
	  test.insertLast(1);
	  assertEquals(test.getFirst(), (Integer)0);
	}

	@Test
	public void testGetLast() {
	  boolean result = false;
     
	  try { // test for get action of empty list
	    test.getLast();
	  } catch(NullPointerException ex) {
	    result = true;
	  }
	     
	  assertTrue(result);
	  
	  test.insertLast(0);
	  test.insertLast(1);
	  assertEquals(test.getLast(), (Integer)1);
	}
}
