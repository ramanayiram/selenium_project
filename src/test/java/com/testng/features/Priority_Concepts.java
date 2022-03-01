package com.testng.features;

import org.testng.annotations.Test;

public class Priority_Concepts {
	
	@Test(priority=-1)
	public void women() {
		
		System.out.println("women");
	}
 @Test(priority=-2,invocationCount=4)
	public void men() {
	
		System.out.println("men");		
	}
 @Test
	public void kids() {

		System.out.println("kids");
	}
 

}
