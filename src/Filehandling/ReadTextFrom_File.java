package Filehandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.Test;

public class ReadTextFrom_File {
  @Test
  public void f() throws IOException {
	  
	  FileInputStream fin=new FileInputStream("D:\\Testing\\sample.txt");
	  
	  int i;
	  while((i=fin.read())!=-1)
	  {
		//prints in ascii chars  System.out.print(i);
	  System.out.print((char)i);
	  }
	   }

}
