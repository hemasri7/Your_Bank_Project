package com.axis.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SupportTeam_Post_Page {
	WebDriver driver;
	public SupportTeam_Post_Page(WebDriver driver) {
		super();
		this.driver=driver;
	}
	By id=By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/div[1]/div/div[2]/div/div/div/div/div/div[1]/input[1]");
	By name=By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/div[1]/div/div[2]/div/div/div/div/div/div[1]/input[2]");
	By email=By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/div[1]/div/div[2]/div/div/div/div/div/div[2]/input[1]");
	By phoneNo=By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/div[1]/div/div[2]/div/div/div/div/div/div[2]/input[2]");
	By projName=By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/div[1]/div/div[2]/div/div/div/div/div/div[3]/input[1]");
	By imgUrl=By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/div[1]/div/div[2]/div/div/div/div/div/div[3]/input[2]");
	By designation=By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/div[1]/div/div[2]/div/div/div/div/div/div[4]/input");
	By addBtn=By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/div[1]/div/div[2]/div/div/div/div/div/div[5]/button[2]");
	By addBtnStart=By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/div[1]/div/div[1]");
	public void clickAddorEdit() {
		driver.findElement(addBtnStart).click();
		String className=driver.findElement(addBtnStart).getAttribute("class");
		System.out.println(className);
		//driver.findElement(addBtnStart).click();
	}
	public void enterId(String jobId) {
		driver.findElement(id).sendKeys(jobId);
		
	}
	public void enterName(String name1) {
		driver.findElement(name).sendKeys(name1);
	}
	public void enterEmail(String email1) {
		driver.findElement(email).sendKeys(email1);
		
	}
	Actions action=new Actions(driver);
	public void enterPhoneNum(Long phone) {
		driver.findElement(phoneNo).sendKeys(String.valueOf(phone));
	}
	public void enterProjectName(String projectName) {
		driver.findElement(projName).sendKeys(projectName);
		
	}
	public void enterImageUrl(String imageUrl) {
		driver.findElement(imgUrl).sendKeys(imageUrl);
	}
	public void enterDesignation(String designation1) {
		driver.findElement(designation).sendKeys(designation1);
	}
	public void clickAdd() {
		driver.findElement(addBtn).click();
	}
	
}
