package com.axis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver webDriver;
	public HomePage(WebDriver webDriver) {
		super();
		this.webDriver=webDriver;
		
	}
	By logoutBtn=By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[4]/div[1]/a");
	public String getHOmePageTitle() {
		return webDriver.getTitle();
	}
	public void clickLogout() {
		webDriver.findElement(logoutBtn).click();
	}
}
