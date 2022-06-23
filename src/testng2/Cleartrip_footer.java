package testng2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Cleartrip_footer {
	
	WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  
	 List <WebElement>l1=driver.findElements(By.xpath("html/body/footer/div[2]/nav"));// other tools -footer
	//List <WebElement>l1=driver.findElements(By.xpath("html/body/footer/div[1]/div[1]/nav[1]/ul")); // footer
	
	 // List <WebElement>l1=driver.findElements(By.xpath("html/body/footer/div[1]/div[1]/nav[2]/ul")); // footer
	 // List <WebElement>l1=driver.findElements(By.xpath("html/body/section[2]/div/aside[1]")); // cleartrip left pane
	  int size_footer=l1.size();
	  
	  Thread.sleep(3000);
	  for(int i=0;i<size_footer;i++)
	  	{	
	  		System.out.println("-----");
	  		System.out.println("------"+l1.get(i).getText());
	  		
	  	}
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  //driver =new FirefoxDriver();
	  
	 
	  System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
	  driver =new ChromeDriver();
	  
	  driver.get("http://cleartrip.com");
	  driver.manage().window().maximize();	
  
    
  }

  @AfterTest
  public void afterTest() throws Exception {
	  Thread.sleep(5000);
	  
	  driver.close();
  }

}
