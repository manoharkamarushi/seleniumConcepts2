package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Split {

	public static void main(String[] args) {
	
		
			String str="manohark584";
			
		    List<String> output = new ArrayList<String>();
		    
		    Matcher match = Pattern.compile("[0-9]+|[a-z]+|"
		    		+ "[A-Z]+").matcher(str);
		   
		    while (match.find()) {
		    	
		        output.add(match.group()); }
		  
		    for(String s:output){
		    	System.out.println(s);
		    }
		
	}

}
