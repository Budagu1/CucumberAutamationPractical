package Test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import Page.PageOpen;
import util.BrowserFactory;



public class TestRunning {
	WebDriver driver;
	
	
	   @Test
	public void Test() throws InterruptedException {
		 driver= BrowserFactory.BrowserLaunch();
		 PageOpen p = PageFactory.initElements(driver, PageOpen.class);
		 p.SkybluebgoundField();
		 p.whitebgoundField();
		 
	   }
}
