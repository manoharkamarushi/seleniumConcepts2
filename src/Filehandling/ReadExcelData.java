package Filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcelData {
  @Test
  public void readexcel() throws BiffException, IOException  {
	
	  FileInputStream fin=new FileInputStream("D:\\TESTING\\Testdata\\sample_excel.xls");
	  Workbook wbb=Workbook.getWorkbook(fin); //input stream type
	  Sheet sh=wbb.getSheet(0);
	  
	  String a[][]=new String[2][15];
	  
	  for(int colno=0;colno<sh.getColumns();colno++)
	  {
	      for(int rowno=0;rowno<sh.getRows();rowno++)
	      {         
	    	  		a[colno][rowno]=sh.getCell(colno, rowno).getContents();
	    	  		System.out.println(colno+" and "+rowno+" "+a[colno][rowno]);
	      }
	      System.out.println("\n");
	  }
	  System.out.println("\n");
	 // return a;   
	}
	
	  
  }

