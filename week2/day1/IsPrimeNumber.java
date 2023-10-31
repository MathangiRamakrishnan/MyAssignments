package week2.day1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
		int num = 7;
		boolean flag = false;
		
		for(int i=2 ; i<num ; i++) {
			if(num%i == 0) {
				flag = true;
			}
		}
		
		if(flag!= true) {
			System.out.println("The number " + num +" is prime number" );
			
		} else {
			System.out.println("The number " + num + " is not a prime number");
		}
		 

	}

}
