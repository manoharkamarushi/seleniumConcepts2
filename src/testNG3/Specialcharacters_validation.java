package testNG3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Specialcharacters_validation {

	public static void main(String[] args) {

		
		
		//String s="manohar.k584@gmail.com";
		String s="manohar";
		Pattern p=Pattern.compile("[^a-z0-9]",Pattern.CASE_INSENSITIVE);
		Matcher m=p.matcher(s);
		boolean b=m.find();
		
		if(b){System.out.println("string has special characters");}
		else{System.out.println("no special characters");}

	}

}
