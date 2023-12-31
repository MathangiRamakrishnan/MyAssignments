package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.safari.SafariDriver;



public class Selenium {

	public static void main(String[] args) throws InterruptedException  {
		
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
//		EdgeDriver driver2 = new EdgeDriver();
//		FirefoxDriver driver3 = new FirefoxDriver();
//		SafariDriver driver = new SafariDriver();
//		ChromeDriver driver1 = new ChromeDriver();
				
		// Maximize the window
		driver.manage().window().maximize();
		
		// wait for the execution 
		Thread.sleep(2000);
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/");
				
		// Locate the username field		
		WebElement userName = driver.findElement(By.id("username"));
		// Pass input to the field
		userName.sendKeys("DemoCSR");
				
		//Locate the password field
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		//Click on the Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// wait for the execution 
		Thread.sleep(2000);
		
		
		//Close the window
//		driver.close();
		

	}

}