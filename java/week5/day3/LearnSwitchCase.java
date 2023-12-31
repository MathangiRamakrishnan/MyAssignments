package week5.day3;

import org.testng.annotations.Test;

public class LearnSwitchCase {
	
	@Test
	public void calendar() {
		
		if(3!=4){
			
			System.out.println("Both values are different");
			
		}
		
		String day = "wednesday";
		switch(day) {
		
		case "Monday":
			System.out.println("Monday is a working day");
			break;
			
		case "Tuesday":
			System.out.println("Tuesday is a working day");
			break;
			
		case "Wednesday":
			System.out.println("Wednesday is a working day");
			break;
			
		case "Thursday":
			System.out.println("Thursday is a working day");
			break;
			
		case "Friday":
			System.out.println("Friday is a working day");
			break;
			
		case "Saturday":
			System.out.println("Saturday is a Week-off");
			break;
			
		case "Sunday":
			System.out.println("Sunday is a Week-off");
			break;
		
		default :
			System.out.println("Invalid entry");
		}
		
		
	}
	
}


/* Switch case:
 * When compared to "if-else" ladder, switch case execution is faster
 * Complexity of the code is reduced
 * "Break" is mandatory in switch case.
 * switch (condition) {
 * case "condition":
 * 	break;
 * }
 * 
 */
 