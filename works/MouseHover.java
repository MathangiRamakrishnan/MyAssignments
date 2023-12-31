package personal.works;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();						
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@role='button']")).click();
		WebElement electronics = driver.findElement(By.xpath("//span[.='Electronics']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(electronics).perform();
		
		
	}

}
