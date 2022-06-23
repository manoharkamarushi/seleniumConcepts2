package testng4;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class Assert_commands {
	
		WebDriver driver;
		WebDriverBackedSelenium se=new WebDriverBackedSelenium(driver,"http://www.google.com.au");
	
 
@Test
  public void google_australia() {
	    driver.get("http://www.google.com.au");
	    driver.findElement(By.name("q")).sendKeys("selenium wiki");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	   try{
		   Assert.assertTrue(se.isTextPresent("selenium wiki"));
		   System.out.println("selenium wiki is present on google au");
		   
	   }catch(Exception e)
	   {
		   System.out.println("no present");
	   }
  }
}
