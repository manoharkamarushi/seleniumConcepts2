package pageobjects_yahoo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//import org.testng.annotations.Test;

public class YahooRegistration {
  
	public static WebElement element;
	
	public static WebElement firstname_signup(WebDriver driver){
		   
		element=driver.findElement(By.id("reg-error-firstName"));
			
		return element;
	} 
	public static WebElement lastname_signup(WebDriver driver){
		
		element=driver.findElement(By.id("reg-error-lastName"));
		return element;
	}
	public static WebElement username_signup(WebDriver driver){
		
		element=driver.findElement(By.id("usernamereg-yid"));
		return element;
	}
  public static WebElement password_signup(WebDriver driver){
	element=driver.findElement(By.id("usernamereg-password"));
	 return element;
	}
public static  Select countrycode_signup(WebDriver driver){
	
	Select element=new Select(driver.findElement(By.name("shortCountryCode")));
	return  element;
}
public static WebElement mobilenumber_signup(WebDriver driver){
	element=driver.findElement(By.id("usernamereg-phone"));
	 return element;
} 
   public static Select Month_signup(WebDriver driver)
		{
			Select element=new Select(driver.findElement(By.id("usernamereg-month")));
			return element;
		}

   public static Select Day_signup(WebDriver driver)
	{
		Select element=new Select(driver.findElement(By.id("usernamereg-day")));
		return element;
	}
   public static Select year_signup(WebDriver driver)
	{
		Select element=new Select(driver.findElement(By.id("usernamereg-year")));
		return element;
	}
public static Select gender_signup(WebDriver driver){
	Select element=new Select(driver.findElement(By.id("usernamereg-gender")));
	return element;
}
public static WebElement continue_signup(WebDriver driver){
	
	driver.findElement(By.id("reg-submit-button"));
	return element;
}
}
