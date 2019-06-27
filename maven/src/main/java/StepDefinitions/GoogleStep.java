package StepDefinitions;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Robot;
import java.io.IOException;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import pages.CommonFunctions;

public class GoogleStep {

	
	CommonFunctions cfObj = new CommonFunctions();

	
	@Given("^Open google com$")
	public void open_google_com() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		cfObj.openUrl();
	}
	

	@Then("^User enter search term$")
	public void user_enter_search_term()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hello");
		//assertEquals(false,true);
	}

	@Then("^user clicks Search button$")
	public void user_clicks_Search_button()  {
	    // Write code here that turns the phrase above into concrete actions
		cfObj.clickSearch();
		
	}
	@Then("^Fail it$")
	public void failit()  {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(1>2);
		
	}
	
	
	@Given("^Open agmax website$")
	public void open_agmax_com() throws Exception {
		
		cfObj.openUrl();
			
		System.out.println("heyyy");
		
	}
	
		
	
	@Then("^Get the response code$")
	public void responsecode()
	{
	
	
			
	}
	
	@Then("^User clicks on Download menu$")
	public void downloadpdf() throws IOException  {
	    
		
		cfObj.clickDownload();
		
		cfObj.clickOnUserGuide();
		
		cfObj.pdfReadText();
		
		cfObj.ResponseCode();
		
		//cfObj.pdfReadTextDrive();
		
		
		
	}
	
	
	
	
}

 class ThreadMe implements Runnable
{
	 Robot rb;
	public void run() 
	{
		
		try {
			rb = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("heyyy");
	}
	
	
	
	
}
