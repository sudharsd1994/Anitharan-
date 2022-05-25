package org.frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty(   "webdriver.chrome.driver"   , "C:\\Users\\SUTHARSAN\\eclipse-workspace\\WindowsHandeling\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1255322456");
		
		
		
	}

}
