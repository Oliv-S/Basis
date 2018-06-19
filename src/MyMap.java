import java.util.HashMap;
import java.util.Map;

public class MyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> myMap = new HashMap<Integer,Integer>();
		myMap.put(100, 200);
		myMap.put(200, 100);
		myMap.put(400, 500);
		
		
		System.out.println(myMap.containsKey(600));
		System.out.println(myMap.containsKey(100));
		System.out.println(myMap.get(500));
		System.out.println(myMap.get(100));
		
		for (Integer key : myMap.keySet()) {
			System.out.println("" + key + " - " + myMap.get(key));
		}
		
		

	}

}
