package Filehandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadingFile_Bufferreader {

	public static void main(String[] args) throws IOException {

		FileInputStream fin=new FileInputStream("D:\\TESTING\\Testdata\\sample.txt");
		
		BufferedReader bin=new BufferedReader(new InputStreamReader(fin));
		
		String line=null;
		while((line=bin.readLine())!=null){
			System.out.println(line);
			
		}
		
		
	}

}
