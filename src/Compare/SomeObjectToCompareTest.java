package Compare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class SomeObjectToCompareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		List<SomeObjectToCompare> myList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			myList.add(new SomeObjectToCompare(rnd.nextInt(100), new Integer(rnd.nextInt(50)).toString()));
		}
		for (SomeObjectToCompare someObjectToCompare : myList) {
			System.out.println(someObjectToCompare);
		}
		System.out.println();
//		Collections.sort(myList,new Comparator<SomeObjectToCompare>() {
//			@Override
//			public int compare(SomeObjectToCompare o1, SomeObjectToCompare o2) {
//				// TODO Auto-generated method stub
//				return o1.getId()-o2.getId();
//			}			
//		});
		
//		Collections.sort(myList, (o1,o2) -> o1.getId()-o2.getId());

		Collections.sort(myList, SomeObjectToCompare::compareById);
		
		myList.forEach(System.out::println);
	}

}
