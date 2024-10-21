package com.wylo.community.objectRepository;


import java.awt.AWTException;
import java.util.List;

import com.wylo.community.genricUtility.VisibleText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wylo.community.genricUtility.WebDriverUtility;
import org.testng.Assert;


public class CoursePage {
    public CoursePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[text()='Courses']")
    private WebElement courseIcon;

    @FindBy(xpath = "//button[@class='OnboardTourModal__CloseBTN-sc-86f5c2f1-25 crUksV']")
    private WebElement onBoardTourModalCloseButton;

    @FindBy(xpath = "//div[text()='Got it']")
    private WebElement cookiesBanner;

    @FindBy(xpath = "//button[@class='Courses__ActionBTN-sc-94e50c69-4 gFUcLL']")
    private WebElement courseCreationPlusIcon;

    @FindBy(xpath = "//button[@class='InfoPage__AddCoverBTN-sc-36ae7136-4 gCBLfQ']")
    private WebElement addCoverImageBtn;

    @FindBy(xpath = "//div[@class='InfoPage__UploadContainer-sc-36ae7136-10 hSwvht']//button[@class='InfoPage__UploadBTN-sc-36ae7136-5 edgkKx'][normalize-space()='Upload']")
    private WebElement imageUploadBtn;

    @FindBy(xpath = "//input[@placeholder='Enter a course name']")
    private WebElement courseName;

    @FindBy(xpath = "//textarea[@placeholder='Give a short description']")
    private WebElement shortDescription;

    @FindBy(xpath = "//div[text()='Add FAQs']")
    private WebElement addFaqOption1;

    @FindBy(xpath = "//div[text()='Add FAQ']")
    private WebElement addFaqOption2;

    @FindBy(xpath = "//input[@placeholder='Question']")
    private WebElement questionTestField;

    @FindBy(xpath = "//textarea[@placeholder='Answer']")
    private WebElement answerTextField;

    @FindBy(xpath = "//button[text()='Add']")
    private WebElement addButton;

    @FindBy(xpath = "//div[@class='FaqViewModal__CloseBTN-sc-9fec558-3 cJLJiZ']")
    private WebElement backButton;

    @FindBy(id = "yoopta-contenteditable")
    private WebElement aboutTextField;

    @FindBy(xpath = "//button[text()='Continue']")
    private WebElement continueBtn;

    @FindBy(xpath = "//input[@placeholder='Enter chapter name']")
    private WebElement chapterNameTextField;

    @FindBy(xpath = "//button[text()='Create']")
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

    @FindBy(xpath = "//div[@class='CourseCardView__ListContainer-sc-f3a2d328-8 cqODfH virtuoso-grid-list']//div[1]//div[1]//div[1]//div[2]//div[2]")
    private WebElement viewDetailsOption;

    @FindBy(xpath = "//p[text()='Edit']")
    private WebElement editOption;

    @FindBy(xpath = "//button[text()='Change cover image']")
    private WebElement changeCoverImageBtn;

    @FindBy(xpath = "//input[@placeholder='Enter a course name']")
    private WebElement courseTitleName;

    @FindBy(xpath = "//div[@class='FaqViewModal__EditBtn-sc-9fec558-17 cYafYN']")
    private WebElement editIcon;

    @FindBy(xpath = "//button[text()='Update and continue']")
    private WebElement updateAndContinueBtn;

    @FindBy(xpath = "//div[@class='SingleModule__CourseOptionBTNContainer-sc-b7c3aea5-18 cQxbZk']")
    private WebElement threeDotIcon;

    @FindBy(xpath = "//li[normalize-space()='Edit']")
    private WebElement editChpaterOption;

    @FindBy(xpath = "//button[text()='Create']")
    private WebElement createButton;

    @FindBy(xpath = "//div[@class='SingleModule__SectionContainer-sc-b7c3aea5-1 fESjOa']")
    private WebElement sectionContainer;

    @FindBy(xpath = "//div[text()='Edit']")
    private WebElement editLessonOption;

    @FindBy(xpath = "//button[text()='Add video (optional)']")
    private WebElement addLessonVideo;

    @FindBy(xpath = "//button[text()='Upload']")
    private WebElement lessonUploadButton;

    @FindBy(xpath = "//input[@placeholder='Course name']")
    private WebElement courseNameTextField;

    @FindBy(xpath = "//p[@class='yoopta-paragraph paragraph hwZ8eR7o']")
    private WebElement lessonCommandsTextField;

    @FindBy(xpath = "//div[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//div[text()='Update']")
    private WebElement updateButton;

    @FindBy(xpath = "//div[text()='Preview']")
    private WebElement previewButton;

