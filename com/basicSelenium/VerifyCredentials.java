package com.basicSelenium;

import org.testng.annotations.Test;

public class VerifyCredentials {
  @Test
  public void TestCase01() {
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("file:///C:/Users/shilp/Downloads/Offline%20Website/Offline%20Website/index.html");
	  driver.findElements(By.id("email").sendkeys("kiran@gmail.com"));
	  driver.findElements(By.id("password").sendkeys("123456"));
	  driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"))
	  String actTitle=driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1"));
	  String expTitle="Dashboard";
	  Assert.assertEqals(actTitle,expTitle);
  }
}

