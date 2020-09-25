package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageOpen {
WebDriver driver;
	
	public PageOpen(WebDriver driver) {
		this.driver= driver;
		
		
	}
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[1]") WebElement  Skybluebground;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[2]") WebElement skywhitebground;
	
	public void SkybluebgoundField() throws InterruptedException {
		Skybluebground.click();
		Thread.sleep(5000);
	}
	public void whitebgoundField() {
		skywhitebground.click();
	}
}