    @FindBy(xpath = "//p[@class='LessonsPreviewPage__CloseBTNText-sc-5970ccc-23 dwvCHL']")
    private WebElement previewBackButton;

    @FindBy(xpath = "//button[@class='KebabBTN__GroupOptionsBTN-sc-e95cf605-0 hmVKJv']")
    private WebElement threeDotOption;

    @FindBy(xpath = "//li[@class='CustomContextMenuV1__OptionItem-sc-a392b1bb-1 MIIIq']")
    private WebElement deleteOption;

    @FindBy(xpath = "//button[@btntype='delete']")
    private WebElement deleteButton;

    @FindBy(xpath = "//div[@class='CourseVisibility__VisibilityOptionsContainer-sc-bc47a3f-2 jRhGQs']//div[2]")
    private WebElement visibility;

    @FindBy(xpath = "//span[text()='Select user tags']")
    private WebElement selectUserTagOption;

    @FindBy(xpath = "//div[@class='CustomCheckbox__MainContainer-sc-65f7c7c2-0 eApdyE']")
    private WebElement userTag;

    @FindBy(xpath = "//div[@class='CreateCoursePricing__CourseTypePill-sc-638915af-3 ecNqXr']")
    private WebElement paidOption;

    @FindBy(xpath = "//input[@placeholder='0.00']")
    private WebElement coursePriceTextField;

    @FindBy(xpath = "//div[contains(text(),'Add taxes')]")
    private WebElement addTaxOption;

    @FindBy(xpath = "//div[@class='ConfigureTaxModal__TaxHeaderContainer-sc-d5c91790-12 dNJPMV']//div[@class='CustomCheckbox__MainContainer-sc-65f7c7c2-0 csFKls']")
    private WebElement TestTax;

    @FindBy(xpath = "//button[text()='Save']")
    private WebElement taxSave;

    @FindBy(xpath = "//div[@class='FaqViewModal__DeleteBtn-sc-9fec558-19 kNqCgI']")
    private WebElement faqDeleteIcon;

    @FindBy(xpath = "//div[@class='SingleModule__ModuleRight-sc-b7c3aea5-15 lgmAPA']//*[name()='svg']")
    private WebElement lessonDeleteIcon;

    @FindBy(xpath = "//button[text()='Delete']")
    private WebElement confirmDeleteLessonButton;

    @FindBy(xpath = "//li[text()='Delete']")
    private WebElement chapterDeleteOption;

    @FindBy(xpath = "//button[text()='Delete']")
    private WebElement chapterDeleteButton;

    @FindBy(xpath = "//input[@placeholder='Enter chapter name']")
    private WebElement chapterTextField;

    @FindBy(xpath = "//div[contains(text(),'Update')]")
    private WebElement updateBtn;

    @FindBy(xpath = "//li[text()='Archive']")
    private WebElement archiveOption;

    @FindBy(xpath = "//button[text()='Archive']")
    private WebElement archiveButton;

    @FindBy(xpath = "//p[contains(@class,'Sidebar__SidebarTabLabel')]")
    private List<WebElement> sideBarList;

    @FindBy(xpath = "//P[contains(@class,'CourseDetails__Title')]")
    private WebElement courseTitle;


    public void createCourse(WebDriverUtility wUtils, String cName, String sDescription, String FAQ_Question, String FAQ_Answer, String aboutSection, String chapterName, String lessonName, String filePath) throws InterruptedException, AWTException {
        navigateToCourseSection(wUtils);
        openCourseCreation();
        uploadCoverImage(wUtils, filePath);
        fillCourseDetails(cName, sDescription);
        addFaq(wUtils, FAQ_Question, FAQ_Answer);
        aboutTextField.sendKeys(aboutSection);
        continueBtn.click();
        wUtils.waitUntilEleToBeVisible(20,chapterNameTextField);
        addChapter(chapterName);
        addLesson(wUtils, lessonName);
        publishCourse(wUtils);
        afterCourseCreationCloseButton.click();
    }


    public void editCourse(WebDriverUtility wUtils, String filePath, String ecourse, String eDescription, String eFaqQuestion, String eFaqAnswer, String eAboutTheCourse, String editChapterName, String lessonFilePath, String lessonName, String lessonCommand, String command) throws AWTException, InterruptedException {
        // navigateToCourseSection(wUtils);
        wUtils.waitUntilEleToBeClickable(20, viewDetailsOption);
        viewCourseDetails();
        wUtils.directScroll(editOption);
        editOption.click();
        uploadCoverImage(wUtils, filePath);
        updateCourseDetails(ecourse, eDescription);
        updateFaq(wUtils, eFaqQuestion, eFaqAnswer);
        updateAboutSection(eAboutTheCourse);
        editChapter(wUtils, editChapterName);
        updateLesson(wUtils, lessonFilePath, lessonName, lessonCommand);
        updateButton.click();
    }

