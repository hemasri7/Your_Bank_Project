package com.axis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FeedsEmployee {
	WebDriver driver;
	public FeedsEmployee(WebDriver driver) {
		super();
		this.driver=driver;
	}
	By feedsBtn=By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[3]/div/a");
	public void clickFeeds() {
		driver.findElement(feedsBtn).click();
	}
}
