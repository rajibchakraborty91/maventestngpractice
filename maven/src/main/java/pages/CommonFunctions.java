package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import gherkin.deps.net.iharder.Base64.InputStream;

public class CommonFunctions {
	
	static WebDriver driver;
	private final String properties="D:\\Java Documents\\text\\maven\\src\\main\\java\\application.properties" ;
	File file;
	FileInputStream fnp;
	Properties prop ;
	WebElement download;
	WebElement searchButton;
	WebElement userGUide;
	public CommonFunctions() {
		// TODO Auto-generated constructor stub
	
				
		prop = new Properties();;
		
		try
		{
			
		prop.load(new FileInputStream(new File(properties)));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java Documents\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		System.out.println(prop.getProperty("url"));
		  
	}
	
	
	public CommonFunctions(String ql)
	{
		
	}
	 public static  WebDriver getDriver()
     {
         return driver;
     }
	
	public void openUrl()
	{
		System.out.println(prop.getProperty("URL"));
		
		  HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		    chromePrefs.put("plugins.always_open_pdf_externally", true);
	        chromePrefs.put("profile.default_content_settings.popups", 0);
	       
	        ChromeOptions options = new ChromeOptions();
	        options.setExperimentalOption("prefs", chromePrefs);
	        //driver = new ChromeDriver(cap);
		    driver.get(prop.getProperty("URL"));
		
	}
	
	public void clickDownload()
	{
		 download = driver.findElement(By.xpath("//a[contains(text(),'Download')]"));
		 
		 waitforvisibility(download, 20);
		 
		 highlight(download);

		 download.click();
		 
		 
	}
	
	public void clickSearch()
	{
		 searchButton = driver.findElement(By.xpath("//input[@name='q']"));
		 
		 waitforvisibility(searchButton, 20);
		 
		 highlight(searchButton);

		 searchButton.sendKeys("abc");
		 
		
		List<WebElement> li =   driver.findElements(By.tagName("a"));
		
		Iterator<WebElement> it = li.iterator();
		
		//it.next().getAttribute("href")
		
		
		
		 
		// Wait wait = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(100, TimeUnit.MICROSECONDS).ignoring(NoSuchElementException.class);  

		 
		 //ewat.until(arg0)
		 
		 //-----------------IMPLICIT WAIT--------------
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 
		 
		try{
			
			Thread.sleep(5000);
		}
		
		catch(Exception e)
		{
			
		}
		 
		 WebElement firstResult = driver.findElement(By.xpath("//ul[@class='erkvQe']/li[1]"));
		 
		 waitforvisibility(firstResult, 10);
		 
		 firstResult.click();
		 
		 waitforvisibility(driver.findElement(By.xpath("//div[@class='a4bIc']/input[@name='q']")), 20);
		 
		 
		 System.out.println(driver.findElement(By.xpath("//div[@class='a4bIc']/input[@name='q']")).getAttribute("value"));
		 
		 
	}
	
	public void clickOnUserGuide()
	{
		userGUide = driver.findElement(By.xpath("//a[contains(@href,'UserGuide')]"));
		
		waitforvisibility(userGUide, 20);
		
		moveToElement(userGUide);
		
		highlight(userGUide);
			
		userGUide.click();
		
	}
	
	public void highlight(WebElement highlight_Element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String sx = highlight_Element.getCssValue("background");
		
		System.out.println(sx);
    
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",highlight_Element);
	}
	
	public void moveToElement(WebElement ele)
	{
		Actions act = new Actions(driver);
		
		act.moveToElement(ele).build().perform();
		
	}
	
	public void waitforvisibility(WebElement elemment, int timeInseconds)
	{
		
		WebDriverWait wait = new WebDriverWait(driver, timeInseconds);
		
		wait.until(ExpectedConditions.visibilityOf(elemment));
		
		
		
	}
	
	public void pdfReadText() throws IOException
	{
		URL url = new URL("https://www.axmag.com/download/UserGuide.pdf");
		
		java.io.InputStream is = url.openStream();
		
		BufferedInputStream bis = new BufferedInputStream(is);
		
		PDDocument document = PDDocument.load(is);
		
		String pdftext = new PDFTextStripper().getText(document);
		
		System.out.println(document.getNumberOfPages());
		
		assertTrue((pdftext.contains("aXmag")), "PASSED");

		
	}
	
	public void ResponseCode() throws IOException
	
	
	{
		URL url = new URL("https://www.axmag.com/download.html");
		
		HttpURLConnection Hurl = (HttpURLConnection)url.openConnection();
		
		System.out.println("Response code is: "+Hurl.getResponseCode());
		
		assertTrue(Hurl.getResponseCode()>=400);
						
			
		
	}
	
	
	
	
	public void pdfReadTextDrive() throws IOException
	{
		URL url = new URL("file:///C:/Users/Rajib/Documents/sample.pdf");
		
		java.io.InputStream is = url.openStream();
		
		PDDocument document = PDDocument.load(is);
		
	
		String pdftext = new PDFTextStripper().getText(document);
			
		System.out.println(document.getNumberOfPages());
	
		assertTrue((pdftext.contains("Virtual Mechanics tutorials")), "PASSED");
		
		
	}
	
		public void waitforframeswitch(WebElement element, int timeout)
		{
			
			WebDriverWait excwait = new WebDriverWait(driver, timeout);
			
			excwait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(userGUide));
			//excwait.until(ExpectedConditions.ele)
			
		}
	
	
		public void screenshotcapture(WebDriver driver) throws Exception
		{
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			Random rand = new Random();

			// nextInt as provided by Random is exclusive of the top value so you need to add 1 

			int randomNum = rand.nextInt((999 - 1) + 1) + 1;
			
			FileUtils.copyFile(src, new File("D:\\Java Documents\\failure_"+randomNum+".jpg"));
			
		}
		
}
