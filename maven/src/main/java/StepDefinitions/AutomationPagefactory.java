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

public class AutomationPagefactory {

	
	CommonFunctions cfObjPagefac = new CommonFunctions();

	
	@Given("^Open automation site$")
	public void openAutomationSite() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		cfObjPagefac.openUrl();
	}
	

	@Given("^click on Tshirt$")
	public void clickonTshirt() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	}
	


	
	
	
}
