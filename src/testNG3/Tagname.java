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

public class Tagname {
	WebDriver driver;
  @Test
  public void tags() {
	  
	  List<WebElement>pagelinks=driver.findElements(By.tagName("a"));
	  
	  int psize=pagelinks.size();
	  
	  for(WebElement eachlink:pagelinks)
	  {
		  if(!eachlink.getText().isEmpty()){  // skips if empty links are available
		  String linktext=eachlink.getText();
		  String linkhref=eachlink.getAttribute("href");
		  
		  System.out.println(linktext+"------------->>>"+linkhref);
		  }
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver=new FirefoxDriver();
	  driver.get("https://in.yahoo.com/");
	  driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
