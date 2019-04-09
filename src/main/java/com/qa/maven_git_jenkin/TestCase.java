package com.qa.maven_git_jenkin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase {

	WebDriver driver;
//Test CICD

	  @BeforeClass
	  public void beforeTest() {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\M\\Desktop\\SeleniumJars\\chromedriver.exe");
	    	driver = new ChromeDriver();
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	driver.get("https:www.jpay.com");
	    	driver.manage().window().maximize();
	  }	

   @Test
  public void TestCase1() {
	  System.out.println("Starting Test : TestCase1");
      driver.findElement(By.xpath("*[@id=\"newHeader_TopRightNavButton_lnkLogin\"]/div")).click(); 
      driver.findElement(By.xpath("*[@id=\"uclLoginFirstTime_txtUserId\"]")).sendKeys("ahayder@jpay.com");  
      driver.findElement(By.xpath("*[@id=\"uclLoginFirstTime_txtPassword\"]")).sendKeys("password"); 
      driver.findElement(By.xpath("*[@id=\"uclLoginFirstTime_btnContinue\"]/div")).click(); 
      driver.findElement(By.xpath("*[@id=\"myheader_TopRightNavButton_lnkLogout\"]/div")).click();
      System.out.println("Ending Test: TestCase1");
   }
        
  
  @AfterClass
  public void afterTest() throws InterruptedException {
  	Thread.sleep(5000);
      driver.quit();
  }
}
