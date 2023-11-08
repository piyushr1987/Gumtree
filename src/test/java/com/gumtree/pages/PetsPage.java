package com.gumtree.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gumtree.genericPage.BaseClass;

public class PetsPage extends BaseClass {

	public PetsPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[contains(@class,'css-14yx5j e1c1vrhj2')][7]")
	private WebElement pets;

	@FindBy(xpath = "//a[normalize-space()='Missing, Lost & Found']")
	private WebElement petsMissing;

	@FindBy(id = "location-field-value")
	private WebElement petLocation;

	@FindBy(xpath = "//div[contains(@class,'css-15qmqfw')][3]")
	private WebElement gingerTomCat;

	@FindBy(xpath = "//div[@id='images-tabpanel']//button[@class=' slide-panel next']")
	private WebElement btnNext;

	@FindBy(xpath = "//div[@class='css-i2cx2f ew0ql602']//p[2]")
	private WebElement adId;

	@FindBy(xpath = "//div[@class='css-ybaagx eetbei415']//span[@class='icon icon--color-default icon--large icon--circ-facebook css-0 eom5h670']")
	private WebElement facebook;

	public void goToPets() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(pets).build().perform();
		Thread.sleep(3000);
		act.moveToElement(petsMissing).build().perform();
		petsMissing.click();
	}

	public boolean validatePetMissingPage() {
		return driver.getCurrentUrl().contains("pets-missing-lost-found");

	}

	public void enterLocation(String location) throws InterruptedException {
		petLocation.clear();
		petLocation.sendKeys(location);
		Thread.sleep(3000);
		petLocation.sendKeys(Keys.ENTER);

	}

	public boolean validateLocationPage() {
		return driver.getCurrentUrl().contains("London&search_category=");

	}

	public void clickOnGingerTomCat() {
		gingerTomCat.click();
	}

	public boolean validateGingerTomCatPage() {
		return driver.getCurrentUrl().contains("missing-ginger-tom-cat");

	}

	public void clickOnNextButton() {
		btnNext.click();
	}

	public boolean validateAdId(String expId) {

		String actId = adId.getText();
		if (actId.equalsIgnoreCase(expId)) {
			return true;
		} else {
			return false;
		}

	}

	public void clickOnFacebook() {
		facebook.click();
	}

}
