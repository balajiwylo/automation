package com.wylo.community.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wylo.community.genricUtility.WebDriverUtility;

import org.testng.Assert;

public class EnrollThePaidCoursePage {
	public EnrollThePaidCoursePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[text()='Got it']")
	private WebElement cookiesBanner;

	@FindBy(xpath = "//div[@class='CourseCardView__ListContainer-sc-f3a2d328-8 cqODfH virtuoso-grid-list']//div[1]//div[1]//div[1]//div[2]//div[2]")
	private WebElement viewdetailsOption;

	@FindBy(xpath = "//div[text()='Buy']")
	private WebElement buyOption;

	@FindBy(id = "cardNumber")
	private WebElement cardNumber;

	@FindBy(id="cardExpiry")
	private WebElement cardExpiry;

	@FindBy(id="cardCvc")
	private WebElement cardCvc;

	@FindBy(id="billingName")
	private WebElement cardholderNameTextField;

	@FindBy(id="billingAddressLine1")
	private WebElement addressTextField1;

	@FindBy(xpath = "//div[@class='AddressAutocomplete-results--showing']//li[1]")
	private WebElement selectAddress;

	@FindBy(id="billingLocality")
	private WebElement cityTextField;

	@FindBy(id="billingPostalCode")
	private WebElement pincode;

	@FindBy(id="billingAdministrativeArea")
	private WebElement stateDropDown;

	@FindBy(xpath = "//option[text()='Tamil Nadu']")
	private WebElement stateName;

	@FindBy(xpath = "//div[@class='SubmitButton-IconContainer']")
	private WebElement payOption;
	
	@FindBy(id="test-source-authorize-3ds")
	private WebElement completeButton;

	@FindBy(xpath = "//div[text()='Close']")
	private WebElement closeOption;

	public void enrollCourse(WebDriverUtility wUtils,String cardNum,String cardExp,String cardCvcNumber,String billingName,String address1) throws InterruptedException
	{
		cookiesBanner.click();
		Thread.sleep(2000);
		viewdetailsOption.click();
		wUtils.directScroll(buyOption);
		Thread.sleep(2000);
		Assert.assertTrue(wUtils.isElementClickable(buyOption), "'Buy' button is not clickable.");
		buyOption.click();
		cardNumber.sendKeys(cardNum);
		cardExpiry.sendKeys(cardExp);
		cardCvc.sendKeys(cardCvcNumber);
		cardholderNameTextField.sendKeys(billingName);
		addressTextField1.sendKeys(address1);
		selectAddress.click();
		Thread.sleep(2000);
		payOption.click();
		
		completeButton.submit();
		closeOption.click();
		//stateDropDown.click();



	}

}
