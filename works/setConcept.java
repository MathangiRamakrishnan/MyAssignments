package personal.works;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class setConcept {

	public static void main(String[] args) {
	
		// Hash set --> Hashing algorithm --> Random order
		Set<String> names1 = new HashSet<String>();
		names1.add("apple");
		names1.add("mango");
		names1.add("pine");
		names1.add("grape");
		names1.add("orange");
	
		System.out.println("Hash Set : " + names1);
		
		System.out.println("---------------------------");
		
		//Tree set --> Sort --> ASCII order
		Set<String> names2 = new TreeSet<String>();
		names2.add("apple");
		names2.add("mango");
		names2.add("pine");
		names2.add("grape");
		names2.add("orange");
		
		System.out.println("Tree Set : " + names2);
		
		System.out.println("---------------------------");
		
		//Linked Hash set --> Sort --> Insertion Order
		Set<String> names3 = new LinkedHashSet<String>();
		names3.add("apple");
		names3.add("mango");
		names3.add("pine");
		names3.add("grape");
		names3.add("orange");
		names3.add("banana");
		
		System.out.println("Linked Hash Set : " + names3);
		
		System.out.println("---------------------------");
		
		// addAll() --> adds to the set if anything is missed
		
		names1.addAll(names3);
		System.out.println(names1);
		
		System.out.println("---------------------------");
		
		// If any data has to be retrieved from the set, then convert the set to list.
		
		List<String>names4 = new ArrayList<String>(names2);
		names4.addAll(names3);
		System.out.println("List : " + names4);
		
		// Clear() --> empties the entire collection
		names3.clear();
		System.out.println(names3);
		
		//remove()
		names2.remove("apple");
		System.out.println(names2);
		
		//removeAll() --> removes specific elements based on another collection
		names1.removeAll(names2);
		System.out.println(names1);
		
	}
}
