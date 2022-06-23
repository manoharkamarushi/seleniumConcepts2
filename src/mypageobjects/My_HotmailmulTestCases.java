package mypageobjects;

import org.openqa.selenium.WebDriver;

public class My_HotmailmulTestCases 
{
	
	public static void verifysingin(WebDriver driver)
	{
		
		  My_HotmailHomepage.username_Signin(driver).sendKeys("sudheera.adusupalli@hotmail.com");
		  My_HotmailHomepage.password_Signin(driver).sendKeys("moun!k06");
		  My_HotmailHomepage.Signin_button(driver).click();
	}
	
	public static void verifysingup(WebDriver driver)
	{
		My_HotmailHomepage.SignupNow_Link(driver).click();
		
		
		My_HotmailRegistration.firstname_Signup(driver).sendKeys("newuser");
		My_HotmailRegistration.lastname_Signup(driver).sendKeys("selenium");
		My_HotmailRegistration.username_signup(driver).sendKeys("newuserselenium");
		My_HotmailRegistration.Month_Signup(driver).selectByVisibleText("May");
		My_HotmailRegistration.Day_Signup(driver).selectByVisibleText("19");
		My_HotmailRegistration.year_Signup(driver).selectByVisibleText("1999");
		
		
	}

}
