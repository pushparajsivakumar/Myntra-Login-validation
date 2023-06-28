package org.stepDefinition;

import org.base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyntraLogin extends BaseClass {
	MyntraPOJO m;
	@Given("To launch the chrome browser and maximize window")
	public void to_launch_the_chrome_browser_and_maximize_window() {
	   launchBrowser();
	   windowMaximize();
	}
	@When("To launch the url of the myntra application")
	public void to_launch_the_url_of_the_myntra_application() {
	   launchUrl("https://www.myntra.com/login");
	}
	@When("To pass valid mobile number in textbox")
	public void to_pass_valid_mobile_number_in_textbox() {
		m = new MyntraPOJO();
		passText("8667203428", m.getNumber());
	}
	@When("To click the continue button")
	public void to_click_the_continue_button() {
		m = new MyntraPOJO();
		clickBtn(m.getContinue());
	}
	@Then("To close the browser")
	public void to_close_the_browser() {
	   closeEntireBrowser();
	}

}
