package junit_samples;

//import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class sample1 {

	WebDriver driver=new FirefoxDriver();
	
	@Test
	public void test_gmail() {
		
		driver.get("http://gmail.com");
		
	}

	@Test
	public void google(){
		
		driver.get("http://google.co.in");
		}
	
	@Ignore
	public void test_olx(){
		driver.get("http://olx.in");
	}


}
