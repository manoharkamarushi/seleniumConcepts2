package testng2;

//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;

public class Spicejet_dynamic_date {
  @Test
    public void f() throws Exception{
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://spicejet.com");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
	  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	  driver.findElement(By.linkText("Delhi (DEL)")).click();
	  Thread.sleep(10000);
	  driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
	  driver.findElement(By.linkText("Dharamshala (DHM)")).click();
	  driver.findElement(By.id("ctl00_mainContent_txt_Fromdate")).click();
	  driver.findElement(By.linkText("17")).click();
	  driver.findElement(By.id("ctl00_mainContent_txt_Todate")).click();
	 //driver.findElement(By.linkText("")).click();
	 driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	 boolean flag=true;
	 while(flag){
	   try {
	  WebElement cdp = driver.findElement(By.xpath("//div[contains(@class,'ui-datepicker-group') and descendant::span[text()='December']]/descendant::a[text()='5']")); // Required future date
	  if(cdp !=null)   //Check if the required date element is found or not
	        {
	   cdp.click(); // if required Date is found, then click  the date
	   flag=false;
	  }
	     } 
	 catch (Exception e) { //Catches exception if no element found
	 try {
	  Thread.sleep(500);
	  driver.findElement(By.xpath("//a[@title='Next']")).click(); //Click on next month
	  }
	 catch (InterruptedException e1) 
	       {
	  // TODO Auto-generated catch block
	   e1.printStackTrace();
	       }
	   }//end of Catches exception if no element found
	 } //end of while
	 
	 
	  /*WebDriver driver=new FirefoxDriver();
	  driver.get("http://spicejet.com");
	  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
	  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	  driver.findElement(By.linkText("Hyderabad (HYD)")).click();
	  driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
	  driver.findElement(By.linkText("Chennai (MAA)")).click();
	  driver.findElement(By.id("ctl00_mainContent_txt_Fromdate")).click();
	  driver.findElement(By.linkText("15")).click();
	  driver.findElement(By.id("ctl00_mainContent_txt_Todate")).click();
	  driver.findElement(By.linkText("29")).click();
	  new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("6 Adults");
	  driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();*/
	  
  	  
  }
}
