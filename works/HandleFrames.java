package personal.works;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		/* driver.findElement(By.name("fname")).sendKeys("Mathangi"); --> This will throw "NoSuchElementException".
		iframe --> html tag inside another html tag is called as iframe ; 
		frame methods are the best example for overloading */

		driver.switchTo().frame(0);  //--> Selecting a frame based on the index. It can also be done using name,ID or xpath as well
		driver.findElement(By.name("fname")).sendKeys("Mathangi");
		driver.findElement(By.name("lname")).sendKeys("Aravind");
		
		driver.switchTo().frame(1);
		driver.findElement(By.name("email")).sendKeys("mathangi@gmail.com");

		//Going to change the last name without starting from first --> Just switch to parent frame
		driver.switchTo().parentFrame();
		driver.findElement(By.name("lname")).sendKeys("A");


		
		
	}

}
