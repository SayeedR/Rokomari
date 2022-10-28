package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.AuthoAndBookSelection;
import utilities.ExtentFactory;

public class InsideRokomariTest extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	public void startUrl(){
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Hover Author Filter Scroll Down and next Page</b></p>")
						.assignAuthor("Sayeed Anwar").assignDevice("Windows");
		
		PageDriver.getCurrentDriver().manage().window().maximize();
	}
	
	@Test (priority = 0, description = "Select লেখক from the menu")
	public void selectAuthorTest() throws IOException{
		
		
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Sign Up using Google</b></p>\")");
		
		AuthoAndBookSelection authoAndBookSelection = new AuthoAndBookSelection(childTest);
		authoAndBookSelection.hoverAuthor();
				
	}
	
	@Test (priority = 1, description = "Select হুমায়ুন আহমেদ")
	public void selectHimuTest() throws IOException{
		
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Select হুমায়ুন আহমেদ</b></p>\")");
		
		
		AuthoAndBookSelection authoAndBookSelection = new AuthoAndBookSelection(childTest);
		authoAndBookSelection.authorClick();
		
				
	}
	
	@Test (priority = 2, description = "Filter  Categories like সমকালীন উপন্যাস, রচনা সংকলন ও সমগ্র")
	public void FilterCategoriesTest() throws IOException{
		
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Filter  Categories like সমকালীন উপন্যাস, রচনা সংকলন ও সমগ্র</b></p>\")");
		
		
		AuthoAndBookSelection authoAndBookSelection = new AuthoAndBookSelection(childTest);
		authoAndBookSelection.filterClick();
				
	}
	
	@Test (priority = 3, description = " Scroll Down and go to Next Page")
	public void scrollDownAndNextPageTest() throws IOException{
		
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Scroll Down and go to Next Page</b></p>\")");
		
		AuthoAndBookSelection authoAndBookSelection = new AuthoAndBookSelection(childTest);
		authoAndBookSelection.scrollTonext();
		authoAndBookSelection.clickOnNextPage();
				
	}
	
	@Test (priority = 4, description = " Add to the cart any book")
	public void AddBookTest() throws IOException{
		
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Add to the cart any book</b></p>\")");
		
		
		AuthoAndBookSelection authoAndBookSelection = new AuthoAndBookSelection(childTest);
		authoAndBookSelection.addToCard();
	}
	
	@Test (priority = 5, description = "Click Cart Icon")
	public void ClickCartIconTest() throws IOException{
		
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Click Cart Icon</b></p>\")");
		
		AuthoAndBookSelection authoAndBookSelection = new AuthoAndBookSelection(childTest);
		authoAndBookSelection.clickOncard();
				
	}
	@Test (priority = 6, description = "Go to the Shipping page")
	public void goToShippingPageTest() throws IOException{
		
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Go to the Shipping page</b></p>\")");
		
		AuthoAndBookSelection authoAndBookSelection = new AuthoAndBookSelection(childTest);
		authoAndBookSelection.clickOncard();
		authoAndBookSelection.placeOrderClick();
				
	}
	
	@AfterClass
	public void afterClass() {
		report.flush();
	}


}
