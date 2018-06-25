package Sorting;

import java.util.ArrayList;

import java.util.List;

public class MySort {
	public static void SelectionSort(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			Integer indexOfMinValue=0;
			Integer minValue = Integer.MAX_VALUE;
			for (int j = i; j < list.size(); j++) {
				if (list.get(j)<minValue) {
					indexOfMinValue = j;
					minValue=list.get(j);
				}
			}
			if (minValue<list.get(i)) {
				Integer tmp=list.get(i);
				list.set(i, minValue);
				list.set(indexOfMinValue, tmp);
			}
		}
	}
	
	public static void MergeSort(ArrayList<Integer> list) {
		List<Integer> sortedList = MergeSortHelper(list);
		list.clear();
		list.addAll(sortedList);
	}
	
	private static List<Integer> MergeSortHelper(List<Integer> list) {
		int listSize = list.size();
		if (listSize <= 1) return list;
		
		int listMid = listSize/2;
		//Sorting Left
		List<Integer> leftList = (List<Integer>)list.subList(0, listMid);
		List<Integer> leftSortedList = MergeSortHelper(leftList);
		
		//Sorting Left
		List<Integer> rightList = (List<Integer>)list.subList(listMid,listSize );
		List<Integer> rightSortedList = MergeSortHelper(rightList);
		
		//Merging Left and Right
		List<Integer> resultList = new ArrayList<>();
		int currentLeft = 0;
		int currentRight = 0;
		while (currentLeft<leftSortedList.size()||currentRight<rightSortedList.size()) {
			//Left List is empty
			if (currentLeft==leftSortedList.size()) {
				resultList.addAll(rightSortedList.subList(currentRight, rightSortedList.size()));
				break;
			}
			//Right List is empty
			if (currentRight==rightSortedList.size()) {
				resultList.addAll(leftSortedList.subList(currentLeft, leftSortedList.size()));
				break;
			}
			if (leftSortedList.get(currentLeft)<rightSortedList.get(currentRight)) {
				resultList.add(leftSortedList.get(currentLeft));
				currentLeft++;
			}else {
				resultList.add(rightSortedList.get(currentRight));
				currentRight++;
			}
		}		
		return resultList;	
	}

	public static void QuickSort(ArrayList<Integer> list) {
		QuickSort(list, 0, list.size());
	}

	private static void QuickSort(ArrayList<Integer> list, int start, int end) {
		if (end<=start) return;
		int midIndex = QuickSortPartition(list, start, end);
		QuickSort(list, start, midIndex);
		QuickSort(list, midIndex+1,end);
	}
	
	private static int QuickSortPartition(List<Integer> list, int start, int end) {
		
		int pivot = list.get(start);
		int j = start+1;
		for (int i=start+1; i<end;i++) {
			if (list.get(i)<=pivot) {
				swap(list,i,j);
				j++;
			}
		}
		//Swap 
		swap(list,start,j-1);
		return j-1;
	}
	
	private static void swap(List<Integer> list, int i, int j) {
		int tmp = list.get(i);
		list.set(i, list.get(j));
		list.set(j,tmp);
	}

}
