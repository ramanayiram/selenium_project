package com.Maven_project;


import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	// 1.browser launch	()
	public static WebDriver browserLaunch(String name) {
		
    if (name.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Driver2\\chromedriver.exe");
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
	}
    else if (name.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", 
				System.getProperty("user.dir")+"\\Driver2\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
	}
	
   return driver;
	}
  // 2.get()
      public static void launchUrl(String url) {
      
    	  driver.get(url);
      }
   
 //3.close ()
   
   public static void closeBrowser() {
	
	   driver.close();
	   
}
   
  //4.quit()
   public static void quitBrowser() {
	
	   driver.quit();
}
   
   //5.sendKeys()
   public static void passInput(WebElement element,String input) {
	
    element.sendKeys(input);
}
   
  //6.click ()
   
   public static void clickElement(WebElement element) {

   element.click();
}
   //7.Navigate to()
   public static void navigateTourl (String tourl) {

   driver.navigate().to(tourl);
}	
   //8.Navigate back()
   public static void navigateBack() {
	   
	   driver.navigate().back();
   }	
   
   //9.Navigate Forward()
   public static void navigateForward() {
	
	   driver.navigate().forward();
}
   //10.Navigate refresh()
   public static void navigateRefresh() {
	
	   driver.navigate().refresh();
}
   //11.Alert()
       //accept()
   public static void alertAccept(Alert alertname) {
	
      alertname.accept();
   }
   //dismiss()
   public static void alertDismiss(Alert alertname) {
	
	  alertname.dismiss(); 
}
   //sendkeys()
   public static void alertsendkeys(Alert alertname) {
	
	   alertname.sendKeys(null);
}
   public static void alertgettext(Alert alertname) {
	
	   alertname.getText();
}
   //12.Action (All methods from action class)
   //Action - Click()
   public static void actionClick(WebElement element, Actions act) {
     
	   act =new Actions(driver);
	   act.click(element).build().perform();
}
   //Action -ContextClick()
   public static void actionContextClick(WebElement element, Actions act) {
	
	   act =new Actions(driver);
	   act.click(element).build().perform();
}
   //Action -doubleClick()
   public static void actionDoubleClick(WebElement element, Actions act) {
	
	   act =new Actions(driver);
	   act.click(element).build().perform();
}
   //Action-DragAndDrop()
   public static void actionDrapAndDrop(WebElement drag,WebElement drop, Actions act) {
	
        act=new Actions(driver);
        act.dragAndDrop(drag, drop).build().perform();
}
   //13.Frames()
   public static void switchToFrame(int index) {
	
	   driver.switchTo().frame(index);
}
	public static void switchToFrame(String idorname) {
		
		driver.switchTo().frame(idorname);
	}
	
	public static void switchToFrame(WebElement element) {
		
		driver.switchTo().frame(element);
	}
	public static void switchToDefaultContent() {
		
		driver.switchTo().defaultContent();
	}
	public static void switchToParentFrame() {
		
		driver.switchTo().parentFrame();
	}
	
	//14.Robot()
	public static void keyBoardEventDown(Robot r) {
         
		r.keypress(KeyEvent.VK_DOWN);
		r.keyrelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyrelease(KeyEvent.VK_ENTER);
	}
		
	//15.Window Handles()
      public static void methodWindowHandles(String page) {
       
		page =driver.getWindowHandle();
		System.out.println(driver.switchTo().window(page).getTitle());
	}
	  public static void methodWindowHandles(Set<String> pages) {

		pages =driver.getWindowHandles();
		for (String tabs : pages) {
			String title = driver.switchTo().window(tabs).getTitle();
		System.out.println(title);
		}
				
    }

	//16.Drop down()
	//single drop down()
	public static void singleDropDown_index(WebElement element,int num) {
		
        Select s = new Select(element);
        s.selectByIndex(num);
	}
	public static void singleDrapDown_value(WebElement element,String value) {
	   
		Select s =new Select(element);
		s.selectByValue(value);
	}
	
	public static void singleDropDown_visibleText(WebElement element,String text) {
		
		Select s=new Select(element);
		s.selectByVisibleText(text);			
		}
	//17.Is multiple()
	public static void methodIsMultiple(WebElement element,boolean ismultiple) {
		
		Select s=new Select(element);
		ismultiple = s.isMultiple();
		System.out.println(ismultiple);		
	}
	//18.Check box()
	public static void methodCheckBox(WebElement checkbox) {
		
		checkbox.click();
	}
	//19.Is enable()
	public static void methodIsEnable(WebElement element,boolean isenable) {
		
        isenable= element.isEnabled();
		//boolean enabled = element.isEnabled();
		System.out.println(isenable);
	}
	//20.Is selected()
	public static void methodIsSelected(WebElement element,boolean isselected) {
		
		isselected = element.isSelected();
		System.out.println(isselected);
	}
	//21.Is displayed()
	public static void methodIsDisplayed(WebElement element,boolean isdisplayed) {
	
		isdisplayed = element.isDisplayed();
        System.out.println(isdisplayed);
	}
	
	//22.Get options()
	public static void getAllOptions(List<WebElement> alloptions,Select s) {
		
              alloptions = s.getOptions();
              for (WebElement options : alloptions) {
		       String text = options.getText();
		       System.out.println(text);
      }
      
	}
      
      //23.Get title()
	public static void getTitleNme(String title) {
		
         title = driver.getTitle();
         System.out.println(title);
	}
    //24.Get current url()
	
      public static void getCurrentUrl(String currentUrl) {
		
           currentUrl = driver.getCurrentUrl();
           System.out.println(currentUrl);
	}
      //25.Get text()
      
      public static void getText(WebElement element,String text) {
		
    	   text = element.getText();
           System.out.println(text);
	}
     //26.Get attribute()
      public static void getAttribute(WebElement element,String attribute) {
		
    	  attribute = element.getAttribute(attribute);
           System.out.println(attribute);
	}
      
	//27.Wait()
      //Implicit wait
      public static void implicitWait() {
		
         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
    }
	//Explicit wait()
     public static void explicitWait(WebElement element,WebDriverWait wait) {
	     
           wait= new WebDriverWait(driver,20);
    	 wait.until(ExpectedConditions.visibilityOf(element));
	} 
     //28.Take screenshot()
     public static void methodTakesScreenshot(String location) throws IOException {
		
    	 TakesScreenshot ts = (TakesScreenshot) driver;
    	 File src = ts.getScreenshotAs(OutputType.FILE);
    	 File dest = new File(location);
    	 FileUtils.copyFile(src, dest);
     }
    	       	
	//29.Scroll Up and Down()
     public static void scrollIntoView(WebElement element,String viewpoint) {
		
    	 JavascriptExecutor js = (JavascriptExecutor)driver;
          js.executeScript(viewpoint, element);
	}
     public static void scrollUp(JavascriptExecutor js,String upvalue) {
	
          js.executeScript(upvalue);
   	}
	
	public static void scrollDown(JavascriptExecutor js,String downvalue) {
		
		js.executeScript(downvalue);

	}

	//30.Get first selected options()
	public static void getFristSelectedOption(WebElement firstSelectedOption,Select s,String firstSelectedText) {
		
		firstSelectedOption = s.getFirstSelectedOption();

		firstSelectedText = firstSelectedOption.getText();
		
		System.out.println(firstSelectedText);
	}
	
	//31.Get all selected options()
	public static void getAllSelectedOptions(List<WebElement> allSelectedOptions,Select s,String selectedText) {
			
         allSelectedOptions = s.getAllSelectedOptions();
         for (WebElement selectedOptions1 : allSelectedOptions) {
        	 selectedText = selectedOptions1.getText();
        	 System.out.println(selectedText);
		}
	}
	
	//32.Radio button()
	public static void radioButton(WebElement radiobutton) {

		radiobutton.click();
	}
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	