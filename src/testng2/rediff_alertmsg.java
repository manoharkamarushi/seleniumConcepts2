package testng2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class rediff_alertmsg {
	
	WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  	Thread.sleep(2000);
	 // driver.findElement(By.partialLinkText("rediffmail")).click();
	  	driver.findElement(By.xpath("html/body/div[2]/div[5]/a[1]/div/u")).click();
	  Thread.sleep(3000);
	  
	    boolean value= driver.findElement(By.id("remember")).isSelected();
	    if (value=true)
	    {
	    	driver.findElement(By.id("remember")).click();
	    	System.out.println("-------------------"+value);
	    }
	    
	    Thread.sleep(2000);
	    driver.findElement(By.name("proceed")).click();
	   
	   //  Alert class which is required to handle the web based alerts in WebDriver
	   Alert  al= driver.switchTo().alert(); //captures alert message on a page
	   System.out.println(al.getText());// storing & printing on console
	   System.out.println("-------------------");
	   
	   Thread.sleep(2000);
	     
	   al.dismiss();// closes message
	   //al.accept();// accepts message 0k
	      
	    }
  @BeforeTest
  public void beforeTest() {
	  		driver=new FirefoxDriver();
	  		driver.get("http://rediff.com");
	  		
  
  }

  @AfterTest
  public void afterTest() {
	 // driver.close();
  }

}
