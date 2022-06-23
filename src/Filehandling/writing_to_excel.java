package Filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class writing_to_excel {
	
  @Test
  public void write() throws IOException,FileNotFoundException, RowsExceededException, WriteException {
	  
	  FileOutputStream fos=new FileOutputStream("D:\\TESTING\\Testdata\\write_excel2.xls");
	  WritableWorkbook wwb=Workbook.createWorkbook(fos);	  
	  WritableSheet ws=wwb.createSheet("results", 0);
  
	  //	Label un=new Label(0,0,"Username");  //it is not java label.... it is jxl.write.label
	  	Label pd=new Label(1,0,"password");
	  	Label rs=new Label(2,0,"results");
	  	
	  	ws.addCell(new Label(0,0,"Username"));
	  	ws.addCell(pd);
	  	ws.addCell(rs);
	  
  wwb.write();
  wwb.close();
  }
}
