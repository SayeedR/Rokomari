package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.Rokomari;
import utilities.ExtentFactory;


public class SignInTest extends BaseDriver{
	
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	public void startUrl(){
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Sign Up using Google</b></p>")
						.assignAuthor("Sayeed Anwar").assignDevice("Windows");
		PageDriver.getCurrentDriver().get(BaseUrl);
		PageDriver.getCurrentDriver().manage().window().maximize();
	}

	@Test (priority = 1, description = " Sign Up using Google")
	public void rokomariTest() throws IOException{
		
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Sign Up using Google</b></p>\")");
		
		Rokomari rokomari = new Rokomari(childTest);
		rokomari.clickOnSignIn();
		rokomari.clickOnSignUp();
		rokomari.clickOnGoogleLink();
		rokomari.inputFieldMail();
		rokomari.clickOnNext();
		rokomari.inputFieldPassword();
		rokomari.clickOnPasswordNext();
		
	}
	
	@AfterClass
	public void afterClass() {
		report.flush();
	}

}
