package week5.day2;

import org.testng.annotations.Test;

public class LearnInvocationCount {

	@Test(priority = 0, invocationCount = 5, invocationTimeOut = 8000, threadPoolSize = 2)
	//1st execution = 1503ms , 2nd execution = 1501ms, 3rd = 1501ms, 4th=1502ms, 5th=1501ms
	// total = 7508ms ---> hence timeout = 8000ms
	public void createLead() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Creating the lead");
		
	}
	
	@Test(priority = 1, invocationCount = 2, invocationTimeOut =2000 )
	public void editLead() {
		System.out.println("Editing the lead");
		
	}
	
	@Test(priority = 2, invocationCount = 2)
	public void deleteLead() {
		System.out.println("Deleting the lead");
		
	}
	
	@Test(priority = -1, invocationCount = 3, threadPoolSize = 2)
	public void duplicateLead() {
		System.out.println("Duplicating the lead");
	}
	
}

/* To execute the same test case multiple time
 * Default value is 1
 */

/* Invocation timeout works with invocation count
 * Within the mentioned ms, the particular test case will be executed
 * To set the maximize timout of the entire execution to complete
 * If the invocation timeout is not sufficient for invocation timeout to be executed, then it does not work properly
 */

/*threadPoolSize works along with invocation count
 *Control the number of threads required to execute the test method
 *Used for parallel execution in the @Test level
 *Default value is 0
 */