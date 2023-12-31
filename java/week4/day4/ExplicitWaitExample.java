package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

    public static void main(String[] args) {
       
        WebDriver driver = new ChromeDriver();
        driver.get("https://leafground.com/window.xhtml");

        // Click on the button "Open with delay"
        WebElement openWithDelayButton = driver.findElement(By.xpath("//span[text()='Open with delay']"));
        openWithDelayButton.click();

        // Apply explicit wait using numberofWindowsToBe
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));

        // Get the title of the second window
        // Get the handles of all windows
        for (String windowHandle : driver.getWindowHandles()) {
            // Switch to the second window
            driver.switchTo().window(windowHandle);
        }

        String secondWindowTitle = driver.getTitle();
        System.out.println("Title of the second window is: " + secondWindowTitle);

    }
}


