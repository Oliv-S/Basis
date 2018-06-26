import java.util.ArrayList;
import java.util.List;
import java.util.Random; 

public class TestStreamsOnLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = new ArrayList<>();
		Random rnd = new Random();
		
		for (int i = 0; i < 100; i++) {
			myList.add(rnd.nextInt(1000));			
		}

		System.out.println(myList);
		myList.replaceAll(x->x*10-5);
		System.out.println(myList);
		myList.removeIf(x->x>3000);
		System.out.println(myList);
//		myList.forEach(System.out::println);

	}

}
