package org.windowshandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowsHandlingor {
        public static WebDriver driver;
@SuppressWarnings("deprecation")
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUTHARSAN\\eclipse-workspace\\WindowsHandeling\\Driver\\chromedriver.exe");
	   driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.xpath(" //img[@alt='OrangeHRM on twitter']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		String parId = driver.getWindowHandle();
		Set<String> allIds = driver.getWindowHandles();
		List<String> li = new ArrayList<String>();
	    li.addAll(allIds);
	   // driver.switchTo().window(li.get(1));
	    switchTonthWindowHandle("YouTube", li);
	    driver.findElement(By.xpath("//input[@id='search']")).sendKeys("online");
	   // driver.switchTo().window(li.get(2));
	    switchTonthWindowHandle("Tweets",li);
	    driver.findElement(By.xpath("//span[text()='Tweets & replies']")).click();
	    driver.switchTo().window(li.get(3));
	    driver.findElement(By.name("email")).sendKeys("anithra");
	    driver.findElement(By.name("pass")).sendKeys("akshaya");
	    driver.switchTo().window(li.get(4));
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("anithra");
	    driver.findElement(By.id("password")).sendKeys("akshaya");
	    driver.switchTo().window(parId);
	}
private static boolean switchTonthWindowHandle(String title, List<String> li) {
	for (String st : li) {
		String title2 = driver.switchTo().window(st).getTitle();
		if (title2.contains(title)) {
			System.out.println("we enter on correct tab :"+driver.getCurrentUrl());
			
			return true;
		}
		
		
	}
	return false;
	
	         

}
}
