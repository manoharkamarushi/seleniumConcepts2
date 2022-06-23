package testng2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class IEtest {
	
	WebDriver driver1;
	
  @Test
  public void f() throws Exception {
	  
	  driver1.findElement(By.id("Email")).sendKeys("manohar.k584");
	  driver1.findElement(By.id("next")).submit();
	  Thread.sleep(2000);
	 
	  driver1.findElement(By.id("Passwd")).sendKeys("silverstar");
	 driver1.findElement(By.id("signIn")).click(); 
	 Thread.sleep(120000);
	
	 driver1.findElement(By.xpath("html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
	 driver1.findElement(By.id("gb_71")).click();
		Thread.sleep(2000);
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception{
	  System.setProperty("webdriver.ie.driver","E:\\IEDriverServer_x64_2.53.0\\IEDriverServer.exe");
	  driver1 =new InternetExplorerDriver();
	  driver1.manage().window().maximize();
	  Thread.sleep(3000);
	  driver1.get("http://gmail.com");
  }

  @AfterTest
  public void afterTest() {
	  driver1.close();
	  
  }

}
