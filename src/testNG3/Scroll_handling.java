package testNG3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll_handling {
	
	WebDriver driver;
	
	@Test
  public void flipkart_scroll() {
		// like Actions class JavaScriptExecutor is also not a webdriver class , so we need to do typecasting-converting 
		//webdriver instance into javascriptexecutor instance
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,550)");  // scrolls to required position in pixels
				
		
  }
  
	
	@BeforeTest
  public void beforeTest() throws Exception {
		driver=new FirefoxDriver();
	  driver.get("http://flipkart.com");
	  //Thread.sleep(5000);
	driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	  
	
	 
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
