package week4.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWaits {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/waits.xhtml");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[text()='I am here']")));
		boolean displayed = driver.findElement(By.xpath("//span[text()='I am here']")).isDisplayed();
		System.out.println("enabled : " + displayed);
	
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		Boolean until = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='I am about to hide']")));
		System.out.println(until);
		
		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click Second']")));
		WebElement secondElement = driver.findElement(By.xpath("//span[text()='Click Second']"));
		driver.executeScript("arguments[0],click();",secondElement);
			
		//To take a screenshot
		File screenShot1 = driver.getScreenshotAs(OutputType.FILE);
		
		//Where to store the screenshot
		File location1 = new File("./snaps/beforeClick.png");
		
		//Move the Screenshot to the location
		FileUtils.copyFile(screenShot1, location1);
		
				
	}

}
