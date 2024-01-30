package scenario.questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelection {
    public static void main(String[] args) throws InterruptedException {
        
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to your webpage
        driver.get("https://www.html-code-generator.com/html/drop-down/country-names");

        // Identify the dropdown element using its locator (replace with your own)
        WebElement dropdownElement = driver.findElement(By.id("condi"));

        // Create a Select object
        Select select = new Select(dropdownElement);

        // Get all options from the dropdown
        java.util.List<WebElement> options = select.getOptions();

        // Iterate through each option
        for (WebElement option : options) {
            // Click the option
            option.click();

            // Print the selected option's text
            System.out.println("Selected option: " + option.getText());

             Thread.sleep(1000);
        }

    }
}

