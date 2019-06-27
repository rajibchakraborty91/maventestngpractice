package pages;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


//@Listeners(MyListenerClass.class)
@Listeners({MyListenerClass.class})
public class DemoTestng extends BaseTestNg {
	

	
	
	
	@Parameters("browser")
	@Test (groups = { "regre" }, priority = 1, description="Invalid Login Scenario with wrong username and password")
	public void test1(@Optional("testing")String browser)
	{
		System.out.println("First test case");

			dv.get("https://www.google.com");
		
		System.out.println(dv.getTitle()+"---------------"+browser);
			
		
	}
	
	
	@Parameters("laptopcompany")
 @Test(groups = { "regre" }, retryAnalyzer = MyTransformer.class,priority=2,enabled=true)
	
	public void test2(String laptopcompany)
	{
		System.out.println("Second test case");

		dv.get("https://www.onlinesbi.com");
		//Assert.assertTrue(1>2);
		System.out.println(dv.getTitle());
		System.out.println("-------------------------"+laptopcompany+"--------------------");
	}
	
	@Parameters("pcowner")
	@Test(groups = { "regre" },expectedExceptions=ArithmeticException.class,invocationCount=1)
	public void test3(String pcown)
	{
		System.out.println("Third grouped test case");
		dv.get("https://www.netflix.com/in/");
		System.out.println(dv.getTitle());
		System.out.println("---------------"+pcown+"-------");
		System.out.println(10/0);
	
	}
	
	@DataProvider(name="testing2")
	public static Object[][] testing2()
	{
		return new Object[][]{{"mou","pal"}};		
	}
	
	@DataProvider(name="testing")
	public static Object[][] testing()
	{
		return new Object[][]{{"rajib","chakraborty"}};		
	}
	
	
	@Test(groups = {"regre","abc"},dataProvider="readExcel",dataProviderClass=DataProviderExcelClass.class, priority=-1)
	public void test4(String susername,String stitle) throws IOException
	{
		System.out.println("fourth test case");
		
		dv.get("https://www.seleniumhq.org");
		
		dv.navigate().refresh();
		
		System.out.println("---------"+susername);
		System.out.println("---------"+stitle);
		
		
		//-----------hard assert------------------
		Assert.assertTrue(1>2);
		
		//------------------soft assert-------------
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertTrue(1>2);
		
		System.out.println("---------"+stitle);
		
	/*	TakesScreenshot td = (TakesScreenshot)dv;
		
		File fs = td.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(fs, fs);
		
		org.openqa.selenium.io.FileHandler.copy(fs, fs);
		*/
		
		
		
	/* we = dv.findElement(By.xpath(""));
		
		
		we.sendKeys("saf");
		
		we.getAttribute(susername);
		
		we.getText();
		
		we.isDisplayed();*/
		
	/*	WebElement ele = dv.findElement(By.className("afa"));
		
		JavascriptExecutor je =  ((JavascriptExecutor)dv);
		
		je.executeScript("arguments[0].click();", ele);
		
		je.executeScript("document.getElementById('idofelement').click();");*/
		
		/*Select drop = new Select(dv.findElement(By.xpath("Dropdown")));
		
		drop.selectByIndex(1);
		drop.selectByValue("value");
		drop.selectByVisibleText("VisibleText");*/
		
		
		
		//Assert.assertTrue(1>2);
		
		
	}

	
	@AfterTest
	public void aftertestme()
	{
		System.out.println("+++++The test case execution finished after test tag+++++++");
		
		
	}
	
}



