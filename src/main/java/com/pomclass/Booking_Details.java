package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Details {
    
	public WebDriver driver;
	
	@FindBy(id ="location")
	private WebElement location;
	
	@FindBy(id ="hotels")
	private WebElement hotels;
	
	@FindBy(id ="room_type")
	private WebElement roomTybe;
	
	@FindBy(id ="room_nos")
	private WebElement roomnos;
	
	@FindBy(id ="adult_room")
	private WebElement adultsRoom;
	
	@FindBy(id ="child_room")
	private WebElement childRoom;
	
	@FindBy(id ="Submit")
	private WebElement search;

	public Booking_Details(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomTybe() {
		return roomTybe;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getAdultsRoom() {
		return adultsRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSearch() {
		return search;

	}
	
	
	
	
}