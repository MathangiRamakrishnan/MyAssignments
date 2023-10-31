package week2.day2;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		
		String test = "changeme";
		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length ; i++) {
			if(i%2==1) {
				charArray[i] = Character.toUpperCase(charArray[i]);
			}	
		}
		
		System.out.println(charArray);
			
	}
		
}

