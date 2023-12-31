package week2.day1;

public class JumpStatements {

	public static void main(String[] args) {
		
		
		
// print odd number from 0 to 10 and don't print number 5
		
		for (int i = 0; i < 10; i++) {
			
			if(i%2!=0) {
				if(i==5) {
					continue;  //helps to skip the current iteration.
				}
				
				System.out.println(i);
			}
		}
		
			System.out.println("======================");
			
		    for (int j=0 ; j<100; j++) {
			
		    	if(j%2==0) {
				if(j>20) {
					break; 
			
				}
				
				System.out.println(j);
			}
		}
		}

	}

