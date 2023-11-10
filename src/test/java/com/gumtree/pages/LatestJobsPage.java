package com.gumtree.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gumtree.genericPage.BaseClass;

public class LatestJobsPage extends BaseClass {

	public LatestJobsPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body/div[@id='content']/div[contains(@class,'view-container')]/section[contains(@class,'home-content')]/div[contains(@class,'container')]/div[contains(@class,'split-container')]/div[contains(@class,'left')]/div[contains(@class,'gumtree-official-featured')]/div[contains(@role,'list')]/div[1]")
	private WebElement latestJobs;

	@FindBy(xpath = "//p[normalize-space()='Teaching & Education']")
	private WebElement teachingAndEducation;

	@FindBy(xpath = "//p[normalize-space()='Tutor']")
	private WebElement tutor;

	@FindBy(xpath = "//label[@for='radio-job_contract_type-4']")
	private WebElement permanent;

	@FindBy(xpath = "//div[contains(@class,'css-15qmqfw')][3]")
	private WebElement supportWorker;

	@FindBy(xpath = "//button[@data-q='contact-email']")
	private WebElement btnApply;

	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	private WebElement btnAccept;

	public void clickOnAccept() {
		btnAccept.click();
	}

	public void clickOnLatestJobs() {
		latestJobs.click();
	}

	public boolean validateLatestJobsPage() {
		return driver.getCurrentUrl().contains("All&utm_campaign=jobs");

	}

	public void clickOnTeachingAndEducation() {
		teachingAndEducation.click();
	}

	public boolean validateTeachingJobsPage() {
		return driver.getCurrentUrl().contains("teaching-nursery-jobs");

	}

	public void clickOnTutor() {
		tutor.click();
	}

	public boolean validateTutorPage() {
		return driver.getCurrentUrl().contains("tutor-jobs");

	}

	public void clickOnPermanent() {
		permanent.click();
	}

	public boolean validatePermanentJobsPage() {
		return driver.getCurrentUrl().contains("job_contract_type=permanent");

	}

	public void clickOnSupportWorker() {
		supportWorker.click();
	}

	public boolean validateSupportWorkerPage() {
		return driver.getCurrentUrl().contains("support-worker-pa/");

	}

	public void clickOnApply() {
		btnApply.click();
	}

}
