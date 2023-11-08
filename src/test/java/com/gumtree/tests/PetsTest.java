package com.gumtree.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gumtree.genericPage.BaseClass;
import com.gumtree.pages.PetsPage;

public class PetsTest extends BaseClass {

	PetsPage pets;

	public PetsTest() throws IOException {
		super();
	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		pets = new PetsPage();

	}

	@Test(priority = 1)
	public void testPets() throws Exception {
		Logger.info("go to pets and click on missing,lost&found");
		try {
			pets.goToPets();
		} catch (Exception e) {
			captureScreen(driver, "pets");

		}

	}

	@Test(priority = 2)
	public void testPetMissingPage() throws Exception {
		if (pets.validatePetMissingPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to pets missing page");
		} else {
			captureScreen(driver, "pets missing Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testLocation() throws Exception {
		Logger.info("enter the location");
		try {
			pets.enterLocation(prop.getProperty("city"));
		} catch (Exception e) {
			captureScreen(driver, "location");

		}

	}

	@Test(priority = 4)
	public void testLocationPage() throws Exception {
		if (pets.validateLocationPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to specified location");
		} else {
			captureScreen(driver, "location Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 5)
	public void testGingerTomCat() throws Exception {
		Logger.info("click on ginger tom cat");
		try {
			pets.clickOnGingerTomCat();
			;
		} catch (Exception e) {
			captureScreen(driver, "ginger tom cat");

		}

	}

	@Test(priority = 6)
	public void testGingerTomCatPage() throws Exception {
		if (pets.validateGingerTomCatPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Ginger Tom Cat Page");
		} else {
			captureScreen(driver, "Ginger Tom Cat Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 7)
	public void testNextButton() throws Exception {
		Logger.info("click on next button");
		try {
			pets.clickOnNextButton();
		} catch (Exception e) {
			captureScreen(driver, "next button");

		}

	}

	@Test(priority = 8)
	public void testAdId() throws Exception {
		if (pets.validateAdId(prop.getProperty("ID"))) {
			Assert.assertTrue(true);
			Logger.info("expected and actual id is matched");
		} else {
			captureScreen(driver, "Ad Id");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 9)
	public void testFacebook() throws Exception {
		Logger.info("click on facebook link");
		try {
			pets.clickOnFacebook();
		} catch (Exception e) {
			captureScreen(driver, "facebook");

		}

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
