package scenario.questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DropdownUniqueValues {
    public static void main(String[] args) {
       
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to your webpage
        driver.get("https://chercher.tech/practice/dropdowns");

        // Locate the dropdown element by its locator (replace with your own)
        WebElement dropdownElement = driver.findElement(By.id("animals"));

        // Create a Select object
        Select select = new Select(dropdownElement);

        // Get all options from the dropdown
        List<WebElement> options = select.getOptions();

        // Use Set to store unique values
        Set<String> uniqueValues = new HashSet<>();

        // Iterate through options and store unique values
        for (WebElement option : options) {
            uniqueValues.add(option.getText());
        }

        // Print unique values
        for (String value : uniqueValues) {
            System.out.println(value);
        }

    }
}

