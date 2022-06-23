package Filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.annotations.Test;

public class WriteTo_file {
	
  @Test
  public void f() throws IOException {
  
	  FileOutputStream fout=new FileOutputStream("D:\\Testing\\write.txt");
	  String s="selenium class";
	  byte b[]=s.getBytes();
	  fout.write(b);
	  fout.close();
   
  }
}
