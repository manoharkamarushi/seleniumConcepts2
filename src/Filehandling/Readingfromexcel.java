package Filehandling;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Readingfromexcel {
	
	
	public String[][] readexcel() throws JXLException, IOException  {
		
		  FileInputStream fin=new FileInputStream("D:\\TESTING\\sample_excel.xls");
		  Workbook wbb=Workbook.getWorkbook(fin); //input stream type
		  Sheet sh=wbb.getSheet(0);
		  
		  String a[][]=new String[2][15]; // two columns 15 rows
		 for(int colno=0;colno<sh.getColumns();colno++)
		  {
		      for(int rowno=0;rowno<sh.getRows();rowno++)
		      {
		    	  a[colno][rowno]=sh.getCell(colno, rowno).getContents();
		      System.out.println(colno+" and "+rowno+" "+a[colno][rowno]);
		      }
		  }
			return a;	 
		   }
		
			
	public static void main(String[] args) throws JXLException, IOException {
		
					Readingfromexcel r=new Readingfromexcel();
					 r.readexcel();
	}

}
