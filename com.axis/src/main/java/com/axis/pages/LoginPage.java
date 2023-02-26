package com.axis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		super();
		this.driver=driver;
	}
	By username=By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/input[1]");
	By pwd=By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/input[2]");
	By loginButton=By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/button");
	public void enterUsername(String user) {
		driver.findElement(username).sendKeys(user);
		
	}
	public void enterPassword(String password) {
		driver.findElement(pwd).sendKeys(password);
	}
	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
}
