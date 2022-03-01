package com.testng.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	
 @BeforeSuite
	public void propertySetting() {
		System.out.println("propertySetting");
	}
 @BeforeTest
	public void browserLounch() {
	
		System.out.println("browserLounch");
	}
 @BeforeClass
	public void urlLounch() {

        System.out.println("urlLounch");
	}
 @BeforeMethod
	public void signIn() {
	
		System.out.println("signIn");
	}
 @Test
	public void women() {
	
		System.out.println("women");
	}
 @Test
	public void men() {
	
		System.out.println("men");		
	}
 @Test
	public void kids() {

		System.out.println("kids");
	}
 @AfterMethod
	public void sighOut() {
	
		System.out.println("signOut");
	}
 @AfterClass
	public void homepage() {
	
		System.out.println("homepage");		
		}
 @AfterTest
	public void deleteCookies() {
	
		System.out.println("deleteCookies");		
	}
 @AfterSuite
	public void quitBrowser() {
		
		System.out.println("quitBrowser");
	}
	
	
	
}
