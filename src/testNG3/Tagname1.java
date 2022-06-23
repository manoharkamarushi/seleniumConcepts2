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

public class Tagname1 {
	WebDriver driver;
 
	@Test
  public void tagnames() {
	  
		List<WebElement>links=driver.findElements(By.tagName("a"));
	  
		System.out.println(links.size());  // counts the no.of 'a' tags means hyperlinks
		// generally <a>    href="path of hyperlink"</a>   so we can get the links/paths using getAttribute("href")
	  // now i want to print the hper links one by one 
		
		for(WebElement paths:links)
		{
			String s=paths.getText();
			String s1=paths.getAttribute("href");
			System.out.println(s1+"==========>>"+s);
			
			
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
	  
	  driver.close();
  }

}
