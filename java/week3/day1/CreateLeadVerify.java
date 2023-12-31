package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadVerify {

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
		
		//Enter the first name
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Gokul");
		
		//Enter the last Name
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Sekar");
		
		// Click on Create lead
		WebElement createLeadButton = driver.findElement(By.className("smallSubmit"));
		createLeadButton.click();
		
		
		// get lead id
		String leadId_Cname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String leadId = leadId_Cname.replaceAll("[^0-9]", "");
		
		System.out.println("leadId_Cname : " +leadId_Cname);
		System.out.println("leadId : " +leadId);
		
		//Click on findLeads
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//wait
		Thread.sleep(2000);
		
		//Verify lead page
		// getText() --> used to get the text in the webpage
		String leadPage = driver.findElement(By.tagName("title")).getText();
		System.out.println(leadPage);
		
		
	}

}