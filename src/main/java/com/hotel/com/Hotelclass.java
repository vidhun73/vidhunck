package com.hotel.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class Hotelclass {
	public WebDriver driver;
		
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement login;
		
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	public Hotelclass(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);

	}


	
}


