package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Type "Bags" in the Search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");

		// Choose the      item in the result (bags for boys)
		driver.findElement(By.xpath("//div[@class='left-pane-results-container']//div[@aria-label='bags for boys']")).click();

		// Print the total number of results (like 50000) - 1-48 of over 50,000 results for "bags for boys"
		String resultsText1 = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//span")).getText();
		String resultsText2 = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//span[@class='a-color-state a-text-bold']")).getText();
		System.out.println("Search Results : " + resultsText1 + resultsText2);

		// Select the first 2 brands in the left menu (like Skybags, American Tourister)
		driver.findElement(By.xpath("//li[@id='p_89/Skybags']//a")).click();
		driver.findElement(By.xpath("//li[@id='p_89/American Tourister']//a")).click();

		// Choose New Arrivals (Sort)
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.linkText("Newest Arrivals")).click();

		// Print the first resulting bag info (name, discounted price)
		String bagInfo = driver.findElement(By.xpath("//div[@data-component-type='s-search-result']//a//span")).getText();
		System.out.println("Bag Name : " + bagInfo);

		String currencySymbol = driver.findElement(By.xpath("//div[@class='a-row a-size-base a-color-base']//span[@class='a-price-symbol']")).getText();
		String bagPrice = driver.findElement(By.xpath("//div[@class='a-row a-size-base a-color-base']//span[@class='a-price-whole']")).getText();

		System.out.println("Bag Price : " + currencySymbol + bagPrice);

		// Get the page title and close the browser(driver.close())
		String pageTitle = driver.getTitle();
		System.out.println("Title of the Page : " + pageTitle);
		

	}

}