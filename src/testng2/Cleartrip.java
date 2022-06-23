package testng2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;


public class Cleartrip {

	WebDriver driver;
	@Test
  public void f() throws Exception {
	Thread.sleep(5000);	
	driver.findElement(By.linkText("18")).click(); // cant access
	
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver.get("http://cleartrip.com");
  }

  @AfterTest
  public void afterTest() {

  driver.close();
  }

}
