package Filehandling;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Read_Write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fin=new FileInputStream("D:\\TESTING\\Testdata\\sample.txt");
		FileOutputStream fout=new FileOutputStream("D:\\TESTING\\Testdata\\samplewrite789.txt");
		
		int i=0;
		while((i=fin.read())!=-1){
//			fout.write((char)i);
		System.out.print((char)i);
		}
		fout.close();
		System.out.println("task done");
	}

}
