package com.Maven_project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pomclass.Booking_Details;
import com.pomclass.Checking_Details;
import com.pomclass.Confirm;
import com.pomclass.Iternity;
import com.pomclass.Login_Page;
import com.pomclass.Personal_Details;
import com.properties.File_Reader_Manager;
import com.sdp.Page_Object_Manager;


public class Runner_class extends BaseClass{

	public static WebDriver driver =browserLaunch("chrome");
	
	//public static Login_Page lp =new Login_Page(driver); 
	
	//public static Booking_Details bd =new Booking_Details(driver);
	
	//public static  Checking_Details cd =new  Checking_Details(driver);
	
	//public static Personal_Details pd =new Personal_Details(driver);
	
	//public static Iternity it =new Iternity(driver);
	
	//public static Confirm cfr = new Confirm(driver);
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static void main(String[] args) throws InterruptedException, IOException {
			
		 String url = File_Reader_Manager.getInstanceFRM().getInstanceCr().geturl();
		
			launchUrl(url);
			
			String username = File_Reader_Manager.getInstanceFRM().getInstanceCr().getUsername();			
			passInput(pom.getInstanceLp().getUsername(), username );			
			
			String passward = File_Reader_Manager.getInstanceFRM().getInstanceCr().getPassward();
			passInput(pom.getInstanceLp().getPassword(), passward);
			
			clickElement(pom.getInstanceLp().getLogin());
			
		    String loction = File_Reader_Manager.getInstanceFRM().getInstanceCr().getLoction();
			singleDropDown_visibleText(pom.getInstanceBd().getLocation(), loction);	
			
			String hotels = File_Reader_Manager.getInstanceFRM().getInstanceCr().getHotels();
			singleDrapDown_value(pom.getInstanceBd().getHotels(), hotels);
			
			String roomtybe = File_Reader_Manager.getInstanceFRM().getInstanceCr().getRoomtybe();
			singleDrapDown_value(pom.getInstanceBd().getRoomTybe(), roomtybe);		
			
			String roomnos = File_Reader_Manager.getInstanceFRM().getInstanceCr().getRoomnos();
			singleDrapDown_value(pom.getInstanceBd().getRoomnos(), roomnos);
			
			String adultRoom = File_Reader_Manager.getInstanceFRM().getInstanceCr().getAdultRoom();
			singleDropDown_visibleText(pom.getInstanceBd().getAdultsRoom(), adultRoom);
			
			String childRoom = File_Reader_Manager.getInstanceFRM().getInstanceCr().getChildRoom();
			singleDrapDown_value(pom.getInstanceBd().getChildRoom(), childRoom);
			
			clickElement(pom.getInstanceBd().getSearch());
			
			
			radioButton(pom.getInstanceCd().getRadiobutton());
			
			clickElement(pom.getInstanceCd().getSubmit());
			
			String firstName = File_Reader_Manager.getInstanceFRM().getInstanceCr().getFirstName();
			passInput(pom.getInstancePd().getFirstname(), firstName);
			
			String lastName = File_Reader_Manager.getInstanceFRM().getInstanceCr().getLastName();
			passInput(pom.getInstancePd().getLastname(), lastName);			
			
			String adress = File_Reader_Manager.getInstanceFRM().getInstanceCr().getAdress();
			passInput(pom.getInstancePd().getAdress(), adress);			
			
			String cardno = File_Reader_Manager.getInstanceFRM().getInstanceCr().getCardno();
			passInput(pom.getInstancePd().getCardno(), cardno);				
			
			String cardTybe = File_Reader_Manager.getInstanceFRM().getInstanceCr().getCardTybe();
			singleDrapDown_value(pom.getInstancePd().getCardtybe(), cardTybe);				
			
			String month = File_Reader_Manager.getInstanceFRM().getInstanceCr().getMonth();
			singleDropDown_visibleText(pom.getInstancePd().getMonth(), month);				
			
			String year = File_Reader_Manager.getInstanceFRM().getInstanceCr().getYear();
			singleDrapDown_value(pom.getInstancePd().getYear(), year);				

			String cvvno = File_Reader_Manager.getInstanceFRM().getInstanceCr().getCvvno();
			passInput(pom.getInstancePd().getCcvno(), cvvno);						
		
			clickElement(pom.getInstancePd().getBookNow());
			
			
			Thread.sleep(10000);					
			
			clickElement(pom.getInstanceIt().getItinerary());
			
			
			
			Thread.sleep(2000);					
			
			clickElement(pom.getConfirmCfr().getLogout());
		}

	}



