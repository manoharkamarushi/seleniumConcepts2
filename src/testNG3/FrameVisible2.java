package testNG3;
//done
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class FrameVisible2 {
	WebDriver driver;
	
	@Test
  public void f() {
		
		driver.switchTo().frame("iframe1");
		//driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div/div/form/fieldset/div[1]/input[1]")).sendKeys("manohar");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("iframe2");
		driver.findElement(By.linkText("ToolsQA")).click();
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://toolsqa.com/iframe-practice-page/");
	  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
