package com.hotel.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	public WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getRadiobtn() {
		return radiobtn;
	}


	public WebElement getCont() {
		return cont;
	}


	@FindBy(name="radiobutton_0")
	private WebElement radiobtn;

	
	@FindBy(name="continue")
	private WebElement cont;
	
	public SelectHotel(WebDriver driver3) {
	this.driver=driver3;
      PageFactory.initElements(driver, this);

	}
	
}
