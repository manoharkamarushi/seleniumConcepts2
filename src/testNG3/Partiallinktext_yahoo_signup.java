package testNG3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Partiallinktext_yahoo_signup {
 
	WebDriver driver;
	
	@Test
  public void f() {
		
		driver.findElement(By.partialLinkText("Sign")).click();
		//driver.findElement(By.id("login-signup")).click();
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
  }
	
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("https://login.yahoo.com/");
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
