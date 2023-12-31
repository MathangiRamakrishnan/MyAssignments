package week5.day2;

import org.testng.annotations.Test;

public class LearnDependsOnMethod {

	@Test(dependsOnMethods = "createLead")
	public void editLead() {
		System.out.println("Edit Lead");
	}

	@Test(dependsOnMethods = "week5.day1.CreateLead.CreateLeadRun")
	public void createLead() {
		System.out.println("Create Lead");
	}
	
	@Test(dependsOnMethods = {"createLead", "editLead"})
	public void deleteLead() {
		System.out.println("Delete Lead");
	}
	
}

/*In different class or package, dependsonMethods = "package_name.class_name"
 *Eg: dependsOnMethods = week5.day1.CreateLead.CreateLeadRun
 */

/*To set the depends Up on another method.
 *Depended methods are failed, it will be skipped in dependsOnMethods.
 */
