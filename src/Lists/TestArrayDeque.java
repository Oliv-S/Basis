package Lists;

import java.util.*;

public class TestArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.push(10);
		ad.push(40);
		ad.push(20);
		ad.push(70);
		ad.push(30);
		ad.push(90);
		System.out.println(ad);
		
		while (!ad.isEmpty()) {
			System.out.println(ad.pop());
		}
		System.out.println(ad);
		
		
	}

}
