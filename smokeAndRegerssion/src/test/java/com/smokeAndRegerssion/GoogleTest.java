package com.smokeAndRegerssion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GoogleTest {
	
	@Test
	public void google() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		  String actualResult=driver.getTitle(); String expectedResult="Google";
		  
			/*
			 * SoftAssert softAssert = new SoftAssert();
			 * softAssert.assertEquals(actualResult, expectedResult, "Title not found");
			 * 
			 * Thread.sleep(2000);
			 */
		  Assert.assertEquals(actualResult, expectedResult);
		  driver.findElement(By.xpath("//span[@class='gb_Dd']")).click();
		 
		driver.quit();
		System.out.println("passed");
		//softAssert.assertAll();
	}
	

}
