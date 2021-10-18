package com.amazon.helper;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public static WebDriver driver;
	private SignInPage sp;
	
	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
	}

	public SignInPage getSp() {
		sp=new SignInPage(driver);
		return sp;
	}

}
