package testNG3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Demotours_list_capture {
	
	WebDriver driver;
	
  @Test
  public void dropdown_capture() {
	  
	 driver.findElement(By.linkText("REGISTER")).click();
	 driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	 // blindly use select class for dropdowns
	 
	 Select s=new Select(driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select")));
	 
	 List<WebElement>l1=s.getOptions();
	 		//		System.out.println(l1.getText());// u cant get all text in list 
	 
	 System.out.println(l1.size());
	  
	 for(WebElement list:l1)
	  {
		System.out.println(list.getText());
		  
		  
	  }
  }
  @BeforeTest
  public void beforeTest() {
	
	  driver=new FirefoxDriver();
	  driver.get("http://newtours.demoaut.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	  
      }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
