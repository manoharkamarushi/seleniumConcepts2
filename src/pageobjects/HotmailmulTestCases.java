package pageobjects;

import org.openqa.selenium.WebDriver;

public class HotmailmulTestCases 
{
	
	public static void verifysingin(WebDriver driver)
	{
		
		  HotmailHomepage.username_Signin(driver).sendKeys("sudheera.adusupalli@hotmail.com");
		  HotmailHomepage.password_Signin(driver).sendKeys("moun!k06");
		  HotmailHomepage.Signin_button(driver).click();
	}
	
	public static void verifysingup(WebDriver driver)
	{
		HotmailHomepage.SignupNow_Link(driver).click();
		
		
		HotmailRegistration.firstname_Signup(driver).sendKeys("newuser");
		HotmailRegistration.lastname_Signup(driver).sendKeys("selenium");
		HotmailRegistration.username_signup(driver).sendKeys("newuserselenium");
		HotmailRegistration.Month_Signup(driver).selectByVisibleText("May");
		HotmailRegistration.Day_Signup(driver).selectByVisibleText("19");
		HotmailRegistration.year_Signup(driver).selectByVisibleText("1999");
		
		
	}

}
