package com.amazon.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	public static WebDriver driver;
  @FindBy(xpath="//span[text()='Hello, Sign in']")
  private WebElement signin;
  @FindBy(name="email")
  private WebElement email;
  @FindBy(id ="continue")
  private WebElement Continue;
  @FindBy(id ="ap_password")
  private WebElement password;
  @FindBy(id="signInSubmit")
  private WebElement clicksignin;
  @FindBy(xpath="//*[@id=\"nav-cart-count-container\"]/span[2]")
  private WebElement checksignin;
public SignInPage(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
}
public WebElement getSignin() {
	return signin;
}
public WebElement getEmail() {
	return email;
}
public WebElement getContinue() {
	return Continue;
}
public WebElement getPassword() {
	return password;
}
public WebElement getClicksignin() {
	return clicksignin;
}
public WebElement getChecksignin() {
	return checksignin;
}
  
  
}
