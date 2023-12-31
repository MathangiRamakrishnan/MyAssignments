package week5.day2;

import org.testng.annotations.Test;

public class LearnPriority {

	@Test(priority = 0)
	public void createLead() {
		System.out.println("Creating the lead");
		
	}
	
	@Test(priority = 1)
	public void editLead() {
		System.out.println("Editing the lead");
		
	}
	
	@Test(priority = 2)
	public void deleteLead() {
		System.out.println("Deleting the lead");
		
	}
	
	@Test(priority = -1)
	public void duplicateLead() {
		System.out.println("Duplicating the lead");
	}
	
}


/* Default value of priority is "0"
 * To prioritize the test case we use this attribute
 * If two or more test method with same same priority, then it will execute based on ASCII order
 */
