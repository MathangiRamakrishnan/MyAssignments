package week2.day3;

public class LearnString {

	public static void main(String[] args) {
		
		String input = " Welcome to Testleaf ";
		
		String lastWord = input.substring(11);
		
		System.out.println("Last word is : " +lastWord);
		
		String firstWord = input.substring(0,8);
		System.out.println("First word is : " +firstWord);
		
		String trim = input.trim();  	// Removes whitespace before and after text
		System.out.println(trim);      
		
		String rupee = "$1245";
		String rupees = rupee.replaceAll("[^0-9]" , "");  // ("Regex","replacementString")Regular expression (Regex) : [^0-9] --> Anything that is not a digit (0-9)
		System.out.println(rupees);
		
		int parseInt = Integer.parseInt(rupees);     //It is similar to regular expression but it can be used for comparison ; Integer is a class unlike other data types. So, we have a method for Integer.
		System.out.println("parseInt : " +parseInt); // It converts the string to Int and used for comparison (Like sorting feature in website)
		
		int num = 1256;
		if(num == parseInt) {
			System.out.println("Both are same");
		}
		
		String string = Integer.toString(parseInt);
		System.out.println("String " +string);
	}

}
