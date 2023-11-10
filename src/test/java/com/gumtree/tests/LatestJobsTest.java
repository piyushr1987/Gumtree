package com.gumtree.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gumtree.genericPage.BaseClass;
import com.gumtree.pages.LatestJobsPage;

public class LatestJobsTest extends BaseClass {

	LatestJobsPage latest;

	public LatestJobsTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		latest = new LatestJobsPage();

	}

	@Test(priority = 1)
	public void testAccept() throws Exception {
		Logger.info("click on accept");
		try {
			latest.clickOnAccept();
		} catch (Exception e) {
			captureScreen(driver, "accept");

		}

	}

	@Test(priority = 2)
	public void testLatestJobs() throws Exception {
		Logger.info("click on latest jobs");
		try {
			latest.clickOnLatestJobs();
		} catch (Exception e) {
			captureScreen(driver, "latest jobs");

		}

	}

	@Test(priority = 3)
	public void testLatestJobsPage() throws Exception {
		if (latest.validateLatestJobsPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Latest Jobs Page");
		} else {
			captureScreen(driver, "latest job page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 4)
	public void testTeachingAndEducation() throws Exception {
		Logger.info("click on Teaching And Education");
		try {
			latest.clickOnTeachingAndEducation();
		} catch (Exception e) {
			captureScreen(driver, "Teaching And Education");

		}

	}

	@Test(priority = 5)
	public void testTeachingJobsPage() throws Exception {
		if (latest.validateTeachingJobsPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Teaching Jobs Page");
		} else {
			captureScreen(driver, "Teaching Jobs Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 6)
	public void testTutor() throws Exception {
		Logger.info("click on Tutor");
		try {
			latest.clickOnTutor();
		} catch (Exception e) {
			captureScreen(driver, "Tutor");

		}

	}

	@Test(priority = 7)
	public void testTutorPage() throws Exception {
		if (latest.validateTutorPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Tutor Page");
		} else {
			captureScreen(driver, "Tutor Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 8)
	public void testPermanent() throws Exception {
		Logger.info("click on Permanent");
		try {
			latest.clickOnPermanent();
		} catch (Exception e) {
			captureScreen(driver, "Permanent");

		}

	}

	@Test(priority = 9)
	public void testPermanentJobsPage() throws Exception {
		if (latest.validatePermanentJobsPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Permanent Jobs Page");
		} else {
			captureScreen(driver, "Permanent Jobs Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 10)
	public void testSupportWorker() throws Exception {
		Logger.info("click on SupportWorker");
		try {
			latest.clickOnSupportWorker();
		} catch (Exception e) {
			captureScreen(driver, "SupportWorker");

		}

	}

	@Test(priority = 11)
	public void testSupportWorkerPage() throws Exception {
		if (latest.validateSupportWorkerPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Support Worker Page");
		} else {
			captureScreen(driver, "Support Worker Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 12)
	public void testApply() throws Exception {
		Logger.info("click on apply button");
		try {
			latest.clickOnApply();
		} catch (Exception e) {
			captureScreen(driver, "apply");

		}

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
