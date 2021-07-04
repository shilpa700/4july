package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demotest {
	@Test
	  public void TestCase01() {
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("file:///C:/Users/shilp/Downloads/Offline%20Website/Offline%20Website/index.html");
		  driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		  driver.findElement(By.id("password")).sendKeys("123456");
		  driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();;
		 
		  String actTitle=driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1")).getText();
		  String expTitle="Dashboard Courses Offered";
		  Assert.assertEquals(actTitle,expTitle);
	  }
	@Test
	public void TestCase02(){
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/shilp/Downloads/Offline%20Website/Offline%20Website/index.html");
		  driver.findElement(By.id("email")).sendKeys("");
		  driver.findElement(By.id("password")).sendKeys("123456");
		  driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();;
		  String actTitle=driver.findElement(By.xpath("//*[@id=\"email_error\"]")).getText();
		  String expTitle="Please enter email";
		  Assert.assertEquals(actTitle,expTitle);
	}

}



