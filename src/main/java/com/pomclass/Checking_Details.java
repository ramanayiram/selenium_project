package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checking_Details {
     
	public WebDriver driver;
	
	@FindBy(name = "radiobutton_0")
	private  WebElement radiobutton;
	
	public Checking_Details(WebDriver driver2) {
		
		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(name = "continue")
	private WebElement submit;
	
	
	
}
