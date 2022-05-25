package org.webtableresuuablexpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableReuseableXPath {
	static WebDriver driver;
	public static WebElement reusableXpath(String team) {
		WebElement findElement = driver.findElement(By.xpath("//a[text()='"+team+"']//parent::td//following-sibling::td[6] "));
		return findElement;
	}
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUTHARSAN\\eclipse-workspace\\WindowsHandeling\\Driver\\chromedriver.exe");
    driver = new ChromeDriver();
	driver.get("https://www.cricbuzz.com/cricket-series/4061/indian-premier-league-2022/points-table");
	driver.manage().window().maximize();
	WebElement reusableXpath = reusableXpath("Chennai Super Kings");
	String text = reusableXpath.getText();
	System.out.println(text);
	
		
}

}
