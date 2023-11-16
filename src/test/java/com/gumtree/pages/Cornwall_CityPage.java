package com.gumtree.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gumtree.genericPage.BaseClass;

public class Cornwall_CityPage extends BaseClass {

	public Cornwall_CityPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	private WebElement btnAccept;

	@FindBy(xpath = "//a[normalize-space()='Cornwall']")
	private WebElement cornwall;

	@FindBy(xpath = "//p[normalize-space()='Motors']")
	private WebElement motor;

	@FindBy(xpath = "//p[normalize-space()='Cars']")
	private WebElement cars;

	@FindBy(xpath = "//label[@for='radio-vehicle_make-4']")
	private WebElement audi;

	@FindBy(xpath = "//label[@for='radio-vehicle_colour-2']")
	private WebElement blue;

	@FindBy(xpath = "//div[@class='css-1tzc1rq']/child::div[2]/child::div/child::div[4]")
	private WebElement audiQ2;

	@FindBy(xpath = "//button[@data-q='send-message-button']")
	private WebElement btnSendMessage;

	public void clickOnAccept() {
		btnAccept.click();
	}

	public void clickOnCornwallCity() {
		cornwall.click();
	}

	public boolean validateCornwallCityPage() {
		return driver.getCurrentUrl().contains("uk/cornwall");

	}

	public void clickOnMotor() {
		motor.click();
	}

	public boolean validateMotorPage() {
		return driver.getCurrentUrl().contains("cars-vans-motorbikes/");

	}

	public void clickOnCar() {
		cars.click();
	}

	public boolean validateCarPage() {
		return driver.getCurrentUrl().contains("cars/uk/cornwall");

	}

	public void clickOnAudi() {
		audi.click();
	}

	public boolean validateAudiCarPage() {
		return driver.getCurrentUrl().contains("vehicle_make=audi");

	}

	public void clickOnBlueAudi() {
		blue.click();
	}

	public boolean validateBlueAudiCarPage() {
		return driver.getCurrentUrl().contains("vehicle_colour=blue");

	}

	public void clickOnBlueAudiQ2() {
		audiQ2.click();
	}

	public boolean validateBlueAudiQ2CarPage() {
		return driver.getCurrentUrl().contains("audi-a3-convertible-tfsi-sport-1.4");

	}

	public void clickOnSendMessage() {
		btnSendMessage.click();

	}

}
