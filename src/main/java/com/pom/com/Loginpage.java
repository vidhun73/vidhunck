package com.pom.com;

import javax.swing.text.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
 public WebDriver driver;
 
 public WebDriver getDriver() {
	return driver;
}
public Element getUsername() {
	return username;
}
public Element getPassword() {
	return password;
}
public Element getLogin() {
	return login;
}
@FindBy(name="username")
 private Element username;
  
 @FindBy(name="password")
 private Element password;
 @FindBy(name="login")
 private Element login;
 

public Loginpage(WebDriver driver1) {
	this.driver = driver1;
	PageFactory.initElements(driver, this);
}
}