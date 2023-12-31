package personal.works;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandlePractise {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://letcode.in/windows");
		driver.manage().window().maximize();
		driver.findElement(By.id("home")).click();

		//Go to the newly opened tab
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(list.get(1));
		
		String windowHandle = driver.getWindowHandle();
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		driver.switchTo().window(list.get(1));
		driver.close();
		
		Thread.sleep(2000);
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		list.clear();
		list.addAll(windowHandles2);
		driver.switchTo().window(list.get(0));
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		driver.findElement(By.id("multi")).click();
		
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> list1 = new ArrayList<String>(windowHandles3);
		
		System.out.println(windowHandles3);
	
		driver.switchTo().window(list1.get(2));
	
		String title2 = driver.getTitle();
		System.out.println(title2); 
		
		
		
		
		
		
	}

}
