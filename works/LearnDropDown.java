package personal.works;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mongodb.annotations.ThreadSafe;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver  = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//Username
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		//Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA
		 driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on Leads
		 driver.findElement(By.linkText("Leads")).click();
		//Click on Create Lead
		 driver.findElement(By.linkText("Create Lead")).click();
		 
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("QEagle");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gokul");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");
		 WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 Select source = new Select(sourceDD);
		 source.selectByIndex(4);
		 
		 WebElement marketingCampaignDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		 Select marketingCampaign = new Select(marketingCampaignDD);
		 marketingCampaign.selectByVisibleText("Automobile");
		 
		 WebElement ownershipDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		 Select ownership = new Select (ownershipDD);
		 ownership.selectByValue("OWN_CCORP");
		 
		 driver.findElement(By.className("smallSubmit")).click();
		 
		 String title = driver.getTitle();
	//	 System.out.println(title);
		 if(title.contains("View Lead | opentaps CRM")) {
			 System.out.println("Title is verified" + title);
		 }else {
			 System.out.println("Title is not correct");
		 }
		 
		 }
	}


