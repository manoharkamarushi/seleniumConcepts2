// close , cancel buttons are not same
//for cancel, we use dismiss()
//for close ,,,we need to capture the property
// alert message with css selector
// css works more faster than xpath especially in IE
package testng2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Alert__message_CSS_selector {
	
	
	WebDriver driver;
  @Test
  public void css(){
	  
	  driver.findElement(By.cssSelector("input[\"Go!\"]")).click();
	 Alert almssge= driver.switchTo().alert();
	  System.out.println(almssge.getText());
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  driver=new FirefoxDriver();
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  driver.manage().window().maximize();
	  Thread.sleep(4000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
