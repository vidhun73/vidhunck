package com.hotel.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchrooms {
	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement roomtype;

	@FindBy(id = "room_nos")
	private WebElement roomno;

	@FindBy(id = "datepick_in")
	private WebElement date;

	@FindBy(name = "datepick_out")
	private WebElement dateout;

	@FindBy(id = "adult_room")
	private WebElement adult;

	@FindBy(id = "child_room")
	private WebElement child;

	@FindBy(id = "Submit")
	private WebElement submit;

	@FindBy(id = "Reset")
	private WebElement reset;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getReset() {
		return reset;
	}

	public Searchrooms(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

}
