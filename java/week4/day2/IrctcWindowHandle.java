package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcWindowHandle {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		//Click flights icon
		driver.findElement(By.linkText("FLIGHTS")).click();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> windowHandles = new ArrayList<>(windowHandles1);
		
		String title = driver.switchTo().window(windowHandles.get(1)).getTitle();
		System.out.println(title);
		driver.switchTo().window(windowHandles.get(0)).close();
		
	}
}


