package com.wylo.community.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wylo.community.genricUtility.WebDriverUtility;

public class CourseEnrollUserAccountPage {
	public CourseEnrollUserAccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//@FindBy(xpath = "//button[@class='OnboardTourModal__CloseBTN-sc-86f5c2f1-25 crUksV']")
	//private WebElement onBoardTourModalCloseButton;

	@FindBy(xpath="//div[text()='Got it']")
	private WebElement cookiesBanner;

	@FindBy(xpath = "//div[@class='CourseCardView__ListContainer-sc-45066e46-8 idWANm virtuoso-grid-list']//div[1]//div[1]//div[1]//div[2]//div[2]")
	private WebElement viewdetailsOption;

	@FindBy(xpath = "//div[text()='Enroll']")
	private WebElement enrollOption;

	@FindBy(xpath = "//div[text()='Start']")
	private WebElement startOption;

	@FindBy(xpath = "//button[@class='CourseLessons__PostBTN-sc-348a3d59-38 cSSlBE']")
	private WebElement makeAsCompleteButton;

	@FindBy(xpath = "//p[text()='Back']")
	private WebElement backButton;


	public void userEnroll(WebDriverUtility wUtils) throws InterruptedException
	{
		//onBoardTourModalCloseButton.click();
		Thread.sleep(2000);
		cookiesBanner.click();
		viewdetailsOption.click();
		wUtils.directScroll(enrollOption);
		enrollOption.click();
		startOption.click();
		makeAsCompleteButton.click();
		backButton.click();
	}
}
