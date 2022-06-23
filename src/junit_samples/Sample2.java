package junit_samples;

//import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Sample2 {
	WebDriver driver=new FirefoxDriver();
	
	@Test
	public void test_spicejet() {
//		fail("Not yet implemented");
	driver.get("http://spicejet.com");
	}

	@Test
	public void testflipkart(){
		driver.get("http://fliprt.com");
	}
	@AfterTest
	public void close(){
		driver.quit();
	}
}
