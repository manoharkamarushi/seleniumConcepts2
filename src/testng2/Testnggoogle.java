package testng2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
//import org.testng.TestNGException;

public class Testnggoogle {
	
	WebDriver driver;
  @Test
  public void f() throws Exception{
       driver.findElement(By.id("lst-ib")).sendKeys("mercury");
       driver.findElement(By.name("btnK")).submit();
         Thread.sleep(2000);
         driver.navigate().back();
   	  Thread.sleep(2000);
   	  driver.findElement(By.id("lst-ib")).sendKeys("bajukaa");
         driver.findElement(By.name("btnK")).submit();
   	    
  }
 
  @BeforeTest
  public void beforeTest() throws Exception  {
	  driver=new FirefoxDriver();
	  driver.get("http://google.com");
	  Thread.sleep(1000);
	  
  
  }
  
  
  @AfterTest
    public void afterTest() {
	  driver.close();
  }

}
