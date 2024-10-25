package com.wylo.community.objectRepository;

import com.wylo.community.genricUtility.VisibleText;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wylo.community.genricUtility.WebDriverUtility;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.List;

public class SignInPage {
    private final WebDriver driver;

    public SignInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[text()='Sign in']")
    private WebElement signInButton;

    @FindBy(xpath = "//div[text()='Continue with email']")
    private WebElement continueWithEmail;

    @FindBy(xpath = "//input[@placeholder='Enter your email ID']")
    private WebElement continueEmailText;

    @FindBy(xpath = "//button[text()='Continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement verifyBtn;

    @FindBy(xpath = "//div[contains(@class,'SignUpScreenOne__CommunityN')]")
    private WebElement txtWylo;

    @FindBy(xpath = "//p[contains(@class,'VerifyOtp__ErrText')]")
    private WebElement errorOtpMessage;

    @FindBy(xpath = "//button[contains(@class,'VerifyOtp__ContinueBTN')]")
    private WebElement verifyButton;

    public void signInWeb(String emailID, String otpValue, WebDriverUtility wUtils) throws InterruptedException {

        signInButton.click();
        Assert.assertEquals(txtWylo.getText(), VisibleText.SignInPage.WYLO, "Wylo Text Is Not Available ");
        continueWithEmail.click();
        continueEmailText.sendKeys(emailID);
        Reporter.log(emailID, true);
        continueButton.click();
        wUtils.waitUntilEleToBeVisible(10, verifyButton);
        Assert.assertEquals(verifyButton.getText(), VisibleText.OtpPage.OTP_VERIFY_BUTTON, "Verify Button is not displayed");
        verifyBtn.click();
        Assert.assertEquals(errorOtpMessage.getText(), VisibleText.OtpPage.OTP_ERROR_MESSAGE, "Error Message is Not Displayed");
        fillingOtp(otpValue);
        Thread.sleep(2000);
        verifyBtn.click();
    }

    /**
     * @param otp String Value
     * @author Balaji
     */
    public void fillingOtp(String otp) {
        for (int i = 0; i < otp.length() - 1; i++) {
            String xpath = "//input[@name='otp' and @tabindex='" + (i + 1) + "']";
            WebElement otpInput = driver.findElement(By.xpath(xpath));
            otpInput.sendKeys(Character.toString(otp.charAt(i)));
        }
    }
}