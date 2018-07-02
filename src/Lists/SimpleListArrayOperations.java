package Lists;

import java.util.Arrays;
import java.util.List;

public class SimpleListArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println("*******");
		String[] array = {"One", "Two", "Three"};
		for (String string : array) {
			System.out.println(string);
		}
		List<String> list = Arrays.asList(array);
		System.out.println("*******");
		System.out.println(list);
		System.out.println("*******");
		array[0] = "0";
		for (String string : array) {
			System.out.println(string);
		}
		System.out.println("*******");
		System.out.println(list);
		System.out.println("*******");
		list.set(1, "1");
		for (String string : array) {
			System.out.println(string);
		}
		System.out.println("*******");
		System.out.println(list);
		
	

	}

}
