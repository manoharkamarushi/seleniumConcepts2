package testNG3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class WindowHandle_multiple {
	WebDriver driver;
  @Test
  public void Mul_windows() {
	  
	  String mainwindow=driver.getWindowHandle();
	  System.out.println(mainwindow);
	  	  driver.findElement(By.id("button1")).click();
	  	  
	  	 driver.manage().window().maximize();
	  	 
	  Set<String>secondwindow= driver.getWindowHandles();
	  
	  for(String s:secondwindow)
		 {
				 driver.switchTo().window(s);
				 System.out.println(driver.getTitle());
				 				 
				  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				 driver.manage().window().maximize();
									 
				  WebElement demohover=driver.findElement(By.xpath("//span[text()='DEMO SITES']"));
				   Actions builder=new Actions(driver);
					builder.moveToElement(demohover).build().perform();
					
		           driver.findElement(By.xpath("//span[text()='Automation Practice Switch Windows']")).click();
		
		}
	  
	 
		
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  driver=new FirefoxDriver();
	  driver.get("http://toolsqa.com/automation-practice-switch-windows");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  // driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
