package testng4;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Hotmail_Compose {
	
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  	driver.findElement(By.id("i0116")).sendKeys("aniltadepalli.569@outlook.com");
		driver.findElement(By.id("i0118")).sendKeys("anil1990");
		driver.findElement(By.id("idChkBx_PWD_KMSI0Pwd")).click();
		driver.findElement(By.id("idSIButton9")).click();
		driver.manage().timeouts().pageLoadTimeout(150, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='New']")).click();  //for new button ,worked
		//driver.findElement(By.xpath("//a[@id='NewMessage']/descendant::span[text()='New']")).click(); //worked too
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		//for 'to' field
		driver.findElement(By.xpath("//textarea[contains(@aria-label,'To field: Enter an email address or any name in your contact list')]")).sendKeys("manohar.k584@gmail.com");
		//for subject
		driver.findElement(By.xpath("//input[contains(@aria-label,'Message subject')]")).sendKeys("hi");
  
		
		
		
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
