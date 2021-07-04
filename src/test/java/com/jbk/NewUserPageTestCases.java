package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//new user page test cases
public class NewUserPageTestCases {
	
	@Test
		
	public void tes01(){
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("file:///C:/Users/shilp/Downloads/Offline%20Website/Offline%20Website/index.html");
	driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();
	driver.findElement(By.id("name")).sendKeys("");
	driver.findElement(By.id("mobile")).sendKeys("9860456789");
	driver.findElement(By.id("email")).sendKeys("shilpa@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.xpath("//*[@id=\"form\"]/div[5]/div/button")).click();
	String actMsg=driver.findElement(By.xpath("//*[@id=\"name_error\"]")).getText();
	String expMsg="Please enter Name.";
	Assert.assertEquals(actMsg, expMsg);

}
	@Test
	public void test02(){
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("file:///C:/Users/shilp/Downloads/Offline%20Website/Offline%20Website/index.html");
		driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();
		driver.findElement(By.id("name")).sendKeys("shilpa");
		driver.findElement(By.id("mobile")).sendKeys("");
		driver.findElement(By.id("email")).sendKeys("shilpa@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[5]/div/button")).click();
		String actMsg=driver.findElement(By.xpath("//*[@id=\"mobile_error\"]")).getText();
		String expMsg="Please enter Mobile.";
		Assert.assertEquals(actMsg, expMsg);
		
	}
	@Test
	public void test03(){
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("file:///C:/Users/shilp/Downloads/Offline%20Website/Offline%20Website/index.html");
		driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();
		driver.findElement(By.id("name")).sendKeys("shilpa");
		driver.findElement(By.id("mobile")).sendKeys("9860456789");
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[5]/div/button")).click();
		String actMsg=driver.findElement(By.xpath("//*[@id=\"email_error\"]")).getText();
		String expMsg="Please enter Email.";
		Assert.assertEquals(actMsg, expMsg);
		
	}
	@Test
	public void test04(){
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("file:///C:/Users/shilp/Downloads/Offline%20Website/Offline%20Website/index.html");
		driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();
		driver.findElement(By.id("name")).sendKeys("shilpa");
		driver.findElement(By.id("mobile")).sendKeys("9860456789");
		driver.findElement(By.id("email")).sendKeys("shilpa@gmail.com");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[5]/div/button")).click();
		String actMsg=driver.findElement(By.xpath("//*[@id=\"password_error\"]")).getText();
		String expMsg="Please enter Password.";
		Assert.assertEquals(actMsg, expMsg);
		
	} 
	@Test
	public void test05(){
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("file:///C:/Users/shilp/Downloads/Offline%20Website/Offline%20Website/index.html");
		driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();
		driver.findElement(By.id("name")).sendKeys("shilpa");
		driver.findElement(By.id("mobile")).sendKeys("9860456789");
		driver.findElement(By.id("email")).sendKeys("shilpa@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[5]/div/button")).click();
		driver.switchTo().alert().accept();
		Assert.assertEquals(true, true);
		
		
}
}
