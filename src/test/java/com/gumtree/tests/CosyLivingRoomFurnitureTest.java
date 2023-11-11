package com.gumtree.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gumtree.genericPage.BaseClass;
import com.gumtree.pages.CosyLivingRoomFurniturePage;

public class CosyLivingRoomFurnitureTest extends BaseClass {

	CosyLivingRoomFurniturePage cosy;

	public CosyLivingRoomFurnitureTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		cosy = new CosyLivingRoomFurniturePage();

	}

	@Test(priority = 1)
	public void testAccept() throws Exception {
		Logger.info("click on accept");
		try {
			cosy.clickOnAccept();
		} catch (Exception e) {
			captureScreen(driver, "accept");

		}

	}

	@Test(priority = 2)
	public void testLivingRoomFurniture() throws Exception {
		Logger.info("click on cosy Living Room Furniture");
		try {
			cosy.clickOnLivingRoomFurniture();
		} catch (Exception e) {
			captureScreen(driver, "Living Room Furniture");

		}

	}

	@Test(priority = 3)
	public void testDiningAndLivingRoomFurniturePage() throws Exception {
		if (cosy.validateDiningAndLivingRoomFurniturePage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Dining And Living Room Furniture Page");
		} else {
			captureScreen(driver, "Dining And Living Room Furniture Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 4)
	public void testshowMore() throws Exception {
		Logger.info("click on show 7 more");
		try {
			cosy.clickOnShowMore();
		} catch (Exception e) {
			captureScreen(driver, "show more");

		}

	}

	@Test(priority = 5)
	public void testCoffeeTable() throws Exception {
		Logger.info("click on coffee table");
		try {
			cosy.clickOnCoffeeTable();
		} catch (Exception e) {
			captureScreen(driver, "coffee table");

		}

	}

	@Test(priority = 6)
	public void testCoffeeTablePage() throws Exception {
		if (cosy.validateCoffeeTablePage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Coffee Table Page");
		} else {
			captureScreen(driver, "Coffee Table Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 7)
	public void testMinPrice() throws Exception {
		Logger.info("enter the minimum price");
		try {
			cosy.enterMinimumPrice(prop.getProperty("minPrice"));
		} catch (Exception e) {
			captureScreen(driver, "min price");

		}

	}

	@Test(priority = 8)
	public void testMaxPrice() throws Exception {
		Logger.info("enter the maximum price");
		try {
			cosy.enterMaximumPrice(prop.getProperty("maxPrice"));
		} catch (Exception e) {
			captureScreen(driver, "max price");

		}

	}

	@Test(priority = 9)
	public void testUpdate() throws Exception {
		Logger.info("click on update");
		try {
			cosy.clickOnUpdate();
		} catch (Exception e) {
			captureScreen(driver, "update");

		}

	}

	@Test(priority = 10)
	public void testPricePage() throws Exception {
		if (cosy.validatePricePage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to price Page");
		} else {
			captureScreen(driver, "price Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 11)
	public void testCoffeeSideTable() throws Exception {
		Logger.info("click on side table");
		try {
			cosy.clickOnSideTable();
		} catch (Exception e) {
			captureScreen(driver, "side table");

		}

	}

	@Test(priority = 12)
	public void testCoffeeSideTablePage() throws Exception {
		if (cosy.validateCoffeeSideTablePage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Coffee Side Table Page");
		} else {
			captureScreen(driver, "Coffee Side Table Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 13)
	public void testViewProfile() throws Exception {
		Logger.info("click on view profile");
		try {
			cosy.clickOnViewProfile();
		} catch (Exception e) {
			captureScreen(driver, "view profile");

		}

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
