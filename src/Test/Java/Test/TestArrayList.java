package Test;
import java.util.*;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> myList = new ArrayList<String>();
		myList.add("1");
		myList.add("4");
		myList.add("5");
		myList.add("2");
		myList.add("3");
		myList.add("2");
		myList.add("3");
		myList.set(5, "6");
		myList.remove("3");
		System.out.println(myList.get(2));
		for (String string : myList) {
			System.out.println(string);
		}
		System.out.println(myList);
		
		Collections.sort(myList);
		System.out.println(myList);
		
		
		
	}

}
