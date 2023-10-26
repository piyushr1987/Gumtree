package com.gumtree.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gumtree.genericPage.BaseClass;
import com.gumtree.pages.HomePage;

public class HomeTest extends BaseClass {
	HomePage home;

	public HomeTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		home = new HomePage();

	}

	@Test(priority = 1)
	public void testCompanyLogo() throws Exception {
		if (home.validateCompanyLogo()) {
			Assert.assertTrue(true);
			Logger.info("company logo is displayed on home page");
		} else {
			captureScreen(driver, "company logo");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 2)
	public void testSearchBox() throws Exception {
		if (home.validateSearchBox()) {
			Assert.assertTrue(true);
			Logger.info("search box is displayed on home page");
		} else {
			captureScreen(driver, "search box");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testLoginAndRegister() throws Exception {
		if (home.validateLoginAndRegister()) {
			Assert.assertTrue(true);
			Logger.info("Login&register button is displayed on home page");
		} else {
			captureScreen(driver, "login&register");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 4)
	public void testTopLocations() throws Exception {
		if (home.validateTopLocations()) {
			Assert.assertTrue(true);
			Logger.info("top locations link is displayed on home page");
		} else {
			captureScreen(driver, "top locations");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 5)
	public void testAboutUs() throws Exception {
		if (home.validateAboutUs()) {
			Assert.assertTrue(true);
			Logger.info("about us link is displayed on home page");
		} else {
			captureScreen(driver, "about us ");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 6)
	public void testAcceptButton() throws Exception {
		Logger.info("click on accept button on pop up");
		try {
			home.clickOnAccept();
		} catch (Exception e) {
			captureScreen(driver, "accept");

		}

	}

	@Test(priority = 7)
	public void testAboutUsLink() throws Exception {
		Logger.info("click on about us link");
		try {
			home.clickOnAboutUs();
		} catch (Exception e) {
			captureScreen(driver, "about us link");

		}

	}

	@Test(priority = 8)
	public void testAboutUsPage() throws Exception {
		if (home.validateAboutUsPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to about us page");
		} else {
			captureScreen(driver, "about us page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
