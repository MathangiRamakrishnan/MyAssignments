package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateFacebookAccount {

	public static void main(String[] args) {
		
		
		ChromeDriver driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Gokul");
		
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Sekar");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("gokul.sekar@testleaf.com");
		
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("gokul.sekar@testleaf.com");
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		

	}

}