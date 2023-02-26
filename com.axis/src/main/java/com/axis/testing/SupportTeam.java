package com.axis.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.axis.pages.SupportTeam_Post_Page;

public class SupportTeam {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chrome\\chromedriver.exe");
		WebDriver obj=new ChromeDriver();
		obj.get("http://localhost:3000/admin/support");
		
		SupportTeam_Post_Page support=new SupportTeam_Post_Page(obj);
		support.clickAddorEdit();
		Thread.sleep(3000);
		System.out.println("Edit or add container opened");
		support.enterId("YBS007");
		support.enterName("Pranavi");
		support.enterEmail("pranavi@gmail.com");
		support.enterDesignation("IT support");
		support.enterProjectName("Inventory-Management");
		support.enterPhoneNum((long) 609099998);
		support.clickAdd();
		System.out.println("Support Team Employee added");
		
	}

}
