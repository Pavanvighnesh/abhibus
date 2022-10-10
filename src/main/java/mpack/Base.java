package mpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	WebDriver driver;

	    public WebDriver initializedriver() {
	    	String browserName="chrome";
	    	if(browserName.equalsIgnoreCase("firefox")) {
	    		WebDriverManager.firefoxdriver().setup();
	    		 driver= new FirefoxDriver();
	    		
	    	}
	    	else if(browserName.equalsIgnoreCase("chrome")) {
	    		WebDriverManager.chromedriver().setup();
	    		 driver = new ChromeDriver();
	    		 
	    	}
	    	else if(browserName.equalsIgnoreCase("InternetExplorer")) {
	    		WebDriverManager.iedriver().setup();
	    	 driver = new InternetExplorerDriver();
	    	 
	    	}
	    	driver.manage().window().maximize();
			return driver;
	    }
}

