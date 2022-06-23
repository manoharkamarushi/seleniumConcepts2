package mercurytoursframework_DDF ;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryTours {
	WebDriver driver;
	
	public MercuryTours(WebDriver driver){
		this.driver = driver;
	}
	
	public void openMercuryTours(){
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}
	
	public void login(){
		driver.findElement(By.cssSelector("input[name='userName']")).sendKeys("mercury");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("mercury");
		driver.findElement(By.cssSelector("input[name='login']")).click();
		System.out.println(driver.getTitle());
	}
	
	public void flightFinder(){
		
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		driver.findElement(By.xpath("//select[@name='passCount']/option[3]")).click();
		//driver.findElement(By.xpath("//select[@name='fromPort']/option[5]")).findElements(By.tagName("option"))
		List<WebElement> allOptions = driver.findElements(By.xpath("//select[@name='fromPort']/option"));
		/*for (WebElement option : alOptions){
			if (option.getText().contains("Paris")){
				option.click();
				break;
			}
		}*/
		
		int count = allOptions.size();
		System.out.println(count);
		for (int i=0; i<count; i++){
			WebElement option = allOptions.get(i);
			if (option.getText().contains("Paris")){
				option.click();
			}
		}
	}
	
	public void flightFinder(String expectedCity){
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		driver.findElement(By.xpath("//select[@name='passCount']/option[3]")).click();
		WebElement departFrom = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select select = new Select(departFrom);
		List<WebElement> allOptions = select.getOptions();
		for (WebElement option : allOptions){
			System.out.println(option.getText());
			if (option.getText().equals(expectedCity)){
				//option.click();
				select.selectByValue(expectedCity);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		WebDriver driver = Drivers.getDriver("firefox");
		
		MercuryTours mt = new MercuryTours(driver);
		mt.openMercuryTours();
		mt.login();
		//mt.flightFinder();
		mt.flightFinder("Sydney");
	}

}
