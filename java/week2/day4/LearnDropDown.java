package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch the browser
				ChromeDriver driver = new ChromeDriver();
				
				// Load the url
				driver.get("http://leaftaps.com/opentaps/");
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//Enter the username
				driver.findElement(By.className("inputLogin")).sendKeys("DemoCSR");
				
				//wait
				Thread.sleep(2000);
				
				//Enter the password
				driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
				
				//Click Login
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//Verify the title
				String title = driver.getTitle();
				//System.out.println(title);
				if(title.contains("TestLeaf")) {
					System.out.println("Leaftaps Login successfully");
				}else {
					System.out.println("Login failed");
				}
				
				
				//Click CRM/SFA
				WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
				crmsfa.click();
				
				//Click Leads tab
				WebElement leadsTab = driver.findElement(By.linkText("Leads"));
				leadsTab.click();
				
				//click Create Lead
				driver.findElement(By.linkText("Create Lead")).click();
				
				//Enter Company name
				WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
				companyName.sendKeys("Testleaf");
				Thread.sleep(2000);
				companyName.clear();
				
				Thread.sleep(2000);
				
				companyName.sendKeys("QEagle");
				
				//Enter the first name
				WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
				firstName.sendKeys("Gokul");
				
				//Enter the last Name
				WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
				lastName.sendKeys("Sekar");
				
				// Source dropdown
				WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
				
				Select source = new Select(sourceDD);
				
				source.selectByIndex(3);  // Direct Mail
				
				Thread.sleep(2000);
				
				source.selectByVisibleText("Partner"); // Partner
				
				Thread.sleep(2000);
				
				source.selectByValue("LEAD_WEBSITE");  // Website
				
				// Locate Marketing Camp..
				WebElement markCampDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
				
				Select markCamp = new Select(markCampDD);
				markCamp.selectByVisibleText("Car and Driver");
				
				
				/*
				 * // Click on Create lead WebElement createLeadButton =
				 * driver.findElement(By.className("smallSubmit")); createLeadButton.click();
				 */		
		
		
	}

}