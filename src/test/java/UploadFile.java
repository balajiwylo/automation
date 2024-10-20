import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadFile {

	WebDriver driver;
	@BeforeMethod
	public void preCondition() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	//@AfterMethod
	public void postCondition() {
		driver.manage().window().minimize();
		driver.quit();

	}
	@Test
	public void upload() throws InterruptedException, AWTException{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://7-test.wylo.site/courses?token=JWT%20eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NjVmNjNkOTIxNGQ4MmI5ODY0Mjc4MjQiLCJpc1ZlcmlmaWVkIjp0cnVlLCJpc0ZpcnN0VGltZVVzZXIiOmZhbHNlLCJ1c2VybmFtZSI6ImFkbWluIiwiZW1haWwiOiJiYWRyaUB3eWxvLmluIiwiZGV2aWNlSWRlbnRpZmllciI6IjY2NWY2M2Q5MjE0ZDgyYjk4NjQyNzgyNC0zNzI3NDYxMzc5LTE3MjgzNjY1MDk3OTQiLCJpYXQiOjE3MjgzNjY1MDksImV4cCI6MTcyODk3MTMwOX0.2g-wU-2u-b9Jkb08797PFHp3Tw3c_AhSU-CI1R4EV_M");
		WebElement closeBtn = driver.findElement(By.xpath("//button[@class='OnboardTourModal__CloseBTN-sc-86f5c2f1-25 crUksV']"));
	    closeBtn.click();
		driver.findElement(By.xpath("//div[text()='Got it']")).click();
		driver.findElement(By.xpath("//button[@class='Courses__ActionBTN-sc-94e50c69-4 gFUcLL']")).click();
		driver.findElement(By.xpath("//button[@class='InfoPage__AddCoverBTN-sc-36ae7136-4 gCBLfQ']")).click();
		driver.findElement(By.xpath("//div[@class='InfoPage__UploadContainer-sc-36ae7136-10 hSwvht']//button[@class='InfoPage__UploadBTN-sc-36ae7136-5 edgkKx'][normalize-space()='Upload']")).click();
		String fileName="C:\\Users\\DELL\\Downloads\\manual-testing4";
		StringSelection content = new StringSelection(fileName);
		Toolkit toolKit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = toolKit.getSystemClipboard();
		clipboard.setContents(content, null);
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);    

		
	}
}
