package KDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Helper {
	WebDriver driver;
	
  @Test
  public void login() throws Exception {
	  
	  driver.findElement(By.id("Email")).sendKeys("manohar.k584");
	  driver.findElement(By.id("next")).submit();
	  Thread.sleep(2000);
	  driver.findElement(By.id("Passwd")).sendKeys("silverstar");
	  driver.findElement(By.id("signIn")).click(); 
  }
 
  @Test
  public void compose()  throws Exception{
	  
	  driver.findElement(By.id("Email")).sendKeys("manohar.k584"); // takes username
	  driver.findElement(By.id("next")).submit();// since next button is of type submit use submit() command instead of click()
	  driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	 
	  driver.findElement(By.id("Passwd")).sendKeys("silverstar");
	  driver.findElement(By.id("signIn")).submit();
	  driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
		WebDriverWait composewait=new WebDriverWait(driver,30);
		composewait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='COMPOSE']")));
		
		driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
		
		driver.findElement(By.name("to")).sendKeys("manohar.kamarushi@gmail.com");
		driver.findElement(By.name("subjectbox")).sendKeys("demo123");
		System.out.println(driver.findElement(By.xpath("//div[contains(@aria-label,'Message Body')]")).getText()); 
		//driver.findElement(By.xpath("//div[contains(@role,'textbox')]")).sendKeys("text from xpath ");// worked
		driver.findElement(By.xpath("//div[contains(@aria-label,'Message Body')]")).sendKeys("message_body");
		
	driver.findElement(By.xpath("//div[contains(text(),'Send')]")).click();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
  }
 
  @Test
  public void logout ()  throws Exception
  {
	  driver.findElement(By.xpath("html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		driver.findElement(By.linkText("Sign out")).click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
  }
  /*@BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver(); 
	  driver.get("http://gmail.com");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
  }*/
}
