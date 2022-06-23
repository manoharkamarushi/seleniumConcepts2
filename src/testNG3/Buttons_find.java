package testNG3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Buttons_find {
	WebDriver driver;
  @Test
  public void button_count_names() {
	  
	  List<WebElement>buttons=driver.findElements(By.tagName("button"));	  
	  System.out.println( buttons.size()); 
 
for(WebElement we:buttons)
  {
	  
	  we.getAttribute("id");
  }
  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver=new FirefoxDriver(); 
	   driver.get("http://spicejet.com");
	   driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
 }


  @AfterTest
  public void afterTest() {
  }

}
