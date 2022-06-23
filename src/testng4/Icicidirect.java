package testng4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Icicidirect {
  
	WebDriver driver=new FirefoxDriver();
	@Test
  public void f() {
					
		driver.get("http://content.icicidirect.com");
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		//driver.findElement(By.linkText("markets")).click();
  driver.findElement(By.xpath("//a[text()='markets']")).click();
  driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
  driver.findElement(By.xpath("//a[text()='Market Stats']")).click();
  driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
// driver.findElement(By.linkText("Nifty Weightage")).click();
 // driver.findElement(By.xpath("//table[@id='Table26']/descendant::a[text()='Nifty Weightage']")).click();
// driver.findElement(By.partialLinkText("Nifty Weightage")).click();
  //   driver.findElement(By.xpath("*//[[@id='Table26']/tbody]/descendant::a[text()='Nifty Weightage']")).click(); 
  		driver.findElement(By.xpath(".//*[@id='hrfNW']")).click();
	
	}
  
}
