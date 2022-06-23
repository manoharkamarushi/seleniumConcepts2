package testng2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Spicejet_From_To {
  
				WebDriver driver;
	@Test
  public void ListContains() throws Exception {
		
	/*	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("hyd");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	*/	
		
		
		
List<WebElement>l1=driver.findElements(By.xpath("html/body/form/div[4]/div[2]/div/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div/table/tbody/tr[2]/td[2]"));
//		List<WebElement>l2=driver.findElements(By.xpath("html/body/form/div[4]/div[2]/div/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div/table/tbody/tr[2]/td[2]"));
List<WebElement>l3=driver.findElements(By.xpath("html/body/form/div[4]/div[2]/div/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div/table/tbody/tr[2]/td[2]"));
		
  // it works 7
	    /* if(l1.contains(l3))
	    	 System.out.println("No city selected");
	     else
	    	 System.out.println("some city selected");
*/
		
  // it works but hard code
 if(l1.size() > l3.size())
	  System.out.println("something selected");
	  else
		     System.out.println("nothing selected");
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  driver=new FirefoxDriver();
	  driver.get("http://spicejet.com");
	  Thread.sleep(2000);
	  
  }

  @AfterTest
  public void afterTest() {
	    //driver.close();
	  
  }

}
