package marathon3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cheapOAir {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cheapoair.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Thread.sleep(40000);
		driver.findElement(By.xpath("//div[@class='modal-close-icon']")).click();
		driver.findElement(By.xpath("(//div[@class='widget__triptype']//div)[2]")).click();
		
		driver.findElement(By.id("from0")).click();
		driver.findElement(By.id("from0")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("from0")).sendKeys("Chennai", Keys.ENTER);
		driver.findElement(By.xpath("(//ul[@class='suggestion-box__list autoSuggest__list']/li)[2]")).click();

		driver.findElement(By.id("from0")).click();
		driver.findElement(By.id("to0")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("to0")).sendKeys("Bengaluru", Keys.ENTER);
		driver.findElement(By.xpath("(//ul[@class='suggestion-box__list autoSuggest__list']/li)[2]")).click();

		driver.findElement(By.id("cal0")).click();
		driver.findElement(By.xpath("//a[@class=' month-date is--today']")).click();

		int count = 2;

		if(count==2) {
			driver.findElement(By.id("travellerButton")).click();
			driver.findElement(By.id("addadults")).click();
			driver.findElement(By.id("closeDialog")).click();
		}
		driver.findElement(By.id("searchNow")).click();
		driver.findElement(By.xpath("//button[text()='See Flights Only']")).click();
		driver.findElement(By.xpath("//li[@class='p-0 sort-tab__item tabHeight tabWidth is--tab-cheapest ']/a")).click();

		List<WebElement> priceList = driver.findElements(By.xpath("//span[@class='currency ']"));
		Thread.sleep(3000);
		System.out.println("Sorted Prices List :");
		for (int i = 0; i < priceList.size(); i++) {
			priceList.get(i).getAttribute("title");
		}

		// driver.findElement(By.xpath("//div[@class='fare-details__select']/button"));
	}
}