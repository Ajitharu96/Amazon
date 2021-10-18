package com.amazon.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.amazon.baseclass.BaseClass;
import com.amazon.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\amazon\\feature",
glue="com\\amazon\\stepdefinition1",plugin="pretty",
monochrome=true)
public class AmazonRunner {
	public static WebDriver driver;
@BeforeClass
public static void setUp() throws Throwable {
	String browser = FileReaderManager.getinstance().getInstanceCR().getBrowser();
	 driver= BaseClass.getBrowser(browser);
	 
}

}
