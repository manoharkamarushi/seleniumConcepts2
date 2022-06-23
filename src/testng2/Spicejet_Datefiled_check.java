package testng2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Spicejet_Datefiled_check {
		
	WebDriver driver;
	
  @Test(enabled=false)
  public void Datecheck() {
	  
boolean roundtripselect=  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected();
  if (roundtripselect==true)
  {
	 String roundtrip= driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).getAttribute("value");
	  System.out.println(roundtrip);
  
	  if(roundtrip.equalsIgnoreCase("RoundTrip"))
	  {
		  System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).getAttribute("name"));
		  System.out.println(driver.findElement(By.id("ctl00_mainContent_txt_Todate")).getAttribute("name"));
	  }
	  else
		  
		  System.out.println("No date pickers are available for Roundtrip option");
	  }
    
  }
  @Test(enabled=true)
  public void onewaytrip()
  {
	  boolean onewaytripselect=driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected();
	  if(onewaytripselect==false)
	  {
		  System.out.println("by defualt not clicked so now performed click operation");
		  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		 String click=driver.findElement(By.id("ctl00_mainContent_txt_Fromdate")).getAttribute("name");
		 System.out.println(click);
		
	  }
	  else
	  {	
		  System.out.println("by defualt clicked");
		  String click=driver.findElement(By.id("ctl00_mainContent_txt_Fromdate")).getAttribute("name");
			 System.out.println(click);
	  }
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://spicejet.com");
	  
  }

  @AfterTest
  public void afterTest() throws Exception {
	  Thread.sleep(1000);
	  driver.close();
  }

}
