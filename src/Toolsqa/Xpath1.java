package Toolsqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Xpath1 {
  
	WebDriver driver = new FirefoxDriver();
	
	@Test(enabled=false)//passed
  public void f() {
				
				driver.get("http://store.demoqa.com");
	  driver.findElement(By.xpath("*//div[@id='social-media']/ul/li[3]/a")).click();
	    
	 	}
@Test(enabled=false)//passed
public void name(){
	
	 driver.get("http://toolsqa.com/about-us/");
	 String s= driver.findElement(By.xpath("*//h2[text()='LAKSHAY SHARMA']")).getTagName();
  System.out.println(s);
}
@Test(enabled=true)
public void flipkart_homepage(){
	
	driver.get("http://flipkart.com");
	driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("coolpad plus"); // worked
	driver.findElement(By.xpath("//input[contains(@value,'SEARCH')]")).click();// worked
	
}

}











