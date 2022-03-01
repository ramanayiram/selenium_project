package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Iternity {

	public WebDriver driver;
	
	public Iternity(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getItinerary() {
		return itinerary;
	}

	@FindBy(name = "my_itinerary")
	private WebElement itinerary;
	
	
	
	
	
	
	
	
	
	
	
}
