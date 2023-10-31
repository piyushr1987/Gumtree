package com.gumtree.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gumtree.genericPage.BaseClass;
import com.gumtree.pages.CarsPage;

public class CarsTest extends BaseClass {

	CarsPage car;

	public CarsTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		car = new CarsPage();

	}

	@Test(priority = 1)
	public void testCar() throws Exception {
		Logger.info("go to car and click on vans");
		try {
			car.goToCar();
		} catch (Exception e) {
			captureScreen(driver, "car");

		}

	}

	@Test(priority = 2)
	public void testVanPage() throws Exception {
		if (car.validateVanPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to van page");
		} else {
			captureScreen(driver, "van");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testMostRecent() throws Exception {
		Logger.info("select highest to low price menu from drop down");
		try {
			car.clickOnMostRecentFirst();
		} catch (Exception e) {
			captureScreen(driver, "price menu");

		}

	}

	@Test(priority = 4)
	public void testHighestPriceFirstPagePage() throws Exception {
		if (car.validateHighestPriceFirstPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Highest Price First page");
		} else {
			captureScreen(driver, "Highest Price");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 5)
	public void testFordVan() throws Exception {
		Logger.info("click on ford van");
		try {
			car.clickOnFordVan();
		} catch (Exception e) {
			captureScreen(driver, "ford");

		}

	}

	@Test(priority = 6)
	public void testsendMessageButton() throws Exception {
		if (car.validateSendMessageButton()) {
			Assert.assertTrue(true);
			Logger.info("Send Message Button is displayed on page");
		} else {
			captureScreen(driver, "send message button");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 7)
	public void testDeposit() throws Exception {
		Logger.info("enter deposit");
		try {
			car.enterDeposit(prop.getProperty("price"));
		} catch (Exception e) {
			captureScreen(driver, "price");

		}

	}

	@Test(priority = 8)
	public void testRepaymentMonths() throws Exception {
		Logger.info("select repayment months");
		try {
			car.selectRepaymentTerm(prop.getProperty("month"));
		} catch (Exception e) {
			captureScreen(driver, "months");

		}

	}

	@Test(priority = 9)
	public void testCreditScore() throws Exception {
		Logger.info("click on good credit score");
		try {
			car.clickOnCreditScore();
		} catch (Exception e) {
			captureScreen(driver, "credit score");

		}

	}

	@Test(priority = 10)
	public void testApplyNow() throws Exception {
		Logger.info("click on apply now");
		try {
			car.clickOnApplyNow();
		} catch (Exception e) {
			captureScreen(driver, "apply now");

		}

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
