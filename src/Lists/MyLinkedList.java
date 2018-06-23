package Lists;

public class MyLinkedList {
	
	private Node head;
	private int count;
	
	public void add(int newElement) {
		count++;
		if (head==null) {
			head = new Node(newElement);
		}
		else {
			Node newNode=new Node(newElement);
			newNode.next=head;
			head=newNode;			
		}
	}

	public int pop() {
		if (count==0) throw new IndexOutOfBoundsException();
		int retValue=head.value;
		if (count==1) {
			head=null;
		}else {
			head = head.next;
		}
		count--;
		return retValue;
	}
	
	public int getCount() {
		return count;
	}

	public int get(int index) {
		if (index<0 || index>count-1) {
			throw new IndexOutOfBoundsException();
		}
		else {
			Node currentNode=head;
			for (int i = 0; i < index; i++) {
				currentNode=currentNode.next;				
			}
			return currentNode.value;			
		}
	}
	
	public void delete(int index) {
		if (index<0 || index>count-1) {
			throw new IndexOutOfBoundsException();
		}
		if (index==0) {
			head=head.next;
			return;
		}
		Node prevNode=head;
		Node currentNode=head.next;
		for (int i = 1; i < index; i++) {
			prevNode=currentNode;
			currentNode=currentNode.next;			
		}
		prevNode=currentNode.next;
	}
	
	

	public MyLinkedList() {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private class Node{
		private Node next;
		private int value;
		public Node(int value) {
			this.value = value;
		}		
	}
}

