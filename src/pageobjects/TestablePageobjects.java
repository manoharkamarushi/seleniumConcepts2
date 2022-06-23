package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestablePageobjects {
	public static WebDriver driver;
  @Test
  public void f() 
  {
	  driver=new FirefoxDriver();
	  driver.get("http://hotmail.com");
	  
	
	  //TestCases.verifysingin(driver);
	  
	  HotmailmulTestCases.verifysingin(driver);
	  
	  driver.navigate().back();
	  
boolean flag= HotmailHomepage.username_Signin(driver).isDisplayed();
System.out.println(flag);	 
System.out.println("page navigated");
	  
  }
}
