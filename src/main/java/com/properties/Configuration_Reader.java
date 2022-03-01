package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

   public class Configuration_Reader {
	   
	 public static   Properties p;
	 
	 public Configuration_Reader() throws IOException {
		 File f = new File
					("C:\\Users\\srire\\eclipse-workspace\\Maven_project\\src\\main\\java\\com\\properties\\Configuration.properties");
			
			FileInputStream fis =new FileInputStream(f);
			
			 p = new Properties();
			
			p.load(fis);
		 
	 }
	   public String geturl() {		
	     
	      String url = p.getProperty("url");
	      
	      return url;	     
	}
	
	  public String getUsername()  {	
		
		String username = p.getProperty("username");
		
		return username;
	
	}
	
	  public String getPassward() {
		
		  String password  = p.getProperty("password");
		  
		  return password;
	}
	  public String getLoction() {
	
		  String location = p.getProperty("location");
		  
		  return location;
	}
	  
	  public String getHotels() {
		
		  String hotels = p.getProperty("hotels");
		  
		  return hotels;
	}
	  public String getRoomtybe() {
		 
		  String roomtybe  = p.getProperty("roomtybe");
		  
		  return roomtybe;
	}
	  public String getRoomnos() {
		
		  String roomnos = p.getProperty("roomnos");
		  
		  return roomnos;
	}
	  public String getAdultRoom() {
		
		  String adultroom = p.getProperty("adultroom");
		  
		  return adultroom;
	}
	  
	  public String getChildRoom() {
		
		  String childroom = p.getProperty("childroom");
		  
		  return childroom;
	}
	  
	  public String getFirstName() {
		
		  String fristname = p.getProperty("fristname");
		  
		  return fristname;

	}
	  
	  public String getLastName() {
			
		  String lastname = p.getProperty("lastname");
		  
		  return lastname;
	  }
	  
	  public String getAdress () {
			
		  String adress = p.getProperty("adress");
		  
		  return adress;
	  }
	  
	  public String getCardno () {
			
		  String cardno = p.getProperty("cardno");
		  
		  return cardno ;	  
	  }
	  
	  
	  public String getCardTybe() {
			
		  String cardtybe  = p.getProperty("cardtybe");
		  
		  return cardtybe ;	  
	  }
	  
	  public String getMonth() {
			
		  String month = p.getProperty("month");
		  
		  return month ;	  
	  }	  
	  
	  public String getYear() {
			
		  String year = p.getProperty("year");
		  
		  return year ;	  
	  }
	  
	  public String getCvvno() {
			
		  String cvvno = p.getProperty("cvvno");
		  
		  return cvvno;	  
	  }
	  
	  
   }  
	  
	  
	  
	  
	  
	   
		
	
	
	
	
	
	
	
	
	
	
	
   
	
	
	
	
	
	
	
	
	
	
	
	
	

