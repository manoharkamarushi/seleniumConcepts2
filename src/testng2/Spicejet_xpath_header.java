package testng2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Spicejet_xpath_header {
	
	WebDriver driver; 
  @Test
  public void f() throws Exception {
	  
	  //driver.findElement(By.xpath("//*[@id='smoothmenu1']/ul/li[2]/a")).click(); clicks About Us - using relative path
	 //  driver.findElement(By.xpath("html/body/form/div[4]/div[1]/div[1]/div[2]/div[2]/div/ul/li[2]/a")).click(); -- using absoulte path
	 // driver.findElement(By.xpath("html/body/form/div[4]/div[1]/div[1]/div[2]/div[2]/div")).click();
	
	  List <WebElement>l1= driver.findElements(By.xpath("html/body/form/div[4]/div[1]/div[1]/div[2]/div[2]/div"));
	 int value =l1.size();
	 System.out.println(value);
 
  for(int i=0;i<value;i++)			{	
	  System.out.println(l1.get(i).getText());     
	  System.out.println("-------------------");      
	  }
  //System.out.println("-------------------");
  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe"); 
	  driver=new ChromeDriver();
	  //driver=new FirefoxDriver();
	  driver.get("http://spicejet.com");
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	     driver.close();
  }

}
