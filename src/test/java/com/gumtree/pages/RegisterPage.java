package com.gumtree.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gumtree.genericPage.BaseClass;

public class RegisterPage extends BaseClass {

	public RegisterPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	private WebElement btnAccept;

	@FindBy(xpath = "//a[normalize-space()='Register']")
	private WebElement lnkRegister;

	@FindBy(id = "form.firstName")
	private WebElement txtFirstName;

	@FindBy(id = "form.lastName")
	private WebElement txtLastName;

	@FindBy(id = "form.emailAddress")
	private WebElement txtEmail;

	@FindBy(id = "form.password")
	private WebElement txtPassword;

	@FindBy(xpath = "//button[@data-q='submit-create-account']")
	private WebElement btnRegister;

	public void clickOnAccept() {
		btnAccept.click();
	}

	public void clickOnRegister() {
		lnkRegister.click();
	}

	public boolean validateCreateAccountPage() {
		return driver.getCurrentUrl().contains("/create-account");
	}

	public void enterFirstName(String fname) {
		txtFirstName.sendKeys(fname);
	}

	public void enterLastName(String lname) {
		txtLastName.sendKeys(lname);
	}

	public void enterEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void enterPassword(String pass) {
		txtPassword.sendKeys(pass);
	}

	public void clickOnRegisterButton() {
		btnRegister.click();
	}

}
