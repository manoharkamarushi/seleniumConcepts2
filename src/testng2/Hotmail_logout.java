package testng2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Hotmail_logout {
	
	WebDriver driver;
	
  @Test
  public void f() throws Exception{
	  		driver.findElement(By.id("i0116")).clear();
	  		Thread.sleep(1000);
	  		driver.findElement(By.id("i0116")).sendKeys("manohar.kamarushi@gmail.com");
	  
	  		driver.findElement(By.id("i0118")).clear();
	  		Thread.sleep(1000);
	  		driver.findElement(By.id("i0118")).sendKeys("pandu@584");
	  		
	  		driver.findElement(By.id("idChkBx_PWD_KMSI0Pwd")).click();
	  		
	  		driver.findElement(By.id("idSIButton9")).submit();
	  		Thread.sleep(10000);
	  		//driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/div[2]/span/span/a/span/span")).click();
	  		//driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/ul/li[9]/a/span[1]/img")).click();
	  		driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/div[1]/a/span/img")).click();
	  		driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div/div[2]/div[1]/div/div/div[2]/ul[1]/li/ul/li[1]/span/span/span/span[1]/span/span")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver=new FirefoxDriver();
	  driver.get("http://hotmail.com");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