    public void deleteCourse(WebDriverUtility wUtils) throws InterruptedException {
        //  navigateToCourseSection(wUtils);
        viewCourseDetails();
        wUtils.directScroll(threeDotOption);
        threeDotOption.click();
        deleteOption.click();
        deleteButton.click();
    }

    private void navigateToCourseSection(WebDriverUtility wUtils) throws InterruptedException {
        closeOnboardingAndCookies(wUtils);
        courseIcon.click();
    }

    private void closeOnboardingAndCookies(WebDriverUtility wUtils) throws InterruptedException {
        wUtils.waitUntilEleToBeClickable(20, onBoardTourModalCloseButton);
        onBoardTourModalCloseButton.click();
        cookiesBanner.click();
        String[] allSideBarText = wUtils.getTextFromList(sideBarList);
        Assert.assertEquals(allSideBarText, VisibleText.HomePage.FEATURES_NAME, "The sidebar text does not match the expected features.");
    }

    private void openCourseCreation() {
        courseCreationPlusIcon.click();
    }

    private void uploadCoverImage(WebDriverUtility wUtils, String filePath) throws AWTException, InterruptedException {
        addCoverImageBtn.click();
        imageUploadBtn.click();
        wUtils.uploadFile(filePath);
    }

    private void fillCourseDetails(String cName, String sDescription) {
        courseName.sendKeys(cName);
        shortDescription.sendKeys(sDescription);
    }

    private void addFaq(WebDriverUtility wUtils, String question, String answer) {
        wUtils.waitUntilEleToBeVisible(10, addFaqOption1);
        wUtils.scrollTillElementToBeVisible(addFaqOption1);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        wUtils.waitUntilEleToBeVisible(10, addFaqOption1);
        addFaqOption1.click();
        addFaqOption2.click();
        questionTestField.sendKeys(question);
        answerTextField.sendKeys(answer);
        addButton.click();
        backButton.click();
    }

    private void addChapter(String chapterName) {

        chapterNameTextField.sendKeys(chapterName);
        chapterCreateButton.click();
    }

    private void addLesson(WebDriverUtility wUtils, String lessonName) throws InterruptedException {
       // wUtils.waitUntilEleToBeClickable(10, newLessonOption);
        newLessonOption.click();
        lessonTitleTextField.sendKeys(lessonName);
        lessonCreateButton.click();
    }

    private void publishCourse(WebDriverUtility wUtils) {
        wUtils.waitUntilEleToBeClickable(20, publishButton);
        publishButton.click();
        wUtils.waitUntilEleToBeVisible(20, courseTitle);
        Assert.assertEquals(courseTitle.getText(), VisibleText.CreateCoursePage.COURSE_TITLE_NAME, "Course Title Name Is Wrong");
    }

    private void viewCourseDetails() {
        viewDetailsOption.click();
    }

    private void updateCourseDetails(String ecourse, String eDescription) {
        courseTitleName.clear();
        courseTitleName.sendKeys(ecourse);
        shortDescription.clear();
        shortDescription.sendKeys(eDescription);
    }

    private void updateFaq(WebDriverUtility wUtils, String question, String answer) {
        wUtils.scrollTillElementToBeVisible(addFaqOption1);
        addFaqOption1.click();
        editIcon.click();
        questionTestField.clear();
        questionTestField.sendKeys(question);
        answerTextField.clear();
        answerTextField.sendKeys(answer);
        addButton.click();
        backButton.click();
    }

    private void updateAboutSection(String aboutText) {
        aboutTextField.clear();
        aboutTextField.sendKeys(aboutText);
        updateAndContinueBtn.click();
    }

    private void editChapter(WebDriverUtility wUtils, String chapterName) {
        threeDotIcon.click();
        editChpaterOption.click();
        chapterNameTextField.clear();
        chapterNameTextField.sendKeys(chapterName);
        createButton.click();
    }

    /**
     * @param wUtils         updated
     * @param lessonFilePath
     * @param lessonName
     * @param commands
     * @throws AWTException
     * @throws InterruptedException
     * @author Balaji
     */
    private void updateLesson(WebDriverUtility wUtils, String lessonFilePath, String lessonName, String commands) throws AWTException, InterruptedException {
        sectionContainer.click();
        editLessonOption.click();
        addLessonVideo.click();
        lessonUploadButton.click();
        wUtils.uploadFile(lessonFilePath);
        courseNameTextField.clear();
        courseNameTextField.sendKeys(lessonName);
        lessonCommandsTextField.sendKeys(commands);
        saveButton.click();
    }


}
