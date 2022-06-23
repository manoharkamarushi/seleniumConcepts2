package DDF;    // bookmarked in firefox about properties 
						// we can also place properties file in src folder itself,check that later
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class hotmail_login_properties {
  
WebDriver driver;
	@Test
  public void f() { 
	  try{
		  
		  Properties p=new Properties();
		  FileInputStream fin=new FileInputStream("D:\\TESTING\\Test data\\hotmail1.properties");
		  p.load(fin);
	  
	  driver.findElement(By.id(p.getProperty("username"))).sendKeys(p.getProperty("uid"));
	  driver.findElement(By.id(p.getProperty("password"))).sendKeys(p.getProperty("pwd"));
	  driver.findElement(By.id(p.getProperty("checkbox"))).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id(p.getProperty("signin"))).click();
	  System.out.println("sucess");
	  
	  
	  }catch(Exception e)
	  {
		  System.out.println(e);
	  }	
	  
	}	
	@BeforeTest
	  public void launch()
	  {
		  driver=new FirefoxDriver();
		  driver.get("http://hotmail.com");
		  
	  }
  
}
