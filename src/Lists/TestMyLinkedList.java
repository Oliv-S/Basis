package Lists;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.Assertions;

@TestInstance(Lifecycle.PER_CLASS)
class TestMyLinkedList {

	private MyLinkedList myList;
	
	@BeforeAll
	public void beforAll(){
		myList = new MyLinkedList();
	}
	
	@Test
	void testClear(){
		myList.add(100);		
		myList.add(200);
		myList.add(300);
		assertEquals(3, myList.getCount());
		myList.clear();
		assertEquals(0, myList.getCount());
	}

	@Test
	void testAddPop(){
		myList.add(100);		
		myList.add(200);
		myList.add(300);
		assertEquals(300, myList.pop());
		assertEquals(200, myList.get(0));
		assertEquals(100, myList.get(1));
		assertEquals(200, myList.pop());
		assertEquals(100, myList.pop());
		myList.clear();
	}

	@Test
	void testCount(){
		assertEquals(0, myList.getCount());
		myList.add(100);		
		myList.add(200);
		myList.add(300);
		assertEquals(3, myList.getCount());
		myList.clear();
	}
	
	@Test
	void testGet(){
		myList.add(100);		
		myList.add(200);
		myList.add(300);
		assertAll(
				()->assertEquals(300, myList.get(0)),
				()->assertEquals(200, myList.get(1)),
				()->assertEquals(100, myList.get(2)));
		myList.clear();
	}
	
	@Test
	void testArraysEquals() {
		int[ ] actual = {10, 5, 3, 9};
		int[ ] expected = {3, 5, 9, 10};
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void testForException() {
		int[ ] actual=null;
		Assertions.assertThrows(NullPointerException.class, ()->Arrays.sort(actual));
	}


}
