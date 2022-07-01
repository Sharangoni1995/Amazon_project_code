package com.AmaezonApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage {
	public static void main(String args[]) throws InterruptedException
	{
	
	//This step is to set the location of our Browser executable
    System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");    
    
    //Create an object for WebDriver with reference to ChromeDriver
    
    WebDriver driver = new ChromeDriver();
    
    //To open any URL we use a method called as get
    
    driver.get("https://www.amazon.in/ap/register?openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
    
    //Need to maximize the browser window
    
    driver.manage().window().maximize();
    
    //Amazon account creation input details 
   
    //First name and last name 
    driver.findElement(By.xpath("//input[starts-with(@name,'customerName')]")).sendKeys("Sharanappa");
    //input  mobile number 
    driver.findElement(By.xpath("//input[starts-with(@id,'ap_phone_number')]")).sendKeys("8888777111");
   
    //email account 
    driver.findElement(By.xpath("//input[starts-with(@name,'secondaryLoginClaim')]")).sendKeys("sharanapp@gmail.com");
     
    //new password 
    driver.findElement(By.xpath("//input[starts-with(@id,'ap_password')]")).sendKeys("smgoni1995");
   
    //click button 

   driver.findElement(By.xpath("//input[starts-with(@class,'a-button-input')]")).click();
    
    
	}    
}
