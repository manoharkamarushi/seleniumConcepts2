package pageobjects_yahoo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Yahoo_testable_objects {
  WebDriver driver;
	
  @Test
  public void f() {
  
	  driver=new FirefoxDriver();  
	  driver.get("http://yahoomail.com");
	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  
	  // calling code of registration page
  
	  Yahoo_mulTestCases.verifysingup(driver);
	  
	  driver.navigate().back();
  
  }
 
}
