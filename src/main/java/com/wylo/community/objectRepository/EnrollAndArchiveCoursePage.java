package com.wylo.community.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wylo.community.genricUtility.WebDriverUtility;

public class EnrollAndArchiveCoursePage {
    public EnrollAndArchiveCoursePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//p[text()='Courses']")
    private WebElement courseIcon;

    @FindBy(xpath = "//button[@class='OnboardTourModal__CloseBTN-sc-86f5c2f1-25 crUksV']")
    private WebElement onBoardTourModalCloseButton;

    @FindBy(xpath = "//div[text()='Got it']")
    private WebElement cookiesBanner;

    @FindBy(xpath = "//div[@class='CourseCardView__ListContainer-sc-45066e46-8 idWANm virtuoso-grid-list']//div[1]//div[1]//div[1]//div[2]//div[2]")
    private WebElement viewDetailsOption;

    @FindBy(xpath = "//div[text()='Enroll']")
    private WebElement enrollOption;

    @FindBy(xpath = "//div[text()='Start']")
    private WebElement startOption;

    @FindBy(xpath = "//button[@class='CourseLessons__PostBTN-sc-348a3d59-38 cSSlBE']")
    private WebElement makeAsCompleteButton;

    @FindBy(xpath = "//p[text()='Back']")
    private WebElement backButton;

    @FindBy(xpath = "//button[contains(@class,'KebabBTN')]")
    private WebElement kebabIcon;

    @FindBy(xpath = "//li[text()='Archive']")
    private WebElement archiveOption;

    @FindBy(xpath = "//button[text()='Archive']")
    private WebElement archiveButton;

    public void userEnroll(WebDriverUtility wUtils) throws InterruptedException {
        courseIcon.click();
        Thread.sleep(2000);
        cookiesBanner.click();
        viewDetailsOption.click();
        wUtils.directScroll(enrollOption);
        enrollOption.click();
        startOption.click();
        makeAsCompleteButton.click();
        backButton.click();
    }

    public void archiveCourse(WebDriverUtility wUtils) {
        onBoardTourModalCloseButton.click();
        cookiesBanner.click();
        viewDetailsOption.click();
        kebabIcon.click();
        archiveOption.click();
        archiveButton.click();
    }
}
