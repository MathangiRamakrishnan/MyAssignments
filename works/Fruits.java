package personal.works;

import java.util.ArrayList;
import java.util.List;

public class Fruits {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("apple");			// list.add()
		list.add("mango");
		list.add("apple");
		list.add("pine");
		list.add("grape");
		
		boolean empty = list.isEmpty();   // list.empty()
		System.out.println("Is empty: " + empty);
		
	//	list.clear();
	//	System.out.println(list.isEmpty());
		
	/*	String firstValue = list.get(2);	// list.get()
		System.out.println(firstValue);
		
		System.out.println("========================");
		
		boolean contains = list.contains("Apple"); // list.contains()
		System.out.println(contains);
		
		//before removing
		for (String eachFruit : list) {
			System.out.println(eachFruit);
		}
		
		list.remove("apple");		// list.remove()
		
		System.out.println("==================");
		
		//after removing
		for (String eachFruit : list) {
			System.out.println(eachFruit);
		}
		
		int size = list.size();
		System.out.println("Size : " + size);
	}*/
	
	}
}
