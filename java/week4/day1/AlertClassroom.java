package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClassroom {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Thread.sleep(2000);
						
		//Prompt Box alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert alert = driver.switchTo().alert();
		String name="Mathangi";
		alert.sendKeys(name);
		alert.accept();
		Thread.sleep(2000);
		String text = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text);
		
	
	
	}

}
