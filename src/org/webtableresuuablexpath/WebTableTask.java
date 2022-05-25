package org.webtableresuuablexpath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTask {
            public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUTHARSAN\\eclipse-workspace\\WindowsHandeling\\Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("http://www.leafground.com/pages/table.html");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				List<WebElement> columns = driver.findElements(By.tagName("th"));
				int size = columns.size();
				System.out.println(size);
				List<WebElement> rows = driver.findElements(By.tagName("tr"));
				int size2 = rows.size();
				System.out.println(size2);
				List<WebElement> progressValues = driver.findElements(By.xpath("//td[2]"));
				List<Integer> li = new ArrayList();
				for (WebElement values : progressValues) {
					String text = values.getText();
					String replace = text.replace("%", "");
					int parseInt = Integer.parseInt(replace);
					li.add(parseInt);
				}
					Integer min = Collections.min(li);
					String minvalue = String.valueOf(min);
					String minimum = minvalue+"%";
					System.out.println(minimum);
					WebElement minivital = driver.findElement(By.xpath("//tr[6]//child::td[2]//font[text()='"+minimum+"']//parent::td//following-sibling::td//input[@type='checkbox']"));
					minivital.click();
					WebElement progress = driver.findElement(By.xpath("//tr[3]//child::td//following-sibling::td"));
					String text = progress.getText();
					System.out.println(text);
				}
				
				
				}

