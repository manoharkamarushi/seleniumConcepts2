package testng4;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Snapdeal {
 
	WebDriver driver;
	@Test
  public void f() throws InterruptedException {

	  //driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("coolpad plus");  it sent the value to the alert window at pin code
		//driver.findElement(By.xpath("*//div/i[@title='Snapdeal.com']")).click();  // for home page snapdeal image
		Thread.sleep(5000);
		
		WebElement pin=driver.findElement(By.xpath("//input[@id='pincode-salience-check'][@type='text']"));
		pin.sendKeys("500049");
		pin.sendKeys(Keys.ENTER);
		
		//ways to refresh a page
	
		// webelement.sendKeys(Keys.F5);
		//webelement.sendKeys("\uE035"); -- ascii value of f5 key
		//driver.navigate().refresh();
		//driver.get(driver.getCurrentUrl());  calling again the same page
		//driver.navigate.to(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		//pin.sendKeys("\uE035"); not works
		//pin.sendKeys(Keys.F5); after pressing enter..we cant find webelement pin...so didnt work
			
	  // driver.navigate().refresh();  -- not worked
	  driver.get(driver.getCurrentUrl()); //-- worked	
	//  driver.navigate().to(driver.getCurrentUrl()); -- worked , as u know focus doesnt wait till the page is loaded
		
	
	     driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		/*WebDriverWait ww=new 	WebDriverWait(driver,30);
		ww.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='text']")));
	*/	
	     driver.findElement(By.xpath("//input[@type='text'][@name='keyword']")).sendKeys("screen card");
	   	
  
  }
  
	@BeforeTest
  public void beforeTest() {
	  	driver=new FirefoxDriver();
       driver.get("http://snapdeal.com");
       driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

  @AfterTest
  public void afterTest() {
  }

}
