package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundTextBox {

	public static void main(String[] args) {
		
		
		ChromeDriver driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.leafground.com/input.xhtml");
		
		WebElement inputBox = driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all']"));
		
		inputBox.sendKeys("Gokul");
		
	}

}