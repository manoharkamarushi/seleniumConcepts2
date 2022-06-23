package DDF;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class BDD_Hotmail_create_account {
 
	WebDriver driver;
	@Test
  public void f() {
		try{
			FileInputStream fin=new FileInputStream("D:\\TESTING\\Test data\\BDD_hotmail_newaccount.xls");
			System.out.println("-----------read file from given path-------");
			Workbook wb=Workbook.getWorkbook(fin);
			System.out.println("----read specific workbook");
	
			Sheet sht=wb.getSheet("s1");
	      System.out.println("----read sheet----");		

			for(int i=1;i<sht.getRows();i++){
			   
				String objtype=sht.getCell(2,i).getContents(); // object type
				System.out.println(objtype);
				Thread.sleep(3000);
				String propid=sht.getCell(1,i).getContents();   //html properties
				System.out.println(propid);
				/*if(sht.getCell(1,i).getContents()=="Password"){Thread.sleep(3000);}
				 * except password field all are working*/
				Thread.sleep(3000);
				
				String testdata=sht.getCell(3,i).getContents();//testdata
				System.out.println(testdata);
				  driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
				  
				
		  switch(objtype)
				{
				case "link":          driver.findElement(By.linkText(propid)).click();
											Thread.sleep(2000);
											break;
				case "text":         driver.findElement(By.id(propid)).sendKeys(testdata); 
											Thread.sleep(4000);
											break;
				case "dropdown":  new Select(driver.findElement(By.id(propid))).selectByVisibleText(testdata); 
											Thread.sleep(2000);
											break;
				default:
											System.out.println(driver.getTitle());
											break;
				}
			}
					
		}
		catch(Exception e){System.out.println(e.getMessage());}
	
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://hotmail.com");
	  driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("successfully read object repository of type excel sheet");
  }

}
