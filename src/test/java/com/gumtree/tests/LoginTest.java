package com.gumtree.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gumtree.genericPage.BaseClass;
import com.gumtree.pages.LoginPage;

public class LoginTest extends BaseClass {

	LoginPage login;

	public LoginTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		login = new LoginPage();

	}

	@Test(priority = 1)
	public void testAcceptButton() throws Exception {
		Logger.info("click on accept button on pop up");
		try {
			login.clickOnAccept();
		} catch (Exception e) {
			captureScreen(driver, "accept");

		}

	}

	@Test(priority = 2)
	public void testLogin() throws Exception {
		Logger.info("click on login");
		try {
			login.clickOnLogin();
		} catch (Exception e) {
			captureScreen(driver, "login");

		}

	}

	@Test(priority = 3)
	public void testLoginPage() throws Exception {
		if (login.validateLoginPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to login page");
		} else {
			captureScreen(driver, "login page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 4)
	public void testEmail() throws Exception {
		Logger.info("enter email");
		try {
			login.enterEmail(prop.getProperty("validemail"));
		} catch (Exception e) {
			captureScreen(driver, "email");

		}

	}

	@Test(priority = 5)
	public void testPassword() throws Exception {
		Logger.info("enter password");
		try {
			login.enterPassword(prop.getProperty("validPassword"));
		} catch (Exception e) {
			captureScreen(driver, "password");

		}

	}

	@Test(priority = 6)
	public void testLoginButton() throws Exception {
		Logger.info("click on login button");
		try {
			login.clickOnLoginButton();
		} catch (Exception e) {
			captureScreen(driver, "login button");

		}

	}

	@Test(priority = 7)
	public void testValidUser() throws Exception {
		Logger.info("sucessfully login as valid user");
		try {
			login.validateUser(prop.getProperty("validMessage"));
		} catch (Exception e) {
			captureScreen(driver, "sucessMessage");

		}

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
