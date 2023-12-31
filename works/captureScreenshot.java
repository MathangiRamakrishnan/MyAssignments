package personal.works;

import java.io.File;
import java.io.IOException;

import org.apache.xmlbeans.impl.inst2xsd.util.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class captureScreenshot {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		
		//Selenium takes screenshot of the DOM (Webpage) visible portion only
		
		// Webpage Screenshot
		File firstSrc = driver.getScreenshotAs(OutputType.FILE); //--> This just captures the webpage
		File destination = new File("./snaps/img1.png"); //--> creates a file in project level,snaps folder in png format and stores it. .png is preferred because of its reduced size and better quality
		FileHandler.copy(firstSrc, destination);
		
		//Screenshot of particular element
/*		driver.findElement(By.id("home"));
		File eleSrc1 = ele.getScreenshotAs(OutputType.FILE);
		File eleDest1 = new File("./snaps/img2.png"); //--> creates a file in project level,snaps folder in png format and stores it. .png is preferred because of its reduced size and better quality
		FileHandler.copy(eleSrc1,eleDest1); --> This is not working, please check*/
		
		//Section Screenshot
		WebElement info = driver.findElement(By.className("content"));
		File eleSrc = info.getScreenshotAs(OutputType.FILE);
		File eledst = new File("./snaps/img3.png");
		FileHandler.copy(eleSrc, eledst);
		
		driver.quit();
		
	}

}
