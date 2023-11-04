package week2.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		
		        // Launch the browser
				ChromeDriver driver = new ChromeDriver();
				
				// Load the url
				driver.get("http://leaftaps.com/opentaps/");
				
				//Maximize the window
				driver.manage().window().maximize();

				// Username
				driver.findElement(By.id("username")).sendKeys("DemoCSR");
				
				//wait
				Thread.sleep(2000);
				
				//Password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				//Click the "Login" button
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//Click on the CRM/SFA link
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				//Click on Accounts tab
				driver.findElement(By.linkText("Accounts")).click();
				
				//Click on Create Account
				driver.findElement(By.linkText("Create Account")).click();
				
				//Enter an account name
				driver.findElement(By.id("accountName")).sendKeys("Mathangi");
				
				//Enter a description as "Selenium Automation Tester"
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
				
				//Select "ComputerSoftware" as industry
				WebElement industryDD = driver.findElement(By.name("industryEnumId"));
				Select industry = new Select(industryDD);
				industry.selectByIndex(2);
				
				
				//Select Ownership "S-Corporation"
				WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
				Select ownership = new Select(ownershipDD);
				ownership.selectByVisibleText("S-Corporation");

				
				//Select "Employee"
				WebElement sourceDD = driver.findElement(By.name("dataSourceId"));
				Select source = new Select(sourceDD);
				source.selectByValue("LEAD_EMPLOYEE");
				
				//Select "eCommerce Site Internal Campaign" as the marketing campaign
				WebElement campaignDD = driver.findElement(By.name("marketingCampaignId"));
				Select campaign = new Select(campaignDD);
				campaign.selectByIndex(6);
				
				//Select "Texas" as state/province using SelectByValue
				WebElement stateDD = driver.findElement(By.name("generalStateProvinceGeoId"));
				Select state = new Select(stateDD);
				state.selectByValue("TX");
				
				//Click "Create Account" button
				driver.findElement(By.className("smallSubmit")).click();
				
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				//Verify that the account name is displayed correctly.
	//			System.out.println("Mathangi");
				
	//			if(accountName.equals(accountName)) {
	//				System.out.println("Account Name verified");
	//			}else {
	//				System.out.println("Account Name is wrong");
	//			}
	//				driver.close();

			    	 
	}
}

