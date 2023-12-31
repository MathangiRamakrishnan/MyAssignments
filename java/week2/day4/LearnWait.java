package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWait {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		// Load the url
		driver.get("https://www.facebook.com/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//ImplicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		// Click Create new account
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(10000); //--> It will wait for the given timeout
		
		// Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Gokul");
		
	}

}