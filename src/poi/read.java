package poi;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class read {

@Test	
public void read_poi() throws Exception{
	
	File f=new File("F:\\TESTING BASICS\\mindq_selinium\\MANOHAR_DOCS\\sudha_poi\\POI_Read_Write_Excel.xlsx");
	System.out.println("-----"+f+"----------");
	
	FileInputStream fin = new FileInputStream(f);
	 System.out.println("------"+fin+"--------");
	 
	 Workbook wbb = new XSSFWorkbook(fin);
	 Sheet Sh = wbb.getSheet("students");
	
	 int rowCount = Sh.getLastRowNum()-Sh.getFirstRowNum();
	  System.out.println("---------------"+rowCount+"-----------");
	 
	  for(int i=1;i<rowCount;i++){
		 
	 }
}
}
