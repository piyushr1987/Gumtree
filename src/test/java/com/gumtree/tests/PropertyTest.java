package com.gumtree.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gumtree.genericPage.BaseClass;
import com.gumtree.pages.PropertyPage;

public class PropertyTest extends BaseClass {

	PropertyPage property;

	public PropertyTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		property = new PropertyPage();

	}

	@Test(priority = 1)
	public void testProperty() throws Exception {
		Logger.info("go to property and then click on internationals");
		try {
			property.goToProperty();
		} catch (Exception e) {
			captureScreen(driver, "property");

		}

	}

	@Test(priority = 2)
	public void testInternationalPage() throws Exception {
		if (property.validateInternationalPropertyPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to international property page");
		} else {
			captureScreen(driver, "international property");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testchooseDistance() throws Exception {
		Logger.info("click on distance");
		try {
			property.chooseDistance();
		} catch (Exception e) {
			captureScreen(driver, "distance");

		}

	}

	@Test(priority = 4)
	public void testselectDistance() throws Exception {
		Logger.info("select the distance");
		try {
			property.selectDistance();
		} catch (Exception e) {
			captureScreen(driver, "select distance");

		}

	}

	@Test(priority = 5)
	public void testUpadateDistance() throws Exception {
		Logger.info("click on update");
		try {
			property.clickOnUpdateForDistance();
		} catch (Exception e) {
			captureScreen(driver, "update button");

		}

	}

	@Test(priority = 6)
	public void testDistancePage() throws Exception {
		if (property.validateDistancePage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to distance page");
		} else {
			captureScreen(driver, "distance page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 7)
	public void testMin() throws Exception {
		Logger.info("click on min");
		try {
			property.clickOnMin();
		} catch (Exception e) {
			captureScreen(driver, "min");

		}

	}

	@Test(priority = 8)
	public void testMinPrice() throws Exception {
		Logger.info("select min price");
		try {
			property.selectMinPrice();
		} catch (Exception e) {
			captureScreen(driver, "min price");

		}

	}

	@Test(priority = 9)
	public void testMax() throws Exception {
		Logger.info("click on max");
		try {
			property.clickOnMax();
		} catch (Exception e) {
			captureScreen(driver, "max");

		}

	}

	@Test(priority = 10)
	public void testMaxPrice() throws Exception {
		Logger.info("select max price");
		try {
			property.selectMaxPrice();
		} catch (Exception e) {
			captureScreen(driver, "max price");

		}

	}

	@Test(priority = 11)
	public void testUpdate() throws Exception {
		Logger.info("click on update");
		try {
			property.clickOnUpdate();
		} catch (Exception e) {
			captureScreen(driver, "update button");

		}

	}

	@Test(priority = 12)
	public void testPricePage() throws Exception {
		if (property.validatePricePage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to price page");
		} else {
			captureScreen(driver, "price page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 13)
	public void testHouseGarden() throws Exception {
		Logger.info("click on house garden");
		try {
			property.clickOnHouseGarden();
		} catch (Exception e) {
			captureScreen(driver, "house garden");

		}

	}

	@Test(priority = 14)
	public void testHouseGardenPage() throws Exception {
		if (property.validateHouseGardenPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to house garden page");
		} else {
			captureScreen(driver, "house garden page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 15)
	public void testFavourite() throws Exception {
		Logger.info("click on Favourite");
		try {
			property.clickOnFavourite();
		} catch (Exception e) {
			captureScreen(driver, "Favourite");

		}

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
