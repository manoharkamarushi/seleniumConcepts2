package testng4;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class WebTable2_icici {
 
	WebDriver driver;
	
	@Test
  public void icicidirect() throws Exception {
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("markets")).click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		WebElement table=driver.findElement(By.xpath("//*[@id='Table26']/tbody"));
		System.out.println(table.getSize());
		
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		/*for(WebElement eachrow:rows)
		{
				List<WebElement>cols=eachrow.findElements(By.tagName("td"));
				for(WebElement eachcell:cols)
				{
					if(eachcell.getText().contains("Nifty Weightage".trim()))
					{
						System.out.println(eachcell.getText());
						eachcell.click();
						break;							
						}
					
					}
			
				}*/
		
//		WebElement table1=driver.findElement(By.xpath("*//[@id='gridSource']/tbody"));
		
//		List<WebElement>rows1=table1.findElements(By.tagName("tr"));
		
//		for(WebElement eachrow1:rows1)
//		{
//			List<WebElement>cols1=eachrow1.findElements(By.tagName("td"));
//		/	for(WebElement eachcell1:cols1)
//			{
				
//				if(eachcell1.getText().contains("SBI".trim()))
//				{	eachcell1.click(); }
//				}
//		}
		
  }
@BeforeTest
  public void beforeTest() {
	  		driver=new FirefoxDriver();
	  	
	  		driver.get("http://content.icicidirect.com/idirectcontent/Home/Home.aspx");
	  		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	  	 
  }

 }
