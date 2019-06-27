package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.management.DescriptorRead;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.TestNG;
import org.testng.annotations.*;

import com.google.common.collect.Lists;

public class BaseTestNg  {	
	WebDriver dv;
	WebDriver di;
String m="rajib";
	WebDriver dvx;
	
	public static int count=1;
	

	
	@BeforeSuite(alwaysRun = true)
	public void startme() throws AWTException,IOException
	{
		System.out.println("Execution starts now!!!!");
		
		/*DesiredCapabilities capa = DesiredCapabilities.chrome();
		
		capa.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);*/
		/*------------Handle SSL alert--------------------
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);*/
		System.setProperty("webdriver.chrome.driver", "D:\\Java Documents\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless");
		/*co.merge(cap);*/
		dv = new ChromeDriver(co);
		/**************cooking management -----------------
		Set st = dv.manage().getCookies();
		dv.manage().deleteAllCookies();
		Cookie ck = new Cookie("cookieName", "cookieValue");;;
		dv.manage().addCookie(ck);
		//dic = new InternetExplorerDriver(cap);
		//*******************************************
	/*	Robot rt = new Robot();
		
		rt.keyPress(KeyEvent.VK_1);
		rt.keyRelease(KeyEvent.VK_1);
		rt.mousePress(InputEvent.mouse);
		
		ControlFocus("title:open","","Edit1");
		ControlSetText("title:open","","Edit1","path")
		ControlClick("title:open","","Button1")
		Runtime.getRuntime().exec("abc.exe");*/
		/*
		Actions ac = new Actions(dv);
		
		ac.moveToElement(dv.findElement(By.xpath(""))).build().perform();
		
		
	/*	
		WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver", "");
		driver.get("https://www.google.com");
		driver.navigate().to("");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		//--------------implicitly wait ---------------
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//---------------- explicit wait---------------
		WebDriverWait wd = new WebDriverWait(driver, 20);
		wd.until(ExpectedConditions.elementToBeClickable(By.xpath("\\input")));
		//--------------------Fluent wait ---------------------------
		Wait fw =  new FluentWait(driver).withTimeout(30,TimeUnit.SECONDS).pollingEvery(5,TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
		
		//----------handling windows ------------------
		String currentwindow = driver.getWindowHandle();
		
		Set<String> listwindows = driver.getWindowHandles();
		
		Iterator it = listwindows.iterator();
		
		while(it.hasNext())
		{
			String nextwindow = (String)it.next();
			
			//////////------------------- switch to next window which is not the current window-------
			if (currentwindow!=nextwindow)
			{
				driver.switchTo().window(nextwindow);
			}
			
		}
		
		//********************** switching frames ------------------
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("framename/id");
		driver.switchTo().frame(driver.findElement(By.xpath("//input[@classpath]")));
		
		//------------------------*/
		
		
		
	}
	
	
	@AfterSuite(alwaysRun = true)
	public void Finishme()
	{
		
		count=count+1;
		System.out.println("End of suite");
	if (count<3)
		{
		
		TestNG testng = new TestNG();
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("D:\\Java Documents\\text\\maven\\test-output\\testng-failed.xml");
	
		//testng.setTestSuites(al);
		
		//testng.run();
		
		}
		
		dv.quit();
	}
	@BeforeTest(alwaysRun = true)
	public void setupdriver()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java Documents\\chromedriver_win32\\chromedriver.exe");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void startmethod()
	{
		System.out.println("The method starts");
		
	}
	
	@AfterMethod(alwaysRun = true)
	public void takescreenshot(ITestResult result) throws Exception
	{
	
		System.out.println("The method ends");
		
		WebDriver dts = dv;
		
		if (ITestResult.FAILURE==result.getStatus()) 
				{
			
			CommonFunctions cm = new CommonFunctions("");
			
			cm.screenshotcapture(dv);
			
		}
		
		
	
		
	}
	
	
	
}

