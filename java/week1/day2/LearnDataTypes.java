package week1.day2;

public class LearnDataTypes {

	public static void main(String[] args) {
		
		//Integer
		byte noOfVehicle =2;
		short age =28;
		int salary = 60000; // Most used data types in the real time
		long cardNumber = 6448654; //Less than 8 digits no error,
		long cardNumber2 = 6445332884958L; // To use long data type with more than 8 digits then the number should end with lower key l or L
	    
		System.out.println("No of Vehicle :"+ noOfVehicle);
		System.out.println(age);
		System.out.println(salary);
		System.out.println(cardNumber);
		System.out.println(cardNumber2);
        System.out.println(noOfVehicle + " " +age); // In order to print two integer types in a single print command, then include a space b/n variables.
		
		
		//Float -- Decimal
		float petrolPrice = 108.76f; // Add either F or f to use float data type values
		double pieValue = 3.146666667; // No need any D or D at the end
		System.out.println(petrolPrice);
		System.out.println(pieValue);
				
		//Character : It accepts only single digit 
		//It accepts symbols, characters, numbers (Single digit only). Char should be in single quote only.
		// We can use ASCII table value
		char logo = '#'; 
		System.out.println("Logo :"+ logo);
		
		//Boolean
		//Use true or false in lowercase
		boolean haveYouHadYourBreakfast = false;
		System.out.println("Had your breakfast? " +haveYouHadYourBreakfast);
	
	    //String : It uses double quotes in data
		//String keyword should start with Capital S
		//It can hold sequence of characters
		String name = "Mathangi";
		System.out.println("My name is " +name);
		
		
		
		
		
	}

}
