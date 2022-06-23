package poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
/* ***
 * 1. read the excel file,file path,use XSSFWork for .xlsx file,
 * 2. read the contents/cell values
 * 3.find the no of rows in the sheet
 * 4.print in console
 */
public class Mypoi_read {
	
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	
		
	public static void createwb() throws FileNotFoundException, IOException{
	String excelpath="E:\\work space\\SELENIUM1\\seleniumtraining_testNG\\excel\\myinputdata.xlsx";
		
	wb=new XSSFWorkbook(new FileInputStream(new File(excelpath)));
	}
	
public static String getData(int sheetindex,int row,int col){
	// find sheetno/sheetname for that sheet
	sheet=wb.getSheetAt(sheetindex);
	String cellvalue=sheet.getRow(row).getCell(col).getStringCellValue();
	return cellvalue;

}

// find the row count to repeat the loop
public static int rowCount(int sheetindex){
	
	int rows=wb.getSheetAt(sheetindex).getLastRowNum();
	return rows+1;
}

	}




