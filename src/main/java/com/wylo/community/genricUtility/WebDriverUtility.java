package com.wylo.community.genricUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
    WebDriver driver;
    Actions act;

    public WebDriverUtility(WebDriver driver) {
        this.driver = driver;
        act = new Actions(this.driver);
    }

    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public void minimizeWindow() {
        driver.manage().window().minimize();
    }

    public void waitForEleImplicitly(int sec) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
    }

    public void waitUntilEleToBeVisible(int sec, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilEleToBeClickable(int sec, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilToGetTitle(int sec, String title) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
        wait.until(ExpectedConditions.titleContains(title));
    }

    public void mouseHover(WebElement element) {
        act.click(element).perform();
    }

    public void dragAndDrop(WebElement src, WebElement dsr) {
        act.dragAndDrop(src, dsr).perform();
    }

    public void dragAndDrop(WebElement src, int x, int y) {
        act.dragAndDropBy(src, x, y);
    }

    public void doubleClick(WebElement element) {
        act.doubleClick(element).perform();
    }

    public void pressTabKey() {
        act.sendKeys(Keys.TAB).perform();
    }

    public void handleDropDown(WebElement element, String text) {
        Select sel = new Select(element);
        sel.selectByVisibleText(text);
    }

    public void sendValueUsingJs(WebElement element, String value) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value=arguments[1]", element, value);
    }

    public void scrollAction(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        int y = element.getLocation().getY();
        js.executeScript("window.scrollBy(0," + y + ")", element);
    }

    public void scrollBarAction(WebElement element, int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + y + ")", element);
    }

    public void clickOnEleUsingJs(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", element);
    }

    public void scrollTillElementToBeVisible(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Point loc = element.getLocation();
        int x = loc.getX();
        int y = loc.getY();
        js.executeScript("window.scrollBy(" + x + "," + y + ")");
    }

    public void directScroll(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
    }

    public void switchWindowUsingTitle(String partialTitle) {
        Set<String> allWidIds = driver.getWindowHandles();
        for (String wid : allWidIds) {
            String text = driver.switchTo().window(wid).getCurrentUrl();
            if (text.contains(partialTitle)) {
                break;
            }
        }
    }

    public void switchPartialWindowUsingUrl(String partialUrl) {
        Set<String> allWidIds = driver.getWindowHandles();
        for (String wid : allWidIds) {
            String text = driver.switchTo().window(wid).getCurrentUrl();
            if (text.contains(partialUrl)) {
                break;
            }
        }
    }

    public void switchToFrame(WebElement ele) {
        driver.switchTo().frame(ele);
    }

    public void uploadFile(String fileName) throws AWTException, InterruptedException {
        StringSelection content = new StringSelection(fileName);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        clipboard.setContents(content, null);
        Thread.sleep(2000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(3000);
    }

    public boolean isElementClickable(WebElement element) {
        return element.isDisplayed() && element.isEnabled();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public String getTextInAlert() {
        return driver.switchTo().alert().getText();
    }

    /**
     * @param list List<WebELement>
     * @return Array
     */
    public String[] getTextFromList(List<WebElement> list) {
        int index = 0;
        String[] a = new String[list.size()];
        for (WebElement element : list) {
            String text = element.getText();
            a[index] = text;
            index++;
        }
        return a;
    }
}

