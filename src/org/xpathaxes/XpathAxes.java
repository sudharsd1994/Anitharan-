package org.xpathaxes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUTHARSAN\\eclipse-workspace\\WindowsHandeling\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_4d1ohbptwj_e&adgrpid=58490306106&hvpone=&hvptwo=&hvadid=486391491061&hvpos=&hvnetw=g&hvrand=12711110962980495434&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299790&hvtargid=kwd-298187295805&hydadcr=5657_2175734&gclid=CjwKCAjwi6WSBhA-EiwA6Niok4sVEKyfdrMEkyBSigc9V013TdZSrOMFzOnm0-qdBSU9n_my4Ljg1xoCybwQAvD_BwE");
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("iphone");
      	driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement text = driver.findElement(By.xpath("//span[text()='Apple iPhone XR (128GB) - Coral']/parent::a/parent::h2/parent::div/following-sibling::div/following-sibling::div//child::div//child::div//child::div//following-sibling::div//child::div//child::div//child::span[@aria-label='Get it by Tomorrow, April 5']//child::span[@class='a-color-base a-text-bold']"));
		String text2 = text.getText();
		System.out.println(text2);
		WebElement prize = driver.findElement(By.xpath("//span[text()='Apple iPhone 12 (64GB) - Green']//parent::a/parent::h2//parent::div//following-sibling::div//following-sibling::div//child::div//child::div//child::div//child::div//child::a//child::span//following-sibling::span//child::span[@class='a-price-whole']"));
		String pri = prize.getText();	
		System.out.println(pri);
		driver.navigate().to("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|RSA|529579609614&s_kwcid=AL!1631!3!529579609614!e!!g!!makemytrip&ef_id=CjwKCAjwrqqSBhBbEiwAlQeqGvS52XfAt9SmV8oFNV3kJf0NQKnisZM-jwI-FLibvhxrEeGoCUuuoBoCrCkQAvD_BwE:G:s&gclid=CjwKCAjwrqqSBhBbEiwAlQeqGvS52XfAt9SmV8oFNV3kJf0NQKnisZM-jwI-FLibvhxrEeGoCUuuoBoCrCkQAvD_BwE");
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
		driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']")).click();
		driver.findElement(By.xpath( "(//p[@class='filtersHeading appendBottom15']//parent::div//child::div//child::label//following-sibling::label//child::div//child::span[@class='customCheckbox'])[1]" )).click();
		
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("india");
		List<WebElement> list = driver.findElements(By.xpath("//input[@type='text']//parent::div//parent::div//parent::div//following-sibling::div[@jscontroller='Dvn7fe']//child::div//child::div//child::div//child::ul//child::li"));
		for (int i = 0; i < list.size(); i++) {
			WebElement web = list.get(i);
			String text3 = web.getText();
			System.out.println(text3);
			
			
		}
	}

}