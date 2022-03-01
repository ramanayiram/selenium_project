package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pomclass.Booking_Details;
import com.pomclass.Checking_Details;
import com.pomclass.Confirm;
import com.pomclass.Iternity;
import com.pomclass.Login_Page;
import com.pomclass.Personal_Details;

public class Page_Object_Manager {
	
   public WebDriver driver;
   private Login_Page lp;   
   private Booking_Details bd;   
   private Checking_Details cd;   
   private Personal_Details pd;   
   private Iternity it;   
   private Confirm cfr;

	public Page_Object_Manager(WebDriver driver2) {
	
		this.driver =driver2;
}
	public Login_Page getInstanceLp() {
		
		if(lp==null) {
		lp =new Login_Page(driver);
		}
		return lp;
	}
	
	public Booking_Details getInstanceBd() {
		if(bd==null) {
		bd = new Booking_Details(driver);
		}
		return bd;
	}
	

	public Checking_Details getInstanceCd() {
		if(cd==null) {
		 cd = new  Checking_Details(driver);
		} 
         return cd;
	}
	
	public Personal_Details getInstancePd() {
		if(pd==null) {
		pd = new Personal_Details(driver);
		}
		return pd;
	}
	
	public Iternity getInstanceIt() {
		if(it==null) {
	    it = new Iternity (driver);
		}
		return it;
	}
	
	public Confirm getConfirmCfr() {
		if(cfr==null) {
		cfr = new Confirm(driver);
		}
        return cfr;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
