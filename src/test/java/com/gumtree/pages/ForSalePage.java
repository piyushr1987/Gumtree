package com.gumtree.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gumtree.genericPage.BaseClass;

public class ForSalePage extends BaseClass {

	public ForSalePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='content']//ul[@class='css-wwpisx e4qfz7d2']/li[2]")
	private WebElement lnkForSale;

	@FindBy(xpath = "//a[normalize-space()='Computers & Software']")
	private WebElement lnkComputers;

	@FindBy(xpath = "//div[@data-q='section-left']//div[@data-q='sub-category-list-item'][2]")
	private WebElement lstSoftwares;

	@FindBy(xpath = "//div[@data-q='section-left']//div[@data-q='sub-category-list-item'][4]")
	private WebElement lstOperatingSystem;

	@FindBy(xpath = "//div[@data-q='section-middle']//div[@class='css-15qmqfw'][4]")
	private WebElement lstWindows8;

	@FindBy(xpath = "//div[@class='seller-contact']//button[@class='button button--secondary favourite ']")
	private WebElement btnFavourite;

	@FindBy(xpath = "//div[@id='content']//button[@data-q='user-menu-button']")
	private WebElement btnMenu;

	@FindBy(xpath = "//div[@data-q='user-sub-menu']//li[3]")
	private WebElement lstFavourites;

	@FindBy(xpath = "//h2[normalize-space()='Windows 8 recovery DVD 64 bit']")
	private WebElement windows8;

	@FindBy(id = "email")
	private WebElement txtEmail;

	@FindBy(id = "fld-password")
	private WebElement txtPassword;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	private WebElement btnLogin;

	public void goToForSale() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(lnkForSale).build().perform();
		Thread.sleep(3000);
		act.moveToElement(lnkComputers).build().perform();
		lnkComputers.click();
	}

	public boolean validateComputerSoftwarePage() {
		return driver.getCurrentUrl().contains("computers-software");

	}

	public void clickOnSoftware() {
		lstSoftwares.click();
	}

	public boolean validateSoftwarePage() {
		return driver.getCurrentUrl().contains("computers-software/software");

	}

	public void clickOnOperatingSystem() {
		lstOperatingSystem.click();
	}

	public boolean validateOperatingSystemPage() {
		return driver.getCurrentUrl().contains("software/operating-system-software");

	}

	public void clickOnWindows8OperatingSystem() {
		lstWindows8.click();
	}

	public boolean validateWindows8OperatingSystemPage() {
		return driver.getCurrentUrl().contains("windows-8-recovery-dvd-64-bit");

	}

	public void clickOnFavourite() {
		btnFavourite.click();
	}

	public void enterEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void enterPassword(String pass) {
		txtPassword.sendKeys(pass);
	}

	public void clickOnLoginButton() {
		btnLogin.click();
	}

	public void clickOnMenu() {
		btnMenu.click();
	}

	public void clickOnFavouriteUnderMenu() {
		lstFavourites.click();
	}

	public boolean validateWindows8OperatingSystem() {
		return windows8.isDisplayed();

	}

}
