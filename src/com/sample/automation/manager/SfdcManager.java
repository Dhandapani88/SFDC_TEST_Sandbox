package com.sample.automation.manager;

import com.sample.automation.utils.MyListener;
import com.sample.automation.utils.ScreenShots;
import com.thoughtworks.selenium.Selenium;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.support.ui.Select;







import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;
import org.testng.Assert;


public class SfdcManager {
	
	public static void profileSearch(WebDriver driver,String getuname,String getpwd,String getUname) throws Exception {
		
		driver.findElement(By.id("username")).sendKeys(getuname);
		driver.findElement(By.id("password")).sendKeys(getpwd);
		
		
		driver.findElement(By.xpath(".//*[@id='Login']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='userNavLabel']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='userNav-menuItems']/a[2]")).click();
		
		driver.findElement(By.xpath("//*[@id='setupSearch']")).sendKeys("profiles");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='EnhancedProfiles_font']")).click();
		
		Assert.assertTrue(driver.getPageSource().contains("Developer"));
		
		Thread.sleep(2000);
		
		//driver.findElement(By.linkText("Developer")).click();
		
		//Thread.sleep(2000);
		
		Assert.assertTrue(driver.getPageSource().contains("Developer"));
	}
	
	
	public static void login1(WebDriver driver, String getuname,String getpwd,String reportName) throws Exception {
		

		EventFiringWebDriver mouseDriver = new EventFiringWebDriver(driver);
		MyListener myListener = new MyListener();
		mouseDriver.register(myListener);
		
		EventFiringMouse mouse = new EventFiringMouse(driver, myListener);	
		
		  String[] commands = new String[]{};
	      String AutoItScriptpath = "D:\\download.exe";
	      commands = new String[]{AutoItScriptpath };
	      Runtime.getRuntime().exec(commands);
		
		
		ScreenShots sc = new ScreenShots();
		
		sc.captureScreen();
		
	driver.findElement(By.id("username")).sendKeys(getuname);
	driver.findElement(By.id("password")).sendKeys(getpwd);
	
	sc.captureScreen();
	driver.findElement(By.xpath(".//*[@id='Login']")).click();
	
	Thread.sleep(2000);
	
	
	driver.findElement(By.linkText("Reports")).click();
	
	Thread.sleep(2000);
	
	Assert.assertTrue(driver.getPageSource().contains("Reports"));
	
	Thread.sleep(2000);
	
	Assert.assertTrue(driver.getPageSource().contains(reportName));
	
	
			
	
	
	
	}
	
	
	
	
	
	
	
	public static void login(WebDriver driver, String getuname,String getpwd,String getName) throws Exception {
	

		EventFiringWebDriver mouseDriver = new EventFiringWebDriver(driver);
		MyListener myListener = new MyListener();
		mouseDriver.register(myListener);
		
		EventFiringMouse mouse = new EventFiringMouse(driver, myListener);	
		
		  /*String[] commands = new String[]{};
	      String AutoItScriptpath = "D:\\download.exe";
	      commands = new String[]{AutoItScriptpath };
	      Runtime.getRuntime().exec(commands);
		*/
		
		ScreenShots sc = new ScreenShots();
		
		sc.captureScreen();
		
	driver.findElement(By.id("username")).sendKeys(getuname);
	driver.findElement(By.id("password")).sendKeys(getpwd);
	
	sc.captureScreen();
	driver.findElement(By.xpath(".//*[@id='Login']")).click();
	
	Thread.sleep(2000);
		sc.captureScreen();
	if(driver.getPageSource().contains(getName))
{
			sc.captureScreen();
		driver.findElement(By.linkText("Opportunities")).click();
			}


	Thread.sleep(3000);
	

	sc.captureScreen();	
	
	driver.findElement(By.xpath("//*[@id='bodyCell']/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a")).click();
	
	
	
	
	
	
	
	Locatable hoverItem19 = (Locatable) driver.findElement(By.xpath("//*[@id='0069000000G7ZoT_RelatedQuoteList_link']/span"));
	Coordinates c19 = hoverItem19.getCoordinates();
	try {
	mouse.mouseMove(c19);
	Assert.assertTrue(driver.getPageSource().contains("Quotes"));
	
	driver.findElement(By.partialLinkText("00000")).click();
	} catch (Exception e1) {
	}
	Thread.sleep(3000);
	
	
	String buttonname = driver.findElement(By.xpath("//*[@id='topButtonRow']/input[8]")).getValue();
	
	Assert.assertEquals("CreateOrder", buttonname);

	String winHandleBefore = driver.getWindowHandle();
	
	driver.findElement(By.xpath("//*[@id='topButtonRow']/input[8]")).click();
	
	Thread.sleep(7000);

	for(String winHandle : driver.getWindowHandles()){
        driver.switchTo().window(winHandle);
    }
	
	Thread.sleep(2000);
	
	    driver.getPageSource().contains("Order Detail");
	    
	    String orderNumber = driver.findElement(By.xpath("//*[@id='bodyCell']/div[1]/div[1]/div[1]/h2")).getText();
	    System.out.println("The order number is : " +orderNumber);
	    
	    Assert.assertTrue(driver.getPageSource().contains("Order Detail"));
	    Assert.assertTrue(driver.getPageSource().contains("Totals"));
	    Assert.assertTrue(driver.getPageSource().contains("Prepared For"));
	    Assert.assertTrue(driver.getPageSource().contains("Address Information"));
	    
	    
	    driver.close();
	    
	driver.switchTo().window(winHandleBefore);
	
	
	
	
	
	
	
	}
	
}
