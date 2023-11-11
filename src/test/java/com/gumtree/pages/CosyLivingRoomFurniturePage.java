package com.gumtree.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gumtree.genericPage.BaseClass;

public class CosyLivingRoomFurniturePage extends BaseClass {

	public CosyLivingRoomFurniturePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='container  gumtree-official-featured']//div[@role='listitem'][2]")
	private WebElement cosyLivingRoomFurniture;

	@FindBy(xpath = "//span[@class='css-1o74gp8 euivcti1']")
	private WebElement showMore;

	@FindBy(xpath = "//p[normalize-space()='Coffee table']")
	private WebElement coffeeTable;

	@FindBy(id = "filter-freeform-price-from")
	private WebElement minPrice;

	@FindBy(id = "filter-freeform-price-to")
	private WebElement maxPrice;

	@FindBy(xpath = "//button[contains(@class,'css-18086eb elz4ov80')]")
	private WebElement updateButton;

	@FindBy(xpath = "//div[contains(@class,'css-15qmqfw')][4]")
	private WebElement sideTable;

	@FindBy(xpath = "//a[text()='View Profile']")
	private WebElement viewProfile;

	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	private WebElement btnAccept;

	public void clickOnAccept() {
		btnAccept.click();
	}

	public void clickOnLivingRoomFurniture() {
		cosyLivingRoomFurniture.click();
	}

	public boolean validateDiningAndLivingRoomFurniturePage() {
		return driver.getCurrentUrl().contains("All&utm_campaign=dining-living-room-furniture");

	}

	public void clickOnShowMore() {
		showMore.click();
	}

	public void clickOnCoffeeTable() {
		coffeeTable.click();
	}

	public boolean validateCoffeeTablePage() {
		return driver.getCurrentUrl().contains("dining-living-room-furniture/coffee-table");

	}

	public void enterMinimumPrice(String min) {
		minPrice.sendKeys(min);
	}

	public void enterMaximumPrice(String max) {
		maxPrice.sendKeys(max);
	}

	public void clickOnUpdate() {
		updateButton.click();
	}

	public boolean validatePricePage() {
		return driver.getCurrentUrl().contains("min_price=1000&max_price=5000");

	}

	public void clickOnSideTable() {
		sideTable.click();
	}

	public boolean validateCoffeeSideTablePage() {
		return driver.getCurrentUrl().contains("1-x-coffee-table-2-side-tables-");

	}

	public void clickOnViewProfile() {
		viewProfile.click();
	}

}
