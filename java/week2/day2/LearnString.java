package week2.day2;

public class LearnString {

	public static void main(String[] args) {
		
		//Type 1 : String Literal
		// Syntax : String stringName = "Values"
		
		String name1 = "Mathangi";
		String name2 = "Aravind";
		
		if(name1 == name2) {
			System.out.println("Both the names are same");
		} else {
			System.out.println("Both the names are different");
	     }
	
		System.out.println("============================================");
		
		//Type 2 : String Instantiation
		// Syntax : String variableName = new String("Values");
		
		String name3 = new String ("mathangi");
		
		if(name1 == name3) {
			System.out.println("Both the names are same");
		} else {
			System.out.println("Both the names are different");
	     }
		
		//Output will be "Both the names are different" because it compares the memory address and not the value
	    // Inside memory there are two types : string pool memory and heap memory
		// String variableName = new String("Values"); -----> It is dynamic allocation i.e, heap memory ---> creates new memory
		// String stringName = "Values"; ----> It is a string pool memory, it does not create new memory, hence it only refers. 
		// Hence the o/p is "Both the names are different" as the memory allcation is different
        // Heap memory is declared in runtime and string pool memory in compilation time
	
		int length1 = name1.length(); //It will be stored as "int"
		int length3 = name3.length(); // It will also be stored a "int"
		
		// To check both string values are equal
		
		if(name1.equals(name3)) {
			System.out.println("Both the values are equal");
		}else {
			System.out.println("Both the values are different");
		}
		
		//Now the output will be "Both values are equal", because it compares the value
		
		
		// It ignores the case sensitive while comparing
		
		if(name1.equalsIgnoreCase(name3)) {                
			System.out.println("Both the names are same");
		}else {
			System.out.println("Both the names are different");
		}
		
		// To check a part of word or character 
		
		if(name1.contains("Math")) {
			System.out.println("exists in " + name1);
		}else {
			System.out.println("does not exist in " +name1);
		}
		
		
		//It splits a string to char array
		
		String name = "Mathangi";
		char[] charArray = name.toCharArray();
		for (int i = 0; i <charArray.length ; i++) {
			System.out.println(charArray[i]);
		}
		
	}

	}


