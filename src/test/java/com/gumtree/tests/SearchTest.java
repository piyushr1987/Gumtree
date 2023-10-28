package com.gumtree.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gumtree.genericPage.BaseClass;
import com.gumtree.pages.SearchPage;

public class SearchTest extends BaseClass {

	SearchPage search;

	public SearchTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		search = new SearchPage();

	}

	@Test(priority = 1)
	public void testSearchBox() throws Exception {
		Logger.info("enter car name in search box");
		try {
			search.enterValueInSearchBox(prop.getProperty("car"));
		} catch (Exception e) {
			captureScreen(driver, "search box");
		}
	}

	@Test(priority = 2)
	public void testSearchBoxHeader() throws Exception {
		Logger.info("enter location in search box header");
		try {
			search.enterValueInHeaderSearchBox(prop.getProperty("country"));
		} catch (Exception e) {
			captureScreen(driver, "search box header");
		}
	}

	@Test(priority = 3)
	public void testSearchButton() throws Exception {
		Logger.info("click on search button");
		try {
			search.clickOnSearch();
		} catch (Exception e) {
			captureScreen(driver, "search button");
		}
	}

	@Test(priority = 4)
	public void testSearchPage() throws Exception {
		if (search.validateSearchPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to search page");
		} else {
			captureScreen(driver, "search page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 5)
	public void testJaguar() throws Exception {
		Logger.info("click on jaguar");
		try {
			search.clickOnJaguar();
		} catch (Exception e) {
			captureScreen(driver, "jaguar");
		}
	}

	@Test(priority = 6)
	public void testJaguarSelection() throws Exception {
		if (search.validateJaguarSelection()) {
			Assert.assertTrue(true);
			Logger.info("jaguar radio button is selected");
		} else {
			captureScreen(driver, "jaguar radio button");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 7)
	public void testYear() throws Exception {
		Logger.info("click on year");
		try {
			search.clickOnYear();
		} catch (Exception e) {
			captureScreen(driver, "year");
		}
	}

	@Test(priority = 8)
	public void testYearSelection() throws Exception {
		if (search.validateYearSelection()) {
			Assert.assertTrue(true);
			Logger.info("year radio button is selected");
		} else {
			captureScreen(driver, "year radio button");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 9)
	public void testBMW() throws Exception {
		Logger.info("click on BMW");
		try {
			search.clickOnBMW();
		} catch (Exception e) {
			captureScreen(driver, "BMW");
		}
	}

	@Test(priority = 10)
	public void testBMWPage() throws Exception {
		if (search.validateBMWCarPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to BMW car page");
		} else {
			captureScreen(driver, "BMW car");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
