package week2.day2;

public class FindIntersection {

	public static void main(String[] args) {
		
		        // Arrays to be compared
		        int a[] = {3,2,11,4,6,7};
		        int b[] = {1,2,8,4,9,7};
		        
		        // Creating nested for loop to compare the array elements
		        for (int i = 0; i < a.length; i++) {
		            for (int j = 0; j < b.length; j++) {
		                if (a[i] == b[j]) {
		                    System.out.println("Matching Element: " + a[i]);
		                }
		            }
		        }
		    }
		


	}
