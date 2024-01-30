package scenario.questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTextBoxCount {
    public static void main(String[] args) {

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the Facebook sign-up page
        driver.get("https://www.facebook.com");

        // Identify the locator for text boxes using XPath
        By textBoxLocator = By.xpath("//input[@type='text']");

        // Find all text boxes using the specified locator
        java.util.List<WebElement> textBoxes = driver.findElements(textBoxLocator);

        // Get the count of text boxes
        int textBoxCount = textBoxes.size();

        // Print the count
        System.out.println("Total number of text boxes on Facebook sign-up page: " + textBoxCount);

    }
}

