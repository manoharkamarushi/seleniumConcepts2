package KDF;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class newtab {
 @Test
 public void f() {
						  
 WebDriver driver=new FirefoxDriver();
 driver.get("http://amazon.in");
 WebElement we= driver.findElement(By.linkText("Your Amazon.in"));
 we.sendKeys(Keys.CONTROL+"t");
																	       
	
	   // driver.get("http://facebook.com");
 }
}
		
