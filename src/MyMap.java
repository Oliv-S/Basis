import java.util.HashMap;
import java.util.Map;

public class MyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> myMap = new HashMap<Integer,Integer>();
		myMap.put(100, 200);
		myMap.put(200, 100);
		myMap.put(400, 500);
		
		//myMap.con
		for (Integer key : myMap.keySet()) {
			System.out.println("" + key + " - " + myMap.get(key));
			
		}
		
		

	}

}
