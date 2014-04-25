package com.sample.automation.utils;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.thoughtworks.selenium.Selenium;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.chrome.ChromeBinary;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class SeleniumTestCase {
	
	protected WebDriver driver;
	
   
	@BeforeMethod
    public void setUp() throws Exception {
  
		//System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
      // DesiredCapabilities capab = DesiredCapabilities.chrome();

        //capab.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
      //driver = new ChromeDriver();
   
      //driver = new InternetExplorerDriver("D:\\IEDriverServer_Win32_2.41.0");
   
     //  C:\Program Files\Google\Chrome\Application\chrome.exe
		//ProfilesIni allprofiles = new ProfilesIni();
	//FirefoxProfile profile = allprofiles.getProfile("default");
	 
	/*File pathToBinary = new File("C:\\Program Files\\Nightly\\firefox.exe");
	FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
	FirefoxProfile firefoxProfile = new FirefoxProfile();
	
	driver = new FirefoxDriver(ffBinary,firefoxProfile);
	 
	 
	 
	 
	 /*  DesiredCapabilities capability = DesiredCapabilities.chrome();
  WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
        */
       
        

	       System.setProperty("webdriver.ie.driver", "D:\\Softwares\\Selenium\\IEDriverServer_Win32_2.41.0\\IEDriverServer.exe");
	        DesiredCapabilities capab = DesiredCapabilities.internetExplorer();

	      //  capab.set(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	        driver = new InternetExplorerDriver(capab);
		 
		 
        
        String baseUrl = "https://login.salesforce.com";
    driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
    driver.get(baseUrl+ "/");
    
    }

	@AfterMethod
    public void tearDown() throws Exception {
        System.out.println("Test finished: ");
        driver.quit();
       // selenium.stop();
        
    }
    }

