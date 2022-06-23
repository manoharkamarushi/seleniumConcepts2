package testng2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class GmailLogout {
  
	 WebDriver driver;
	
	@Test
  public void f() throws Exception {
		
		 driver.findElement(By.id("Email")).sendKeys("manohar.k584");
		  driver.findElement(By.id("next")).submit();
		  		Thread.sleep(2000);
		  		
		  driver.findElement(By.id("Passwd")).sendKeys("silverstar");
		 driver.findElement(By.id("signIn")).click(); 
	Thread.sleep(50000);
	
	driver.findElement(By.xpath("html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
	driver.findElement(By.id("gb_71")).click();
	
	
	}
  
    @BeforeTest
  public void beforeTest() throws Exception {
	  
	  driver= new FirefoxDriver();
	 // driver.navigate().to("http://gmail.com");
	  driver.get("http://gmail.com");
	  Thread.sleep(2000);
	  
  }

  @AfterTest
  public void afterTest() throws Exception {
  Thread.sleep(1000);
  driver.close();
         
  }

}
