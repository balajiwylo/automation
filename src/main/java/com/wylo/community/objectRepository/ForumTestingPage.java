package com.wylo.community.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wylo.community.genricUtility.*;
public class ForumTestingPage {
	public ForumTestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='ContextScreen__CenterContainer-sc-a407bd4c-2 fJYrxo']")
	private WebElement Scrolling;

	@FindBy(xpath =  "//div[@class='ContextSelectorMain__ContextContainer-sc-c79a7c65-4 eterRV']")
	private WebElement GettingstartChannel; 

	@FindBy(xpath = "(//div[@class='ContextSelectorMain__ContextContainer-sc-c79a7c65-4 ctKjxm'])[1]")
	private WebElement introChannel;

	public WebElement getGettingstartChannel() {
		return GettingstartChannel;
	}
	public WebElement getIntroChannel() {
		return introChannel;
	}

	public WebElement getScrolling() {
		return Scrolling;
	}
	public void clickOnChannel() throws InterruptedException {
		GettingstartChannel.click();
		Thread.sleep(2000);
		introChannel.click();
	}
}
