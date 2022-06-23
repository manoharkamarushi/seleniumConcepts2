package DDF;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Gmai_login_DDF {

	WebDriver driver=new FirefoxDriver();
	FileInputStream fin;
	Workbook wbb;
	Sheet s1,s2;
	
	
	@Test
  public void f() throws BiffException, IOException,FileNotFoundException, InterruptedException{
	  fin=new FileInputStream("D:\\Testing\\ddf_gmail_login.xls");
	  wbb=Workbook.getWorkbook(fin);
	  s1=wbb.getSheet(0);
	  s2=wbb.getSheet(1);
	
	  driver.get("https://mail.google.com/mail/u/0/h/an2x6itx718e/"); // gmail basic html version
	  
	  for(int i=1;i<s2.getRows();i++){
	  
	  driver.findElement(By.id(s1.getCell(0, 1).getContents())).sendKeys(s2.getCell(0, i).getContents());
	  driver.findElement(By.id(s1.getCell(1, 1).getContents())).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id(s1.getCell(2, 1).getContents())).sendKeys(s2.getCell(1, i).getContents());
	  driver.findElement(By.id("persistant cookie")).click();  // clicks stay signed in
	  driver.findElement(By.id(s1.getCell(3, 1).getContents())).click();
	  
	  }
	  driver.close();
  }
  
}
