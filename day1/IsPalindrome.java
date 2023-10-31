package week2.day1;

public class IsPalindrome {

	public static void main(String[] args) {
		int input = 121, rem, output=0;
		int temp = input ;
		
		for( ; input!=0 ; input/=10) {
			rem = input%10;
			output = output * 10 + rem;
			}
		
		//Check if it is palindrome or not
		if(temp == output) {
			System.out.println(temp + " is a palindrome number");
		}
		else {
			System.out.println(temp + " is not a palindrome number");
		}
		
	}

}
