package org.stepDefinition;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraPOJO extends BaseClass {
	
	public MyntraPOJO() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[@class='form-control mobileNumberInput']")
	private WebElement Number;
	
	@FindBy(xpath ="//div[@class='submitBottomOption']")
	private WebElement Continue;

	
	
	public WebElement getNumber() {
		return Number;
	}

	public WebElement getContinue() {
		return Continue;
	}

}
