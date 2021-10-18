package com.amazon.stepdefinition1;

import java.util.NoSuchElementException;

import org.junit.internal.runners.statements.ExpectException;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.WebDriver;

import com.amazon.baseclass.BaseClass;
import com.amazon.helper.FileReaderManager;
import com.amazon.helper.PageObjectManager;
import com.amazon.runner.AmazonRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonStepDefinition extends BaseClass{
	public static WebDriver driver=AmazonRunner.driver;
	PageObjectManager pom = new PageObjectManager(driver);
	@Given("^User launch amazon website$")
	public void user_launch_amazon_website() throws Throwable {
	   String url = FileReaderManager.getinstance().getInstanceCR().getUrl();
	   geturl(url);
	   implicitWait(10);
	}

	@When("^User click sign in menu$")
	public void user_click_sign_in_menu() throws Throwable {
	   click(pom.getSp().getSignin());
	}

	@When("^user enter \"([^\"]*)\" valid username$")
	public void user_enter_valid_username(String arg1) throws Throwable {
	   sendKeys(pom.getSp().getEmail(),arg1);
	}

	@When("^user click continue$")
	public void user_click_continue() throws Throwable {
	   click(pom.getSp().getContinue());
	}

	@When("^user enter \"([^\"]*)\" valid password$")
	public void user_enter_valid_password(String arg1) throws Throwable {
	    sendKeys(pom.getSp().getPassword(),arg1);
	}

	@When("^user click sign in$")
	public void user_click_sign_in() throws Throwable {
		click(pom.getSp().getClicksignin());
		
	    
	}

	@Then("^user verify sign in and navigates to home page$")
	public void user_verify_sign_in_and_navigates_to_home_page() throws Throwable {
	  boolean enabled = pom.getSp().getChecksignin().isDisplayed();
	  if (enabled) {
		System.out.println("home page verified");
	}
	}
	


}
