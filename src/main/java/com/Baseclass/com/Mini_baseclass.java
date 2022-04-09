package com.Baseclass.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetAllWindowHandles;
import org.openqa.selenium.remote.server.handler.interactions.touch.Move;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;
import org.openqa.selenium.support.ui.Select;

import com.google.common.annotations.VisibleForTesting;

public class Mini_baseclass {
	public static  WebDriver driver;
	public static WebDriver browserlaunch (String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhun ck\\eclipse-workspace\\miniproject\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\vidhun ck\\eclipse-workspace\\miniproject\\driver\\geckodriver.exe");
		driver= new FirefoxDriver();
		}
		
		else if (browser.equalsIgnoreCase("incognito")) {
			ChromeOptions options = new ChromeOptions();
			FirefoxOptions options2 = new FirefoxOptions();
			options.addArguments("--start-Maximized");
			options2.addArguments("--start-Maximized");
			options.addArguments("--disable-popup-blocking");
			options2.addArguments("--disable-popup-blocking");
			driver = new ChromeDriver(options);
		}			
		
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void Singledrop(WebElement element,String selectionmethod, String values) {
		Select s = new Select(element);
		if(selectionmethod.equalsIgnoreCase("values")) {
			s.selectByValue(values);
		}
		else if (selectionmethod.equalsIgnoreCase("visible")){
		
		s.selectByVisibleText(values);
		} 
		else if(selectionmethod.equalsIgnoreCase("index")) {
			int index=Integer.parseInt(values);
			s.selectByIndex(index);
		}
		
		else {
			System.out.println("singeldropdown");;
			}

	}
	public static void urlLaunch(String url) {
	driver.get(url);
	}
	public static void MoveToElements(WebElement elements) {
	
	Actions move = new Actions(driver);
	move.contextClick(elements).build().perform();
  }
  public static void Scrolldown() {
	  JavascriptExecutor js= (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,500)","");
	}
   public static void Scrollbyview2() {
   JavascriptExecutor rc = (JavascriptExecutor)driver;
   rc.executeScript("arugument[0].scrollIntoView(0)","elements");  
   }
  
    public static void Movements() throws AWTException {
    	Robot ak = new Robot();
		ak.keyPress(KeyEvent.VK_DOWN);
		ak.keyRelease(KeyEvent.VK_ENTER);
		ak.keyPress(KeyEvent.VK_ENTER);
		ak.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void switchToTabs(Object GetTitleName) {
    	String parent= driver.getWindowHandle();
    	Set<String>tabs= driver.getWindowHandles();
    	for(String id : tabs) {
    		String TextToFind= driver.switchTo().window(id).getTitle();
    		System.out.println(TextToFind);
    	}
    	}
    public static void Wait(WebElement element)  {
	driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	
	}
    public static void Close() {
    	driver.close();
    	}
    public static void click(WebElement element) {
    	element.click();
	

	}
  public static void Navigate_to(String url) {
	driver.navigate().to(url);

}
  public static void Navigate_back() {
driver.navigate().back();

}
  public static void Alert(Object Titlename ) {
   driver.switchTo().alert();

}
  public static void Frame(WebElement element) {
	driver.switchTo().frame(element);

}
  public static void Checkbox(WebElement element) {
	  element.click();
}
  public static void AttributeValue(WebElement element,String value) {
	element.getAttribute(value);
	
}
  public static void Screenshot() throws IOException {
TakesScreenshot rs= (TakesScreenshot) driver;
File source = rs.getScreenshotAs(OutputType.FILE);
File location1 = new File("C:\\Users\\vidhun ck\\eclipse-workspace\\pom\\Screenshot\\photo.png");
FileUtils.copyFileToDirectory(source, location1);

}
  
public static void RadioButton(WebElement element) {
element.click();

}  
  public static void GetEnable(WebElement element) {
	  element.isEnabled();

}
  public static void GetDisplayed(WebElement element) {
	  element.isDisplayed();
}
  public static void Selected(WebElement element) {
element.isSelected();	
}
  public static void Refresh() {
	  driver.navigate().refresh();
}
  
 public static void SendValues(WebElement element, String values) {
	 element.sendKeys(values);
} 
  
}
