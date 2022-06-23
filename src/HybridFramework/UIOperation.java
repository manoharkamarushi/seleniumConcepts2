package HybridFramework;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UIOperation {
	WebDriver driver1;
	
	public UIOperation(WebDriver driver){
		driver1 = driver;
	}
	public void perform(Properties p,String operation,String objectName,String objectType,String value) throws Exception{
		System.out.println("Operation: " + operation + " ObjectName: " + objectName + " ObjectType: "+ objectType +" Value: "+ value);
	
		switch (operation.toUpperCase()) {
		case "CLICK":
			//Perform click
			//Thread.sleep(3000);
			driver1.findElement(this.getObject(p,objectName,objectType)).click();
			
			break;
		case "SETTEXT":
			//Set text on control
			driver1.findElement(this.getObject(p,objectName,objectType)).sendKeys(value);
			//Thread.sleep(3000);
			break;
			
		case "GOTOURL":
			//Get url of application
			driver1.get(p.getProperty(value));
			
			break;
		case "GETTEXT":
			//Get text of an element
			driver1.findElement(this.getObject(p,objectName,objectType)).getText();
			//Thread.sleep(3000);
			break;
			
		case "CHECK":
			//uncheck the checkbox
			driver1.findElement(this.getObject(p,objectName,objectType)).click();
			break;
		default:
			break;
		}
	}
	
	/**
	 * Find element BY using object type and value
	 * @param p
	 * @param objectName
	 * @param objectType
	 * @return
	 * @throws Exception
	 */
	private By getObject(Properties p,String objectName,String objectType) throws Exception{
		String so;
		//Find by xpath
		if(objectType.equalsIgnoreCase("XPATH")){
			
			return By.xpath(p.getProperty(objectName));
		}
		//find by id
else if(objectType.equalsIgnoreCase("ID")){
			
			return By.id(p.getProperty(objectName));
			
		}
		//find by class
		else if(objectType.equalsIgnoreCase("CLASSNAME")){
			
			return By.className(p.getProperty(objectName));
			
		}
		//find by name
		else if(objectType.equalsIgnoreCase("NAME")){
			so = p.getProperty(objectName);
			System.out.println(so.toString());
			return By.name(p.getProperty(objectName));
			
		}
		//Find by css
		else if(objectType.equalsIgnoreCase("CSS")){
			
			return By.cssSelector(p.getProperty(objectName));
			
		}
		//find by link
		else if(objectType.equalsIgnoreCase("LINK")){
			
			return By.linkText(p.getProperty(objectName));
			
		}
		//find by partial link
		else if(objectType.equalsIgnoreCase("PARTIALLINK")){
			
			return By.partialLinkText(p.getProperty(objectName));
			
		}else
		{
			throw new Exception("Wrong object type");
		}
	}
}



