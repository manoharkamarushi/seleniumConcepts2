package testng2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Spicejet_CurrencyConverter {

	WebDriver driver;
	
 @Test
  public void Spicejet_Currency_Converter() throws Exception {
	 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();//from text box
	 driver.findElement(By.linkText("Bengaluru (BLR)")).click();//from Delhi (DEL)
	 driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();//to text box
	 driver.findElement(By.linkText("Hyderabad (HYD)")).click();//to hyd
	 driver.findElement(By.id("ctl00_mainContent_txt_Fromdate")).click();//leave date click
	 driver.findElement(By.linkText("6")).click();// leave date select
	 driver.findElement(By.id("ctl00_mainContent_txt_Todate")).click();//return date click
	 driver.findElement(By.linkText("8")).click();//return date select
new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("3 Adults");//adults 
	//driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).submit();// submit is not working
	driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	//Thread.sleep(5000);
	
	
	
	
	driver.findElement(By.id("popUpConverter")).click();
	Thread.sleep(30000);
	driver.switchTo().window("converter"); //focus shifted to the respective pop up window
	driver.manage().window().maximize();
	new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListBaseCurrency"))).selectByVisibleText("US Dollars(USD)");
	new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListConversionCurrency"))).selectByVisibleText("Indian Rupee(INR)");
	driver.findElement(By.id("CurrencyConverterCurrencyConverterView_TextBoxAmount")).sendKeys("1");
	//Thread.sleep(1000);
	//driver.findElement(By.id("CurrencyConverterCurrencyConverterView_ButtonConvert")).submit(); not worked
	driver.findElement(By.id("CurrencyConverterCurrencyConverterView_ButtonConvert")).click();

	String s=driver.findElement(By.id("converterResults")).getText();
	System.out.println(s);
	System.out.println(driver.getTitle());
	System.out.println(driver.getWindowHandle());
	Thread.sleep(2000);
	driver.close();
	

  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  	driver=new FirefoxDriver();
	  	driver.get("http://spicejet.com");
	  	Thread.sleep(2000);
	  	driver.manage().window().maximize();
  
  }

  @AfterTest
  public void afterTest() {
 driver.quit();
	  
	  
  }

}
