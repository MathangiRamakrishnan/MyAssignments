package personal.works;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LiquidLove {
	
	public static void timer(long ms) throws InterruptedException {
		Thread.sleep(1500);
	}
		
	
	public static void main(String[] args) throws InterruptedException {
		
		 // Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		// Load the url
		driver.get("https://liquidlove.ssssotn.org/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Wait
		timer(1000);
		
		//Blood Request Button
		driver.findElement(By.linkText("Blood request")).click();
		
		//Wait
		timer(1500);
		
		//Home
		driver.findElement(By.linkText("Home")).click();
		
		//Wait
		timer(2000);
		
		//Donor Button
//		WebElement DonorDD = driver.findElement(By.linkText("Donor"));
//		Select DonorSelector = new Select(DonorDD);
//		DonorSelector.selectByVisibleText("Register");
		
		//Donor Button
		driver.findElement(By.linkText("Donor")).click();
		
		//Wait
		timer(1500);
		
		//Update Profile
		By updateSelector = By.cssSelector("a[href=\'/liquidlove/verify/donor\']");
		WebElement updateButton = driver.findElement(updateSelector);
		updateButton.click();
		
		//Wait
		timer(1500);
		
		//Phone number
		driver.findElement(By.name("phone")).sendKeys("8807834932");
		
		//Wait
		timer(1500);
		
		//Click OTP button
    	driver.findElement(By.className("btn")).click();
		//driver.findElement(By.cssSelector(".btn.btn-primary.btn-sm")).click();
		//css.Selector accepts attributes, class and ID
		//Attributes : // Select all <input> elements with a "type" attribute of "text" --> By cssSelector = By.cssSelector("input[type='text']");
		//Class : .class
		//ID : #ID
    	
    	//Wait
    	timer(2000);
    	
//    	driver.close();
		
		
	}

}


