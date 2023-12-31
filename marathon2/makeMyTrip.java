package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class makeMyTrip {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Thread.sleep(3000);
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		driver.findElement(By.xpath("//a[@class='close']")).click();
		Thread.sleep(3000);

		driver.switchTo().defaultContent();
		
		Actions build = new Actions(driver);
		build.moveByOffset(0, 0).click().perform();

		driver.findElement(By.xpath("//span[text()='Holiday Packages']")).click();
		driver.findElement(By.xpath("(//div[@class='appendTop30 locationModalBtn disable']/p)[2]")).click();

		driver.findElement(By.xpath("//label[@for='fromCity']/input")).click();
		driver.findElement(By.xpath("(//div[@class='citypicker_list']//li)[2]")).click();

		driver.findElement(By.xpath("//label[@for='toCity']/input")).click();
		driver.findElement(By.xpath("(//div[@class='dest-search-list']/div)[3]")).click();

		// driver.findElement(By.xpath("(//div[@class='hdsw_inner']/div)[3]")).click();
		driver.findElement(By.xpath("//div[@class='DayPicker-Day']")).click();

		// driver.findElement(By.xpath("(//div[@class='hdsw_inner']/div)[4]")).click();
		driver.findElement(By.xpath("//div[@class='pointer plus-sign-wrapper']")).click();
		driver.findElement(By.xpath("//button[@class='applyBtn']")).click();

		WebElement Slider = driver.findElement(By.xpath("//div[@class='rc-slider-handle rc-slider-handle-1']"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(Slider, 50, 0).perform();

		WebElement Slider2 = driver.findElement(By.xpath("//div[@class='rc-slider-handle rc-slider-handle-2']"));
		action.dragAndDropBy(Slider2, -200, 0).perform();

		WebElement apply = driver.findElement(By.xpath("//button[text()='APPLY']"));
		driver.executeScript("arguments[0].click();", apply);

		driver.findElement(By.id("search_button")).click();

		driver.findElement(By.xpath("//button[text()='SKIP']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[@class='close closeIcon']")).click();

		WebElement element = driver.findElement(By.xpath("//div[@class='slideItem relative']"));
		Actions action1 = new Actions(driver);
		action1.scrollToElement(element).perform();

		File source = element.getScreenshotAs(OutputType.FILE);
		File target = new File("./snap/package.png");
		FileUtils.copyFile(source, target);

		System.out.println("Title of the page : " + driver.getTitle());
		driver.close();
	}

}
