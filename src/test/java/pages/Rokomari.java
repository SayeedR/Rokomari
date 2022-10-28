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

public class Rokomari extends CommonMethods{

	ExtentTest test;
	
	public Rokomari(ExtentTest test) {
			PageFactory.initElements(PageDriver.getCurrentDriver(), this);
			this.test = test;
		}
	//TestCase
	@FindAll({
		@FindBy(xpath = "//a[normalize-space()='Sign in']")
	})
	WebElement signIn;
	
	@FindAll({
		@FindBy(xpath = "//span[normalize-space()='Google']")
	})
	WebElement google;
	
	@FindAll({
		@FindBy(xpath = "//div[@id='js--registration-form']//div//div//button[@onclick=\"gtag('event', 'login', { method: 'GOOGLE'});callGoogleLogin()\"][normalize-space()='Google']")
	})
	WebElement googlelink;
	
	@FindAll({
		@FindBy(xpath = "//input[@id='identifierId']")
	})
	WebElement googleField;
	
	@FindAll({
		@FindBy(xpath = "//span[normalize-space()='Next']"),
		@FindBy(xpath = "//span[contains(text(),'পরবর্তী')]")
	})
	WebElement next;
	
	@FindAll({
		@FindBy(xpath = "//p[normalize-space()='Sign up']")
	})
	WebElement signUp;
	
	@FindAll({
		@FindBy(xpath = "//input[@name='password']"),
	})
	
	WebElement password;
	@FindAll({
		@FindBy(xpath = "//span[normalize-space()='Next']"),
		@FindBy(xpath = "//span[contains(text(),'পরবর্তী')]")
		
	})
	
	WebElement passNext;
	
	@SuppressWarnings("unused")
	public void clickOnSignIn() throws IOException {
		test.info("click on sign in");

		try {
			if (signIn.isDisplayed()) {
				signIn.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>sign InInput click.</b></p>");
				timeOut();
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "signInPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "signInPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b> sign Input location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "signIn");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "signIn.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(signIn.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
	}
	
	@SuppressWarnings("unused")
	public void clickOnSignUp() throws IOException {
		test.info("click on sign up");
		try {
			if (signUp.isDisplayed()) {
				signUp.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>sign Up click.</b></p>");
				timeOut();
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "signUpPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "signUpPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b> sign up location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "signUp");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "signUp.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(signUp.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	@SuppressWarnings("unused")
	public void clickOnGoogleLink() throws IOException {
		test.info("click on google link");
		try {
			if (googlelink.isDisplayed()) {
				googlelink.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>google link click.</b></p>");
				timeOut();
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "googlelinkPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "googlelinkPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
				
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b> googlelink location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "googlelink");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "googlelink.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(googlelink.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	
	
	@SuppressWarnings("unused")
	public void inputFieldMail() throws IOException {
		test.info("sending mail");
		try {
			if (googleField.isDisplayed()) {
				sendText(googleField, "automationtest635@gmail.com");
				test.pass("<p style=\"color:green; font-size:13px\"><b>mail send.</b></p>");
				timeOut();
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "googleFieldPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "googleFieldPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b> mail send field not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "googleField");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "googleField.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(googleField.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}

	}
	
	public void clickOnNext() throws IOException {
		test.info("click on next");

		try {
			if (next.isDisplayed()) {
				next.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>next click.</b></p>");
				timeOut();
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "nextPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "nextPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>next location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "next");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "next.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(next.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	@SuppressWarnings("unused")
	public void inputFieldPassword() throws IOException {
		test.info("send password");
		try {
			if (password.isDisplayed()) {
				sendText(password, "automation@@15");
				test.pass("<p style=\"color:green; font-size:13px\"><b>password send.</b></p>");
				timeOut();
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "passwordPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "passwordPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>password location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "password");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "password.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(password.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
	}
	@SuppressWarnings("unused")
	public void clickOnPasswordNext() throws IOException {
		test.info("click on password field next button");
		try {
			if (passNext.isDisplayed()) {
				passNext.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>next click.</b></p>");
				timeOut();
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "passNextPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "passNextPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>next location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "passNext");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "passNext.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(passNext.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
		
	}
	
	
		
}