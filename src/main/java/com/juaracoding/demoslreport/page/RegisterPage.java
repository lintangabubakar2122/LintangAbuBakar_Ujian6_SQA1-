package com.juaracoding.demoslreport.page;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.demoslreport.driver.DriverSingleton;



public class RegisterPage {
	
private WebDriver driver;
	
	public RegisterPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="body > p > a")
	private WebElement btnDismiss;
	
	@FindBy(css = "#noo-site > header > div.noo-topbar > div > ul.pull-right.noo-topbar-right > li")
	private List<WebElement> btnMyaccount;
	
	@FindBy(id="reg_username")
	private WebElement txtUsername;
	
	@FindBy(id="reg_email")
	private WebElement txtEmail;
	
	@FindBy(id="reg_password")
	private WebElement txtPassword;
	
	@FindBy(css="#customer_login > div.u-column2.col-2 > form > p:nth-child(5) > button")
	private WebElement btnRegister;
	
	public void goToRegisterPage() {
		btnDismiss.click();
		btnMyaccount.get(1).click();
	}
	
	public void goToRegister() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,650)");
		txtUsername.sendKeys("lintangkeren2122");
		txtEmail.sendKeys("lintangkeren2122@example.com");
		txtPassword.sendKeys("lintangkeren2122");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnRegister.click();
	}

}
