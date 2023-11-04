package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException {
		 // Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		// Load the url
		driver.get("https://en-gb.facebook.com/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Click on create new account button
		driver.findElement(By.linkText("Create new account")).click();
		
		//wait
		Thread.sleep(1000);
		
		//Enter the First Name
		driver.findElement(By.name("firstname")).sendKeys("Mathangi");
		
		//wait
		Thread.sleep(1000);
		
		//Enter the Surname
		driver.findElement(By.name("lastname")).sendKeys("Aravind");
		
		//wait
		Thread.sleep(1000);
		
		//Enter the mobile number or email address
		driver.findElement(By.name("reg_email__")).sendKeys("9840849010");
		
		//wait
		Thread.sleep(1000);
		
		//Enter the new password
		driver.findElement(By.name("reg_passwd__")).sendKeys("Bnym123");
		
		//wait
		Thread.sleep(1000);
		
		//Handle all three dropdowns in Date of birth
		
		WebElement birthdaydateDD = driver.findElement(By.name("birthday_day"));
		Select date = new Select(birthdaydateDD);
		date.selectByIndex(14);
		
		//wait
		Thread.sleep(1000);
				
		WebElement birthdayMonthDD = driver.findElement(By.name("birthday_month"));
		Select month = new Select(birthdayMonthDD);
		month.selectByValue("7");
		
		//wait
		Thread.sleep(1000);
		
		WebElement birthyearDD = driver.findElement(By.name("birthday_year"));
		Select year = new Select(birthyearDD);
		year.selectByVisibleText("1997");
		
		
	}

}
