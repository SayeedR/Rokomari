package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import junit.framework.Assert;
import utilities.CommonMethods;
import utilities.GetScreenShot;

public class ShippingInfo extends CommonMethods{

	ExtentTest test;
	
	public ShippingInfo(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	//for TestCase 2
	
	
	
		//shopping Information TestCase
		
		@FindAll({
			@FindBy(xpath = "//form[@method='POST']//div//div//label[@for='home'][normalize-space()='Home']")
			
		})
		WebElement ratioButton;
		
		@FindAll({
			@FindBy(xpath = "//form[@method='POST']//div//div//div//input[@id='name']")
			
		})
		WebElement nameInput;
		
		@FindAll({
			@FindBy(xpath = "//form[@method='POST']//div//div//div//input[@id='phone']")
		})
		WebElement phoneNumber;
		
		@FindAll({
			@FindBy(xpath = "//input[@class='js--alternative-phone']")
		})
		WebElement altNumber;
		
		@FindAll({
			@FindBy(xpath = "//select[@name='countryId']")
		})
		WebElement location;
		
		@FindAll({
			@FindBy(xpath = "//select[@class='custom-select js-shipping-country js-shipping-courier']"),
			@FindBy(id = "js--country")
		})
		WebElement selCountry;
		
		@FindAll({
			@FindBy(xpath = "//select[@id='js--courier']")
			
		})
		WebElement clickCity;
		
		@FindAll({
			@FindBy(xpath = "//textarea[@id='address'][1]")
			
		})
		WebElement address;
		
		@SuppressWarnings("unused")
		public void sendAddress() throws IOException {
			test.info("sending address");
			
			try {
				if (address.isDisplayed()) {
					//addressGenerate();
					address.clear();
					sendText(address,addressGenerate());
					test.pass("<p style=\"color:green; font-size:13px\"><b>address Click.</b></p>");
					timeOut();
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "addressPass");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "addressPass.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>address location not avialble.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "address");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "address.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(address.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			
		}
		
		
		
		@SuppressWarnings("unused")
		public void clickOnCity() throws IOException {
			test.info("click on city ");
			try {
				if (clickCity.isDisplayed()) {
					selectItemByIndex(clickCity, 0);
					test.pass("<p style=\"color:green; font-size:13px\"><b>City Click.</b></p>");
					timeOut();
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "clickCityPass");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickCityPass.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>city location not avialble.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "clickCity");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickCity.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(clickCity.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
	
		}
		
		
		@SuppressWarnings("unused")
		public void selectCountry() throws IOException {
			test.info("select city");
			
			try {
				if (selCountry.isDisplayed()) {
					selectItemByIndex(selCountry, 2);
					test.pass("<p style=\"color:green; font-size:13px\"><b>selCountry Click.</b></p>");
					timeOut();
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "selCountryPass");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "selCountryPass.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>selCountry location not avialble.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "selCountry");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "selCountry.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(selCountry.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
		}
		
		@SuppressWarnings("unused")
		public void clickLocation() throws IOException {
			test.info("click on location");

			try {
				if (location.isDisplayed()) {
					selectItemByIndex(location, 2);
					test.pass("<p style=\"color:green; font-size:13px\"><b>location Click.</b></p>");
					timeOut();
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "locationPass");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "locationPass.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b> location not avialble.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "location");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "location.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(location.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			
		}
		
		@SuppressWarnings("unused")
		public void sendAltNumber() throws IOException {
			
			try {
				if (nameInput.isDisplayed()) {
					nameInput.clear();
					sendText(altNumber,phoneNumberGenerate());
					test.pass("<p style=\"color:green; font-size:13px\"><b>phone Number Click.</b></p>");
					timeOut();
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "nameInputPass");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "nameInputPass.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b> phone Number location not avialble.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "nameInput");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "nameInput.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(phoneNumber.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			
			
		}
		@SuppressWarnings("unused")
		public void sendphoneNumber() throws IOException {
			test.info("send phone number");
			
			try {
				if (phoneNumber.isDisplayed()) {
					phoneNumber.clear();
					sendText(phoneNumber,phoneNumberGenerate());
					test.pass("<p style=\"color:green; font-size:13px\"><b>phone Number Click.</b></p>");
					timeOut();
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "phoneNumberPass");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "phoneNumberPass.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b> phone Number location not avialble.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "phoneNumber");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "phoneNumber.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(phoneNumber.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			
		}
		@SuppressWarnings("unused")
		public void sendName() throws IOException {
			test.info("send name");

			try {
				if (nameInput.isDisplayed()) {
					nameInput.clear();
					sendText(nameInput,firstNameGenerate());
					test.pass("<p style=\"color:green; font-size:13px\"><b>name Input send.</b></p>");
					timeOut();
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "nameInputPass");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "nameInputPass.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b> name Input location not avialble.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "nameInput");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "nameInput.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(nameInput.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
		}
		
		@SuppressWarnings("unused")
		public void ratioButtonClick() throws IOException {
			test.info("click on ratio button");
			try {
				if (ratioButton.isDisplayed()) {
					ratioButton.click();
					test.pass("<p style=\"color:green; font-size:13px\"><b>ratio Button click.</b></p>");
					timeOut();
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ratioButtonPass");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ratioButtonPass.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b> ratio Button location not avialble.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ratioButton");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ratioButton.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(ratioButton.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
		}
	
}
