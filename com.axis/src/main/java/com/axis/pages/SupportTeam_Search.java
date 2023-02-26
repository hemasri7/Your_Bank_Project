package com.axis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SupportTeam_Search {

	WebDriver driver;
	public SupportTeam_Search(WebDriver driver) {
		super();
		this.driver=driver;
	}
	By search=By.xpath("//*[@id=\"root\"]/div/div/div[2]/input");
	public void enterSearch(String searchKey) {
		driver.findElement(search).sendKeys(searchKey);
		
	}
}
