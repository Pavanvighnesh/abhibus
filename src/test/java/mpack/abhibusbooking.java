package mpack;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class abhibusbooking extends Base {
	 WebDriver driver;
	 @Test
	 public void login() throws InterruptedException {
	 	driver=initializedriver();
	 	System.out.println("browser is initialized");
	 	 driver.get("https://www.abhibus.com/");
	 	  driver.manage().window().maximize();
	 	   WebElement acclogin = driver.findElement(By.id("AccLogin"));
	 	   acclogin.click();
	 	   Thread.sleep(2000);
	 	   WebElement mobileno2=driver.findElement(By.id("mobileNo"));
	 	   mobileno2.sendKeys("7993543979");
	 	   WebElement otp=driver.findElement(By.id("getotp"));
	 	   otp.click();
	 	   driver.close();
	 }

	
	@Test
	 public void abhibusbooking() throws IOException, InterruptedException {
		  driver=initializedriver();
		 driver.get("https://www.abhibus.com/");
		  driver.manage().window().maximize();
		  File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(screenshotFile, new File("screenshots\\screenshot1.jpg")); 
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
		 WebElement calender= driver.findElement(By.id("datepicker1"));
		  calender.click();
		  Thread.sleep(2000);
		  WebElement date= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[3]/td[6]/a"));
		 date.click(); 
		 WebElement search=driver.findElement(By.xpath("//a[@class='btn btn-main px-5 py-2 border-right-radius']"));
		 search.click();
		 Thread.sleep(2000);
		 WebElement click=driver.findElement(By.xpath("//*[@id=\"ShowBtnHide01\"]"));
		   click.click();
		 WebElement selectbus= driver.findElement(By.id("1272890164"));
		  selectbus.click();
		  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 WebElement Boardingpoint=driver.findElement(By.id("pickup_id"));
		 Select select=new Select(Boardingpoint);
         select.selectByVisibleText("Amalapuram-17:00");
	     
	     WebElement Droppingpoint=driver.findElement(By.id("drop_id"));
	          Select select1=new Select(Droppingpoint);
	          select1.selectByVisibleText("Old Gajuwaka-22:50");
	          
	    WebElement Generalpublic=driver.findElement(By.id("concession"));
	    Select select2=new Select(Generalpublic);
	    select2.selectByVisibleText("GENERAL PUBLIC");
	    
	    WebElement showlayout=driver.findElement(By.id("btnEnable11"));
	     showlayout.click(); 
	    
	     WebElement element = driver.findElement(By.id("O5-3ZZ"));
	     element.click();
	     
	    WebElement continuepay=driver.findElement(By.id("btnEnable1"));
	        continuepay.click();
	        WebElement mobile=driver.findElement(By.id("mobileNumber"));
	        mobile.sendKeys("7993543979");
	       
	        WebElement mail=driver.findElement(By.id("EmailID"));
	        mail.sendKeys("vighneshkumar@gmail.com");
	       
	        WebElement mobileno=driver.findElement(By.id("Mobile_No"));
	        mobileno.sendKeys("7993543979");
	       
	        WebElement name=driver.findElement(By.id("adultname0"));
	        name.sendKeys("B.pavan vighnesh kumar");
	       
	        WebElement age=driver.findElement(By.id("adultage0"));
	        age.sendKeys("21");
	      
	        WebElement payment=driver.findElement(By.id("paynow"));
	        payment.click();
	        
	    File screenshotFile2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshotFile2, new File("screenshots\\screenshot2.jpg"));
		 driver.quit();
	 } 


	
}


