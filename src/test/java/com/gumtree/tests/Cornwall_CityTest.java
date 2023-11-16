package com.gumtree.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gumtree.genericPage.BaseClass;
import com.gumtree.pages.Cornwall_CityPage;

public class Cornwall_CityTest extends BaseClass {

	Cornwall_CityPage cornwall;

	public Cornwall_CityTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		cornwall = new Cornwall_CityPage();

	}

	@Test(priority = 1)
	public void testAccept() throws Exception {
		Logger.info("click on accept");
		try {
			cornwall.clickOnAccept();
		} catch (Exception e) {
			captureScreen(driver, "accept");

		}

	}

	@Test(priority = 2)
	public void testCornwallCity() throws Exception {
		Logger.info("click on Cornwall City");
		try {
			cornwall.clickOnCornwallCity();
		} catch (Exception e) {
			captureScreen(driver, "Cornwal lCity");

		}

	}

	@Test(priority = 3)
	public void testCornwallCityPage() throws Exception {
		if (cornwall.validateCornwallCityPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Cornwall City Page");
		} else {
			captureScreen(driver, "Cornwall City Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 4)
	public void testMotor() throws Exception {
		Logger.info("click on Motor");
		try {
			cornwall.clickOnMotor();
		} catch (Exception e) {
			captureScreen(driver, "Motor");

		}

	}

	@Test(priority = 5)
	public void testMotorPage() throws Exception {
		if (cornwall.validateMotorPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to motor Page");
		} else {
			captureScreen(driver, "motor Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 6)
	public void testCars() throws Exception {
		Logger.info("click on cars");
		try {
			cornwall.clickOnCar();
		} catch (Exception e) {
			captureScreen(driver, "car");

		}

	}

	@Test(priority = 7)
	public void testCarsPage() throws Exception {
		if (cornwall.validateCarPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to car Page");
		} else {
			captureScreen(driver, "car Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 8)
	public void testAudi() throws Exception {
		Logger.info("click on audi");
		try {
			cornwall.clickOnAudi();
		} catch (Exception e) {
			captureScreen(driver, "audi");

		}

	}

	@Test(priority = 9)
	public void testAudiCarPage() throws Exception {
		if (cornwall.validateAudiCarPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Audi Car Page");
		} else {
			captureScreen(driver, "Audi Car Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 10)
	public void testBlueAudi() throws Exception {
		Logger.info("click on blue audi");
		try {
			cornwall.clickOnBlueAudi();
		} catch (Exception e) {
			captureScreen(driver, "blue audi");

		}

	}

	@Test(priority = 11)
	public void testBlueAudiCarPage() throws Exception {
		if (cornwall.validateBlueAudiCarPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Blue Audi Car Page");
		} else {
			captureScreen(driver, "Blue Audi Car Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 12)
	public void testBlueAudiQ2() throws Exception {
		Logger.info("click on blue audi q2");
		try {
			cornwall.clickOnBlueAudiQ2();
		} catch (Exception e) {
			captureScreen(driver, "blue audi q2");

		}

	}

	@Test(priority = 13)
	public void testBlueAudiQ2CarPage() throws Exception {
		if (cornwall.validateBlueAudiQ2CarPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Blue Audi Q2 Car Page");
		} else {
			captureScreen(driver, "Blue Audi Q2 Car Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 14)
	public void testSendMessage() throws Exception {
		Logger.info("click on Send Message");
		try {
			cornwall.clickOnSendMessage();
		} catch (Exception e) {
			captureScreen(driver, "Send Message");

		}

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
