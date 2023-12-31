package personal.works;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		
		// Simple alert ---> accept button
		driver.findElement(By.id("accept")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();			//Switching to alert window and click ok 
		String text = alert.getText(); 		// getText()
		System.out.println("Simple alert text " + text);
		alert.accept();  //Both accept and dismiss (alert.dismiss()) will work the same
		
		Thread.sleep(2000);
		
		// Confirm alert
		driver.findElement(By.id("confirm")).click();
		Alert alert1 = driver.switchTo().alert();
		String text1 = alert1.getText();
		System.out.println("Confirm alert text " + text1);
		Thread.sleep(2000);
		alert.dismiss();
		
		//Prompt alert
		driver.findElement(By.id("prompt")).click();
		Alert alert2 = driver.switchTo().alert();
		String text2 = alert2.getText();
		System.out.println("Prompt alert text " + text2);
		Thread.sleep(2000);
		alert.sendKeys("Mathangi Aravind");
		alert.accept();
		
		String text3 = driver.findElement(By.id("myName")).getText();
		System.out.println(text3);
		
		/*1.Exception handling : UnhandledAlertException --> This error will occur when the alert is not handled
		driver.findElement(By.id("prompt")).click();
		System.out.println(driver.getCurrentUrl());
		Alert alert2 = driver.switchTo().alert(); 
		
		2.Exception handling : NoAlertPresentException --> Trying to handle an alert that is not present */

		/*Modern/Sweet alert --> It is not an alert as right click will not be disabled, it is a part of the DOM
		 Windows authentication (like signin) is not an alert.*/
	}

}
