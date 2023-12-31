package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		
		//Modal Alert - 3 types ---> Cannot be inspected ; 1.Simple alert
		String text = alert.getText();
		System.out.println(text);
		alert.accept(); //alert will be closed after this line. Later, alert cannot be interacted.
		
		//2.Confirmation alert --> Cannot pass keys
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		alert.dismiss();
		
		Thread.sleep(2000);
		
		//3.Prompt alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		alert.sendKeys("Gokul");
		alert.accept();
		
		Thread.sleep(2000);
		
		//Non-modal alert : Sweet alert - It can be inspected but cannot be ignored
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();

		
		
		
		
		
	}

}
