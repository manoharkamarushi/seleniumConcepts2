package mypageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class My_TestablePageobjects {
public static WebDriver driver;
  @Test
  public void f() 
  {
	  driver=new FirefoxDriver();
	  driver.get("http://hotmail.com");
	  
	
	  //TestCases.verifysingin(driver);
	  
	  My_HotmailmulTestCases.verifysingin(driver);
	  
	  driver.navigate().back();
	  
	  My_HotmailHomepage.username_Signin(driver).isDisplayed();
	  System.out.println("page navigated");
	  
  }
}
