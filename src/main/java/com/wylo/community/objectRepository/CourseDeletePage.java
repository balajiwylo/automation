package com.wylo.community.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wylo.community.genricUtility.WebDriverUtility;

public class CourseDeletePage {
	public CourseDeletePage(WebDriver driver)
	{

		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[@class='OnboardTourModal__CloseBTN-sc-86f5c2f1-25 crUksV']")
	private WebElement onBoardTourModalCloseButton;

	@FindBy(xpath="//div[text()='Got it']")
	private WebElement cookiesBanner;

	@FindBy(xpath="//div[@class='CourseCardView__ListContainer-sc-45066e46-8 idWANm virtuoso-grid-list']//div[1]//div[1]//div[1]//div[2]//div[2]")
	private WebElement viewDetailsOption;

	@FindBy(xpath = "//p[text()='Edit']")
	private WebElement editOption;

	
//	public void deleteCourse(WebDriverUtility wUtils) throws InterruptedException
//	{
//		Thread.sleep(2000);
//		onBoardTourModalCloseButton.click();
//		Thread.sleep(2000);
//		cookiesBanner.click();
//		//wUtils.waitUntilEleToBeVisible(10, viewDetailsOption);
//		viewDetailsOption.click();
//		//Thread.sleep(2000);
		//wUtils.scrollTillElementToBeVisible(threeDotOption);
//		wUtils.directScroll(threeDotOption);
		//Thread.sleep(5000);
//		//editOption.click();
//		threeDotOption.click();
//		//Thread.sleep(2000);
//		deleteOption.click();
//		//deleteButton.click();
	}

//}
