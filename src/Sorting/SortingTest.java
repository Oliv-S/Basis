package Sorting;

import java.util.ArrayList;

import java.util.Random;

public class SortingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		ArrayList<Integer> myList = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			myList.add(rnd.nextInt(1000));			
		}		
		System.out.println(myList);
		MySort.SelectionSort(myList);
		System.out.println(myList);
		
		ArrayList<Integer> myListCopy = (ArrayList<Integer>)myList.clone();
		MySort.MergeSort(myListCopy);
		System.out.println(myListCopy);
		
		ArrayList<Integer> myListCopy2 = (ArrayList<Integer>)myList.clone();
		MySort.QuickSort(myListCopy2);
		System.out.println(myListCopy2);
		
	}

}
