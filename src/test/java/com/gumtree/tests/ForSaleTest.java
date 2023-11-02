package com.gumtree.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gumtree.genericPage.BaseClass;
import com.gumtree.pages.ForSalePage;

public class ForSaleTest extends BaseClass {

	ForSalePage forSale;

	public ForSaleTest() throws IOException {
		super();
	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		forSale = new ForSalePage();

	}

	@Test(priority = 1)
	public void testForSale() throws Exception {
		Logger.info("go to For Sale and then click on computers & softwares");
		try {
			forSale.goToForSale();
		} catch (Exception e) {
			captureScreen(driver, "for sale");

		}

	}

	@Test(priority = 2)
	public void testComputersAndSoftwaresPage() throws Exception {
		if (forSale.validateComputerSoftwarePage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to computers and softwares page");
		} else {
			captureScreen(driver, "computers&softwares");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testSoftware() throws Exception {
		Logger.info("click on software");
		try {
			forSale.clickOnSoftware();
			;
		} catch (Exception e) {
			captureScreen(driver, "software");

		}

	}

	@Test(priority = 4)
	public void testSoftwarePage() throws Exception {
		if (forSale.validateSoftwarePage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to software page");
		} else {
			captureScreen(driver, "software page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 5)
	public void testOperatingSystem() throws Exception {
		Logger.info("click on operating system");
		try {
			forSale.clickOnOperatingSystem();
		} catch (Exception e) {
			captureScreen(driver, "operating system");

		}

	}

	@Test(priority = 6)
	public void testOperatingSystemPage() throws Exception {
		if (forSale.validateOperatingSystemPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to operating system page");
		} else {
			captureScreen(driver, "operating system page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 7)
	public void testWindows8OperatingSystem() throws Exception {
		Logger.info("click on windows 8 operating system");
		try {
			forSale.clickOnWindows8OperatingSystem();
			;
		} catch (Exception e) {
			captureScreen(driver, "Windows8 Operating System");

		}

	}

	@Test(priority = 8)
	public void testWindows8OperatingSystemPage() throws Exception {
		if (forSale.validateWindows8OperatingSystemPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to windows 8 operating system page");
		} else {
			captureScreen(driver, "Windows8 Operating System Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 9)
	public void testFavourite() throws Exception {
		Logger.info("click on Favourite");
		try {
			forSale.clickOnFavourite();
			;
		} catch (Exception e) {
			captureScreen(driver, "Favourite");

		}

	}

	@Test(priority = 10)
	public void testEmail() throws Exception {
		Logger.info("enter email");
		try {
			forSale.enterEmail(prop.getProperty("validemail"));
		} catch (Exception e) {
			captureScreen(driver, "email");

		}

	}

	@Test(priority = 11)
	public void testPassword() throws Exception {
		Logger.info("enter password");
		try {
			forSale.enterPassword(prop.getProperty("validPassword"));
		} catch (Exception e) {
			captureScreen(driver, "password");

		}

	}

	@Test(priority = 12)
	public void testLoginButton() throws Exception {
		Logger.info("click on login button");
		try {
			forSale.clickOnLoginButton();
		} catch (Exception e) {
			captureScreen(driver, "login button");

		}

	}

	@Test(priority = 13)
	public void testMenu() throws Exception {
		Logger.info("click on menu");
		try {
			forSale.clickOnMenu();
		} catch (Exception e) {
			captureScreen(driver, "menu");

		}

	}

	@Test(priority = 14)
	public void testFavouriteUnderMenu() throws Exception {
		Logger.info("click on favourite under menu");
		try {
			forSale.clickOnFavouriteUnderMenu();
		} catch (Exception e) {
			captureScreen(driver, "Favourite Under Menu");

		}

	}

	@Test(priority = 15)
	public void testWindows8OperatingSystemElement() throws Exception {
		if (forSale.validateWindows8OperatingSystem()) {
			Assert.assertTrue(true);
			Logger.info("windows 8 operating system element is displayed on page");
		} else {
			captureScreen(driver, "Windows8 element");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
