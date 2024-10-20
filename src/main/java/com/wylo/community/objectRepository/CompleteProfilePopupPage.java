package com.wylo.community.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wylo.community.genricUtility.WebDriverUtility;

public class CompleteProfilePopupPage {

	public CompleteProfilePopupPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//div[text()='Change']")
	private WebElement changeImage;

	@FindBy(name = "ProfileFullName")
	private WebElement fullnameTextField;

	@FindBy(name = "ProfileUsername")
	private WebElement usernameTextField;

	@FindBy(name="ProfileAbout")
	private WebElement aboutTextField;

	@FindBy(name = "postLink")
	private WebElement postLinkTextField;

	@FindBy(xpath = "//button[text()='Save changes']")
	private WebElement savechangesButton;
	
	@FindBy(xpath = "//div[contains(@class,'CustomCheckbox')]")
	private WebElement checkbox;
	
	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//div[text()='Got it']")
	private WebElement gotItPopup;
	
	@FindBy(xpath = "//div[text()='Enable']")
	private WebElement enablePopupOpt;

	public void completeProfile(String fullname,String username,WebDriverUtility wUtils) throws InterruptedException
	{
		//fullnameTextField.sendKeys(fullname);
		//usernameTextField.sendKeys(username);
		//savechangesButton.click();
		//checkbox.click();
		//continueButton.click();
		gotItPopup.click();
		//enablePopupOpt.click();
	}
	
}
