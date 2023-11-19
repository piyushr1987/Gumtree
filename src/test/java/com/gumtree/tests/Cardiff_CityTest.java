package com.gumtree.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gumtree.genericPage.BaseClass;
import com.gumtree.pages.Cardiff_CityPage;

public class Cardiff_CityTest extends BaseClass {

	Cardiff_CityPage cardiff;

	public Cardiff_CityTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		cardiff = new Cardiff_CityPage();

	}

	@Test(priority = 1)
	public void testAccept() throws Exception {
		Logger.info("click on accept");
		try {
			cardiff.clickOnAccept();
		} catch (Exception e) {
			captureScreen(driver, "accept");

		}

	}

	@Test(priority = 2)
	public void testCardiffCity() throws Exception {
		Logger.info("click on cardiff City");
		try {
			cardiff.clickOnCardiffCity();
		} catch (Exception e) {
			captureScreen(driver, "cardiff City");

		}

	}

	@Test(priority = 3)
	public void testCardiffCityPage() throws Exception {
		if (cardiff.validateCardiffCityPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Cardiff City Page");
		} else {
			captureScreen(driver, "Cardiff City Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 4)
	public void testBritanniaSouthBank() throws Exception {
		Logger.info("click on Britannia South Bank");
		try {
			cardiff.clickOnBritanniaSouthBank();
		} catch (Exception e) {
			captureScreen(driver, "Britannia South Bank");

		}

	}

	@Test(priority = 5)
	public void testBritanniaSouthBankPage() throws Exception {
		if (cardiff.validateBritanniaSouthBankPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Britannia South Bank Page");
		} else {
			captureScreen(driver, "Britannia South Bank Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 6)
	public void testViewRooms() throws Exception {
		Logger.info("click on View Rooms");
		try {
			cardiff.clickOnViewRooms();
		} catch (Exception e) {
			captureScreen(driver, "View Rooms");

		}

	}

	@Test(priority = 7)
	public void testStudio() throws Exception {
		Logger.info("click on Studio");
		try {
			cardiff.clickOnStudio();
		} catch (Exception e) {
			captureScreen(driver, "Studio");

		}

	}

	@Test(priority = 8)
	public void testEntirePlace() throws Exception {
		Logger.info("click on Entire Place");
		try {
			cardiff.clickOnEntirePlace();
		} catch (Exception e) {
			captureScreen(driver, "Entire Place");

		}

	}

	@Test(priority = 9)
	public void testPrivateBathroom() throws Exception {
		Logger.info("click on Private Bathroom");
		try {
			cardiff.clickOnPrivateBathroom();
		} catch (Exception e) {
			captureScreen(driver, "Private Bathroom");

		}

	}

	@Test(priority = 10)
	public void testPrivateKitchen() throws Exception {
		Logger.info("click on Private Kitchen");
		try {
			cardiff.clickOnPrivateKitchen();
		} catch (Exception e) {
			captureScreen(driver, "Private Kitchen");

		}

	}

	@Test(priority = 11)
	public void testBedrooms() throws Exception {
		Logger.info("click on Bedrooms");
		try {
			cardiff.clickOnBedrooms();
		} catch (Exception e) {
			captureScreen(driver, "Bedrooms");

		}

	}

	@Test(priority = 12)
	public void testEnquiry() throws Exception {
		Logger.info("click on Enquiry");
		try {
			cardiff.clickOnEnquiry();
		} catch (Exception e) {
			captureScreen(driver, "Enquiry");

		}

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
