package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//load the urlg
		driver.get("https://www.facebook.com");
		
		//maximize
		driver.manage().window().maximize();
		
		//email-id
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("testleaf.2023@gmail.com");
		
		//password
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		//click the login button 
		driver.findElement(By.name("login")).click();
		
		//Find your account and login
		driver.findElement(By.linkText("Find your account and log in.")).click();
		
		//title
		String title = driver.getTitle();
		System.out.println(title);
		
		//Verify
		if(title.contains("Forgotten password")) {
			System.out.println("Login successful");
		} else {
			System.out.println("Login not successful");
		}

	}

}
