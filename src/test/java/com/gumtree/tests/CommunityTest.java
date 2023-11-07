package com.gumtree.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gumtree.genericPage.BaseClass;
import com.gumtree.pages.CommunityPage;

public class CommunityTest extends BaseClass {

	CommunityPage community;

	public CommunityTest() throws IOException {
		super();
	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		community = new CommunityPage();

	}

	@Test(priority = 1)
	public void testCommunity() throws Exception {
		Logger.info("go to community and click on music,bands and musician");
		try {
			community.goToCommunity();
		} catch (Exception e) {
			captureScreen(driver, "Community");

		}

	}

	@Test(priority = 2)
	public void testMusicPage() throws Exception {
		if (community.validateMusicPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to music,bands and musician page");
		} else {
			captureScreen(driver, "Music Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testMostRecent() throws Exception {
		Logger.info("click on most recent");
		try {
			community.clickOnMostRecent();
		} catch (Exception e) {
			captureScreen(driver, "Most Recent");

		}

	}

	@Test(priority = 4)
	public void testNearest() throws Exception {
		Logger.info("click on nearest");
		try {
			community.clickOnNearest();
		} catch (Exception e) {
			captureScreen(driver, "Nearest");

		}

	}

	@Test(priority = 5)
	public void testNearestDistancePage() throws Exception {
		if (community.validateNearestDistancePage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Nearest Distance Page");
		} else {
			captureScreen(driver, "Nearest Distance Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 6)
	public void testMusicianWanted() throws Exception {
		Logger.info("click on Musician Wanted");
		try {
			community.clickOnMusicianWanted();
		} catch (Exception e) {
			captureScreen(driver, "Musician Wanted");

		}

	}

	@Test(priority = 7)
	public void testMusicianWantedPage() throws Exception {
		if (community.validateMusicianWantedPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Musician Wanted Page");
		} else {
			captureScreen(driver, "Musician Wanted Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 8)
	public void testGuitarPlayer() throws Exception {
		Logger.info("click on Guitar Player");
		try {
			community.clickOnGuitarPlayer();
		} catch (Exception e) {
			captureScreen(driver, "Guitar Player");

		}

	}

	@Test(priority = 9)
	public void testGuitarPlayerPage() throws Exception {
		if (community.validateGuitarPlayerPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Guitar Player Page");
		} else {
			captureScreen(driver, "Guitar Player Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 10)
	public void testLeadGuitarist() throws Exception {
		Logger.info("click on Lead Guitarist");
		try {
			community.clickOnLeadGuitarist();
		} catch (Exception e) {
			captureScreen(driver, "Lead Guitarist");

		}

	}

	@Test(priority = 11)
	public void testLeadGuitaristPage() throws Exception {
		if (community.validateLeadGuitaristPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Lead Guitarist Page");
		} else {
			captureScreen(driver, "Lead Guitarist Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 12)
	public void testOpenImage() throws Exception {
		Logger.info("click on open image");
		try {
			community.clickOnOpenImage();
		} catch (Exception e) {
			captureScreen(driver, "open image");

		}

	}

	@Test(priority = 13)
	public void testCloseImage() throws Exception {
		Logger.info("click on close image");
		try {
			community.clickOnCloseImage();
		} catch (Exception e) {
			captureScreen(driver, "close image");

		}

	}

	@Test(priority = 14)
	public void testReport() throws Exception {
		Logger.info("click on report");
		try {
			community.clickOnReport();
		} catch (Exception e) {
			captureScreen(driver, "report");

		}

	}

	@Test(priority = 15)
	public void testSpamAd() throws Exception {
		Logger.info("click on spam ad");
		try {
			community.clickOnSpamAd();
		} catch (Exception e) {
			captureScreen(driver, "spam Ad");

		}

	}

	@Test(priority = 16)
	public void testMessage() throws Exception {
		Logger.info("enter message");
		try {
			community.enterMessage(prop.getProperty("message"));
		} catch (Exception e) {
			captureScreen(driver, "message");

		}

	}

	@Test(priority = 17)
	public void testSend() throws Exception {
		Logger.info("click on send");
		try {
			community.clickOnSend();
		} catch (Exception e) {
			captureScreen(driver, "send");

		}

	}

	@Test(priority = 18)
	public void testThankYouMessage() throws Exception {
		if (community.validateThankYouMessage(prop.getProperty("thank"))) {
			Assert.assertTrue(true);
			Logger.info("expected and actual message is matched");
		} else {
			captureScreen(driver, "message");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 19)
	public void testClose() throws Exception {
		Logger.info("click on close");
		try {
			community.clickOnClose();
		} catch (Exception e) {
			captureScreen(driver, "close");

		}

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
