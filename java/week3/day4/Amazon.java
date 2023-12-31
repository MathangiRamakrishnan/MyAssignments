package week3.day4;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Amazon {

	public static void main(String[] args) {
		
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
				
		// Load the url
		driver.get("https://www.amazon.in/");
				
		//Maximize the window
		driver.manage().window().maximize();
		
		//Search
		WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
		searchField.sendKeys("Phones");
		searchField.submit();
		
		//Find Phone Prices
		List<WebElement> phonePrices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		// Get price values
        List<Integer> priceValues = new ArrayList<Integer>();
        for (WebElement priceElement : phonePrices) {
            String priceText = priceElement.getText().replaceAll("[^0-9]", ""); // Extract only digits
            int price = Integer.parseInt(priceText);
            priceValues.add(price);
        }

        // Sort the list
        Collections.sort(priceValues);

        // Get the lowest price
        int lowestPrice = priceValues.get(0);

        // Print the lowest price
        System.out.println("The lowest mobile phone price on Amazon is: Rs. " + lowestPrice);

        // Close the browser
     //    driver.quit();
    }
		
		
		

	}

	
