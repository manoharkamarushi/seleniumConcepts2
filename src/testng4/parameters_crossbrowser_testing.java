package testng4;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;

public class parameters_crossbrowser_testing {
  
	private WebDriver driver;
	
	
	@Test
  public void multi_browser() throws Exception{
		
		 driver.get("http://google.com");  
		 }
  
	@Parameters("browser")
	@BeforeMethod
  public void setup(String browser) {

  if(browser.equalsIgnoreCase("firefox")){
	  driver=new FirefoxDriver();
	
	    }
  if(browser.equalsIgnoreCase("chrome")){
	  System.setProperty("Webdriver.chrome.driver", "D:\\TESTING\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	 
	    }
  if(browser.equalsIgnoreCase("ie")){
	  System.setProperty("Webdriver.ie.driver", "D:\\TESTING\\IEDriverServer_x64_2.53.0\\IEDriverServer.exe");
	  driver=new InternetExplorerDriver();

  }
  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
/**/