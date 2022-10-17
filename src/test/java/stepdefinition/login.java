package stepdefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
	WebDriver driver;
	@Before
	public void set_up(){

		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();	
	}
		
	@Given("navigates to abhibus website")
    public void navigates_to_abhibus_website() {
		driver.get("https://www.abhibus.com/");
	 	  driver.manage().window().maximize();
    }

    @When("i click on login")
    public void i_click_on_login() throws InterruptedException {
    	 WebElement acclogin = driver.findElement(By.id("AccLogin"));
	 	   acclogin.click();
	 	  Thread.sleep(2000);
    }

    @Then("i enter mobile number")
    public void i_enter_mobile_number() throws InterruptedException  {
    	WebElement mobileno2=driver.findElement(By.id("mobileNo"));
	 	   mobileno2.sendKeys("7993543979");
	 	   Thread.sleep(2000);
    }

    @And("i click on login or signup with otp")
    public void i_click_on_login_or_signup_with_otp()  {
    	 WebElement otp=driver.findElement(By.id("getotp"));
	 	   otp.click();
        
    }
}

