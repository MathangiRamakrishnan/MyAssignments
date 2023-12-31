package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class tataCliq {

	public static void main(String[] args) throws IOException, InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();

		WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));

		Actions builder = new Actions(driver);

		builder.moveToElement(brands).perform();

		driver.findElement(By.xpath("//div[text()='Watches & Accessories']")).click();

		driver.findElement(By.xpath("(//div[@class='DesktopHeader__subBrandsLogoHolder']//img)[1]")).click();

		WebElement sortDropDown = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));

		Select sortBy = new Select(sortDropDown);

		sortBy.selectByVisibleText("New Arrivals");

		driver.findElement(By.xpath("//div[@class='ReactCollapse--content']/div")).click();

		List<WebElement> priceList = driver.findElements(By.xpath("//div[contains(@class, 'ProductDescription__priceHolder')]"));
		System.out.println("Price of " + priceList.size() + " watches : ");
		for (int i = 0; i < priceList.size(); i++) {
			String price = priceList.get(i).getText().replaceAll("[^0-9]", "");
			System.out.println(price);
		}

		String price = driver.findElement(By.xpath("(//div[@class='ProductModule__base'])[2]//div[@class='ProductDescription__priceHolder']/h3")).getText();
		String watchPrice = price.replaceAll("[^0-9]", "");
		System.out.println("Price of the second loaded result(watch) : " + watchPrice);

		driver.findElement(By.xpath("(//div[@class='ProductModule__base'])[2]")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> listWindow =new ArrayList<String>(windowHandles);

		driver.switchTo().window(listWindow.get(1));

		String price1 = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3")).getText();
		String watchPrice1 = price1.replaceAll("[^0-9]", "");
		System.out.println("Price of the watch : " + watchPrice1);
		if(watchPrice.equals(watchPrice1)) {
			System.out.println("Price of the watch in both the windows is same");
		}

		driver.findElement(By.xpath("(//div[@class='ProductDescriptionPage__buttonHolder'])[2]")).click();

		String bagCount = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println("Count in cart : " + bagCount);

		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();

		Thread.sleep(5000);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File Target = new File("./snap/watch.png");
		FileUtils.copyFile(source, Target);

		driver.close();
		driver.quit();
	}

}