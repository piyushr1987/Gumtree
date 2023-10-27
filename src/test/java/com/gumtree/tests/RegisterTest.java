package com.gumtree.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gumtree.genericPage.BaseClass;
import com.gumtree.pages.RegisterPage;

public class RegisterTest extends BaseClass {

	RegisterPage register;

	public RegisterTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		register = new RegisterPage();

	}

	@Test(priority = 1)
	public void testAcceptButton() throws Exception {
		Logger.info("click on accept button on pop up");
		try {
			register.clickOnAccept();
		} catch (Exception e) {
			captureScreen(driver, "accept");

		}

	}

	@Test(priority = 2)
	public void testRegister() throws Exception {
		Logger.info("click on register");
		try {
			register.clickOnRegister();
		} catch (Exception e) {
			captureScreen(driver, "register");

		}

	}

	@Test(priority = 3)
	public void testCreateAccountPage() throws Exception {
		if (register.validateCreateAccountPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to create account page");
		} else {
			captureScreen(driver, "create account");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 4)
	public void testFirstName() throws Exception {
		Logger.info("enter first name");
		try {
			register.enterFirstName(prop.getProperty("firstName"));
		} catch (Exception e) {
			captureScreen(driver, "first name");

		}

	}

	@Test(priority = 5)
	public void testLastName() throws Exception {
		Logger.info("enter last name");
		try {
			register.enterLastName(prop.getProperty("lastName"));
		} catch (Exception e) {
			captureScreen(driver, "last name");

		}

	}

	@Test(priority = 6)
	public void testEmail() throws Exception {
		Logger.info("enter email");
		try {
			register.enterEmail(prop.getProperty("validemail"));
		} catch (Exception e) {
			captureScreen(driver, "email");

		}

	}

	@Test(priority = 7)
	public void testPassword() throws Exception {
		Logger.info("enter password");
		try {
			register.enterPassword(prop.getProperty("validPassword"));
		} catch (Exception e) {
			captureScreen(driver, "password");

		}

	}

	@Test(priority = 8)
	public void testRegisterButton() throws Exception {
		Logger.info("click on register");
		try {
			register.clickOnRegisterButton();
		} catch (Exception e) {
			captureScreen(driver, "register button");

		}

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
