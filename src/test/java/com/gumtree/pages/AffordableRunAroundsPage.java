package com.gumtree.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gumtree.genericPage.BaseClass;

public class AffordableRunAroundsPage extends BaseClass {

	public AffordableRunAroundsPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	private WebElement btnAccept;

	@FindBy(xpath = "//*[text()='Featured Categories']/parent::div/parent::div/child::div[@role='list']/div[4]")
	private WebElement AffordableRunArounds;

	@FindBy(xpath = "//label[@for='radio-vehicle_make-2']")
	private WebElement audi;

	@FindBy(xpath = "//label[@for='radio-vehicle_registration_year-4']")
	private WebElement upto9years;

	@FindBy(xpath = "//div[contains(@class,'css-15qmqfw')][3]")
	private WebElement audiA3;

	@FindBy(xpath = "//textarea[@placeholder='Is this available?']")
	private WebElement contactMessage;

	@FindBy(xpath = "//button[@data-q='send-message-button']")
	private WebElement btnSendMessage;

	public void clickOnAccept() {
		btnAccept.click();
	}

	public void clickOnAffordableRunArounds() {
		AffordableRunArounds.click();
	}

	public boolean validateAffordableCarsPage() {
		return driver.getCurrentUrl().contains("srpsearch+cheap+cars?utm");

	}

	public void clickOnAudi() {
		audi.click();
	}

	public boolean validateAudiPage() {
		return driver.getCurrentUrl().contains("vehicle_make=audi");

	}

	public void clickOnYear() {
		upto9years.click();
	}

	public boolean validateYearPage() {
		return driver.getCurrentUrl().contains("registration_year=up_to_9");

	}

	public void clickOnAudiBLKEdition() {
		audiA3.click();
	}

	public boolean validateAudiBLKEditionPage() {
		return driver.getCurrentUrl().contains("-audi-a3-blk-edition-2018");

	}

	public boolean validateSenderMessage(String expMessage) {

		String actMessage = contactMessage.getText();
		if (actMessage.contains(expMessage)) {
			return true;
		} else {
			return false;
		}
	}

	public void clickOnSendMessage() {
		btnSendMessage.click();

	}

}
