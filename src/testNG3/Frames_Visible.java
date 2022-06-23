package testNG3;
//done
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Frames_Visible {  
	
	WebDriver driver;

  @Test
  public void f() {
	 driver.switchTo().frame("packageListFrame");
	 driver.findElement(By.linkText("org.openqa.selenium.ie")).click();
	 driver.switchTo().defaultContent();  // surely u should back to defualtcontent
	 driver.switchTo().frame("packageFrame");
	 driver.findElement(By.linkText("InternetExplorerDriverService.Builder")).click();
	  
  }
 
  
  @BeforeTest
  public void beforeTest() {
	  
	 driver=new FirefoxDriver();
	 driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	// driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS); 
		  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }

}
