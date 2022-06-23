 package testng4;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class HtmlTable_capture {
 
	WebDriver driver;
	
	@Test
  public void table() {
		
		String s=driver.findElement(By.xpath("html/body/table/tbody/tr[3]/td[2]")).getText();
		
		System.out.println();
		System.out.println(s);
		
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("file:///C:/Users/manu/Desktop/table.htm");
	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
