package org.stepDefinition;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class OrderedHooks extends BaseClass {

	@Before(order = 1)             //Always Runs in Incremental Order (1,2,3,4....)
	// Pre-Condition
	private void precondition2() {
		launchBrowser();
		System.out.println("Launch The Browser");
	}
	@Before(order = 2)
	private void precondition1() {
		windowMaximize();
		System.out.println("maximize the Window");
	}
	@Before(order = 3, value = "@Sanity")
	private void precondition3() {
		System.out.println("Pre-Condition-3");
	}

	@After(order = 2, value = "@feature1")  //Always Runs in Decremental Order (3,2,1....)
	// Post-Condition
	private void postCondition2() {
		System.out.println("Takes Screenshot of Scenarios");

	}
	@After(order = 1 )
	private void postCondition1() {
		closeEntireBrowser();
        System.out.println("Close the Entire Browser");
	}

}
