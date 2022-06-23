package KDF;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Newtab1_amazon {
  @Test
  public void f() throws Exception {
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://amazon.in");
	
	  //driver.findElement(By.linkText("Your Amazon.in"));
	  
	  String oldtab=driver.getWindowHandle();
	  //for opening new tab
	  
	  String newtablink=Keys.chord(Keys.CONTROL,Keys.RETURN);
	  
	 driver.findElement(By.linkText("Your Amazon.in")).sendKeys(newtablink);
	 
	 //perform ctrl + tab & focus to new tab window
	 
    new Actions(driver).sendKeys(Keys.chord(Keys.CONTROL,Keys.TAB)).perform();
	 Thread.sleep(2000);
	 
//	  driver.switchTo().window(oldtab);
	  Thread.sleep(2000);

	  driver.navigate().refresh();
  }
}
