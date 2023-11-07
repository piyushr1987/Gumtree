package com.gumtree.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gumtree.genericPage.BaseClass;

public class CommunityPage extends BaseClass {

	public CommunityPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[contains(@class,'css-14yx5j e1c1vrhj2')][6]")
	private WebElement community;

	@FindBy(xpath = "//a[normalize-space()='Music, Bands & Musicians']")
	private WebElement music;

	@FindBy(xpath = "//div[@class='css-s5xdrg']//div[text()='Most recent first']")
	private WebElement mostRecent;

	@FindBy(xpath = "//div[contains(text(),'Nearest first')]")
	private WebElement nearest;

	@FindBy(xpath = "//div[@class='css-1mj4j8a']//div[@data-q='sub-category-list-item'][1]")
	private WebElement musicianWanted;

	@FindBy(xpath = "//div[@data-q='sub-category-list-item'][4]")
	private WebElement guitarPlayer;

	@FindBy(xpath = "//div[contains(@class,'css-15qmqfw')][2]")
	private WebElement leadGuitarist;

	@FindBy(xpath = "//button[@class='carousel-open']")
	private WebElement btnOpen;

	@FindBy(xpath = "//button[@data-q='dialog-close']")
	private WebElement btnClose;

	@FindBy(xpath = "//div[@class='seller-contact']//button[@class='button button--secondary reporter']")
	private WebElement btnReport;

	@FindBy(xpath = "//label[@for='radio-three']")
	private WebElement rdAd;

	@FindBy(xpath = "//textarea[@placeholder='Please provide more information']")
	private WebElement txtArea;

	@FindBy(xpath = "//button[@data-q='send-report-button']")
	private WebElement btnSendReport;

	@FindBy(xpath = "//div[@class='feedback-success-container']/h4")
	private WebElement textThank;

	@FindBy(xpath = "//button[@class='button button--GTALL-26629-primary close-reporter']")
	private WebElement btnCloseText;

	public void goToCommunity() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(community).build().perform();
		Thread.sleep(3000);
		act.moveToElement(music).build().perform();
		music.click();
	}

	public boolean validateMusicPage() {
		return driver.getCurrentUrl().contains("music-bands-musicians-djs");

	}

	public void clickOnMostRecent() {
		mostRecent.click();
	}

	public void clickOnNearest() {
		nearest.click();
	}

	public boolean validateNearestDistancePage() {
		return driver.getCurrentUrl().contains("music-bands-musicians-djs&sort=distance");

	}

	public void clickOnMusicianWanted() {
		musicianWanted.click();
	}

	public boolean validateMusicianWantedPage() {
		return driver.getCurrentUrl().contains("musicians-wanted&search");

	}

	public void clickOnGuitarPlayer() {
		guitarPlayer.click();
	}

	public boolean validateGuitarPlayerPage() {
		return driver.getCurrentUrl().contains("guitar-player-wanted");

	}

	public void clickOnLeadGuitarist() {
		leadGuitarist.click();
	}

	public boolean validateLeadGuitaristPage() {
		return driver.getCurrentUrl().contains("seeking-lead-guitarist-for-gigging");

	}

	public void clickOnOpenImage() {
		btnOpen.click();
	}

	public void clickOnCloseImage() {
		btnClose.click();
	}

	public void clickOnReport() {
		btnReport.click();
	}

	public void clickOnSpamAd() {
		rdAd.click();
	}

	public void enterMessage(String msg) {
		txtArea.sendKeys(msg);
	}

	public void clickOnSend() {
		btnSendReport.click();
	}

	public boolean validateThankYouMessage(String expMessage) {
		String actMessage = textThank.getText();
		if (actMessage.equalsIgnoreCase(expMessage)) {
			return true;
		} else {
			return false;
		}
	}

	public void clickOnClose() {
		btnCloseText.click();
	}

}
