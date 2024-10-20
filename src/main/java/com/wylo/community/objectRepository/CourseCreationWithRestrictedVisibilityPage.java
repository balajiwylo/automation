package com.wylo.community.objectRepository;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wylo.community.genricUtility.WebDriverUtility;

public class CourseCreationWithRestrictedVisibilityPage {
	public CourseCreationWithRestrictedVisibilityPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[@class='OnboardTourModal__CloseBTN-sc-86f5c2f1-25 crUksV']")
	private WebElement onBoardTourModalCloseButton;

	@FindBy(xpath="//div[text()='Got it']")
	private WebElement cookiesBanner;

	@FindBy(xpath = "//button[@class='Courses__ActionBTN-sc-94e50c69-4 gFUcLL']")
	private WebElement courseCreationPlusIcon;

	@FindBy(xpath="//button[@class='InfoPage__AddCoverBTN-sc-36ae7136-4 gCBLfQ']")
	private WebElement addCoverImageBtn;

	@FindBy(xpath="//div[@class='InfoPage__UploadContainer-sc-36ae7136-10 hSwvht']//button[@class='InfoPage__UploadBTN-sc-36ae7136-5 edgkKx'][normalize-space()='Upload']")
	private WebElement imageUploadBtn;

	@FindBy(xpath = "//input[@placeholder='Enter a course name']")
	private WebElement courseNameTextField;

	@FindBy(xpath = "//textarea[@placeholder='Give a short description']")
	private WebElement shortDescriptionTextField;

	@FindBy(id = "yoopta-contenteditable")
	private WebElement aboutTextField;

	@FindBy(xpath = "//div[@class='CourseVisibility__VisibilityOptionsContainer-sc-bc47a3f-2 jRhGQs']//div[2]")
	private WebElement visibility;

	@FindBy(xpath = "//span[text()='Select user tags']")
	private WebElement selectUsertagOption;

	@FindBy(xpath = "//div[@class='CustomCheckbox__MainContainer-sc-65f7c7c2-0 eApdyE']")
	private WebElement userTag;

	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement continueBtn;

	@FindBy(xpath = "//input[@placeholder='Enter chapter name']")
	private WebElement chapterNameTextField;

	@FindBy(xpath="//button[text()='Create']")
	private WebElement chapterCreateButton;

	@FindBy(xpath = "//P[text()='New lesson']")
	private WebElement newLessonOption;

	@FindBy(xpath = "//input[@placeholder='Enter lesson title']")
	private WebElement lessonTitleTextField;

	@FindBy(xpath = "//button[text()='Create']")
	private WebElement lessonCreateButton;

	@FindBy(xpath = "//button[text()='Publish']")
	private WebElement publishButton;

	@FindBy(xpath = "//div[text()='Close']")
	private WebElement afterCourseCreationCloseButton;
	
	public WebElement getCourseNameTextField() {
		return courseNameTextField;
	}


	public WebElement getShortDescriptionTextField() {
		return shortDescriptionTextField;
	}


	public WebElement getAboutTextField() {
		return aboutTextField;
	}

	public void restrictedCourse(WebDriverUtility wUtils, String filePath, String courseName, String shortDescription, String aboutTheCourse,String chapterName, String lessonName) throws InterruptedException, AWTException
	{
		Thread.sleep(2000);
		onBoardTourModalCloseButton.click();
		cookiesBanner.click();
		Thread.sleep(2000);
		courseCreationPlusIcon.click();
		addCoverImageBtn.click();
		imageUploadBtn.click();
		Thread.sleep(2000);
		wUtils.uploadFile(filePath);
		Thread.sleep(2000);
		courseNameTextField.sendKeys(courseName);
		shortDescriptionTextField.sendKeys(shortDescription);
		aboutTextField.sendKeys(aboutTheCourse);
		wUtils.directScroll(aboutTextField);
		Thread.sleep(2000);
		visibility.click();
		selectUsertagOption.click();
		userTag.click();
		wUtils.scrollTillElementToBeVisible(continueBtn);
		Thread.sleep(2000);
		continueBtn.click();
		chapterNameTextField.sendKeys(chapterName);
		chapterCreateButton.click();
		newLessonOption.click();
		lessonTitleTextField.sendKeys(lessonName);
		lessonCreateButton.click();
		Thread.sleep(2000);
		publishButton.click();
		Thread.sleep(2000);
		afterCourseCreationCloseButton.click();
	}
}
