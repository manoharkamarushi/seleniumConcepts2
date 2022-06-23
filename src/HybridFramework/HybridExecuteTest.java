package HybridFramework;
import java.io.IOException;
import java.util.Properties;

import HybridFramework.ReadObject;
import HybridFramework.UIOperation;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import HybridFramework.ReadExcelFile;

public class HybridExecuteTest {
	WebDriver driver = null;
	
    @Test(dataProvider="hybridData")
	public void testLogin(String testcaseName,String keyword,String objectName,String objectType,String value) throws Exception {
		    
    	
    	if(testcaseName!=null&&testcaseName.length()!=0){
    		driver=new FirefoxDriver();
    	}
        ReadObject object = new ReadObject();
        Properties allObjects =  object.getObjectRepository();
        UIOperation operation = new UIOperation(driver);
      	//Call perform function to perform operation on UI
    			operation.perform(allObjects, keyword, objectName, objectType, value);
    	    
	}

    
    @DataProvider(name="hybridData")
	public Object[][] getDataFromDataprovider() throws IOException{
    	Object[][] object = null; 
    	ReadExcelFile file = new ReadExcelFile();
        
         //Read keyword sheet
         Sheet Sheet = file.readExcel(System.getProperty("user.dir")+"\\","TestCases.xlsx" , "KeywordFramework");
       //Find number of rows in excel file
       // System.out.println("System User Directory: " + System.getProperty("user.dir").toString());
     	int rowCount = Sheet.getLastRowNum()-Sheet.getFirstRowNum();
     	object = new Object[rowCount][5];
     	for (int i = 0; i < rowCount; i++) {
    		//Loop over all the rows
    		Row row = Sheet.getRow(i+1);
    		//Create a loop to print cell values in a row
    		for (int j = 0; j < row.getLastCellNum(); j++) {
    			//Print excel data in console
    			object[i][j] = row.getCell(j).toString();
    			System.out.println("Object["+i+"]["+j+"]"+object[i][j]);
    		}
         
    	}
     	System.out.println("-----------------");
     	 	  return object;	 
	}
}



