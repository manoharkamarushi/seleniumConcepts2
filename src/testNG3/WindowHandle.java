package testNG3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class WindowHandle {
	WebDriver driver;
	
  @Test(enabled=true)
  public void window_handle() {
	 
	  String mainwindow=driver.getWindowHandle();
	  System.out.println(mainwindow);
	  driver.findElement(By.xpath("html/body/div[1]/div[1]/div[5]/ul[3]/li/a/span[2]")).click();
	  
	 Set<String>secondwindow= driver.getWindowHandles();
	  
	 for(String s:secondwindow)
	 {
			 driver.switchTo().window(s);
			 System.out.println(driver.getTitle());
	}
	 Actions a=new Actions(driver);
	  
  }
 
  @BeforeTest
  public void beforeTest() {
	driver=new FirefoxDriver(); 
	   driver.get("https://www.online.citibank.co.in/products-services/online-services/internet-banking.htm");
	   driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
  }
	  
  @AfterTest
  public void afterTest() {
	  driver.close();
	  driver.quit();
  }

}
