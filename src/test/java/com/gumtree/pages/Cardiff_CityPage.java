package com.gumtree.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gumtree.genericPage.BaseClass;

public class Cardiff_CityPage extends BaseClass {

	public Cardiff_CityPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	private WebElement btnAccept;

	@FindBy(xpath = "//ul[@class='link-list'][3]//li[4]//a[1]")
	private WebElement cardiff;

	@FindBy(xpath = "//div[@class='ns-e08wf-e-2 column-container product-container']//a[@class='ns-e08wf-e-6 flex']")
	private WebElement britanniaSouthBank;

	@FindBy(xpath = "//div[@class='amber-Grid-col amber-19moo7d']//div[3]//button[1]")
	private WebElement btnViewRoom;

	@FindBy(xpath = "//div[@class='amber-88em9o']//div[1]//div[2]//div[1]//div[1]//div[2]//div[1]//div[1]")
	private WebElement studio;

	@FindBy(xpath = "//div[@class='amber-88em9o']//div[1]//div[2]//div[1]//div[1]//div[2]//div[1]//div[2]")
	private WebElement entirePlace;

	@FindBy(xpath = "//div[@class='amber-88em9o']//div[1]//div[2]//div[1]//div[1]//div[2]//div[1]//div[3]")
	private WebElement privateBathroom;

	@FindBy(xpath = "//div[@class='amber-88em9o']//div[1]//div[2]//div[1]//div[1]//div[2]//div[1]//div[4]")
	private WebElement privateKitchen;

	@FindBy(xpath = "//div[@class='amber-88em9o']//div[1]//div[2]//div[1]//div[1]//div[2]//div[1]//div[5]")
	private WebElement bedrooms;

	@FindBy(xpath = "//button[@class='amber-UnstyledButton-root amber-ActionIcon-root amber-Modal-close amber-gkwa6d']//*[name()='svg']")
	private WebElement btnClose;

	@FindBy(xpath = "//button[@class='amber-UnstyledButton-root amber-Button-root amber-1cedzmq']")
	private WebElement btnEnquiry;

	public void clickOnAccept() {
		btnAccept.click();
	}

	public void clickOnCardiffCity() {
		cardiff.click();
	}

	public boolean validateCardiffCityPage() {
		return driver.getCurrentUrl().contains("uk/cardiff");

	}

	public void clickOnBritanniaSouthBank() {
		britanniaSouthBank.click();
		Set<String> handles = driver.getWindowHandles();
		List<String> hList = new ArrayList<String>(handles);
		switchToRightWindow("Britannia South Bank, London | Amber", hList);
	}

	public boolean validateBritanniaSouthBankPage() {
		return driver.getCurrentUrl().contains("britannia-south-bank-london");

	}

	public void clickOnViewRooms() {
		btnViewRoom.click();
	}

	public void clickOnStudio() {
		studio.click();
		btnClose.click();
	}

	public void clickOnEntirePlace() {
		entirePlace.click();
		btnClose.click();
	}

	public void clickOnPrivateBathroom() {
		privateBathroom.click();
		btnClose.click();
	}

	public void clickOnPrivateKitchen() {
		privateKitchen.click();
		btnClose.click();
	}

	public void clickOnBedrooms() {
		bedrooms.click();
		btnClose.click();
	}

	public void clickOnEnquiry() {
		btnEnquiry.click();
		btnClose.click();
	}

	public static boolean switchToRightWindow(String windowTitle, List<String> hList) {
		for (String e : hList) {
			String title = driver.switchTo().window(e).getTitle();
			if (title.contains(windowTitle)) {
				System.out.println("found right window....");
				return true;
			}
		}
		return false;
	}

}
