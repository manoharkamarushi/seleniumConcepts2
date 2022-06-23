package testng2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class Spicejet_footer {
	
	WebDriver driver;
  @Test
  public void func() {
	  
	  
	  List <WebElement>l1=driver.findElements(By.xpath("html/body/form/div[4]/div[2]/div/div[4]/div[4]/ul"));
	  	int size_footer=l1.size();
	  	
	  //	l1.get(size_footer).getText();
	  	
	  	for(int i=0;i<size_footer;i++)
	  	{	
	  		System.out.println("-----");
	  		System.out.println("------"+l1.get(i).getText());
	  		
	  	}
	  	
	  	/*List<WebElement>l2=driver.findElements(By.xpath("html/body/form/div[5]/div[2]/div/div[2]/ul"));
	  	int sige=l2.size();
	  	for (int i=0;i<sige;i++){System.out.println(l2.get(i).getText());	  	}
  */
  }
  @BeforeTest
 
  
  public void beforeTest() {
	 driver =new FirefoxDriver();
	 /*driver = new FirefoxDriver();
	 driver =new InternetExplorerDriver();
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");*/
	 
	  driver.get("http://spicejet.com");
	  driver.manage().window().maximize();	
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
