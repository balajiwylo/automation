//package com.wylo.community.objectRepository;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import com.wylo.community.genricUtility.WebDriverUtility;
//
//public class DeleteAndCreateTheNewFAQAndChapterAndLessonPage {
//	public DeleteAndCreateTheNewFAQAndChapterAndLessonPage(WebDriver driver)
//	{
//		PageFactory.initElements(driver, this);
//	}
//	@FindBy(xpath = "//button[@class='OnboardTourModal__CloseBTN-sc-86f5c2f1-25 crUksV']")
//	private WebElement onBoardTourModalCloseButton;
//
//	@FindBy(xpath="//div[text()='Got it']")
//	private WebElement cookiesBanner;
//
//	@FindBy(xpath="//div[@class='CourseCardView__ListContainer-sc-f3a2d328-8 cqODfH virtuoso-grid-list']//div[1]//div[1]//div[1]//div[2]//div[2]")
//	private WebElement viewDetailsOption;
//
//	@FindBy(xpath = "//p[text()='Edit']")
//	private WebElement editOption;
//
//	@FindBy(xpath = "//div[text()='Add FAQs']")
//	private WebElement addFaqOption1;
//
//
//	@FindBy(xpath = "//div[text()='Add FAQ']")
//	private WebElement addFaq;
//
//	@FindBy(xpath = "//input[@placeholder='Question']")
//	private WebElement questionTextField;
//
//	@FindBy(xpath = "//textarea[@placeholder='Answer']")
//	private WebElement answerTextField;
//
//	@FindBy(xpath="//button[text()='Add']")
//	private WebElement addButton;
//
//	@FindBy(xpath = "//div[@class='FaqViewModal__CloseBTN-sc-9fec558-3 cJLJiZ']")
//	private WebElement backButton;
//
//	@FindBy(xpath = "//button[text()='Update and continue']")
//	private WebElement updateAndContinueBtn;
//
//
//
//
//	@FindBy(xpath = "//div[@class='SingleModule__CourseOptionBTNContainer-sc-b7c3aea5-18 cQxbZk']")
//	private WebElement threeDotIcon;
//
//
//
//	@FindBy(xpath="//button[text()='Create']")
//	private WebElement chapterCreateButton;
//
//	@FindBy(xpath = "//P[text()='New lesson']")
//	private WebElement newLessonOption;
//
//	@FindBy(xpath = "//input[@placeholder='Enter lesson title']")
//	private WebElement lessonTitleTextField;
//
//	@FindBy(xpath = "//button[text()='Create']")
//	private WebElement lessonCreateButton;
//
//
//	public void deleteAndCreate(WebDriverUtility wUtils,String qCourse,String aCourse,String chpaterName,String lessonName) throws InterruptedException
//	{
//		Thread.sleep(2000);
//		onBoardTourModalCloseButton.click();
//		cookiesBanner.click();
//		Thread.sleep(2000);
//		viewDetailsOption.click();
//		wUtils.directScroll(editOption);
//		editOption.click();
//		Thread.sleep(3000);
//		wUtils.scrollTillElementToBeVisible(addFaqOption1);
//		Thread.sleep(2000);
//		addFaqOption1.click();
//		deleteIcon.click();
//		addFaq.click();
//		questionTextField.sendKeys(qCourse);
//		answerTextField.sendKeys(aCourse);
//		addButton.click();
//		backButton.click();
//		updateAndContinueBtn.click();
//		lessonDeleteIcon.click();
//		deleteButton.click();
//		threeDotIcon.click();
//		chapterDeleteOption.click();
//		chapterDeleteButton.click();
//		chapterTextField.sendKeys(chpaterName);
//		chapterCreateButton.click();
//		newLessonOption.click();
//		lessonTitleTextField.sendKeys(lessonName);
//		lessonCreateButton.click();
//		Thread.sleep(2000);
//		updateBtn.click();
//	}
//}
