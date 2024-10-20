package com.wylo.community.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wylo.community.genricUtility.WebDriverUtility;

public class SignoutPage {
    public SignoutPage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    @FindBy(xpath = "//button[contains(@class,'Header__User')]")
    private WebElement profileDropdown;
    
    @FindBy(xpath = "//li[text()='Sign out']")
    private WebElement signoutOpt;
    
    public void signoutAccount(WebDriverUtility wUtils)
    {
    	profileDropdown.click();
    	signoutOpt.click();
    }
}