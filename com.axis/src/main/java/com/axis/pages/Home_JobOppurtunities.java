package com.axis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_JobOppurtunities {
	WebDriver driver;
	public Home_JobOppurtunities(WebDriver driver) {
		super();
		this.driver=driver;
	}
	By jobs=By.xpath("//*[@id=\"dropdown-basic-button\"]");
	By job_oppurtunities=By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[3]/div/div/div/a[5]");
	public void clickMoreInfo() {
		driver.findElement(jobs).click();
	}
	public void clickJobs() {
		driver.findElement(job_oppurtunities).click();
	}
	
	

}
