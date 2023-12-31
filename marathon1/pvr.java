package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class pvr {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Click the sandwich(menu) bar
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();

		// Click on Movie Library
		driver.findElement(By.xpath("//ul[@class='sidebar-list']//a[contains(text(),'Movie Library')]")).click();

		Thread.sleep(5000);

		// Select the City --> Chennai
		WebElement cityDropdown = driver.findElement(By.name("city"));
		Select city = new Select(cityDropdown);
		city.selectByValue("Chennai");

		// Select the Genre-->Animation
		WebElement genreDropdown = driver.findElement(By.name("genre"));
		Select genre = new Select(genreDropdown);
		genre.selectByVisibleText("ANIMATION");

		// Select the Language-->english
		WebElement languageDropdown = driver.findElement(By.name("lang"));
		Select language = new Select(languageDropdown);
		language.selectByVisibleText("ENGLISH");

		// Click Apply
		driver.findElement(By.xpath("//button[@class = 'btn btn-submit btn-primary']")).click();

		Thread.sleep(5000);

		// Click on first resulting animation movie

		/*driver.findElement(By.xpath("(//div[@class='movie-list']//div[@class='movie-wrapper ng-star-inserted'])[1]")).click(); -- this can't intercept 
		the element in DOM - throws ElementClickInterceptedException */

		driver.findElement(By.xpath("//div[@class = 'movie-wrapper ng-star-inserted']/img")).click();

		Thread.sleep(5000);

		// Click proceed to book
		driver.findElement(By.xpath("//div[@class='header-info-fixed']//button[contains(text(),'Proceed To Book')]")).click();
		Thread.sleep(5000);

		WebElement cinemaNameElement = driver.findElement(By.name("cinemaName"));
		Select cinemaName = new Select(cinemaNameElement);
		cinemaName.selectByVisibleText("PVR Theyagaraja Thiruvanmiyur Chennai");
	}

}