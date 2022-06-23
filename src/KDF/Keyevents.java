package KDF ;

import org.openqa.selenium.By;


import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



//Sending F5 key   
//driver.findElement(By.id("name")).sendKeys(Keys.F5);   
 
//Sending arrow down key    
//driver.findElement(By.id("name")).sendKeys(Keys.ARROW_DOWN);   
 
//sending pagedown key from keyboard   

//driver.findElement(By.id("name")).sendKeys(Keys.PAGE_DOWN);   
 
//sending space key    
//driver.findElement(By.id("name")).sendKeys(Keys.SPACE);   
 
//sending tab key   
//driver.findElement(By.id("name")).sendKeys(Keys.TAB);   
 
//sending alt key   
//driver.findElement(By.id("name")).sendKeys(Keys.ALT);  
/*driver.FindElement(By.XPath("String"));
if we add send keys as keyboard command, then we can use keyboard event with the element that we found. like
driver.FindElement(By.XPath("String")).SendKeys(Keys.ArrowRight);
Here, "string" is the Xpath loaction. And on the element that we have found, keyboard's Arrow left will be pressed.
Like that following keys can be pressed
-For the number pad addition key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Add);
-For  the Alt key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Alt);
-For  the Left arrow key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.ArrowDown);
-For  the left arrow key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.ArrowLeft);
-For  the right arrow key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.ArrowRight);
-For  the up arrow key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.ArrowUp);
-For  the Backspace key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Backspace);
-For  the Cancel keystroke.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Cancel);
-For  the Clear keystroke.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Clear);
-For  the function key COMMAND.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Command);
-For  the Control key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Control);
-For  the number pad decimal separator key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Decimal);
-For  the Delete key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Delete);
-For  the number pad division key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Divide);
-For  the Left arrow key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Down);
-For  the End key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.End);
-For  the Enter key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Enter);
-For  the equal sign key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Equal);
-For  the Escape key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Escape);
-For  the function key F1.
driver.FindElement(By.XPath("String")).SendKeys(Keys.F1);
-For  the function key F10.
driver.FindElement(By.XPath("String")).SendKeys(Keys.F10);
-For  the function key F11.
driver.FindElement(By.XPath("String")).SendKeys(Keys.F11);
-For  the function key F12.
driver.FindElement(By.XPath("String")).SendKeys(Keys.F12);
-For  the function key F2.
driver.FindElement(By.XPath("String")).SendKeys(Keys.F2);
-For  the function key F3.
driver.FindElement(By.XPath("String")).SendKeys(Keys.F3);
-For  the function key F4.
driver.FindElement(By.XPath("String")).SendKeys(Keys.F4);
-For  the function key F5.
driver.FindElement(By.XPath("String")).SendKeys(Keys.F5);
-For  the function key F6.
driver.FindElement(By.XPath("String")).SendKeys(Keys.F6);
-For  the function key F7.
driver.FindElement(By.XPath("String")).SendKeys(Keys.F7);
-For  the function key F8.
driver.FindElement(By.XPath("String")).SendKeys(Keys.F8);
-For  the function key F9.
driver.FindElement(By.XPath("String")).SendKeys(Keys.F9);
-For  the Help keystroke.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Help);
-For  the Home key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Home);
-For  the Insert key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Insert);
-For  the left arrow key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Left);
-For  the Alt key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.LeftAlt);
-For  the Control key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.LeftControl);
-For  the Shift key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.LeftShift);
-For  the function key META.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Meta);
-For  the number pad multiplication key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Multiply);
-For  the NUL keystroke.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Null);
-For  the number pad 0 key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.NumberPad0);
-For  the number pad 1 key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.NumberPad1);
-For  the number pad 2 key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.NumberPad2);
-For  the number pad 3 key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.NumberPad3);
-For  the number pad 4 key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.NumberPad4);
-For  the number pad 5 key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.NumberPad5);
-For  the number pad 6 key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.NumberPad6);
-For  the number pad 7 key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.NumberPad7);
-For  the number pad 8 key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.NumberPad8);
-For  the number pad 9 key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.NumberPad9);
-For  the Page Down key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.PageDown);
-For  the Page Up key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.PageUp);
-For  the Pause key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Pause);
-For  the Return key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Return);
-For  the right arrow key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Right);
-For  the semi-colon key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Semicolon);
-For  the number pad thousands separator key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Separator);
-For  the Shift key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Shift);
-For  the Space bar key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Space);
-For  the number pad subtraction key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Subtract);
-For  the Tab key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Tab);
-For  the up arrow key.
driver.FindElement(By.XPath("String")).SendKeys(Keys.Up);
*/

public class Keyevents {
	

public WebDriver driver=new FirefoxDriver();

  @Test
  public void f() throws Exception{
	  	 driver.get("http://gmail.com");
		 driver.findElement(By.id("Email")).sendKeys("manoha.k584@gmail.com");
		 driver.findElement(By.id("next")).click();
		  Thread.sleep(4000);
		  driver.findElement(By.id("Passwd")).sendKeys("silverstar");
	   	  driver.findElement(By.id("signIn")).sendKeys(Keys.ENTER);
	   	  driver.findElement(By.id("")).sendKeys(Keys.ENTER);
  }
}
