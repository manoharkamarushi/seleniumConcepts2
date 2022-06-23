package testng2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class spicejet_dropdown_adult {

	WebDriver driver;
@Test(enabled=true)
  public void dropdown() {
// using select Class 
//	System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).getSize());
	Select adults=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))); // for selecting drop down
	List<WebElement>l1=adults.getOptions();

		for(int i=0;i<l1.size();i++)
		{
		//System.out.println("--------");
		System.out.println(l1.get(i).getText());
		  
		}

}
@Test(enabled=false)
public void dropdown_split()
{
	
String s=driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).getText(); // entire list is one string, we
// cannot find the specific value whichever we want
System.out.println(s);
// till above , we can print the list of dropdown but if we want to select a particular value for testing that dropdown 
//list... first we should split the list by some delimeter,,,, and can print particular element 
String sp[]=s.split("\n");

for(int i=0;i<sp.length;i++){

	if(sp[i].equalsIgnoreCase("4 adults")){
	System.out.println("the value is :"+sp[i]); }
}
}
  @BeforeTest
  public void beforeTest() {
	  
	  driver=new FirefoxDriver();
	  driver.get("http://spicejet.com");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
