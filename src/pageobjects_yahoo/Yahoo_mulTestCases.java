package pageobjects_yahoo;

import org.openqa.selenium.WebDriver;

import pageobjects.HotmailHomepage;
import pageobjects.HotmailRegistration;

//import org.testng.annotations.Test;

public class Yahoo_mulTestCases {
	
	public static void verifysingup(WebDriver driver)
	{
		//YahooHomepage.SignupNow_Link(driver).click();
		
		
		YahooRegistration.firstname_signup(driver).sendKeys("newuser");
		YahooRegistration.lastname_signup(driver).sendKeys("selenium");
		YahooRegistration.username_signup(driver).sendKeys("newuserselenium");
		YahooRegistration.Month_signup(driver).selectByVisibleText("May");
		YahooRegistration.Day_signup(driver).selectByVisibleText("19");
		YahooRegistration.year_signup(driver).selectByVisibleText("1999");
		YahooRegistration.continue_signup(driver).click();
		
	}

}
