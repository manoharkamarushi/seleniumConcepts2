package testNG3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Frame_not_available {
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver.findElement(By.linkText("Autocomplete")).click();
	   driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	    driver.findElement(By.id("tags")).sendKeys("denom");
	    
	    driver.switchTo().defaultContent();
	    
	    driver.findElement(By.linkText("Sortable")).click();
	    System.out.println(driver.getCurrentUrl());	
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver=new FirefoxDriver();
	  driver.get("https://jqueryui.com/autocomplete/");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

  @AfterTest
  public void afterTest() {
  
  }

}
