package testng2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Mouse_hover_capture {
	//capturing about us elements in spice jet .com
	
	WebDriver driver;
	
	@Test
  public void f() throws Exception {
Thread.sleep(4000);

WebElement aboutus=driver.findElement(By.xpath("//a[text()='About Us ']")); //customised xpath worked
	//WebElement aboutus=driver.findElement(By.id("html/body/form/div[4]/div[1]/div[1]/div[2]/div[2]/div/ul/li[2]/a"));
	
//create action builder instance by passing web driver instance
	Actions builder=new Actions(driver);
	builder.moveToElement(aboutus).build().perform();
	 //perform()--it is better to use ‘perform()’ action on the main menu to hold the menu list till 
	  //the time Selenium identify the sub menu item and click on it
	 
	  //action.moveToElement(driver.findElement(By.linkText("iPads"))).click().build().perform();
	  //here it doesnt wait
	  // its better to use webdriverwait command for mouse over objects until submenu/list appears
	Thread.sleep(9000);
	driver.findElement(By.xpath("//a[text()='Careers ']")).click();;
	//driver.findElement(By.linkText("Careers ")).click();
	
	
	}
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://spicejet.com");
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
