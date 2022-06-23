package testng2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Chrometest {
  
	WebDriver driver1;
   @Test
  public void f() throws Exception {
		
		driver1.findElement(By.id("Email")).sendKeys("manohar.k584");
		  driver1.findElement(By.id("next")).submit();
		Thread.sleep(2000);
		  driver1.findElement(By.id("Passwd")).click();
		 driver1.findElement(By.id("signIn")).click(); 
		/* Thread.sleep(7200);
		 driver1.findElement(By.xpath("html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
	Thread.sleep(10000);
	
	driver1.findElement(By.id("gb_71")).click();
	Thread.sleep(1000);*/
	}
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	   System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe"); 
		driver1= new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("http://gmail.com");
		
  }

 /* @AfterTest
  public void afterTest() {
	  driver1.close();
  }*/

}
