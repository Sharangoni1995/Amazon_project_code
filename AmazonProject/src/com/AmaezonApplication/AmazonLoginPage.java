package com.AmaezonApplication;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class AmazonLoginPage
{
	public static void main(String args[]) throws InterruptedException 
	{
	
	//This step is to set the location of our Browser executable
    System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");    
    
    //Create an object for WebDriver with reference to ChromeDriver
    
    WebDriver driver = new ChromeDriver();
    
    //To open any URL we use a method called as get
    
    driver.get("https://www.amazon.in/");
    
    //Need to maximize the browser window
    
    driver.manage().window().maximize();
    
    //To use ID selector to access/perform the action
    
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile phone");
    Thread.sleep(2000);
  
    //Using Xpath 
    
    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
    
		//click the Get it buy tomorrow option 
    driver.findElement(By.xpath("//i[@class='a-icon a-icon-checkbox']")).click();	
		
		
	
		
		
	}	
		
		
		
}
