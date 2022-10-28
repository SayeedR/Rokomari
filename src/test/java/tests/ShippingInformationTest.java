package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.ShippingInfo;
import utilities.ExtentFactory;

public class ShippingInformationTest extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	public void startUrl(){
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Shipping Information Test</b></p>")
						.assignAuthor("Sayeed Anwar").assignDevice("Windows");
		
		PageDriver.getCurrentDriver().manage().window().maximize();
	}
	
	@Test (priority = 0, description = "Give shipping Information")
	public void shippingInformation() throws IOException{
		
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Give shipping Information</b></p>\")");
		
		ShippingInfo shippingInfo = new ShippingInfo(childTest);
		shippingInfo.ratioButtonClick();
		shippingInfo.sendName();
		shippingInfo.sendphoneNumber();
		shippingInfo.sendAltNumber();
		shippingInfo.clickLocation();
		shippingInfo.selectCountry();
		shippingInfo.clickOnCity();
		shippingInfo.sendAddress();		
		
	}
	@AfterClass
	public void afterClass() {
		report.flush();
	}


}
