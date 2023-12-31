package personal.works;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://letcode.in/windows");
		driver.manage().window().maximize();
		String windowHandle = driver.getWindowHandle();
		System.out.println("First window :" + windowHandle);
		driver.findElement(By.id("home")).click();
		
		// To check if new tab is opened
		//getWindowHandle() --> returns for parent window
		//getWindowHandles() --> returns for all the window
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		// As we cannot use get() in set, this has to be converted to list
		
		System.out.println(windowHandles); //It provides 2 array values in ID --> 1st ID belongs to 1st tab and 2nd ID belongs to 2nd tab
		
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.switchTo().window(list.get(0)); // get(0)--> Parent window
		String currentUrl1 = driver.getCurrentUrl();
		System.out.println(currentUrl1);
		driver.close();
		
	
	}

}
