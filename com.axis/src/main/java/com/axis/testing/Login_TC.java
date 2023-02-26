package com.axis.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.axis.pages.FeedsEmployee;
import com.axis.pages.HomePage;
import com.axis.pages.LoginPage;

public class Login_TC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chrome\\chromedriver.exe");
		WebDriver obj=new ChromeDriver();
		obj.get("http://localhost:3000/login");
		
		LoginPage login=new LoginPage(obj);
		login.enterUsername("EMP001");
		login.enterPassword("1232");
		login.clickLogin();
		System.out.println("Home is being displayed");
		
		Thread.sleep(3000);
		System.out.println("Dashboard is being displayed");
		
		//Feeds Page Testing
		FeedsEmployee feeds=new FeedsEmployee(obj);
		System.out.println("Feeds of Employee is being displayed:");
		feeds.clickFeeds();
		
		Thread.sleep(3000);
		
		HomePage home=new HomePage(obj);
		System.out.println("Home page title is: "+home.getHOmePageTitle());
		home.clickLogout();
		
		
		
	}

}
