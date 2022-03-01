package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Personal_Details {
      
	public WebDriver driver;

	@FindBy(name ="first_name")
	private WebElement firstname;
	
	@FindBy(name ="last_name")
	private WebElement lastname;
	
	@FindBy(name ="address")
	private WebElement adress;
	
     @FindBy(name ="cc_num")
     private  WebElement cardno;

     @FindBy(name ="cc_type")
     private  WebElement cardtybe;
     
     @FindBy(name ="cc_exp_month")
     private  WebElement month;

     @FindBy(name ="cc_exp_year")
     private WebElement year;
     
     @FindBy(name ="cc_cvv")
     private WebElement ccvno;
     
	@FindBy(name ="book_now")
	private WebElement bookNow;
	
	
	public Personal_Details(WebDriver driver2) {
		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAdress() {
		return adress;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtybe() {
		return cardtybe;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCcvno() {
		return ccvno;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

}
	
	
	
	
	

