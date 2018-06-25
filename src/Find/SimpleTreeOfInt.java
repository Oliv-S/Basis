package Find;

import java.util.LinkedList;

public class SimpleTreeOfInt {
	private int[] array;
	private int size;

	public SimpleTreeOfInt(int... array) {
		super();
		this.array = array.clone();
		this.size = this.array.length;
	}

	public int getSize() {
		return size;
	}

	private int getLeftIndex(int index) {
		int res=index*2+1;
		if (res>=size) return -1;
		return res;
	}
	private int getRightIndex(int index) {
		int res=index*2+2;
		if (res>=size) return -1;
		return res;	}	
	
	public boolean DFS(int index, int value) {
		System.out.print(array[index] + ", ");
		if (array[index]==value) return true;
		int leftIndex = getLeftIndex(index);
		int rightIndex = getRightIndex(index);
		
		if (leftIndex<0) return false;
		else if (DFS(leftIndex,value)) return true;
		
		if (rightIndex<0) return false;
		else return DFS(rightIndex,value);
		
	}
	
	public boolean BFS(int value) {
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(0);
		while(!queue.isEmpty()) {
			int index = queue.pop();
			System.out.print(array[index] + ", ");
			if (array[index]==value) return true; 
			int leftIndex = getLeftIndex(index);
			int rightIndex = getRightIndex(index);
			
			if (leftIndex>0) queue.add(leftIndex);
			if (rightIndex>0) queue.add(rightIndex);
		}
		return false;		
	}
	public boolean DFS(int value) {
		LinkedList<Integer> stack = new LinkedList<>();
		stack.push(0);
		while(!stack.isEmpty()) {
			int index = stack.pop();
			System.out.print(array[index] + ", ");
			if (array[index]==value) return true; 
			int leftIndex = getLeftIndex(index);
			int rightIndex = getRightIndex(index);
			
			if (rightIndex>0) stack.push(rightIndex);
			if (leftIndex>0) stack.push(leftIndex);
		}
		return false;		
	}
}
