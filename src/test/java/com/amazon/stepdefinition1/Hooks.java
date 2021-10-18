package com.amazon.stepdefinition1;



import com.amazon.baseclass.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	@Before
    public void beforeHooks(Scenario scenario) {
		String name = scenario.getName();
        System.out.println("Scenario Name:"+name);
	}
	@After
	public void afterHooks(Scenario scenario) throws Throwable {
		String status = scenario.getStatus();
        System.out.println("Scenario Status:"+status);
        if (scenario.isFailed()) {
			takesScreenshot("C:\\Users\\saran\\eclipse-workspace\\amazon\\ScreenShots\\img.png");
		}
	}
}
