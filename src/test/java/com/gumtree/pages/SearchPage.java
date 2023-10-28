package com.gumtree.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gumtree.genericPage.BaseClass;

public class SearchPage extends BaseClass {

	public SearchPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "q")
	private WebElement txtSearchBox;

	@FindBy(id = "header-search-location")
	private WebElement txtHeaderSearchBox;

	@FindBy(xpath = "//button[@data-q='search-button']")
	private WebElement btnSearch;

	@FindBy(xpath = "//label[@for='radio-vehicle_make-3']")
	private WebElement rdJaguar;

	@FindBy(xpath = "//label[contains(@for,'radio-vehicle_registration_year-2')]")
	private WebElement rd8Year;

	@FindBy(xpath = "//div[@data-q='section-middle']/child::div/child::div[3]")
	private WebElement bmwCar;

	public void enterValueInSearchBox(String search) {
		txtSearchBox.sendKeys(search);
	}

	public void enterValueInHeaderSearchBox(String hsearch) {
		txtHeaderSearchBox.sendKeys(hsearch);
	}

	public void clickOnSearch() {
		btnSearch.click();
	}

	public boolean validateSearchPage() {
		return driver.getCurrentUrl().contains("search_location=UK");
	}

	public void clickOnJaguar() {
		rdJaguar.click();
	}

	public boolean validateJaguarSelection() {
		return rdJaguar.isSelected();
	}

	public void clickOnYear() {
		rd8Year.click();
	}

	public boolean validateYearSelection() {
		return rd8Year.isSelected();
	}

	public void clickOnBMW() {
		bmwCar.click();
	}

	public boolean validateBMWCarPage() {
		return driver.getCurrentUrl().contains("diesel-manual-xdrive-euro");
	}

}
