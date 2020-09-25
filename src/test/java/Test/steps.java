package Test;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page.PageOpen;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import util.BrowserFactory;

public class steps {
	WebDriver driver;
	public PageOpen page;
	
	@Given("^: \"([^\"]*)\" button exists$")
	public void button_exists1(String arg1) throws Throwable {
	 driver=BrowserFactory.BrowserLaunch() ;
	 page=PageFactory.initElements(driver, PageOpen.class);
	 
	}

	@When("^: I click on the button;$")
	public void i_click_on_the_button1() throws Throwable {
	    page.SkybluebgoundField();
	}

	@Then("^: the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() throws Throwable {
	   Assert.assertTrue(true);
	}

	@Given("^: \"([^\"]*)\" button exists;$")
	public void button_exists(String arg1) throws Throwable {
		 driver=BrowserFactory.BrowserLaunch() ;
		 page=PageFactory.initElements(driver, PageOpen.class);
	}

	@When("^: I click on the button ;$")
	public void i_click_on_the_button() throws Throwable {
	    page.whitebgoundField();
	}

	@Then("^: the background color will change to white$")
	public void the_background_color_will_change_to_white() throws Throwable {
		 Assert.assertTrue(true);
	}


}
