package org.orangeHRM.com;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class BaseClass{
	
	public static WebDriver driver;
	
	public static WebDriver setup(String bname){
		
		if(bname.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sheela.WINDOWS-4R3S7OJ\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			return driver;
		}
		else if(bname.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sheela.WINDOWS-4R3S7OJ\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			return driver;
		}else
			
			throw new NullPointerException("InvalidBrowser");		
	}
	public static void navigate(WebDriver driver, String action) {
		
		if(action.equalsIgnoreCase("forward"))
		{
			driver.navigate().forward();
		}else if (action.equalsIgnoreCase("backward"))
		{
			driver.navigate().back();
		}else if (action.equalsIgnoreCase("maximize"))
		{
			driver.manage().window().maximize();			
		}else if (action.equalsIgnoreCase("refresh"))
		{
			driver.navigate().refresh();			
		}
		else
		{
			System.out.println("Navigation function is not used");
		}
		

	}
	
	public static void geturl(String url) {
		driver.get(url);

	}
		
	public static void sleep() throws Throwable {
		Thread.sleep(3000);
	}
	public static void click(WebElement element) {
		
		element.click();
	}
	public static void sendkeys(WebElement element, String value) {
		element.sendKeys(value);
		element.getText();
	}
	public static void close() {
		driver.close();
	}
	
	public void mouse(WebElement element) {
		Actions ac = new Actions(driver);	
		ac.moveToElement(element).perform();
		//ac.contextClick().perform();
		//ac.doubleClick().perform();
		
	}
	
	public static void drag(WebElement element, WebElement element2) {
		Actions ac1 = new Actions(driver);
		ac1.dragAndDrop(element, element2).perform();
	}
	
	public static void select(WebElement element, String value) {
		Select sc = new Select(element);
		sc.selectByValue(value);
	}
	public static void check(WebElement element) {
		element.isSelected();
		//element.isEnabled();
		//element.isDisplayed();
	}
	public static void frame(WebElement element) {
		driver.switchTo().frame(0);
	}
	public static void default_frame() {
		driver.switchTo().defaultContent();
	}
	
	public static void screenshot(String scpath) throws InterruptedException{
		
		String path = scpath + Math.random() + ".png";
		System.out.println(path);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		try {
		File dtn = new File(path);
		Files.copy(src, dtn);
		}catch (IOException e)
		{
			System.out.println("Exception is occured");
		} finally
		{
			System.out.println("Screenshot saved successfully");
		}
			
	}
	
	

}
