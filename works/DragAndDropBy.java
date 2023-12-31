package personal.works;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();						
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.id("draggable"));
		Actions builder = new Actions (driver);							// builder - object name for action class
		int x = ele.getLocation().getX();
		int y = ele.getLocation().getY();
		builder.dragAndDropBy(ele, x+70, y+90).perform();
		
	}

}
