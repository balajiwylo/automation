package com.wylonetwork.wylo.forum;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wylo.community.genricUtility.FileUtility;
import com.wylo.community.genricUtility.WebDriverUtility;
import com.wylo.community.objectRepository.ForumTestingPage;


public class ClickTheChannelTest {
   WebDriver driver;
   @Test
   public void ClickTheChannel() throws IOException
   {
	   FileUtility fUtil = new FileUtility();
	   String browser = fUtil.readDataFromPropertyFile("browser");
	   String url = fUtil.readDataFromPropertyFile("url");
	   if(browser.equals("chrome")) {
		   driver=new ChromeDriver();
	   }
	   else {
		driver=new FirefoxDriver();
   }
	WebDriverUtility wUtil =new WebDriverUtility(driver);
	ForumTestingPage forum = new ForumTestingPage(driver);
	wUtil.maximizeWindow();
	wUtil.waitForEleImplicitly(10);
	driver.get(url);
	forum.getGettingstartChannel().click();
}
}
