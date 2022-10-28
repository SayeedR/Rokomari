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

public class AuthoAndBookSelection extends CommonMethods{
	

	ExtentTest test;
	
	public AuthoAndBookSelection(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	@FindAll({
		@FindBy(xpath = "//a[@id='js--authors']")
	})
	WebElement author;
	
	@FindAll({
		@FindBy(xpath = "//a[contains(text(),'হুমায়ূন আহমেদ')]")
	})
	WebElement authorhimu;
	
	@FindAll({
		@FindBy(xpath = "//ul[@id='categoryIds']//li[1]//div[1]//label[1]"),
	})
	WebElement filter;
	
	
	
	@FindAll({
		@FindBy(xpath = "//h2[normalize-space()='Filter']")
	})
	WebElement scrollFilter;
	
	@FindAll({
		//@FindBy(xpath = "//a[normalize-space()='Next']"),
		//@FindBy(xpath = "//a[normalize-space()='2']"),
		@FindBy(xpath = "//p[contains(text(),'অপরাহ্ণ')]"),
		@FindBy(linkText = "Next")
	})
	WebElement scrollTo;
	
	@FindAll({
		@FindBy(xpath = "//a[normalize-space()='2']"),
		@FindBy(css = "body div section a:nth-child(4)"),
		@FindBy(linkText = "Next")
	})
	WebElement nextPage;
	
	@FindAll({
		@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/section[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/img[1]"),
		@FindBy(linkText = "Next")
	})
	WebElement add;
	
	@FindAll({
		@FindBy(xpath = "//a[@id='js-cart-menu']//*[name()='svg']"),
		@FindBy(id = "js-cart-menu")
	})
	WebElement card;
	
	@FindAll({
		@FindBy(xpath = "//span[normalize-space()='Place Order']"),
		@FindBy(id = "js-cart-menu")
	})
	WebElement order;
	
	
	@SuppressWarnings("unused")
	public void placeOrderClick() throws IOException {
		test.info("click on place order button");
		try {
			if (order.isDisplayed()) {
				order.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>order Button Clicked.</b></p>");
				timeOut();
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "orderPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "orderPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>order location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "order");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "order.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(order.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
	}
	@SuppressWarnings("unused")
	public void clickOncard() throws IOException {
		test.info("click on card");
		try {
			if (card.isDisplayed()) {
				card.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>card Button Clicked.</b></p>");
				timeOut();
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "cardPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "cardPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>order location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "card");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "card.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(card.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
	}
	@SuppressWarnings("unused")
	public void addToCard() throws IOException {
		test.info("click on add to card");
		try {
			if (add.isDisplayed()) {
				add.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>add To Card Button Clicked.</b></p>");
				timeOut();
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "addPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "addPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>add To Card location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "add");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "add.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(add.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	@SuppressWarnings("unused")
	public void clickOnNextPage() throws IOException {
		test.info("click on next page");
		try {
			if (nextPage.isDisplayed()) {
				nextPage.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Next Page Button Clicked.</b></p>");
				timeOut();
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "nextPagePass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "nextPagePass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Next Page location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "nextPage");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "nextPage.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(nextPage.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
		
	}
	@SuppressWarnings("unused")
	public void scrollTonext() throws IOException {
		test.info("scroll down page");
		try {
			if (scrollTo.isDisplayed()) {
				scrollToElement(scrollTo);
				test.pass("<p style=\"color:green; font-size:13px\"><b>scroll To next.</b></p>");
				timeOut();
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "scrollToPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "scrollToPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>scroll To next location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
		
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "scrollTo");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "scrollTo.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(scrollTo.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
			
			
		}
	@SuppressWarnings("unused")
	public void filterClick() throws IOException {
		test.info("click on filter");
		try {
			if (filter.isDisplayed()) {
				filter.click();
				waitForPageLoad();
				test.pass("<p style=\"color:green; font-size:13px\"><b>filter Click.</b></p>");
				timeOut();
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "filterPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "filterPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>filter location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "filter");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "filter.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(filter.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}

	}
	//	public void scrollToFilter() {
	//	scrollFilter.click();
	//}

	@SuppressWarnings("unused")
	public void authorClick() throws IOException {
		test.info("click on author");
		try {
			if (authorhimu.isDisplayed()) {
				authorhimu.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>authorhimu Click.</b></p>");
				timeOut();
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "authorhimuPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "authorhimuPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>authorhimu location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "authorhimu");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "authorhimu.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(authorhimu.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
	}
	@SuppressWarnings("unused")
	public void hoverAuthor() throws IOException {
		test.info("hover on author");
		try {
			if (author.isDisplayed()) {
				hover(author);
				test.pass("<p style=\"color:green; font-size:13px\"><b>author Click.</b></p>");
				timeOut();
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "authorPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "authorPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>author location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
		
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "author");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "author.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(author.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
	}
	
	
}
