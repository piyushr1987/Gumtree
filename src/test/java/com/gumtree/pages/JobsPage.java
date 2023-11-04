package com.gumtree.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gumtree.genericPage.BaseClass;

public class JobsPage extends BaseClass {

	public JobsPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='content']//ul[@class='css-wwpisx e4qfz7d2']/li[4]")
	private WebElement lnkJobs;

	@FindBy(xpath = "//a[normalize-space()='Engineering']")
	private WebElement lnkEngineering;

	@FindBy(xpath = "//div[@data-q='section-left-and-middle']//div[@class='css-1mj4j8a'][1]//div[@data-q='sub-category-list']//p[text()='Mechanical Engineers']")
	private WebElement lnkMechanicalEngineering;

	@FindBy(xpath = "//label[@for='radio-job_contract_type-2']")
	private WebElement rdPermant;

	@FindBy(xpath = "//label[@for='radio-job_level-1']")
	private WebElement rdExperience;

	@FindBy(xpath = "//div[contains(@class,'css-15qmqfw')][7]")
	private WebElement workshop;

	@FindBy(xpath = "//button[@data-q='contact-email']")
	private WebElement btnApply;

	@FindBy(id = "form.senderName")
	private WebElement txtFirstName;

	@FindBy(id = "form.senderLastName")
	private WebElement txtLastName;

	@FindBy(id = "form.senderEmail")
	private WebElement txtEmail;

	@FindBy(xpath = "//textarea[@id='form.message']")
	private WebElement txtArea;

	@FindBy(xpath = "//button[@data-title='submit-message']")
	private WebElement btnSend;

	@FindBy(xpath = "//figcaption[text()='Success!']")
	private WebElement sucessMessage;

	public void goToJobs() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(lnkJobs).build().perform();
		Thread.sleep(3000);
		act.moveToElement(lnkEngineering).build().perform();
		lnkEngineering.click();
	}

	public boolean validateEngineeringJobsPage() {
		return driver.getCurrentUrl().contains("engineering-jobs");

	}

	public void clickOnMechanicalEngineeringJobs() {
		lnkMechanicalEngineering.click();
	}

	public boolean validateMechanicalEngineeringJobsPage() {
		return driver.getCurrentUrl().contains("mechanical-engineers-jobs");

	}

	public void clickOnPermantJobs() {
		rdPermant.click();
	}

	public boolean validatePermantJobsPage() {
		return driver.getCurrentUrl().contains("job_contract_type=permanent");

	}

	public void clickOnExperience() {
		rdExperience.click();
	}

	public boolean validateExperienceJobsPage() {
		return driver.getCurrentUrl().contains("job_level=experienced");

	}

	public void clickOnWorkshopOperative() {
		workshop.click();
	}

	public boolean validateWorkshopOperativePage() {
		return driver.getCurrentUrl().contains("/workshop-operative-/5413279429");

	}

	public void clickOnApply() {
		btnApply.click();
	}

	public boolean validateReplyPage() {
		return driver.getCurrentUrl().contains("reply/5413279429");

	}

	public void enterSenderDetails(String fname, String lname, String email) {
		txtFirstName.sendKeys(fname);
		txtLastName.sendKeys(lname);
		txtEmail.sendKeys(email);
	}

	public void enterCoverLetter(String letter) {
		txtArea.sendKeys(letter);
	}

	public void clickOnSend() {
		btnSend.click();
	}

	public boolean validateSucessMessage(String expMessage) {

		String actMessage = sucessMessage.getText();
		if (actMessage.equalsIgnoreCase(expMessage)) {
			return true;
		} else {
			return false;

		}

	}
}
