package com.wylo.community.genricUtility;

import java.io.IOException;
import java.util.Map;

import com.wylo.community.objectRepository.SignInPage;
import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

import com.wylo.community.objectRepository.CompleteProfilePopupPage;
import com.wylo.community.objectRepository.SignoutPage;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver sdriver;
	public WebDriverUtility wUtils;
	public FileUtility fUtils=new FileUtility();
	public ExcelUtility eUtils=new ExcelUtility();

	@BeforeClass()
	public void launchBrowser() throws IOException {
		ChromeOptions options = new ChromeOptions();
		Map<String,Object> prefs = new HashedMap<>();
		prefs.put("profile.default_content_setting_values.notifications", 1);
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--incognito");
		String Browser = fUtils.readDataFromPropertyFile("browser");
		String Url = fUtils.readDataFromPropertyFile("urlUser");
		if(Browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver(options);
		}
		else if(Browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(Browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		sdriver=driver;
		wUtils=new WebDriverUtility(driver);
		wUtils.maximizeWindow();
		wUtils.waitForEleImplicitly(10);
		driver.get(Url);
	}
	//@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	@BeforeMethod
	public void signIn() throws EncryptedDocumentException, IOException, InterruptedException
	{
		SignInPage signinPage = new SignInPage(driver);
		String emailId = eUtils.readDataFromExcel("Admin", 0, 0);
		String otp = eUtils.readDataFromExcel("Admin", 1, 0);
		signinPage.signInWeb(emailId, otp, wUtils);
	}
	//@AfterMethod
	public void signOut()
	{
		SignoutPage signout = new	SignoutPage(driver);
		signout.signoutAccount(wUtils);
	}

}
