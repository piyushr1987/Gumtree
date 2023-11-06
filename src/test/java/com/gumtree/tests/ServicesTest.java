package com.gumtree.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gumtree.genericPage.BaseClass;
import com.gumtree.pages.ServicesPage;

public class ServicesTest extends BaseClass {

	ServicesPage service;

	public ServicesTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		service = new ServicesPage();

	}

	@Test(priority = 1)
	public void testServices() throws Exception {
		Logger.info("go to services and click on pets");
		try {
			service.goToSerives();
		} catch (Exception e) {
			captureScreen(driver, "services");

		}

	}

	@Test(priority = 2)
	public void testPetServicePage() throws Exception {
		if (service.validatePetServicesPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to pet service page");
		} else {
			captureScreen(driver, "pet service Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testChooseDistance() throws Exception {
		Logger.info("click on choose distance");
		try {
			service.clickOnChooseDistance();
		} catch (Exception e) {
			captureScreen(driver, "distance");

		}

	}

	@Test(priority = 4)
	public void testSelectDistance() throws Exception {
		Logger.info("select +10 miles distance");
		try {
			service.clickOnSelectDistance();
		} catch (Exception e) {
			captureScreen(driver, "10 miles");

		}

	}

	@Test(priority = 5)
	public void testUpdate() throws Exception {
		Logger.info("click on update");
		try {
			service.clickOnUpdate();
		} catch (Exception e) {
			captureScreen(driver, "update");

		}

	}

	@Test(priority = 6)
	public void testDistancePage() throws Exception {
		if (service.validateDistancePage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to distance page");
		} else {
			captureScreen(driver, "distance Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 7)
	public void testPetsitter() throws Exception {
		Logger.info("click on Petsitter&Dogwalker");
		try {
			service.clickOnPetsitterAndDogwalker();
		} catch (Exception e) {
			captureScreen(driver, "Petsitter&Dogwalker");

		}

	}

	@Test(priority = 8)
	public void testPetsitterPage() throws Exception {
		if (service.validatePetsitterPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to petsitter page");
		} else {
			captureScreen(driver, "petsitter page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 9)
	public void testTheAvesHotel() throws Exception {
		Logger.info("click on the aves hotel");
		try {
			service.clickOnTheAvesHotel();
		} catch (Exception e) {
			captureScreen(driver, "aves hotel");

		}

	}

	@Test(priority = 10)
	public void testTheAvesHotelPage() throws Exception {
		if (service.validatTheAvesHotelPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to the aves hotel page");
		} else {
			captureScreen(driver, "aves hotel page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 11)
	public void testFavourite() throws Exception {
		Logger.info("click on Favourite");
		try {
			service.clickOnFavourite();
		} catch (Exception e) {
			captureScreen(driver, "Favourite");

		}

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
