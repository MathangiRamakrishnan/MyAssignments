package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class abhiBus {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Click on Bus
		driver.findElement(By.id("pills-home-tab")).click();

		// Type "Chennai" in the FROM text box
		driver.findElement(By.id("source")).sendKeys("Chennai");

		// Click the first option from the pop up box
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();

		// Type "Bangalore" in the TO text box
		driver.findElement(By.id("destination")).sendKeys("Bangalore");

		// Click the first option from the pop up box
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();

		// Select tomorrow's date in the Date field
		driver.findElement(By.id("datepicker1")).click();
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[contains(text(),\"26\")]")).click();

		// Click Search Buses
		driver.findElement(By.xpath("//a[text()='Search']")).click();

		// Print the name of the first resulting bus (use .getText())
		String firstResultText = driver.findElement(By.xpath("(//div[@id='SerVicesDetOnewayInner']//h2[contains(text(),\"Yolo Bus\")])[1]")).getText();
		System.out.println("First Resulting Bus Service Name : " + firstResultText);

		// Choose SLEEPER in the left menu from Bus Type
		driver.findElement(By.xpath("//input[@title='SLEEPER']")).click();

		// Print the first resulting bus seat count(Example:35 Seats Available)(use .getText())
		String seatsAvailableText = driver.findElement(By.xpath("(//div[@id='SerVicesDetOnewayInner']//p[@class='noseats AvailSts ng-binding'])[1]")).getText();
		System.out.println("Seats Available : " + seatsAvailableText);

		// Click SelectSeat
		driver.findElement(By.xpath("(//div[@id='SerVicesDetOnewayInner']//span[contains(text(),'Select Seat')])[1]")).click();

		// Choose any one Available seat
		driver.findElement(By.id("UO4-1ZZ")).click();

		// Print Seats Selected ,Total Fare
		String seatsSelectedText = driver.findElement(By.xpath("//div[@class='jurnydetails']//span[@id='seatnos']")).getText();
		System.out.println("Seat Selected : " + seatsSelectedText);
		String seatFareText = driver.findElement(By.xpath("//div[@class='jurnydetails']//span[@id='ticketfare']")).getText();
		System.out.println("Seat Fare : " + seatFareText);

		// Select Boarding Point  and Dropping Point (Select class)
		WebElement boardingPointElement = driver.findElement(By.id("boardingpoint_id"));
		Select boardingPoint = new Select(boardingPointElement);
		boardingPoint.selectByIndex(2);

		WebElement droppingPointElement = driver.findElement(By.id("droppingpoint_id"));
		Select droppingPoint = new Select(droppingPointElement);
		droppingPoint.selectByIndex(4);

		// Get the Title of the page(use .getTitle())
		String title = driver.getTitle();
		System.out.println("Title of the page : " + title);
	}
}