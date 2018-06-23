package Lists;

import static org.junit.jupiter.api.Assertions.*;

import java.rmi.server.ExportException;

import org.junit.Rule;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

class TestMyLinkedList {



	@Test
	void testAddPop(){
		MyLinkedList myList = new MyLinkedList();
		myList.add(100);		
		myList.add(200);
		myList.add(300);
		assertEquals(300, myList.pop());
		assertEquals(200, myList.get(0));
		assertEquals(100, myList.get(1));
		assertEquals(200, myList.pop());
		assertEquals(100, myList.pop());
	}

	@Test
	void testCount(){
		MyLinkedList myList = new MyLinkedList();
		assertEquals(0, myList.getCount());
		myList.add(100);		
		myList.add(200);
		myList.add(300);
		assertEquals(3, myList.getCount());
	}
	
	@Test
	void testGet(){
		MyLinkedList myList = new MyLinkedList();

		myList.add(100);		
		myList.add(200);
		myList.add(300);
		assertEquals(300, myList.get(0));
		assertEquals(200, myList.get(1));
		assertEquals(100, myList.get(2));
	}
	

}
