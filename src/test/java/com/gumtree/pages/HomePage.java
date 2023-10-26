package com.gumtree.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gumtree.genericPage.BaseClass;

public class HomePage extends BaseClass {

	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='content']//a[@data-testid='gumtree-logo']")
	WebElement companyLogo;

	@FindBy(id = "q")
	WebElement txtSearchBox;

	@FindBy(xpath = "//div[@id='content']//a[@data-q='hm-login']")
	WebElement btnLoginAndRegister;

	@FindBy(xpath = "//button[@id='top-locations-tab']")
	WebElement lnktopLocations;

	@FindBy(xpath = "//div[@id='content']//span[text()='About Gumtree']")
	WebElement lnkAboutUs;

	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	WebElement btnAccept;

	public boolean validateCompanyLogo() {
		return companyLogo.isDisplayed();
	}

	public boolean validateSearchBox() {
		return txtSearchBox.isDisplayed();
	}

	public boolean validateLoginAndRegister() {
		return btnLoginAndRegister.isDisplayed();
	}

	public boolean validateTopLocations() {
		return lnktopLocations.isDisplayed();
	}

	public boolean validateAboutUs() {
		return lnkAboutUs.isDisplayed();
	}

	public void clickOnAccept() {
		btnAccept.click();
	}

	public void clickOnAboutUs() {
		lnkAboutUs.click();
	}

	public boolean validateAboutUsPage() {
		return driver.getCurrentUrl().contains("about-us/");
	}

}
