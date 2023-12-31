package week5.day2;

import org.testng.annotations.Test;

public class LearnEnabled {

	@Test(priority = 0)
	public void createLead() {
		System.out.println("Creating the lead");
		
	}
	
	@Test(priority = 1)
	public void editLead() {
		System.out.println("Editing the lead");
		
	}
	
	@Test(priority = 2, enabled = false)
	public void deleteLead() {
		System.out.println("Deleting the lead");
		
	}
	
	@Test(priority = -1)
	public void duplicateLead() {
		System.out.println("Duplicating the lead");
	}
	
}

/* Default value of enabled is "true"
 * To ignore the test method
 * If enabled = false, the particular test case/test method will be ignored/not executed
 */
