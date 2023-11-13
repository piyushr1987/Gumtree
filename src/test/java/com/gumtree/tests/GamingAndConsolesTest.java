package com.gumtree.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gumtree.genericPage.BaseClass;
import com.gumtree.pages.GamingAndConsolesPage;

public class GamingAndConsolesTest extends BaseClass {

	GamingAndConsolesPage gaming;

	public GamingAndConsolesTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		gaming = new GamingAndConsolesPage();

	}

	@Test(priority = 1)
	public void testAccept() throws Exception {
		Logger.info("click on accept");
		try {
			gaming.clickOnAccept();
		} catch (Exception e) {
			captureScreen(driver, "accept");

		}

	}

	@Test(priority = 2)
	public void testGamingAndConsoles() throws Exception {
		Logger.info("click on Gaming And Consoles");
		try {
			gaming.clickOnGamingAndConsoles();
		} catch (Exception e) {
			captureScreen(driver, "gaming and console");

		}

	}

	@Test(priority = 3)
	public void testGamingAndConsolesPage() throws Exception {
		if (gaming.validateGamingAndConsolesPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Gaming And Consoles Page");
		} else {
			captureScreen(driver, "Gaming And Consoles Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 4)
	public void testGames() throws Exception {
		Logger.info("click on games");
		try {
			gaming.clickOnGames();
		} catch (Exception e) {
			captureScreen(driver, "games");

		}

	}

	@Test(priority = 5)
	public void testGamesPage() throws Exception {
		if (gaming.validateGamesPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Games Page");
		} else {
			captureScreen(driver, "Games Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 6)
	public void testMinPrice() throws Exception {
		Logger.info("enter the minimum price");
		try {
			gaming.enterMinimumPrice(prop.getProperty("minPrice"));
		} catch (Exception e) {
			captureScreen(driver, "min price");

		}

	}

	@Test(priority = 7)
	public void testMaxPrice() throws Exception {
		Logger.info("enter the maximum price");
		try {
			gaming.enterMaximumPrice(prop.getProperty("maxPrice"));
		} catch (Exception e) {
			captureScreen(driver, "max price");

		}

	}

	@Test(priority = 8)
	public void testUpdate() throws Exception {
		Logger.info("click on update");
		try {
			gaming.clickOnUpdate();
		} catch (Exception e) {
			captureScreen(driver, "update");

		}

	}

	@Test(priority = 9)
	public void testPricePage() throws Exception {
		if (gaming.validatePricePage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Price Page");
		} else {
			captureScreen(driver, "Price Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 10)
	public void testPcGaming() throws Exception {
		Logger.info("click on Pc Gaming");
		try {
			gaming.clickOnPcGaming();
		} catch (Exception e) {
			captureScreen(driver, "Pc Gaming");

		}

	}

	@Test(priority = 11)
	public void testPcGamingPage() throws Exception {
		if (gaming.validatePcGamingPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Pc Gaming Page");
		} else {
			captureScreen(driver, "Pc Gaming Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 12)
	public void testUserName() throws Exception {
		if (gaming.validateUserName(prop.getProperty("validUser"))) {
			Assert.assertTrue(true);
			Logger.info("expected and actual user name is matched");
		} else {
			captureScreen(driver, "user name");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 13)
	public void testFavourite() throws Exception {
		Logger.info("click on Favourite");
		try {
			gaming.clickOnFavourite();
		} catch (Exception e) {
			captureScreen(driver, "Favourite");

		}

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
