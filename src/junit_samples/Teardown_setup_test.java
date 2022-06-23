package junit_samples;

//import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Teardown_setup_test {
WebDriver driver=new FirefoxDriver();
	
@Before
	public void setUp() throws Exception {
		System.out.println("i wil execute before test -called setup()");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("i will execute after a test called teardown() ");
	}

	@Test
	public void test() {
		System.out.println("u know am in test google");
		driver.get("http://google.co.in");
	}
	@Test
	public void testgmail(){
		
	System.out.println("am in gmail test method");
	driver.get("http://gmail.com");
	}
}
