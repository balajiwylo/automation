package com.wylo.community.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wylo.community.genricUtility.WebDriverUtility;

public class ArchiveCoursePage {

	public ArchiveCoursePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[@class='OnboardTourModal__CloseBTN-sc-86f5c2f1-25 crUksV']")
	private WebElement onBoardTourModalCloseButton;

	@FindBy(xpath="//div[text()='Got it']")
	private WebElement cookiesBanner;

	@FindBy(xpath="//div[@class='CourseCardView__ListContainer-sc-f3a2d328-8 cqODfH virtuoso-grid-list']//div[1]//div[1]//div[1]//div[2]//div[2]")
	private WebElement viewDetailsOption;

	@FindBy(xpath = "//button[@class='KebabBTN__GroupOptionsBTN-sc-e95cf605-0 hmVKJv']")
	private WebElement threeDotOption;


	public void archiveCourse(WebDriverUtility wUtils) throws InterruptedException
	{
		Thread.sleep(2000);
		onBoardTourModalCloseButton.click();
		cookiesBanner.click();
		viewDetailsOption.click();
		wUtils.directScroll(threeDotOption);
		threeDotOption.click();
//		archiveOption.click();
//		archiveButton.click();
	}
}
