package testng2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.interactions.Actions;


public class Spicejet_Aboutus_elements {// go to mouse hover capture script
	
	WebDriver driver;  // am unable to capture the list :( ask pratap
  @Test
  public void Aboutus() throws Exception {
	  /*List<WebElement>about=driver.findElements(By.xpath("html/body/form/div[4]/div[1]/div[1]/div[2]/div[2]/div/ul/li[2]/ul/li[1]/ul/li[2]/a"));
	  System.out.println(about.size());*/
	  
	  WebElement aboutus=driver.findElement(By.xpath("//a[text()='About Us ']"));
	 // Actions builder=new Actions(driver).contextClick(aboutus);  for right click on a particular element 
      
	  Actions builder=new Actions(driver);
	  builder.moveToElement(aboutus).build().perform();
	 
  }
	  
    @BeforeTest
  public void launch() throws Exception {
	  
	  driver=new FirefoxDriver();
   driver.get("http://spicejet.com");
  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
  }
    
  @AfterTest
  public void afterTest() {
	  driver.close();
  
  }

}
