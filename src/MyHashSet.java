import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class MyHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***
		 *  HashSet
		 */
		HashSet<String> myHashSet = new HashSet<String>();
		myHashSet.add("One");
		myHashSet.add("Two");
		myHashSet.add("Three");
		myHashSet.add("Four");
		myHashSet.add("Five");
		myHashSet.add("Five");
		
		System.out.println(myHashSet);
		System.out.println("Set contains Seven: " + myHashSet.contains("Seven"));
		if (myHashSet.contains("Seven")) System.out.println("Seven");		
		else System.out.println("There is no Seven!");

		/***
		 *  LinkedHashSet
		 */
		HashSet<String> myLinkedHashSet = new LinkedHashSet<String>();
		myLinkedHashSet.add("One");
		myLinkedHashSet.add("Two");
		myLinkedHashSet.add("Three");
		myLinkedHashSet.add("Four");
		myLinkedHashSet.add("Five");
		myLinkedHashSet.remove("Four");
		
		System.out.println(myLinkedHashSet);
		
		if (myLinkedHashSet.containsAll(myHashSet)) System.out.println("myLinkedHashSet contain myHashSet");

		/***
		 *  TreeSet
		 */
		TreeSet<String> myTreeSet = new TreeSet<String>();
		myTreeSet.add("One");
		myTreeSet.add("Two");
		myTreeSet.add("Three");
		myTreeSet.add("Four");
		myTreeSet.add("Five");
		
		System.out.println(myTreeSet);
		System.out.println(myTreeSet.subSet("Four", "Three"));
		myTreeSet.forEach(n->System.out.println(n));


	}

}


