//package com.wylo.community.objectRepository;
//
//import java.awt.AWTException;
//import java.awt.Desktop.Action;
//
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import com.wylo.community.genricUtility.WebDriverUtility;
//
//public class CourseEditPage
//{
//	public CourseEditPage(WebDriver driver)
//	{
//		PageFactory.initElements(driver, this);
//	}
//	@FindBy(xpath = "//button[@class='OnboardTourModal__CloseBTN-sc-86f5c2f1-25 crUksV']")
//	private WebElement onBoardTourModalCloseButton;
//
//	@FindBy(xpath="//div[text()='Got it']")
//	private WebElement cookiesBanner;
//
//	//
////
////	public WebElement getChangeCoverImageBtn() {
////		return changeCoverImageBtn;
////	}
////
////	public WebElement getCourseTitleName() {
////		return courseTitleName;
////	}
////
////	public WebElement getShortDescription() {
////		return shortDescription;
////	}
////
////	public WebElement getAddFaqOption1() {
////		return addFaqOption1;
////	}
////
////	public WebElement getEditIcon() {
////		return editIcon;
////	}
////
////	public WebElement getQuestionTestField() {
////		return questionTestField;
////	}
////
////	public WebElement getAnswerTextfield() {
////		return answerTextfield;
////	}
////
////	public WebElement getAddButton() {
////		return addButton;
////	}
////
////	public WebElement getBackButton() {
////		return backButton;
////	}
////
////	public WebElement getAboutTextField() {
////		return aboutTextField;
////	}
////
////	public WebElement getUpdateAndContinueBtn() {
////		return updateAndContinueBtn;
////	}
////
////
////	public WebElement getThreeDotIcon() {
////		return threeDotIcon;
////	}
////
////	public WebElement getEditChpaterOption() {
////		return editChpaterOption;
////	}
////
////	public WebElement getChapterNameTextField() {
////		return chapterNameTextField;
////	}
////
////	public WebElement getCreateButton() {
////		return createButton;
////	}
////
////	public WebElement getSectionContainer() {
////		return sectionContainer;
////	}
////
////	public WebElement getEditLessonOption() {
////		return editLessonOption;
////	}
////
////	public WebElement getAddLessonVideo() {
////		return addLessonVideo;
////	}
////
////	public WebElement getLessonUploadElement() {
////		return lessonUploadButton;
////	}
////
////	public WebElement getCourseNameTextField() {
////		return courseNameTextField;
////	}
////
////	public WebElement getLessonCommandsTextField() {
////		return lessonCommandsTextField;
////	}
//
//	public void editCourse(WebDriverUtility wUtils,String filePath,String ecourse, String eDescription, String eFaqQuestion, String eFaqAnswer,String eAboutTheCourse, String lessonFilePath,String editChapterName, String lessonName,String lessonCommand) throws AWTException, InterruptedException
//	{
//		onBoardTourModalCloseButton.click();
//		cookiesBanner.click();
//		viewDetailsOption.click();
//		wUtils.directScroll(editOption);
//		editOption.click();
//		changeCoverImageBtn.click();
//		wUtils.uploadFile(filePath);
//		courseTitleName.clear();
//		courseTitleName.sendKeys(ecourse);
//		shortDescription.clear();
//		shortDescription.sendKeys(eDescription);
//		Thread.sleep(3000);
//		wUtils.scrollTillElementToBeVisible(addFaqOption1);
//		Thread.sleep(2000);
//		addFaqOption1.click();
//		editIcon.click();
//		questionTestField.clear();
//		questionTestField.sendKeys(eFaqQuestion);
//		answerTextfield.clear();
//		answerTextfield.sendKeys(eFaqAnswer);
//		addButton.click();
//		backButton.click();
//		aboutTextField.sendKeys(Keys.TAB);
//		aboutTextField.clear();
//		aboutTextField.sendKeys(eAboutTheCourse);
//		updateAndContinueBtn.click();
//		Thread.sleep(2000);
//		threeDotIcon.click();
//		editChpaterOption.click();
//		chapterNameTextField.clear();
//		Thread.sleep(2000);
//		chapterNameTextField.sendKeys(editChapterName);
//		createButton.click();
//		sectionContainer.click();
//		editLessonOption.click();
//		addLessonVideo.click();
//		lessonUploadButton.click();
//		wUtils.uploadFile(lessonFilePath);
//		wUtils.waitUntilEleToBeClickable(2, courseNameTextField);
//		courseNameTextField.clear();
//		courseNameTextField.sendKeys(lessonName);
//		lessonCommandsTextField.sendKeys(lessonCommand);
//		saveButton.click();
//		updateButton.click();
//	}
//}
