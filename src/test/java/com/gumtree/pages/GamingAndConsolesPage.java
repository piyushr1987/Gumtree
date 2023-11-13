package com.gumtree.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gumtree.genericPage.BaseClass;

public class GamingAndConsolesPage extends BaseClass {

	public GamingAndConsolesPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	private WebElement btnAccept;

	@FindBy(xpath = "//*[text()='Featured Categories']/parent::div/parent::div/child::div[@role='list']/div[3]")
	private WebElement gamingAndConsoles;

	@FindBy(xpath = "//div[contains(@class,'css-eq7f8j euivcti7')]/p[text()='Games']")
	private WebElement games;

	@FindBy(id = "filter-freeform-price-from")
	private WebElement minPrice;

	@FindBy(id = "filter-freeform-price-to")
	private WebElement maxPrice;

	@FindBy(xpath = "//button[contains(@class,'css-18086eb elz4ov80')]")
	private WebElement updateButton;

	@FindBy(xpath = "//div[contains(@class,'css-15qmqfw')][3]")
	private WebElement pcGaming;

	@FindBy(xpath = "//div[@data-q='reply-box-2']//h2[text()='ivan']")
	private WebElement userName;

	@FindBy(xpath = "//button[@class='button button--secondary favourite ']")
	private WebElement btnFavourite;

	public void clickOnAccept() {
		btnAccept.click();
	}

	public void clickOnGamingAndConsoles() {
		gamingAndConsoles.click();
	}

	public boolean validateGamingAndConsolesPage() {
		return driver.getCurrentUrl().contains("campaign=video-games-consoles");

	}

	public void clickOnGames() {
		games.click();
	}

	public boolean validateGamesPage() {
		return driver.getCurrentUrl().contains("video-games");

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

	public void clickOnPcGaming() {
		pcGaming.click();
	}

	public boolean validatePcGamingPage() {
		return driver.getCurrentUrl().contains("/pc-gaming-/1469196865");

	}

	public boolean validateUserName(String expName) {
		String actName = userName.getText();
		if (actName.equalsIgnoreCase(expName)) {
			return true;
		} else {
			return false;
		}
	}

	public void clickOnFavourite() {
		btnFavourite.click();
	}

}
