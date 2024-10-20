package com.wylonetwork.wylo.admin;


import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OtpValueEnter {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Balaji/Desktop/WebTech/CSS/otp.html");
		LinkedHashMap<String,String> map = new LinkedHashMap<>();
		String otp = "6789";
		int j=1;
		for(int i =0;i<otp.length();i++) {
			map.put("(//input[@class='otp-input'])["+j+"]",""+otp.charAt(i));
			j++;
		}
		for(Map.Entry<String, String> m : map.entrySet()) {
			driver.findElement(By.xpath(m.getKey())).sendKeys(m.getValue());
			Thread.sleep(3000);
		}
	}
}