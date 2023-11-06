package com.gumtree.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gumtree.genericPage.BaseClass;

public class ServicesPage extends BaseClass {

	public ServicesPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='content']//ul[@class='css-wwpisx e4qfz7d2']/li[5]")
	private WebElement lnkServices;

	@FindBy(xpath = "//a[text()='Pets']")
	private WebElement lnkPets;

	@FindBy(xpath = "//div[@class='react-select__input-container css-ackcql']")
	private WebElement chooseDistance;

	@FindBy(xpath = "//div[contains(@class,'css-bjn8wh e1ejawu1')][5]")
	private WebElement selectDistance;

	@FindBy(xpath = "//button[contains(@class,'button button--primary location-update-button')]")
	private WebElement updateButton;

	@FindBy(xpath = "//div[contains(@class,'css-eq7f8j euivcti7')][1]")
	private WebElement petsitter;

	@FindBy(xpath = "//div[contains(@class,'css-15qmqfw')][3]")
	private WebElement avesHotel;

	@FindBy(xpath = "//button[contains(@class,'button button--secondary favourite')]")
	private WebElement btnFavourite;

	public void goToSerives() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(lnkServices).build().perform();
		Thread.sleep(3000);
		act.moveToElement(lnkPets).build().perform();
		lnkPets.click();
	}

	public boolean validatePetServicesPage() {
		return driver.getCurrentUrl().contains("pet-services-supplies");

	}

	public void clickOnChooseDistance() {
		chooseDistance.click();
	}

	public void clickOnSelectDistance() {
		selectDistance.click();
	}

	public void clickOnUpdate() {
		updateButton.click();
	}

	public boolean validateDistancePage() {
		return driver.getCurrentUrl().contains("false&distance=10");

	}

	public void clickOnPetsitterAndDogwalker() {
		petsitter.click();
	}

	public boolean validatePetsitterPage() {
		return driver.getCurrentUrl().contains("petsitters-dogwalkers&search_location");

	}

	public void clickOnTheAvesHotel() {
		avesHotel.click();
	}

	public boolean validatTheAvesHotelPage() {
		return driver.getCurrentUrl().contains("the-aves-hotel/1468654300");

	}

	public void clickOnFavourite() {
		btnFavourite.click();
	}

}
