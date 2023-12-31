package marathon3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class jira extends jiraBase {

	@BeforeTest
	public void setUp() {
		fileName = "createStory";
	}
	@Test(dataProvider = "fetchData")
	public void createStory(String inputText) throws InterruptedException {

		// click SDET-5
		driver.findElement(By.xpath("//div[@class='sc-1p2gpiw-0 jxAqSF']/a")).click();
		Thread.sleep(2000);
		// click create
		driver.findElement(By.id("createGlobalItem")).click();

		// switch focus to child window
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listWindow = new ArrayList<String>(windowHandles);
		driver.switchTo().window(listWindow.get(0));

		// enter the text input into Summary TextBox
		String summaryText = "A Summary has been given";
		driver.findElement(By.xpath("//input[@name='summary']")).sendKeys(summaryText);
		driver.findElement(By.xpath("//button[@form='issue-create.ui.modal.create-form']")).click();

		driver.switchTo().defaultContent();

		// click Backlog
		driver.findElement(By.xpath("(//div[@aria-label='PLANNING']//a)[2]")).click();
		// Search for the new created story using searchBox
		driver.findElement(By.xpath("//input[@aria-label='Search backlog']")).sendKeys(summaryText);
		Thread.sleep(2000);
		// find the input from the list
		String text = driver.findElement(By.xpath("//mark[@class='_bfhkwtfv _syaz1fxt']")).getText();
		// compare to verify
		if (text.equals(summaryText)) {
			System.out.println("Newly created story has been found in the list");
		} else {
			System.out.println("Newly created story has not been found in the list");
		}
	}
}