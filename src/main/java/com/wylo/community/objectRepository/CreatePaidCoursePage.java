//package com.wylo.community.objectRepository;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import com.wylo.community.genricUtility.WebDriverUtility;
//
//public class CreatePaidCoursePage {
//	public CreatePaidCoursePage(WebDriver driver)
//	{
//		PageFactory.initElements(driver, this);
//	}
//	@FindBy(xpath = "//button[@class='OnboardTourModal__CloseBTN-sc-86f5c2f1-25 crUksV']")
//	private WebElement onBoardTourModalCloseButton;
//
//	@FindBy(xpath="//div[text()='Got it']")
//	private WebElement cookiesBanner;
//
//	@FindBy(xpath = "//button[@class='Courses__ActionBTN-sc-94e50c69-4 gFUcLL']")
//	private WebElement courseCreationPlusIcon;
//
//	@FindBy(xpath = "//input[@placeholder='Enter a course name']")
//	private WebElement courseNameTextField;
//
//	@FindBy(xpath = "//textarea[@placeholder='Give a short description']")
//	private WebElement shortDescriptionTextField;
//
//	@FindBy(id = "yoopta-contenteditable")
//	private WebElement aboutTextField;

//	//@FindBy(xpath = "//div[6]//div[1]//div[1]")

//	@FindBy(xpath = "//button[text()='Continue']")
//	private WebElement continueBtn;
//
//	@FindBy(xpath = "//input[@placeholder='Enter chapter name']")
//	private WebElement chapterNameTextField;
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
//	@FindBy(xpath = "//button[text()='Publish']")
//	private WebElement publishButton;
//
//	@FindBy(xpath = "//div[text()='Close']")
//	private WebElement afterCourseCreationCloseButton;
//
//	public void paidCourse(WebDriverUtility wUtils,String courseName,String shortDescription,String aboutCourse, String coursePrice, String chapterName,String lessonName ) throws InterruptedException
//	{
//		onBoardTourModalCloseButton.click();
//		cookiesBanner.click();
//		courseCreationPlusIcon.click();
//		courseNameTextField.sendKeys(courseName);
//		shortDescriptionTextField.sendKeys(shortDescription);
//		Thread.sleep(3000);
//		wUtils.scrollTillElementToBeVisible(aboutTextField);
//		Thread.sleep(2000);
//		aboutTextField.sendKeys(aboutCourse);
//		paidOption.click();
//		coursePriceTextField.sendKeys(coursePrice);
//		wUtils.scrollTillElementToBeVisible(addTaxOption);
//		Thread.sleep(2000);
//		addTaxOption.click();
//		TestTax.click();
//		taxSave.click();
//		wUtils.scrollTillElementToBeVisible(continueBtn);
//		Thread.sleep(2000);
//		continueBtn.click();
//		chapterNameTextField.sendKeys(chapterName);
//		chapterCreateButton.click();
//		newLessonOption.click();
//		lessonTitleTextField.sendKeys(lessonName);
//		lessonCreateButton.click();
//		publishButton.click();
//		afterCourseCreationCloseButton.click();
//	}
//
//}
