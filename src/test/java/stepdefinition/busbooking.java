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
import io.github.bonigarcia.wdm.WebDriverManager;

public class busbooking {
	WebDriver driver;
	@Before
	public void set_up(){

		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();	}
	@Given("navigates to abhibus website.")
    public void navigates_to_abhibus_website() {
		driver.get("https://www.abhibus.com/");
	 	  driver.manage().window().maximize();
    }
	@Then("i should enter source and destination.")
	public void i_should_enter_source_and_destination() throws InterruptedException {
		 WebElement from = driver.findElement(By.id("source"));
		   from.sendKeys("Amalapuram");
		   Thread.sleep(2000);
		   from.sendKeys(Keys.ENTER);
		   Thread.sleep(2000);
		   WebElement to=driver.findElement(By.id("destination"));
		   to.sendKeys("vizag");
		   Thread.sleep(2000);
		   to.sendKeys(Keys.ENTER);
		   Thread.sleep(2000);
		   
	}
	@Then("i should select the Journey date.")
	public void i_should_select_the_Journey_date() throws InterruptedException {
		WebElement calender= driver.findElement(By.id("datepicker1"));
		  calender.click();
		  Thread.sleep(2000);
		  WebElement date= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[4]/td[6]/a"));
		 date.click(); 
	}
	@Then("i click on Search button.")
	public void i_click_on_Search_button() throws InterruptedException {
		WebElement search=driver.findElement(By.xpath("//a[@class='btn btn-main px-5 py-2 border-right-radius']"));
		 search.click();
		 Thread.sleep(2000);
	}
	 @Then("i click showmore buses button.")
	    public void i_click_showmore_buses_button() throws Throwable {
		 WebElement click=driver.findElement(By.xpath("//*[@id=\"ShowBtnHide01\"]"));
		   click.click();
	    }


	    @Then("i should click on select Seat.")
	    public void i_should_click_on_select_seat() throws Throwable {
	    	WebElement selectbus= driver.findElement(By.id("1269731498"));
			  selectbus.click();
	    }

	    @Then("i should select the boarding point and dropping point.")
	    public void i_should_select_the_boarding_point_and_dropping_point() throws Throwable {
	    	//WebElement Boardingpoint=driver.findElement(By.id("pickup_id"));
			 //Select select=new Select(Boardingpoint);
	         //select.selectByVisibleText("Red Bridge-18:25");
	         //Thread.sleep(2000);
	    
		     WebElement Droppingpoint=driver.findElement(By.id("drop_id"));
		          Select select1=new Select(Droppingpoint);
		          select1.selectByVisibleText("Old Gajuwaka-00:00");
		          WebElement Generalpublic=driver.findElement(By.id("concession"));
		  	    Select select2=new Select(Generalpublic);
		  	    select2.selectByVisibleText("GENERAL PUBLIC");
		  	 
		  	  WebElement showlayout=driver.findElement(By.id("btnEnable11"));
			     showlayout.click(); 
			     Thread.sleep(2000);
	   
	    	WebElement element = driver.findElement(By.id("O5-10ZZ"));
		     element.click();
		     
	    }

	    @Then("i should click on Continue to payment.")
	    public void i_should_click_on_continue_to_payment() throws Throwable {
	    
	    }
	  
	    public void i_should_click_on_paynow() throws Throwable {
	    	WebElement continuepay=driver.findElement(By.id("btnEnable1"));
	        continuepay.click();
	    }

	    @And("i should enter the mobile number.")
	    public void i_should_enter_the_mobile_number() throws Throwable {
	    	WebElement mobile=driver.findElement(By.id("mobileNumber"));
	        mobile.sendKeys("7993543979");  
	    }

	    @And("i should enter the email Id and mobile number.")
	    public void i_should_enter_the_email_id_and_mobile_number() throws Throwable {
	    	WebElement mail=driver.findElement(By.id("EmailID"));
	        mail.sendKeys("vighneshkumar@gmail.com"); 
	        WebElement mobileno=driver.findElement(By.id("Mobile_No"));
	        mobileno.sendKeys("7993543979");
	    }

	    @And("i should enter  name and age.")
	    public void i_should_enter_name_and_age() throws Throwable {
	    	WebElement name=driver.findElement(By.id("adultname0"));
	        name.sendKeys("B.pavan vighnesh kumar");
	       
	        WebElement age=driver.findElement(By.id("adultage0"));
	        age.sendKeys("21");
	       
	    }
	    @Then("i should click on Paynow.")
	    public void i_should_click_on_paynow1() throws Throwable {
	    	 WebElement payment=driver.findElement(By.id("paynow"));
		        payment.click();
	    

	}
	    
	    
}


