package org.webtableresuuablexpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
	       static WebDriver driver;
     public static WebElement price(String date) {
    	 WebElement price = driver.findElement(By.xpath("//div[@class='dateInnerCell']//child::p[text()='"+date+"']//following-sibling::p"));
		return price;
	}
     public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUTHARSAN\\eclipse-workspace\\WindowsHandeling\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		WebElement price = price("28");
		String text = price.getText();
		System.out.println(text);
	}

}
