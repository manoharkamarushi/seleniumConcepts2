package testng4;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Dataproviders_gmail_login {
	
	WebDriver driver;
	
  @Test(dataProvider = "gmail_login")
  public void f(String uname, String pwd) {
	  	WebElement e1=driver.findElement(By.id("Email"));
	  					e1.sendKeys(uname);
	  	System.out.println("mail id got from dp"+uname);				
	  					driver.findElement(By.id("next")).submit();					
	  	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	  		WebElement e2=	driver.findElement(By.id("Passwd"));
	  			e2.sendKeys(pwd);
	  			System.out.println("password got from dp method"+pwd);	
	  			driver.findElement(By.id("signIn")).submit();
	  			
	  Assert.assertTrue(e1.getAttribute("value").equalsIgnoreCase(uname));
	  Assert.assertTrue(e2.getAttribute("value").equalsIgnoreCase(pwd));
	  }

  @DataProvider(name="gmail_login")// for more concept refer guru99.com
  public Object[][] dp() {
    return new Object[][] {
     /* new Object[] { 1, "a" },
      new Object[] { 2, "b" },*/
    
    	{"manohar.k584","silverstar"}
    };
  }
  @BeforeTest
  public void beforeTest() {
	  	driver=new FirefoxDriver();
	  	driver.get("http://gmail.com");
	  //	driver.manage().window().maximize();
	  	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
