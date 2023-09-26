package com.smokeAndRegerssion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GooglewithAtag {
	
	
	@Test	
	public void GoogleWIthAtag() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		List<WebElement>link=driver.findElements(By.tagName("a"));
		for(WebElement alllinks:link) {
			System.out.println(alllinks.getAttribute("href"));
		}
		driver.quit();
		
	}

}
