package week2.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		
		// Type 1 : Array Literal
		// Syntax : dataType variableName[] = {values with same data type};
	    // [] it represent array
		
		int favNum[] = {9,21,4,5,33, -55}; //in int type, it accepts both positive and negative values
		
		System.out.println(favNum); // The output will be memory address of array
		
		//Array index starts from 0.
		
		System.out.println(favNum[0]);
		
		int length = favNum.length;
		
		System.out.println("Length " +length);
		
		System.out.println("Last value in the array is " +favNum [length-1]);
		
		
		for (int i = 0; i < favNum.length; i++) {  //Length is a property
			
			System.out.println(favNum[i]);
		}
		
		int[] clone = favNum.clone(); // Clone is a method ; It copies the same set of values and stores in an array
		
		System.out.println("================================================================");
		
		//Type 2 : Array Instantiation
		
		//Syntax : dataType [] variableName = new dataType[ size ];
		
		int[] numbers = new int [5];
		
		numbers[4] = 23;
		System.out.println(numbers[4]);
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
	  //number[5] = 5 ; cannot access values out of index
		
		for(int i = 0 ; i < numbers.length ; i++ ) {
			System.out.println(numbers[i]);
		}
		
		Arrays.sort(numbers);   //Sorting will happen based on ASCII value ; Arrays is a class
		
		System.out.println("=========================================================");
		
		for (int i=0 ; i<numbers.length ; i++) {
		System.out.println(numbers[i]);
		}
		
		System.out.println("=============================================================");
		
		System.out.println("Smallest Value in the Array is " + numbers [0]);
		System.out.println("Largest Value in the Array is " + numbers[numbers.length-1]);
		
		//ctrl+shift+o --> Imports the package
		
	}
		
		
		
	}


