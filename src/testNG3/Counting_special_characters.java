package testNG3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Counting_special_characters {

	public static void main(String[] args) {

		String s="manohar.k584@gmail.com";
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			
			Pattern p=Pattern.compile("[^0-9a-z]",Pattern.CASE_INSENSITIVE);
			Matcher m=p.matcher(c+"");
			boolean b=m.find();
			if(b){System.out.println("special characters found "+c);
			       count++;}
			
		}
		System.out.println("total no.of characters:"+count);	
	}
}
