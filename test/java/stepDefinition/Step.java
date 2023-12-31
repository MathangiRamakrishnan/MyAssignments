package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step {

    public RemoteWebDriver driver;

    @Given("Launch the Browser")
    public void launch_the_browser() {
        driver = new ChromeDriver();
    }

    @Given("Load the url")
    public void load_the_url() {
        driver.get("http://leaftaps.com/opentaps/");
    }

    @Given("Enter the username")
    public void enter_the_username() {
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
    }

    @Given("Enter the password")
    public void enter_the_password() {
        driver.findElement(By.id("password")).sendKeys("crmsfa");
    }

    @When("Click on the Login Button")
    public void click_on_the_login_button() {
        driver.findElement(By.className("decorativeSubmit")).click();
        
    }

    @Then("Verify login is successful")
    public void verify_login_is_successful() {
        String title = driver.getTitle();
        if (title.contains("leaftaps")) {
            System.out.println("Title is verified");
        }
    }

    @When("Click on the crmsfa")
    public void clickCrmsfa() {
        driver.findElement(By.linkText("CRM/SFA")).click();
    }

    @When("Click on the Leads tab")
    public void clickLeads() {
    	driver.findElement(By.linkText("Leads")).click();
       
    }

    @When("Click on the Create Lead")
    public void Click_on_the_CreateLead() {
    	driver.findElement(By.linkText("Create Lead")).click();

    }

    @Given("Enter the company name")
    public void enterCname() {
    	WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
    	companyName.sendKeys("Testleaf");

    }

    @And("Enter the first name")
    public void enterFname() {
    	WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Gokul");
    }

    @And("Enter the last name")
    public void enterLname() {
    	WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Sekar");  
    }

    @When("Click on the submit button")
    public void clickSubmit() {
		WebElement createLeadButton = driver.findElement(By.className("smallSubmit"));
		createLeadButton.click();
    }

    @Then("Verify Create Lead is successful")
    public void verifyCreateLead() {
		String leadPage = driver.findElement(By.tagName("title")).getText();
		if(leadPage.contains("View Lead")) {
			System.out.println("Lead create successfully");
		}else {
			System.out.println("Lead is not created");
		}
    }

    @Given("Get the lead id")
    public void leadId() {
		String leadId_Cname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String leadId = leadId_Cname.replaceAll("[^0-9]", "");
		
		System.out.println("leadId_Cname : " +leadId_Cname);
		System.out.println("leadId : " +leadId);
    }

    @When ("Close the browser")
	public void closeBrowser() {
		driver.close();
    }	
 
    @Given ("Enter the uname")
    public void enterUName() {
    	driver.findElement(By.id("username")).sendKeys("demo");
    }



}
