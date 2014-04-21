package com.sample.automation.manager;

import com.sample.automation.utils.MyListener;
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
	
	
	public static void login(WebDriver driver, String getuname,String getpwd,String getName) throws InterruptedException, IOException {
	

		EventFiringWebDriver mouseDriver = new EventFiringWebDriver(driver);
		MyListener myListener = new MyListener();
		mouseDriver.register(myListener);
		
		EventFiringMouse mouse = new EventFiringMouse(driver, myListener);	
		
		  /*String[] commands = new String[]{};
	      String AutoItScriptpath = "D:\\download.exe";
	      commands = new String[]{AutoItScriptpath };
	      Runtime.getRuntime().exec(commands);
		*/
		
	driver.findElement(By.id("username")).sendKeys(getuname);
	driver.findElement(By.id("password")).sendKeys(getpwd);
	
	driver.findElement(By.xpath(".//*[@id='Login']")).click();
	
	Thread.sleep(2000);
		
	if(driver.getPageSource().contains(getName))
{
			
		driver.findElement(By.linkText("Opportunities")).click();
			}

Thread.sleep(3000);
	
	
	
	
	
	//Assert.assertTrue(driver.getPageSource().contains("Opportunities"));
	
	String opprtunityName = driver.findElement(By.xpath("//*[@id='bodyCell']/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a")).getText();
	driver.findElement(By.xpath("//*[@id='bodyCell']/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a")).click();
	
	driver.getPageSource().contains(opprtunityName);
	
	Assert.assertTrue(driver.getPageSource().contains("Quotes"));
	
	WebElement quote = driver.findElement(By.id("0069000000AJeJ5_RelatedQuoteList"));
	
	driver.findElement(By.xpath("//*[@id='0069000000AJeJ5_RelatedQuoteList_body']/table/tbody/tr[2]/th/a")).click();
	
	Thread.sleep(2000);
	
	String winHandleBefore = driver.getWindowHandle();

	driver.findElement(By.xpath("//*[@id='topButtonRow']/input[8]")).click();

	Thread.sleep(4000);
	for(String winHandle : driver.getWindowHandles()){
    driver.switchTo().window(winHandle);
    }
	
	
	driver.getPageSource().contains("Order Detail");

	driver.close();

	Thread.sleep(2000);


	driver.switchTo().window(winHandleBefore);
	
	
	
	
	
	
	
	
	}
	
}
