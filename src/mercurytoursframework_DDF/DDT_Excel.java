package mercurytoursframework_DDF ;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class DDT_Excel extends MercuryTours{

	public DDT_Excel(WebDriver driver) {
		super(driver);
	}
	
	public String login(String username, String password){
		String result=null;
		driver.findElement(By.cssSelector("input[name='userName']")).sendKeys(username);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
		driver.findElement(By.cssSelector("input[name='login']")).click();
		if (driver.getTitle().contains("Find a Flight")){
			result="login sucessful";
			System.out.println("loginsucessfull");				
			driver.findElement(By.linkText("SIGN-OFF")).click();
		}
		
		else
		{
			result="unsuccessful login";
		}
		
		return result;
	}
	
	public void readExcel() throws IOException{
		File file = new File("D:\\Testdata1\\MercuryTestData.xlsx");
		FileInputStream inputFile = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(inputFile);
		XSSFSheet loginSheet = wb.getSheet("LoginData");
		//System.out.println(loginSheet.getFirstRowNum());
		int rowCount = loginSheet.getLastRowNum();
		System.out.println("Total no of rows are: " + rowCount);
		
		for (int i=1; i<=rowCount; i++){
			String res="invalid data";
			try{
				String un = loginSheet.getRow(i).getCell(0).getStringCellValue();
				String pwd = loginSheet.getRow(i).getCell(1).getStringCellValue();
				res = login(un, pwd);
			}catch(Exception e){
				//e.printStackTrace();
				System.out.println(e.getMessage());
				Drivers.takeScreenshot(driver, "D:\\TESTING\\", "screenshot2");
			}
			try{
				loginSheet.getRow(i).createCell(2).setCellValue(res);
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
		inputFile.close();
		FileOutputStream oFile = new FileOutputStream(file);
		wb.write(oFile);
		oFile.close();
		wb.close();
	}
	

	public static void main(String[] args) {
		WebDriver driver = Drivers.getDriver("chrome");
		DDT_Excel ddt = new DDT_Excel(driver);
		ddt.openMercuryTours();
		try {
			ddt.readExcel();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
