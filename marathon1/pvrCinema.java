package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class pvrCinema {

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
		driver.findElement(By.xpath("//li[@class='sidebar-list-item']//a[contains(text(),'Movie Library')]")).click();

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

		// Click on first resulting animation movie
		driver.findElement(By.xpath("//div[@class='modal-content']//button[@class='btn btn-submit btn-primary']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='movie-wrapper ng-star-inserted']/img")).click();
		Thread.sleep(5000);

		// Click proceed to book
		driver.findElement(By.xpath("//div[@class='header-info-fixed']//button[contains(text(),'Proceed To Book')]")).click();
		Thread.sleep(5000);

		// Enter  all  the fields  cinema , Name, date, Prefered show time, no of seats, food and beverages,Email and Mobile
		WebElement cinemaNameDropdown = driver.findElement(By.xpath("//select[@name='cinemaName']"));
		Select cinemaName = new Select(cinemaNameDropdown);
		cinemaName.selectByIndex(3);

		driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']")).click();
		driver.findElement(By.xpath("//span[@class='day-unit ng-star-inserted']")).click();

		WebElement timingsDropdown = driver.findElement(By.xpath("//select[@name='timings']"));
		Select timings = new Select(timingsDropdown);
		timings.selectByValue("12:00 PM - 03:00 PM");

		driver.findElement(By.name("noOfTickets")).sendKeys("2");
		driver.findElement(By.name("name")).sendKeys("Radhakrishnan");
		driver.findElement(By.name("email")).sendKeys("kradha158@gmail.com");
		driver.findElement(By.name("mobile")).sendKeys("8220869911");

		WebElement foodDropdown = driver.findElement(By.xpath("//select[@name='food']"));
		Select food = new Select(foodDropdown);
		food.selectByValue("Yes");

		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("No Thanks!!!");

		// Click on copy to self
		driver.findElement(By.xpath("//div[@class='form-group col-sm-6']")).click();

		// Click on  Send Request
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();

		// Click cancel
		driver.findElement(By.xpath("(//button[contains(text(),'CANCEL')])[2]")).click();

		// Close the OTP dialog
		driver.findElement(By.xpath("//button[@aria-label='Close this dialog']")).click();

		// Verify the ttile of the page
		String title = driver.getTitle();
		System.out.println("Title of the page : " + title);
	}

}