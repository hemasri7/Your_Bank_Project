package com.axis.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.axis.pages.SupportTeam_Search;

public class SupportSearch_TC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chrome\\chromedriver.exe");
		WebDriver obj=new ChromeDriver();
		obj.get("http://localhost:3000/admin/support");
		
		SupportTeam_Search support=new SupportTeam_Search(obj);
		support.enterSearch("YBSS001");
		System.out.println("Search is cliked with YBSS001 in support team Page");
	}

}
