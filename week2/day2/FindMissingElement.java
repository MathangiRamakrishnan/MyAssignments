package week2.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
		int arr[] = {1,4,3,2,8,6,7}; 
		for(int i = 0 ; i < arr.length ; i++) {
			Arrays.sort(arr);
			//System.out.println(arr[i]);
			if(arr[i]!=i) {
				System.out.println(arr[i]);
				
			}
		}
				
			
		}
	}
