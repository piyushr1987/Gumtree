package com.gumtree.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gumtree.genericPage.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	private WebElement btnAccept;

	@FindBy(xpath = "//a[normalize-space()='Login']")
	private WebElement lnkLogin;

	@FindBy(id = "email")
	private WebElement txtEmail;

	@FindBy(id = "fld-password")
	private WebElement txtPassword;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	private WebElement btnLogin;

	@FindBy(xpath = "//div[@class='grid-col-s-8']/h2")
	private WebElement sucessMessage;

	public void clickOnAccept() {
		btnAccept.click();
	}

	public void clickOnLogin() {
		lnkLogin.click();
	}

	public boolean validateLoginPage() {
		return driver.getCurrentUrl().contains("login");
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

	public boolean validateUser(String expMessage) {
		String actMessage = sucessMessage.getText();
		if (actMessage.equalsIgnoreCase(expMessage)) {
			return true;
		} else {
			return false;
		}
	}

}
