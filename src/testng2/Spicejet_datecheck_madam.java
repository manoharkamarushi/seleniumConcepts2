package testng2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Spicejet_datecheck_madam {
  
	WebDriver driver;
	
	@Test
  public void trip() {
		String s1=driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).getAttribute("value");
		System.out.println(s1);
		
		if(s1.equalsIgnoreCase("roundtrip"))
		{
			System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).getAttribute("name"));
			 System.out.println(driver.findElement(By.id("ctl00_mainContent_txt_Todate")).getAttribute("name"));
			
		}
  }
  
	@BeforeTest
  public void beforeTest() {
  driver=new FirefoxDriver();
  driver.get("http://spicejet.com");
  }

  
  @AfterTest
  public void afterTest() throws Exception {
Thread.sleep(1000);
	  driver.close();
  
  
  }

}
