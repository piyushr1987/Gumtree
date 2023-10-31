package com.gumtree.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.gumtree.genericPage.BaseClass;

public class CarsPage extends BaseClass {

	public CarsPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='content']//ul[@class='css-wwpisx e4qfz7d2']/li[1]")
	private WebElement lnkCar;

	@FindBy(xpath = "//a[normalize-space()='Vans']")
	private WebElement lnkVans;

	@FindBy(xpath = "//div[@class='css-j6f4sy e1xm8y82']")
	private WebElement drpMostRecent;

	@FindBy(xpath = "//div[contains(@class,'css-j6f4sy e1xm8y82')]")
	private WebElement drpPrice;

	@FindBy(xpath = "//div[@data-q='section-middle']//div[@class='css-15qmqfw'][2]")
	private WebElement lstFord;

	@FindBy(xpath = "//button[@class='button button--GTALL-26629-primary button--full-width']")
	private WebElement btnSendMessage;

	@FindBy(name = "deposit")
	private WebElement txtDeposit;

	@FindBy(xpath = "//select[@name='repay-months']")
	private WebElement drpMonths;

	@FindBy(xpath = "//button[@name='Good']")
	private WebElement btnGood;

	@FindBy(xpath = "//button[@name='apply-now']")
	private WebElement btnApplyNow;

	public void goToCar() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(lnkCar).build().perform();
		Thread.sleep(3000);
		act.moveToElement(lnkVans).build().perform();
		lnkVans.click();
	}

	public boolean validateVanPage() {
		return driver.getCurrentUrl().contains("motorbikes/vans");

	}

	public void clickOnMostRecentFirst() throws InterruptedException {
		drpMostRecent.click();
		Thread.sleep(3000);
		drpPrice.click();
	}

	public boolean validateHighestPriceFirstPage() {
		return driver.getCurrentUrl().contains("price_highest_first");

	}

	public void clickOnFordVan() {
		lstFord.click();
	}

	public boolean validateSendMessageButton() {
		return btnSendMessage.isDisplayed();

	}

	public void enterDeposit(String deposit) {
		txtDeposit.sendKeys(deposit);
	}

	public void selectRepaymentTerm(String months) {
		Select sel = new Select(drpMonths);
		sel.selectByVisibleText(months);
	}

	public void clickOnCreditScore() {
		btnGood.click();
	}

	public void clickOnApplyNow() {
		btnApplyNow.click();
	}

}
