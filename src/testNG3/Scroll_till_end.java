package testNG3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Scroll_till_end {
	
WebDriver driver;

@Test
  public void f() throws Exception{
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	for(int i=0;;i++)
	{
		if(i>=80){ break;}
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(1000);
		
	}
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://flipkart.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
