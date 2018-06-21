package Lists;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> myLList = new LinkedList<>();
		myLList.add(3);
		myLList.add(4);
		myLList.add(5);
		myLList.add(6);
		
		/*
		for (Integer integer : myLList) {
			System.out.println(integer);
		}*/
		
		while (!myLList.isEmpty()) {
			System.out.println(myLList.pop());
		}
		
		System.out.println();
		myLList.push(3);
		myLList.push(4);
		myLList.push(5);
		myLList.push(6);
		
		/*
		for (Integer integer : myLList) {
			System.out.println(integer);
		}*/

		
		while (!myLList.isEmpty()) {
			System.out.println(myLList.pop());
		}

	}

}
