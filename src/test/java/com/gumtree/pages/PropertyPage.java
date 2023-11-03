package com.gumtree.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gumtree.genericPage.BaseClass;

public class PropertyPage extends BaseClass {

	public PropertyPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='content']//ul[@class='css-wwpisx e4qfz7d2']/li[3]")
	private WebElement lnkProperty;

	@FindBy(xpath = "//a[normalize-space()='International']")
	private WebElement lnkInternational;

	@FindBy(xpath = "//div[@class='react-select__input-container css-ackcql']")
	private WebElement drpChooseDistance;

	@FindBy(xpath = "//div[@id='react-select-location-option-3']")
	private WebElement drpDistance;

	@FindBy(xpath = "//button[@class='button button--primary location-update-button']")
	private WebElement btnUpdateForDistance;

	@FindBy(xpath = "//div[@class='react-select__single-value css-qc6sy-singleValue'][normalize-space()='No min']")
	private WebElement drpMin;

	@FindBy(xpath = "//div[contains(@class,'css-bjn8wh ea832k84')][4]")
	private WebElement drpMinValue;

	@FindBy(xpath = "//div[@class='react-select__single-value css-qc6sy-singleValue'][normalize-space()='No max']")
	private WebElement drpMax;

	@FindBy(xpath = "//div[contains(text(),'£80,000')]")
	private WebElement drpMaxValue;

	@FindBy(xpath = "//button[contains(@class,'css-18086eb elz4ov80')]")
	private WebElement btnUpdate;

	@FindBy(xpath = "//div[@data-q='section-middle']//div[@class='css-15qmqfw'][3]")
	private WebElement lstHouseGarden;

	@FindBy(xpath = "//div[@class='seller-contact']//button[@class='button button--secondary favourite ']")
	private WebElement btnFavourite;

	public void goToProperty() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(lnkProperty).build().perform();
		Thread.sleep(3000);
		act.moveToElement(lnkInternational).build().perform();
		lnkInternational.click();
	}

	public boolean validateInternationalPropertyPage() {
		return driver.getCurrentUrl().contains("international-property-for-sale");

	}

	public void chooseDistance() {
		drpChooseDistance.click();
	}

	public void selectDistance() {
		drpDistance.click();
	}

	public void clickOnUpdateForDistance() {
		btnUpdateForDistance.click();
	}

	public boolean validateDistancePage() {
		return driver.getCurrentUrl().contains("filter=false&distance=5");

	}

	public void clickOnMin() {
		drpMin.click();
	}

	public void selectMinPrice() {
		drpMinValue.click();
	}

	public void clickOnMax() {
		drpMax.click();
	}

	public void selectMaxPrice() {
		drpMaxValue.click();
	}

	public void clickOnUpdate() {
		btnUpdate.click();
	}

	public boolean validatePricePage() {
		return driver.getCurrentUrl().contains("min_price=30000&max_price=80000");

	}

	public void clickOnHouseGarden() {
		lstHouseGarden.click();
	}

	public boolean validateHouseGardenPage() {
		return driver.getCurrentUrl().contains("house-garden-barn-located-in-france-charente-region");

	}

	public void clickOnFavourite() {
		btnFavourite.click();
	}

}
