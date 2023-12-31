package week2.day2;

public class ReverseString {

	public static void main(String[] args) {
		
		String name = "Mathangi"; //output should be : ignahtam
		
		char[] charArray = name.toCharArray();
		
		for(int i=charArray.length-1; i>=0; i--) {
			System.out.println(charArray[i]);
		}
		
		System.out.println("==============================================");
		
		System.out.println(name.charAt(6));  // Fetches the character in that index ; "\n" will create a new line

		System.out.println("==============================================");
		
		String[] split = name.split("ath");
		for(int i=0 ; i<split.length ; i++) {
			System.out.println(split[i]);
		}
		
		System.out.println("==============================================");
		
		String lowerCase = name.toLowerCase();
		System.out.println(lowerCase);
		
		String upperCase = name.toUpperCase();
		System.out.println(upperCase);
		
		String replace = name.replace("t" , "d");
		System.out.println(replace);
		
		String replaceFirst = name.replaceFirst("a", "aa");
		System.out.println(replaceFirst);
	
		String text = "hello123!$%";
		String numbers = text.replaceAll("[^0-9]", "");  //Prints the numbers only
		System.out.println(numbers);
		
		String withoutNumbers = text.replaceAll("[0-9]", "");
		System.out.println(withoutNumbers);
		
		String onlyLetters = text.replaceAll("[^a-z]"," ");
		System.out.println(onlyLetters);
	}

}
