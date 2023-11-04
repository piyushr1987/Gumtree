package com.gumtree.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gumtree.genericPage.BaseClass;
import com.gumtree.pages.JobsPage;

public class JobsTest extends BaseClass {
	JobsPage jobs;

	public JobsTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		jobs = new JobsPage();

	}

	@Test(priority = 1)
	public void testJobs() throws Exception {
		Logger.info("go to jobs and then click on engineering");
		try {
			jobs.goToJobs();
		} catch (Exception e) {
			captureScreen(driver, "jobs");

		}

	}

	@Test(priority = 2)
	public void testEngineeringJobsPage() throws Exception {
		if (jobs.validateEngineeringJobsPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to engineering jobs page");
		} else {
			captureScreen(driver, "Engineering Jobs Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testMechanicalEngineeringJobs() throws Exception {
		Logger.info("click on Mechanical Engineering");
		try {
			jobs.clickOnMechanicalEngineeringJobs();
		} catch (Exception e) {
			captureScreen(driver, "Mechanical Engineering");

		}

	}

	@Test(priority = 4)
	public void testMechanicalEngineeringJobsPage() throws Exception {
		if (jobs.validateMechanicalEngineeringJobsPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Mechanical Engineering Jobs page");
		} else {
			captureScreen(driver, "Mechanical Engineering Jobs Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 5)
	public void testPermantJobs() throws Exception {
		Logger.info("click on Permant Jobs");
		try {
			jobs.clickOnPermantJobs();
		} catch (Exception e) {
			captureScreen(driver, "Permant Jobs");

		}

	}

	@Test(priority = 6)
	public void testPermantJobsPage() throws Exception {
		if (jobs.validatePermantJobsPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Permant Jobs Page");
		} else {
			captureScreen(driver, "Permant Jobs Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 7)
	public void testExperience() throws Exception {
		Logger.info("click on Experience");
		try {
			jobs.clickOnExperience();
		} catch (Exception e) {
			captureScreen(driver, "Experience");

		}

	}

	@Test(priority = 8)
	public void testExperienceJobsPage() throws Exception {
		if (jobs.validateExperienceJobsPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Experience Jobs Page");
		} else {
			captureScreen(driver, "Experience Jobs Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 9)
	public void testWorkshopOperative() throws Exception {
		Logger.info("click on Workshop Operative");
		try {
			jobs.clickOnWorkshopOperative();
		} catch (Exception e) {
			captureScreen(driver, "Workshop Operative");

		}

	}

	@Test(priority = 10)
	public void testWorkshopOperativePage() throws Exception {
		if (jobs.validateWorkshopOperativePage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Workshop Operative Page");
		} else {
			captureScreen(driver, "Workshop Operative Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 11)
	public void testApply() throws Exception {
		Logger.info("click on apply");
		try {
			jobs.clickOnApply();
		} catch (Exception e) {
			captureScreen(driver, "apply");

		}

	}

	@Test(priority = 12)
	public void testReplyPage() throws Exception {
		if (jobs.validateReplyPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to reply Page");
		} else {
			captureScreen(driver, "reply Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 13)
	public void testSenderDetails() throws Exception {
		Logger.info("enter first name.last name and email");
		try {
			jobs.enterSenderDetails(prop.getProperty("firstName"), prop.getProperty("lastName"),
					prop.getProperty("validemail"));
		} catch (Exception e) {
			captureScreen(driver, "sender deatils");

		}

	}

	@Test(priority = 14)
	public void testCoverLetter() throws Exception {
		Logger.info("enter matter in cover letter");
		try {
			jobs.enterCoverLetter(prop.getProperty("coverLetter"));
		} catch (Exception e) {
			captureScreen(driver, "cover letter");

		}

	}

	@Test(priority = 15)
	public void testSend() throws Exception {
		Logger.info("click on send");
		try {
			jobs.clickOnSend();
		} catch (Exception e) {
			captureScreen(driver, "send");

		}

	}

	@Test(priority = 16)
	public void testSucessMessage() throws Exception {
		Logger.info("sucess message is displayed sucessfully");
		try {
			jobs.validateSucessMessage(prop.getProperty("sucess"));
		} catch (Exception e) {
			captureScreen(driver, "sucess message");

		}

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
