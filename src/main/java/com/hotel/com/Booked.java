package com.hotel.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked {
	public WebDriver driver;
	
	@FindBy(xpath="(//input[@class='reg_button'])[2]")
	public WebElement myitine;

	public WebElement getMyitine() {
		return myitine;
	}

	public WebElement getIds() {
		return ids;
	}

	@FindBy(id="radiobutton_0")
	public WebElement ids;
	@FindBy(xpath ="(//input[@class='reg_button'])[2]")
	public WebElement logout;

	public WebElement getLogout() {
		return logout;
	}
	
	
    public Booked (WebDriver driver5) {
		this.driver = driver5;
		PageFactory.initElements(driver, this);

	}
}
