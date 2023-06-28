$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/myntra.feature");
formatter.feature({
  "name": "To Validate the login Functionality of myntra application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@feature1"
    }
  ]
});
formatter.scenario({
  "name": "To validate login with valid login Details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "To launch the chrome browser and maximize window",
  "keyword": "Given "
});
formatter.match({
  "location": "MyntraLogin.to_launch_the_chrome_browser_and_maximize_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url of the myntra application",
  "keyword": "When "
});
formatter.match({
  "location": "MyntraLogin.to_launch_the_url_of_the_myntra_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass valid mobile number in textbox",
  "keyword": "And "
});
formatter.match({
  "location": "MyntraLogin.to_pass_valid_mobile_number_in_textbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the continue button",
  "keyword": "And "
});
formatter.match({
  "location": "MyntraLogin.to_click_the_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "MyntraLogin.to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});