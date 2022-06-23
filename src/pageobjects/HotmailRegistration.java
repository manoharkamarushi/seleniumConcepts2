package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HotmailRegistration 
{
	

	//public static WebDriver driver;
	public static WebElement element;
	
	//Creating userDefined method for firstname in registration
	public static WebElement firstname_Signup(WebDriver driver)
	{
		element=driver.findElement(By.id("FirstName"));
		return element;
	}
	//Creating userDefined method for lastname in registraton
	public static WebElement lastname_Signup(WebDriver driver)
	{
		element=driver.findElement(By.id("LastName"));
		return element;
	}
	
	//Creating userDefined method for username in registration
		public static WebElement username_signup(WebDriver driver)
		{
			element=driver.findElement(By.id("MemberName"));
			return element;
		}
		
	//Creating userdefined method for month dropdown
		public static Select Month_Signup(WebDriver driver)
		{
			Select element=new Select(driver.findElement(By.id("BirthMonth")));
			return element;
		}
		
		//Creating userdefined method for month dropdown
		public static Select Day_Signup(WebDriver driver)
		{
			Select element=new Select(driver.findElement(By.id("BirthDay")));
			return element;
		}

				
		//Creating userdefined method for month dropdown
		public static Select year_Signup(WebDriver driver)
		{
			Select element=new Select(driver.findElement(By.id("BirthYear")));
			return element;
		}



}
