package testng2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.apache.jasper.tagplugins.jstl.core.If;
import org.eclipse.jdt.internal.compiler.ast.IfStatement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class spicejet_dropdown_child {
  
	WebDriver driver;
	
	@Test
	public void dropdown_child() {
		String s=driver.findElement(By.id("")).getText();
		System.out.println(s);
	//using split()
	String [] arry=s.split("/n");	
			for(int i=0;i<arry.length;i++){
				if(arry[i].equalsIgnoreCase("2 childs")){
				System.out.println("value is :"+arry[i]);}
			}
	}
  @BeforeTest
  public void beforeTest() {
	  
	  driver=new FirefoxDriver();
	  driver.get("http://spicejet.com");
  
  
  }

  @AfterTest
  public void afterTest() {
  
	  driver.close();
  }

}
