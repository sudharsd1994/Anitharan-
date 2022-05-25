package org.webtable;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\SUTHARSAN\\\\eclipse-workspace\\\\WindowsHandeling\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> heading1 = driver.findElements(By.tagName("th"));
		for (WebElement h1 : heading1) {
			String text = h1.getText();
			System.out.println(text );
			List<WebElement> row = driver.findElements(By.tagName("tr"));
			for (int i = 0; i <row.size(); i++) {
				String text2 = row.get(i).getText();
				System.out.println(text2);
				TakesScreenshot t = (TakesScreenshot)driver;
				File screenshotAs = t.getScreenshotAs(OutputType.FILE);
				File f = new File("E:\\screen shot\\screenshot.png");
				FileUtils.copyFile(screenshotAs, f);
				
				
				
//				List<WebElement> data = driver.findElements(By.tagName("td"));
//				for (WebElement d : data) {
//					String text3 = d.getText();
//					System.out.println(text3);
//					driver.close();
//					
			//	}
				
				
			}
			
		}
	}

}
