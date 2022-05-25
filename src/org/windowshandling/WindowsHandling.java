package org.windowshandling;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUTHARSAN\\eclipse-workspace\\WindowsHandeling\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement buttonclick = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		buttonclick.click();
		WebElement productname = driver.findElement(By.xpath("//input[@type='text']"));
		productname.sendKeys("iphone12");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
		search.click();
		WebElement firstproduct = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
		firstproduct.click();
		WebElement secondproduct = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]"));
		secondproduct.click();
		
		
//		String parId = driver.getWindowHandle();
//		Set<String> allId = driver.getWindowHandles();
//		for(String s:allId) {
//			if(!parId.equals(s)) {
//			driver.switchTo().window(s);
//			WebElement productname2 = driver.findElement(By.xpath("//span[@class='B_NuCI']"));
//			String text2 = productname2.getText();
//			System.out.println(text2);
			//}
		String parId = driver.getWindowHandle();
		Set<String> allIds = driver.getWindowHandles();
		List<String> li = new ArrayList<String>();
		li.addAll(allIds);
		driver.switchTo().window((String) li.get(1));
		WebElement pro1 = driver.findElement(By.linkText("APPLE iPhone 12 (Green, 128 GB)"));
		String p1 = pro1.getText();
		System.out.println(p1);
		driver.switchTo().window(parId);
		WebElement mobpid = driver.findElement(By.linkText("Mobiles & Accessories"));
		String text3 = mobpid.getText();
		System.out.println(text3);
		driver.switchTo().window((String) li.get(2));
		WebElement child2 = driver.findElement(By.linkText("APPLE iPhone 12 (Purple, 128 GB)"));
		String text4 = child2.getText();
		System.out.println(text4);
		
		
		
		
		
		
		}
	}

	
