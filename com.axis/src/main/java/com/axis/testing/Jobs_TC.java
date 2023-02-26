package com.axis.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.axis.pages.Home_JobOppurtunities;

public class Jobs_TC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chrome\\chromedriver.exe");
		WebDriver obj=new ChromeDriver();
		obj.get("http://localhost:3000/admin/home");
		Thread.sleep(3000);
		 Home_JobOppurtunities home=new Home_JobOppurtunities(obj);
		 home.clickMoreInfo();
		 home.clickJobs();
		 System.out.println("Job oppurtunities page opened");
	}

}
