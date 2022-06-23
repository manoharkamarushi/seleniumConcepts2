package poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Read_Write_Excel { 
                public void readExcel(String filePath,String fileName,String sheetName) throws IOException{
 
    //Create a object of File class to open xlsx file
 
    File file =    new File("F:\\TESTING BASICS\\mindq_selinium\\MANOHAR_DOCS\\sudha_poi\\POI_Read_Write_Excel.xlsx");
    	System.out.println(file);
    //Create an object of FileInputStream class to read excel file
 
    FileInputStream inputStream = new FileInputStream(file);
 
    Workbook wb = null;
 
    //Find the file extension by splitting file name in substring and getting only extension name
 
    String fileExtensionName = fileName.substring(fileName.indexOf("."));
 
    //Check condition if the file is xlsx file
 
    if(fileExtensionName.equals(".xlsx")){
 
    //If it is xlsx file then create object of XSSFWorkbook class
 
    wb = new XSSFWorkbook(inputStream);
 
    }
 
    //Check condition if the file is xls file
 
    else if(fileExtensionName.equals(".xls")){
 
        //If it is xls file then create object of HSSFWorkbook class
 
        wb = new HSSFWorkbook(inputStream);
 
    }
 
    //Read sheet inside the workbook by its name
 
    Sheet Sh = wb.getSheet(sheetName);
 
    //Find number of rows in excel file
 
    int rowCount = Sh.getLastRowNum()-Sh.getFirstRowNum();
    System.out.println("---------------"+rowCount+"-----------");
    //Create a loop over all the rows of excel file to read it
 
    for (int i = 1; i < rowCount; i++) {
 
        Row row = Sh.getRow(i);
 
        //Create a loop to print 'cell values' in a row
 
        for (int j = 0; j < row.getLastCellNum(); j++) {
        		System.out.println("---------------"+row.getLastCellNum()+"---------------");
            //Print excel data in console
 
            System.out.print(row.getCell(j).getStringCellValue()+"|| ");
 
        }
 
        System.out.println("\n Read excel is successfull");
 
    }
 
    }
                /* public void writeExcel(String filePath,String fileName,String sheetName,String[] dataToWrite) throws IOException{
                                 
                        //Create a object of File class to open xlsx file
                 
                        File file =    new File(filePath+"\\"+fileName);
                 
                        //Create an object of FileInputStream class to read excel file
                 
                        FileInputStream inputStream = new FileInputStream(file);
                 
                        Workbook wb = null;
                 
                        //Find the file extension by spliting file name in substing and getting only extension name
                 
                        String fileExtensionName = fileName.substring(fileName.indexOf("."));
                 
                        //Check condition if the file is xlsx file
                 
                        if(fileExtensionName.equals(".xlsx")){
                 
                        //If it is xlsx file then create object of XSSFWorkbook class
                 
                        wb = new XSSFWorkbook(inputStream);
                 
                        }
                 
                        //Check condition if the file is xls file
                 
                        else if(fileExtensionName.equals(".xls")){
                 
                            //If it is xls file then create object of XSSFWorkbook class
                                wb = new HSSFWorkbook(inputStream);
                 
                        }
                 
                         
                 
                    //Read excel sheet by sheet name   
                 
                    Sheet sheet = wb.getSheet(sheetName);
                 
                    //Get the current count of rows in excel file
                 
                    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
                 
                    //Get the first row from the sheet
                 
                    Row row = sheet.getRow(0);
                 
                    //Create a new row and append it at last of sheet
                 
                    Row newRow = sheet.createRow(rowCount+1);
                 
                    //Create a loop over the cell of newly created Row
                 
                    for(int j = 0; j < row.getLastCellNum(); j++){
                 
                        //Fill data in row
                 
                        Cell cell = newRow.createCell(j);
                 
                        cell.setCellValue(dataToWrite[j]);
                 
                    }
                 
                    //Close input stream
                 
                    inputStream.close();
                 
                    //Create an object of FileOutputStream class to create write data in excel file
                 
                    FileOutputStream outputStream = new FileOutputStream(file);
                 
                    //write data in the excel file
                 
                    wb.write(outputStream);
                 
                    //close output stream
                 
                    outputStream.close();
                 
                                 
                    }*/
                 
                          
  @Test
  public void f() throws IOException {
                  
	  			//	String[] valueToWrite = {"Vivek","Chennai"};
                  
                  readExcel("F:\\TESTING BASICS\\mindq_selinium\\MANOHAR_DOCS\\sudha_poi\\",
                		  			"POI_Read_Write_Excel.xlsx",
                		  			"students");
                  //writeExcel("X:\\","POI_Read_Write_Excel.xlsx","sheet1",valueToWrite);
  }
}
