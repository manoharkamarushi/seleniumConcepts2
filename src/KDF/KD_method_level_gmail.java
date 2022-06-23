package KDF;

//import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class KD_method_level_gmail extends Helper {
 
	static WebDriver driver=new FirefoxDriver();

	@Test
  public void f() throws BiffException, IOException {
		
		driver.get("http://gmail.com");
	try{
		FileInputStream fin=	new FileInputStream("D:\\TESTING\\Testdata\\kdd_gmail.xls");
		Workbook wbb=Workbook.getWorkbook(fin);
		System.out.println(wbb);
		Sheet sh=wbb.getSheet(0);
		System.out.println(sh);
		
		//code to read Test case
		
		int rows=sh.getRows();
		System.out.println(rows);
		
	for (int i=1;i<rows;i++){
			
			String Tc_name=sh.getCell(0, i).getContents().toString();
			// now calling execute function-- to read mapped function
			Excute(Tc_name);
			
	}//for
	
		quitdriver();
		
	}//try
	catch(Exception e){System.out.println(e.getMessage());}}
	
	private void Excute(String Casename) throws Exception{
			
		String option=Casename.trim();
			
			if(option.equalsIgnoreCase("Tc_login")){ login();}
			else if(option.equalsIgnoreCase("Tc_compose")){compose();}
			else if(option.equalsIgnoreCase("Tc_logout")){logout();}

	}//execute
	private void quitdriver() {
		driver.quit();
		}
	}//class