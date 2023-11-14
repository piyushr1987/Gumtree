package com.gumtree.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gumtree.genericPage.BaseClass;
import com.gumtree.pages.AffordableRunAroundsPage;

public class AffordableRunAroundsTest extends BaseClass {

	AffordableRunAroundsPage affordable;

	public AffordableRunAroundsTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		affordable = new AffordableRunAroundsPage();

	}

	@Test(priority = 1)
	public void testAccept() throws Exception {
		Logger.info("click on accept");
		try {
			affordable.clickOnAccept();
		} catch (Exception e) {
			captureScreen(driver, "accept");

		}

	}

	@Test(priority = 2)
	public void testAffordableRunArounds() throws Exception {
		Logger.info("click on Affordable Run Arounds");
		try {
			affordable.clickOnAffordableRunArounds();
		} catch (Exception e) {
			captureScreen(driver, "Affordable Ru nArounds");

		}

	}

	@Test(priority = 3)
	public void testAffordableCarsPage() throws Exception {
		if (affordable.validateAffordableCarsPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Affordable Cars Page");
		} else {
			captureScreen(driver, "Affordable Cars Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 4)
	public void testAudi() throws Exception {
		Logger.info("click on audi");
		try {
			affordable.clickOnAudi();
		} catch (Exception e) {
			captureScreen(driver, "audi");

		}

	}

	@Test(priority = 5)
	public void testAudiPage() throws Exception {
		if (affordable.validateAudiPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Audi Page");
		} else {
			captureScreen(driver, "Audi Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 6)
	public void testYear() throws Exception {
		Logger.info("click on year");
		try {
			affordable.clickOnYear();
		} catch (Exception e) {
			captureScreen(driver, "year");

		}

	}

	@Test(priority = 7)
	public void testYearPage() throws Exception {
		if (affordable.validateYearPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to year Page");
		} else {
			captureScreen(driver, "year Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 8)
	public void testAudiBLKEdition() throws Exception {
		Logger.info("click on Audi BLK Edition");
		try {
			affordable.clickOnAudiBLKEdition();
		} catch (Exception e) {
			captureScreen(driver, "Audi BLKE dition");

		}

	}

	@Test(priority = 9)
	public void testAudiBLKEditionPage() throws Exception {
		if (affordable.validateAudiBLKEditionPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Audi BLK Edition Page");
		} else {
			captureScreen(driver, "Audi BLK Edition Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 10)
	public void testSenderMessage() throws Exception {
		if (affordable.validateSenderMessage(prop.getProperty("userMessage"))) {
			Assert.assertTrue(true);
			Logger.info("actual and expected message is matched");
		} else {
			captureScreen(driver, "message");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 11)
	public void testSendMessage() throws Exception {
		Logger.info("click on Send Message");
		try {
			affordable.clickOnSendMessage();
		} catch (Exception e) {
			captureScreen(driver, "Send Message");

		}

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
