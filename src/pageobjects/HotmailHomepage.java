package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class HotmailHomepage 
{
	
	//public static WebDriver driver;
	public static WebElement element;
	
	//Creating userDefined method for username
	public static WebElement username_Signin(WebDriver driver)
	{
		element=driver.findElement(By.id("i0116"));
		return element;
	}
	//Creating userDefined method for password
	public static WebElement password_Signin(WebDriver driver)
	{
		element=driver.findElement(By.id("i0118"));
		return element;
	}

	//Creating userDefined method for signin button
	public static WebElement Signin_button(WebDriver driver)
	{
		element=driver.findElement(By.id("idSIButton9"));
		return element;
	}

	//Creating userDefined method for keep me sigin checkbox
		public static WebElement keepmesignin_checkbox(WebDriver driver)
		{
			
			element=driver.findElement(By.id("idChkBx_PWD_KMSI0Pwd"));
			return element;
		}

		//Creating userDefined method for sign up now link
		public static WebElement SignupNow_Link(WebDriver driver)
		{
			element=driver.findElement(By.linkText("Sign up now"));
			return element;
		}


}
